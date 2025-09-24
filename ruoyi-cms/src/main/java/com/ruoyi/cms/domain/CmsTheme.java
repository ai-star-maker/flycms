package com.ruoyi.cms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.List;
import java.util.Map;

/**
 * 网站主题对象 cms_theme
 * 
 * @author ruoyi
 * @date 2025-08-24
 */
public class CmsTheme extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主题编号 */
    private Long themeId;

    /** 主题名称 */
    @Excel(name = "主题名称")
    private String themeName;

    /** 主题样式图 */
    @Excel(name = "主题样式图")
    private String themeStyle;

    /** 主题作者 */
    @Excel(name = "主题作者")
    private String themeAuthor;

    /** 主题介绍 */
    @Excel(name = "主题介绍")
    private String themeInfo;

    /** 主题版本号 */
    @Excel(name = "主题版本号")
    private String themeVersion;

    /** 是否启用0启用 1停用 */
    @Excel(name = "是否启用0启用 1停用")
    private String themeEnabled;

    /** 是否可以更新0可以 1否 */
    private String themeUpdate;

    /** 联系方式 */
    private String themeTouch;


    /** 配置信息 */
    private Map<String, String> configs;

    public void setThemeId(Long themeId) 
    {
        this.themeId = themeId;
    }

    public Long getThemeId() 
    {
        return themeId;
    }

    public void setThemeName(String themeName) 
    {
        this.themeName = themeName;
    }

    public String getThemeName() 
    {
        return themeName;
    }

    public void setThemeStyle(String themeStyle) 
    {
        this.themeStyle = themeStyle;
    }

    public String getThemeStyle() 
    {
        return themeStyle;
    }

    public void setThemeAuthor(String themeAuthor) 
    {
        this.themeAuthor = themeAuthor;
    }

    public String getThemeAuthor() 
    {
        return themeAuthor;
    }

    public void setThemeInfo(String themeInfo) 
    {
        this.themeInfo = themeInfo;
    }

    public String getThemeInfo() 
    {
        return themeInfo;
    }

    public void setThemeVersion(String themeVersion) 
    {
        this.themeVersion = themeVersion;
    }

    public String getThemeVersion() 
    {
        return themeVersion;
    }

    public void setThemeEnabled(String themeEnabled) 
    {
        this.themeEnabled = themeEnabled;
    }

    public String getThemeEnabled() 
    {
        return themeEnabled;
    }

    public void setThemeUpdate(String themeUpdate) 
    {
        this.themeUpdate = themeUpdate;
    }

    public String getThemeUpdate() 
    {
        return themeUpdate;
    }

    public void setThemeTouch(String themeTouch) 
    {
        this.themeTouch = themeTouch;
    }

    public String getThemeTouch() 
    {
        return themeTouch;
    }

    public Map<String, String> getConfigs() {
        return configs;
    }

    public void setConfigs(Map<String, String> configs) {
        this.configs = configs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("themeId", getThemeId())
            .append("themeName", getThemeName())
            .append("themeStyle", getThemeStyle())
            .append("themeAuthor", getThemeAuthor())
            .append("themeInfo", getThemeInfo())
            .append("themeVersion", getThemeVersion())
            .append("themeEnabled", getThemeEnabled())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("themeUpdate", getThemeUpdate())
            .append("themeTouch", getThemeTouch())
            .toString();
    }
}
