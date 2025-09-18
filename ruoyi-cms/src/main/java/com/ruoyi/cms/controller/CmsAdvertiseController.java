package com.ruoyi.cms.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

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
import com.ruoyi.cms.domain.CmsAdvertise;
import com.ruoyi.cms.service.ICmsAdvertiseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 广告管理Controller
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
@RestController
@RequestMapping("/cms/advertise")
public class CmsAdvertiseController extends BaseController
{
    @Autowired
    private ICmsAdvertiseService cmsAdvertiseService;

    /**
     * 查询广告管理列表 + web anonymous
     */
    @Anonymous
    @GetMapping("/list")
    public TableDataInfo list(CmsAdvertise cmsAdvertise)
    {
        startPage();
        List<CmsAdvertise> list = cmsAdvertiseService.selectCmsAdvertiseList(cmsAdvertise);
        return getDataTable(list);
    }

    /**
     * 导出广告管理列表
     */
    @PreAuthorize("@ss.hasPermi('cms:advertise:export')")
    @Log(title = "广告管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmsAdvertise cmsAdvertise)
    {
        List<CmsAdvertise> list = cmsAdvertiseService.selectCmsAdvertiseList(cmsAdvertise);
        ExcelUtil<CmsAdvertise> util = new ExcelUtil<CmsAdvertise>(CmsAdvertise.class);
        util.exportExcel(response, list, "广告管理数据");
    }

    /**
     * 获取广告管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('cms:advertise:query')")
    @GetMapping(value = "/{advertiseId}")
    public AjaxResult getInfo(@PathVariable("advertiseId") Long advertiseId)
    {
        return success(cmsAdvertiseService.selectCmsAdvertiseByAdvertiseId(advertiseId));
    }

    /**
     * 新增广告管理
     */
    @PreAuthorize("@ss.hasPermi('cms:advertise:add')")
    @Log(title = "广告管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmsAdvertise cmsAdvertise)
    {
        return toAjax(cmsAdvertiseService.insertCmsAdvertise(cmsAdvertise));
    }

    /**
     * 修改广告管理
     */
    @PreAuthorize("@ss.hasPermi('cms:advertise:edit')")
    @Log(title = "广告管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmsAdvertise cmsAdvertise)
    {
        return toAjax(cmsAdvertiseService.updateCmsAdvertise(cmsAdvertise));
    }

    /**
     * 删除广告管理
     */
    @PreAuthorize("@ss.hasPermi('cms:advertise:remove')")
    @Log(title = "广告管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{advertiseIds}")
    public AjaxResult remove(@PathVariable Long[] advertiseIds)
    {
        return toAjax(cmsAdvertiseService.deleteCmsAdvertiseByAdvertiseIds(advertiseIds));
    }
}
