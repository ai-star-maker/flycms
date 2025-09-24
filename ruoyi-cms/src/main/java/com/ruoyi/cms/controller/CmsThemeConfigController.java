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
import com.ruoyi.cms.domain.CmsThemeConfig;
import com.ruoyi.cms.service.ICmsThemeConfigService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 主题配置Controller
 * 
 * @author ruoyi
 * @date 2025-09-19
 */
@RestController
@RequestMapping("/cms/themeConfig")
public class CmsThemeConfigController extends BaseController
{
    @Autowired
    private ICmsThemeConfigService cmsThemeConfigService;

    /**
     * 查询主题配置列表
     */
    @PreAuthorize("@ss.hasPermi('cms:themeConfig:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmsThemeConfig cmsThemeConfig)
    {
        startPage();
        List<CmsThemeConfig> list = cmsThemeConfigService.selectCmsThemeConfigList(cmsThemeConfig);
        return getDataTable(list);
    }

    /**
     * 导出主题配置列表
     */
    @PreAuthorize("@ss.hasPermi('cms:themeConfig:export')")
    @Log(title = "主题配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmsThemeConfig cmsThemeConfig)
    {
        List<CmsThemeConfig> list = cmsThemeConfigService.selectCmsThemeConfigList(cmsThemeConfig);
        ExcelUtil<CmsThemeConfig> util = new ExcelUtil<CmsThemeConfig>(CmsThemeConfig.class);
        util.exportExcel(response, list, "主题配置数据");
    }

    /**
     * 获取主题配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('cms:themeConfig:query')")
    @GetMapping(value = "/{configId}")
    public AjaxResult getInfo(@PathVariable("configId") Long configId)
    {
        return success(cmsThemeConfigService.selectCmsThemeConfigByConfigId(configId));
    }

    /**
     * 新增主题配置
     */
    @PreAuthorize("@ss.hasPermi('cms:themeConfig:add')")
    @Log(title = "主题配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmsThemeConfig cmsThemeConfig)
    {
        return toAjax(cmsThemeConfigService.insertCmsThemeConfig(cmsThemeConfig));
    }

    /**
     * 修改主题配置
     */
    @PreAuthorize("@ss.hasPermi('cms:themeConfig:edit')")
    @Log(title = "主题配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmsThemeConfig cmsThemeConfig)
    {
        return toAjax(cmsThemeConfigService.updateCmsThemeConfig(cmsThemeConfig));
    }

    /**
     * 删除主题配置
     */
    @PreAuthorize("@ss.hasPermi('cms:themeConfig:remove')")
    @Log(title = "主题配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{configIds}")
    public AjaxResult remove(@PathVariable Long[] configIds)
    {
        return toAjax(cmsThemeConfigService.deleteCmsThemeConfigByConfigIds(configIds));
    }
}
