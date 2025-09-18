package com.ruoyi.cms.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.cms.domain.CmsArticleCount;
import com.ruoyi.cms.service.ICmsArticleCountService;
import com.ruoyi.common.annotation.Anonymous;
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
import com.ruoyi.cms.domain.CmsArticle;
import com.ruoyi.cms.service.ICmsArticleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文章管理Controller
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
@RestController
@RequestMapping("/cms/article")
public class CmsArticleController extends BaseController
{
    @Autowired
    private ICmsArticleService cmsArticleService;
    @Autowired
    private ICmsArticleCountService cmsArticleCountService;

    /**
     * 查询文章管理列表
     */
    @Anonymous
    @GetMapping("/list")
    public TableDataInfo list(CmsArticle cmsArticle)
    {
        startPage();
        List<CmsArticle> list = cmsArticleService.selectCmsArticleList(cmsArticle);
        return getDataTable(list);
    }

    /**
     * 导出文章管理列表
     */
    @PreAuthorize("@ss.hasPermi('cms:article:export')")
    @Log(title = "文章管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmsArticle cmsArticle)
    {
        List<CmsArticle> list = cmsArticleService.selectCmsArticleList(cmsArticle);
        ExcelUtil<CmsArticle> util = new ExcelUtil<CmsArticle>(CmsArticle.class);
        util.exportExcel(response, list, "文章管理数据");
    }

    /**
     * 获取文章管理详细信息
     */
    @Anonymous
    @GetMapping(value = "/{articleId}")
    public AjaxResult getInfo(@PathVariable("articleId") Long articleId)
    {
        //增加文件的浏览数量
        CmsArticleCount count = new CmsArticleCount();
        count.setArticleId(articleId);
        count.setViews(new Long(1));
        cmsArticleCountService.insertCmsArticleCount(count);

        //TODO:查询该文章的统计数据
        List<CmsArticleCount> countList = cmsArticleCountService.selectCmsArticleCountList(count);
        CmsArticle article = cmsArticleService.selectCmsArticleByArticleId(articleId);
        article.setArticleCount(countList.get(0));
        return success(article);
    }

    /**
     * 新增文章管理
     */
    @PreAuthorize("@ss.hasPermi('cms:article:add')")
    @Log(title = "文章管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmsArticle cmsArticle)
    {
        return toAjax(cmsArticleService.insertCmsArticle(cmsArticle));
    }

    /**
     * 修改文章管理
     */
    @PreAuthorize("@ss.hasPermi('cms:article:edit')")
    @Log(title = "文章管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmsArticle cmsArticle)
    {
        return toAjax(cmsArticleService.updateCmsArticle(cmsArticle));
    }

    /**
     * 删除文章管理
     */
    @PreAuthorize("@ss.hasPermi('cms:article:remove')")
    @Log(title = "文章管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{articleIds}")
    public AjaxResult remove(@PathVariable Long[] articleIds)
    {
        return toAjax(cmsArticleService.deleteCmsArticleByArticleIds(articleIds));
    }
}
