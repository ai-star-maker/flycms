package com.ruoyi.cms.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.cms.domain.CmsArticle;
import com.ruoyi.cms.service.ICmsArticleService;
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
import com.ruoyi.cms.domain.CmsSearch;
import com.ruoyi.cms.service.ICmsSearchService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 网站搜索Controller
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
@RestController
@RequestMapping("/cms/search")
public class CmsSearchController extends BaseController
{
    @Autowired
    private ICmsSearchService cmsSearchService;
    @Autowired
    private ICmsArticleService cmsArticleService;

    /**
     * 查询网站搜索列表
     */
    @PreAuthorize("@ss.hasPermi('cms:search:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmsSearch cmsSearch)
    {
        startPage();
        List<CmsSearch> list = cmsSearchService.selectCmsSearchList(cmsSearch);
        return getDataTable(list);
    }

    /**
     * 查询网站搜索关键字频率列表
     */
    @Anonymous
    @GetMapping("/listTopKeywords")
    public TableDataInfo listTopKeywords(CmsSearch cmsSearch)
    {
        List<CmsSearch> list = cmsSearchService.selectCmsSearchKeywordsGroupList(cmsSearch);
        return getDataTable(list);
    }

    /**
     * 根据keyword查询article列表
     */
    @Anonymous
    @GetMapping("/search")
    public TableDataInfo search(CmsSearch cmsSearch)
    {

        String userName = "";
        try {
            userName = getUsername();
        }
        catch (Exception e) {
            System.out.println("获得用户信息异常，可能没有登录");
        }
        cmsSearch.setCreateBy(userName);
        cmsSearch.setSearchTimes(1L);
        cmsSearchService.insertCmsSearch(cmsSearch);

        startPage();
        CmsArticle article = new CmsArticle();
        article.setSiteCode(cmsSearch.getSiteCode());
        article.setDescription(cmsSearch.getKeyword());
        List<CmsArticle> list = cmsArticleService.selectCmsArticleList(article);
        return getDataTable(list);
    }

    /**
     * 导出网站搜索列表
     */
    @PreAuthorize("@ss.hasPermi('cms:search:export')")
    @Log(title = "网站搜索", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmsSearch cmsSearch)
    {
        List<CmsSearch> list = cmsSearchService.selectCmsSearchList(cmsSearch);
        ExcelUtil<CmsSearch> util = new ExcelUtil<CmsSearch>(CmsSearch.class);
        util.exportExcel(response, list, "网站搜索数据");
    }

    /**
     * 获取网站搜索详细信息
     */
    @PreAuthorize("@ss.hasPermi('cms:search:query')")
    @GetMapping(value = "/{searchId}")
    public AjaxResult getInfo(@PathVariable("searchId") Long searchId)
    {
        return success(cmsSearchService.selectCmsSearchBySearchId(searchId));
    }

    /**
     * 新增网站搜索
     */
    @PreAuthorize("@ss.hasPermi('cms:search:add')")
    @Log(title = "网站搜索", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmsSearch cmsSearch)
    {
        return toAjax(cmsSearchService.insertCmsSearch(cmsSearch));
    }

    /**
     * 修改网站搜索
     */
    @PreAuthorize("@ss.hasPermi('cms:search:edit')")
    @Log(title = "网站搜索", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmsSearch cmsSearch)
    {
        return toAjax(cmsSearchService.updateCmsSearch(cmsSearch));
    }

    /**
     * 删除网站搜索
     */
    @PreAuthorize("@ss.hasPermi('cms:search:remove')")
    @Log(title = "网站搜索", businessType = BusinessType.DELETE)
	@DeleteMapping("/{searchIds}")
    public AjaxResult remove(@PathVariable Long[] searchIds)
    {
        return toAjax(cmsSearchService.deleteCmsSearchBySearchIds(searchIds));
    }
}
