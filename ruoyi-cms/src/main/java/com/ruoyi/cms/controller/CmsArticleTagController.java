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
import com.ruoyi.cms.domain.CmsArticleTag;
import com.ruoyi.cms.service.ICmsArticleTagService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 标签管理Controller
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
@RestController
@RequestMapping("/cms/tag")
public class CmsArticleTagController extends BaseController
{
    @Autowired
    private ICmsArticleTagService cmsArticleTagService;

    /**
     * 查询标签管理列表
     */
    @PreAuthorize("@ss.hasPermi('cms:tag:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmsArticleTag cmsArticleTag)
    {
        startPage();
        List<CmsArticleTag> list = cmsArticleTagService.selectCmsArticleTagList(cmsArticleTag);
        return getDataTable(list);
    }

    /**
     * 导出标签管理列表
     */
    @PreAuthorize("@ss.hasPermi('cms:tag:export')")
    @Log(title = "标签管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmsArticleTag cmsArticleTag)
    {
        List<CmsArticleTag> list = cmsArticleTagService.selectCmsArticleTagList(cmsArticleTag);
        ExcelUtil<CmsArticleTag> util = new ExcelUtil<CmsArticleTag>(CmsArticleTag.class);
        util.exportExcel(response, list, "标签管理数据");
    }

    /**
     * 获取标签管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('cms:tag:query')")
    @GetMapping(value = "/{tagId}")
    public AjaxResult getInfo(@PathVariable("tagId") Long tagId)
    {
        return success(cmsArticleTagService.selectCmsArticleTagByTagId(tagId));
    }

    /**
     * 新增标签管理
     */
    @PreAuthorize("@ss.hasPermi('cms:tag:add')")
    @Log(title = "标签管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmsArticleTag cmsArticleTag)
    {
        return toAjax(cmsArticleTagService.insertCmsArticleTag(cmsArticleTag));
    }

    /**
     * 修改标签管理
     */
    @PreAuthorize("@ss.hasPermi('cms:tag:edit')")
    @Log(title = "标签管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmsArticleTag cmsArticleTag)
    {
        return toAjax(cmsArticleTagService.updateCmsArticleTag(cmsArticleTag));
    }

    /**
     * 删除标签管理
     */
    @PreAuthorize("@ss.hasPermi('cms:tag:remove')")
    @Log(title = "标签管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{tagIds}")
    public AjaxResult remove(@PathVariable Long[] tagIds)
    {
        return toAjax(cmsArticleTagService.deleteCmsArticleTagByTagIds(tagIds));
    }
}
