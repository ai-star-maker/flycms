package com.ruoyi.cms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 主题配置对象 cms_theme_config
 * 
 * @author ruoyi
 * @date 2025-08-24
 */
public class CmsThemeConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 配置编号 */
    private Long configId;

    /** 主题编号 */
    @Excel(name = "主题编号")
    private Long themeId;

    /** 配置名称 */
    @Excel(name = "配置名称")
    private String configName;

    /** 配置值 */
    @Excel(name = "配置值")
    private String configValue;

    /** 状态（0正常 1删除 2停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=删除,2=停用")
    private String status;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    public void setConfigId(Long configId) 
    {
        this.configId = configId;
    }

    public Long getConfigId() 
    {
        return configId;
    }

    public void setThemeId(Long themeId) 
    {
        this.themeId = themeId;
    }

    public Long getThemeId() 
    {
        return themeId;
    }

    public void setConfigName(String configName) 
    {
        this.configName = configName;
    }

    public String getConfigName() 
    {
        return configName;
    }

    public void setConfigValue(String configValue) 
    {
        this.configValue = configValue;
    }

    public String getConfigValue() 
    {
        return configValue;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("configId", getConfigId())
            .append("themeId", getThemeId())
            .append("configName", getConfigName())
            .append("configValue", getConfigValue())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remarks", getRemarks())
            .toString();
    }
}
