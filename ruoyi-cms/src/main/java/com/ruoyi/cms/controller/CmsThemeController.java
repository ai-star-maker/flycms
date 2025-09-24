package com.ruoyi.cms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.cms.domain.CmsCategory;
import com.ruoyi.cms.domain.CmsThemeConfig;
import com.ruoyi.cms.service.ICmsThemeConfigService;
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
import com.ruoyi.cms.domain.CmsTheme;
import com.ruoyi.cms.service.ICmsThemeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 网站主题Controller
 * 
 * @author ruoyi
 * @date 2025-08-24
 */
@RestController
@RequestMapping("/cms/theme")
public class CmsThemeController extends BaseController
{
    @Autowired
    private ICmsThemeService cmsThemeService;
    @Autowired
    private ICmsThemeConfigService cmsThemeConfigService;

    /**
     * 查询网站主题列表
     */
    @PreAuthorize("@ss.hasPermi('cms:theme:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmsTheme cmsTheme)
    {
        startPage();
        List<CmsTheme> list = cmsThemeService.selectCmsThemeList(cmsTheme);
        return getDataTable(list);
    }

    /**
     * 查询网站主题列表和配置信息
     */
    @Anonymous
    @GetMapping("/config")
    public TableDataInfo config(CmsTheme cmsTheme)
    {
        startPage();
        List<CmsTheme> list = cmsThemeService.selectCmsThemeList(cmsTheme);
        CmsThemeConfig themeConfig = new CmsThemeConfig();
        themeConfig.setStatus("0");
        List<CmsThemeConfig> configs = cmsThemeConfigService.selectCmsThemeConfigList(themeConfig);
        list.forEach((theme) -> {
            Map<String, String> kv = new HashMap<>();
            configs.forEach((config) -> {
                if (theme.getThemeName().equals(config.getThemeName())) {
                    kv.put(config.getConfigName(), config.getConfigValue());
                }
            });
            theme.setConfigs(kv);
        });
        return getDataTable(list);
    }

    /**
     * 导出网站主题列表
     */
    @PreAuthorize("@ss.hasPermi('cms:theme:export')")
    @Log(title = "网站主题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmsTheme cmsTheme)
    {
        List<CmsTheme> list = cmsThemeService.selectCmsThemeList(cmsTheme);
        ExcelUtil<CmsTheme> util = new ExcelUtil<CmsTheme>(CmsTheme.class);
        util.exportExcel(response, list, "网站主题数据");
    }

    /**
     * 获取网站主题详细信息
     */
    @PreAuthorize("@ss.hasPermi('cms:theme:query')")
    @GetMapping(value = "/{themeId}")
    public AjaxResult getInfo(@PathVariable("themeId") Long themeId)
    {
        return success(cmsThemeService.selectCmsThemeByThemeId(themeId));
    }

    /**
     * 新增网站主题
     */
    @PreAuthorize("@ss.hasPermi('cms:theme:add')")
    @Log(title = "网站主题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmsTheme cmsTheme)
    {
        return toAjax(cmsThemeService.insertCmsTheme(cmsTheme));
    }

    /**
     * 修改网站主题
     */
    @PreAuthorize("@ss.hasPermi('cms:theme:edit')")
    @Log(title = "网站主题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmsTheme cmsTheme)
    {
        return toAjax(cmsThemeService.updateCmsTheme(cmsTheme));
    }

    /**
     * 删除网站主题
     */
    @PreAuthorize("@ss.hasPermi('cms:theme:remove')")
    @Log(title = "网站主题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{themeIds}")
    public AjaxResult remove(@PathVariable Long[] themeIds)
    {
        return toAjax(cmsThemeService.deleteCmsThemeByThemeIds(themeIds));
    }
}
