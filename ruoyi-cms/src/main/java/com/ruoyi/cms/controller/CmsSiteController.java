package com.ruoyi.cms.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.cms.domain.CmsCategory;
import com.ruoyi.cms.service.ICmsCategoryService;
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
import com.ruoyi.cms.domain.CmsSite;
import com.ruoyi.cms.service.ICmsSiteService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 站点管理Controller
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
@RestController
@RequestMapping("/cms/site")
public class CmsSiteController extends BaseController
{
    @Autowired
    private ICmsSiteService cmsSiteService;
    @Autowired
    private ICmsCategoryService cmsCategoryService;

    /**
     * 查询站点管理列表
     */
    @GetMapping("/list")
    public TableDataInfo list(CmsSite cmsSite)
    {
        startPage();
        List<CmsSite> list = cmsSiteService.selectCmsSiteList(cmsSite);
        return getDataTable(list);
    }

    /**
     * 返回站点和栏目列表
     */
    @Anonymous
    @GetMapping("/category")
    public TableDataInfo category(CmsSite cmsSite)
    {
        //这个方法存在site表字段覆盖category相同列的问题，后期完善
        //List<CmsSite> list = cmsSiteService.selectCmsSiteAndCategoryList(cmsSite);
        List<CmsSite> list = cmsSiteService.selectCmsSiteList(cmsSite);
        list.forEach((site) -> {
            CmsCategory category = new CmsCategory();
            category.setSiteCode(site.getSiteCode());
            site.setCategories(cmsCategoryService.selectCmsCategoryList(category));
        });
        return getDataTable(list);
    }

    /**
     * 导出站点管理列表
     */
    @PreAuthorize("@ss.hasPermi('cms:site:export')")
    @Log(title = "站点管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmsSite cmsSite)
    {
        List<CmsSite> list = cmsSiteService.selectCmsSiteList(cmsSite);
        ExcelUtil<CmsSite> util = new ExcelUtil<CmsSite>(CmsSite.class);
        util.exportExcel(response, list, "站点管理数据");
    }

    /**
     * 获取站点管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('cms:site:query')")
    @GetMapping(value = "/{siteId}")
    public AjaxResult getInfo(@PathVariable("siteId") Long siteId)
    {
        return success(cmsSiteService.selectCmsSiteBySiteId(siteId));
    }

    /**
     * 新增站点管理
     */
    @PreAuthorize("@ss.hasPermi('cms:site:add')")
    @Log(title = "站点管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmsSite cmsSite)
    {
        return toAjax(cmsSiteService.insertCmsSite(cmsSite));
    }

    /**
     * 修改站点管理
     */
    @PreAuthorize("@ss.hasPermi('cms:site:edit')")
    @Log(title = "站点管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmsSite cmsSite)
    {
        return toAjax(cmsSiteService.updateCmsSite(cmsSite));
    }

    /**
     * 删除站点管理
     */
    @PreAuthorize("@ss.hasPermi('cms:site:remove')")
    @Log(title = "站点管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{siteIds}")
    public AjaxResult remove(@PathVariable Long[] siteIds)
    {
        return toAjax(cmsSiteService.deleteCmsSiteBySiteIds(siteIds));
    }
}
