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
import com.ruoyi.cms.domain.CmsCategory;
import com.ruoyi.cms.service.ICmsCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 栏目管理Controller
 * 
 * @author ruoyi
 * @date 2025-07-14
 */
@RestController
@RequestMapping("/cms/category")
public class CmsCategoryController extends BaseController
{
    @Autowired
    private ICmsCategoryService cmsCategoryService;

    /**
     * 查询栏目管理列表
     */
    @PreAuthorize("@ss.hasPermi('cms:category:list')")
    @GetMapping("/list")
    public AjaxResult list(CmsCategory cmsCategory)
    {
        List<CmsCategory> list = cmsCategoryService.selectCmsCategoryList(cmsCategory);
        return success(list);
    }

    /**
     * 导出栏目管理列表
     */
    @PreAuthorize("@ss.hasPermi('cms:category:export')")
    @Log(title = "栏目管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmsCategory cmsCategory)
    {
        List<CmsCategory> list = cmsCategoryService.selectCmsCategoryList(cmsCategory);
        ExcelUtil<CmsCategory> util = new ExcelUtil<CmsCategory>(CmsCategory.class);
        util.exportExcel(response, list, "栏目管理数据");
    }

    /**
     * 获取栏目管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('cms:category:query')")
    @GetMapping(value = "/{categoryId}")
    public AjaxResult getInfo(@PathVariable("categoryId") Long categoryId)
    {
        return success(cmsCategoryService.selectCmsCategoryByCategoryId(categoryId));
    }

    /**
     * 新增栏目管理
     */
    @PreAuthorize("@ss.hasPermi('cms:category:add')")
    @Log(title = "栏目管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmsCategory cmsCategory)
    {
        return toAjax(cmsCategoryService.insertCmsCategory(cmsCategory));
    }

    /**
     * 修改栏目管理
     */
    @PreAuthorize("@ss.hasPermi('cms:category:edit')")
    @Log(title = "栏目管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmsCategory cmsCategory)
    {
        return toAjax(cmsCategoryService.updateCmsCategory(cmsCategory));
    }

    /**
     * 删除栏目管理
     */
    @PreAuthorize("@ss.hasPermi('cms:category:remove')")
    @Log(title = "栏目管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{categoryIds}")
    public AjaxResult remove(@PathVariable Long[] categoryIds)
    {
        return toAjax(cmsCategoryService.deleteCmsCategoryByCategoryIds(categoryIds));
    }
}
