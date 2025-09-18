package com.ruoyi.cms.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.cms.domain.CmsArticleCount;
import com.ruoyi.cms.service.ICmsArticleCountService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文章统计Controller
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
@RestController
@RequestMapping("/cms/count")
public class CmsArticleCountController extends BaseController
{
    @Autowired
    private ICmsArticleCountService cmsArticleCountService;

    /**
     * 查询文章统计列表
     */
    @PreAuthorize("@ss.hasPermi('cms:count:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmsArticleCount cmsArticleCount)
    {
        startPage();
        List<CmsArticleCount> list = cmsArticleCountService.selectCmsArticleCountList(cmsArticleCount);
        return getDataTable(list);
    }

    /**
     * 导出文章统计列表
     */
    @PreAuthorize("@ss.hasPermi('cms:count:export')")
    @Log(title = "文章统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmsArticleCount cmsArticleCount)
    {
        List<CmsArticleCount> list = cmsArticleCountService.selectCmsArticleCountList(cmsArticleCount);
        ExcelUtil<CmsArticleCount> util = new ExcelUtil<CmsArticleCount>(CmsArticleCount.class);
        util.exportExcel(response, list, "文章统计数据");
    }

    /**
     * 获取文章统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('cms:count:query')")
    @GetMapping(value = "/{countId}")
    public AjaxResult getInfo(@PathVariable("countId") Long countId)
    {
        return success(cmsArticleCountService.selectCmsArticleCountByCountId(countId));
    }

    /**
     * 新增文章统计
     */
    @PreAuthorize("@ss.hasPermi('cms:count:add')")
    @Log(title = "文章统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmsArticleCount cmsArticleCount)
    {
        return toAjax(cmsArticleCountService.insertCmsArticleCount(cmsArticleCount));
    }

    /**
     * 修改文章统计
     */
    @PreAuthorize("@ss.hasPermi('cms:count:edit')")
    @Log(title = "文章统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmsArticleCount cmsArticleCount)
    {
        return toAjax(cmsArticleCountService.updateCmsArticleCount(cmsArticleCount));
    }

    /**
     * 删除文章统计
     */
    @PreAuthorize("@ss.hasPermi('cms:count:remove')")
    @Log(title = "文章统计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{countIds}")
    public AjaxResult remove(@PathVariable Long[] countIds)
    {
        return toAjax(cmsArticleCountService.deleteCmsArticleCountByCountIds(countIds));
    }
}
