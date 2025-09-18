package com.ruoyi.cms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文章管理对象 cms_article
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
public class CmsArticle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 文章编号 */
    private Long articleId;

    /** 站点编码 */
    @Excel(name = "站点编码")
    private String siteCode;

    /** 栏目编码 */
    @Excel(name = "栏目编码")
    private String categoryCode;

    /** 内容标题 */
    @Excel(name = "内容标题")
    private String title;

    /** 关键字 */
    @Excel(name = "关键字")
    private String keywords;

    /** 描述 */
    private String description;

    /** 宣传图片 */
    @Excel(name = "宣传图片")
    private String image;

    /** 文章内容 */
    private String content;

    /** 外部链接 */
    private String href;

    /** 权重 */
    private Long weight;

    /** 来源 */
    private String source;

    /** 文章出处 */
    private String copyFrom;

    /** 视图配置 */
    private String viewConfig;

    /** 通过审核 */
    @Excel(name = "通过审核")
    private String isAudited;

    /** 审核者 */
    @Excel(name = "审核者")
    private String auditBy;

    /** 允许评论 */
    private String isCanComment;

    /** 状态 */
    private String status;

    /** 备注信息 */
    private String remarks;

    /** 扩展 String 1 */
    private String extendS1;

    /** 扩展 String 2 */
    private String extendS2;

    /** 文件的统计数据 */
    private CmsArticleCount articleCount;


    public CmsArticleCount getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(CmsArticleCount articleCount) {
        this.articleCount = articleCount;
    }

    public void setArticleId(Long articleId) 
    {
        this.articleId = articleId;
    }

    public Long getArticleId() 
    {
        return articleId;
    }

    public void setSiteCode(String siteCode) 
    {
        this.siteCode = siteCode;
    }

    public String getSiteCode() 
    {
        return siteCode;
    }

    public void setCategoryCode(String categoryCode) 
    {
        this.categoryCode = categoryCode;
    }

    public String getCategoryCode() 
    {
        return categoryCode;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
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

    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setHref(String href) 
    {
        this.href = href;
    }

    public String getHref() 
    {
        return href;
    }

    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
    {
        return weight;
    }

    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }

    public void setCopyFrom(String copyFrom) 
    {
        this.copyFrom = copyFrom;
    }

    public String getCopyFrom() 
    {
        return copyFrom;
    }

    public void setViewConfig(String viewConfig) 
    {
        this.viewConfig = viewConfig;
    }

    public String getViewConfig() 
    {
        return viewConfig;
    }

    public void setIsAudited(String isAudited) 
    {
        this.isAudited = isAudited;
    }

    public String getIsAudited() 
    {
        return isAudited;
    }

    public void setAuditBy(String auditBy) 
    {
        this.auditBy = auditBy;
    }

    public String getAuditBy() 
    {
        return auditBy;
    }

    public void setIsCanComment(String isCanComment) 
    {
        this.isCanComment = isCanComment;
    }

    public String getIsCanComment() 
    {
        return isCanComment;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("articleId", getArticleId())
            .append("siteCode", getSiteCode())
            .append("categoryCode", getCategoryCode())
            .append("title", getTitle())
            .append("keywords", getKeywords())
            .append("description", getDescription())
            .append("image", getImage())
            .append("content", getContent())
            .append("href", getHref())
            .append("weight", getWeight())
            .append("source", getSource())
            .append("copyFrom", getCopyFrom())
            .append("viewConfig", getViewConfig())
            .append("isAudited", getIsAudited())
            .append("auditBy", getAuditBy())
            .append("isCanComment", getIsCanComment())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remarks", getRemarks())
            .append("extendS1", getExtendS1())
            .append("extendS2", getExtendS2())
            .toString();
    }
}
