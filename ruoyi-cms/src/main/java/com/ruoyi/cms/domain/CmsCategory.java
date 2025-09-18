package com.ruoyi.cms.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * 栏目管理对象 cms_category
 * 
 * @author ruoyi
 * @date 2025-07-14
 */
public class CmsCategory extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** 栏目ID */
    private Long categoryId;

    /** 栏目编码 */
    @Excel(name = "栏目编码")
    private String categoryCode;

    /** 父级编号 */
    @Excel(name = "父级编号")
    private String parentCode;

    /** 栏目名称 */
    @Excel(name = "栏目名称")
    private String categoryName;

    /** 站点编码 */
    @Excel(name = "站点编码")
    private String siteCode;

    /** 模块类型 */
    private String moduleType;

    /** 栏目图片 */
    @Excel(name = "栏目图片")
    private String image;

    /** 链接 */
    private String href;

    /** 关键字 */
    private String keywords;

    /** 描述 */
    private String description;

    /** 在导航中显示 */
    private String inMenu;

    /** 在分类页中显示列表 */
    private String inList;

    /** 展现模式 */
    @Excel(name = "展现模式")
    private String showModes;

    /** 需要审核 */
    private String isNeedAudit;

    /** 允许评论 */
    private String isCanComment;

    /** 视图配置 */
    private String viewConfig;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 备注信息 */
    private String remarks;

    /** 扩展 String 1 */
    private String extendS1;

    /** 扩展 String 2 */
    private String extendS2;

    /** 扩展 Integer 1 */
    private Long extendI1;

    /** 扩展 Integer 2 */
    private Long extendI2;

    /** 扩展 Float 1 */
    private BigDecimal extendF1;

    /** 扩展 Float 2 */
    private BigDecimal extendF2;

    /** 扩展 Date 1 */
    private Date extendD1;

    /** 扩展 Date 2 */
    private Date extendD2;

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }

    public void setCategoryCode(String categoryCode) 
    {
        this.categoryCode = categoryCode;
    }

    public String getCategoryCode() 
    {
        return categoryCode;
    }

    public void setParentCode(String parentCode) 
    {
        this.parentCode = parentCode;
    }

    public String getParentCode() 
    {
        return parentCode;
    }

    public void setCategoryName(String categoryName) 
    {
        this.categoryName = categoryName;
    }

    public String getCategoryName() 
    {
        return categoryName;
    }

    public void setSiteCode(String siteCode) 
    {
        this.siteCode = siteCode;
    }

    public String getSiteCode() 
    {
        return siteCode;
    }

    public void setModuleType(String moduleType) 
    {
        this.moduleType = moduleType;
    }

    public String getModuleType() 
    {
        return moduleType;
    }

    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }

    public void setHref(String href) 
    {
        this.href = href;
    }

    public String getHref() 
    {
        return href;
    }

    public void setKeywords(String keywords) 
    {
        this.keywords = keywords;
    }

    public String getKeywords() 
    {
        return keywords;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setInMenu(String inMenu) 
    {
        this.inMenu = inMenu;
    }

    public String getInMenu() 
    {
        return inMenu;
    }

    public void setInList(String inList) 
    {
        this.inList = inList;
    }

    public String getInList() 
    {
        return inList;
    }

    public void setShowModes(String showModes) 
    {
        this.showModes = showModes;
    }

    public String getShowModes() 
    {
        return showModes;
    }

    public void setIsNeedAudit(String isNeedAudit) 
    {
        this.isNeedAudit = isNeedAudit;
    }

    public String getIsNeedAudit() 
    {
        return isNeedAudit;
    }

    public void setIsCanComment(String isCanComment) 
    {
        this.isCanComment = isCanComment;
    }

    public String getIsCanComment() 
    {
        return isCanComment;
    }

    public void setViewConfig(String viewConfig) 
    {
        this.viewConfig = viewConfig;
    }

    public String getViewConfig() 
    {
        return viewConfig;
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

    public void setExtendS1(String extendS1) 
    {
        this.extendS1 = extendS1;
    }

    public String getExtendS1() 
    {
        return extendS1;
    }

    public void setExtendS2(String extendS2) 
    {
        this.extendS2 = extendS2;
    }

    public String getExtendS2() 
    {
        return extendS2;
    }

    public void setExtendI1(Long extendI1) 
    {
        this.extendI1 = extendI1;
    }

    public Long getExtendI1() 
    {
        return extendI1;
    }

    public void setExtendI2(Long extendI2) 
    {
        this.extendI2 = extendI2;
    }

    public Long getExtendI2() 
    {
        return extendI2;
    }

    public void setExtendF1(BigDecimal extendF1) 
    {
        this.extendF1 = extendF1;
    }

    public BigDecimal getExtendF1() 
    {
        return extendF1;
    }

    public void setExtendF2(BigDecimal extendF2) 
    {
        this.extendF2 = extendF2;
    }

    public BigDecimal getExtendF2() 
    {
        return extendF2;
    }

    public void setExtendD1(Date extendD1) 
    {
        this.extendD1 = extendD1;
    }

    public Date getExtendD1() 
    {
        return extendD1;
    }

    public void setExtendD2(Date extendD2) 
    {
        this.extendD2 = extendD2;
    }

    public Date getExtendD2() 
    {
        return extendD2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("categoryId", getCategoryId())
            .append("categoryCode", getCategoryCode())
            .append("parentCode", getParentCode())
            .append("ancestors", getAncestors())
            .append("categoryName", getCategoryName())
            .append("siteCode", getSiteCode())
            .append("moduleType", getModuleType())
            .append("image", getImage())
            .append("href", getHref())
            .append("keywords", getKeywords())
            .append("description", getDescription())
            .append("inMenu", getInMenu())
            .append("inList", getInList())
            .append("showModes", getShowModes())
            .append("isNeedAudit", getIsNeedAudit())
            .append("isCanComment", getIsCanComment())
            .append("viewConfig", getViewConfig())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remarks", getRemarks())
            .append("extendS1", getExtendS1())
            .append("extendS2", getExtendS2())
            .append("extendI1", getExtendI1())
            .append("extendI2", getExtendI2())
            .append("extendF1", getExtendF1())
            .append("extendF2", getExtendF2())
            .append("extendD1", getExtendD1())
            .append("extendD2", getExtendD2())
            .toString();
    }
}
