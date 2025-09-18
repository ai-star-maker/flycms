package com.ruoyi.cms.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文章统计对象 cms_article_count
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
public class CmsArticleCount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 统计编号 */
    private Long countId;

    /** 文章编号 */
    @Excel(name = "文章编号")
    private Long articleId;

    /** 统计日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date countDate;

    /** 总访问数 */
    @Excel(name = "总访问数")
    private Long views;

    /** 总评论数 */
    @Excel(name = "总评论数")
    private Long comments;

    /** 总下载数 */
    @Excel(name = "总下载数")
    private Long downloads;

    /** 总顶数 */
    @Excel(name = "总顶数")
    private Long ups;

    /** 总踩数 */
    @Excel(name = "总踩数")
    private Long downs;

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

    public void setCountId(Long countId) 
    {
        this.countId = countId;
    }

    public Long getCountId() 
    {
        return countId;
    }

    public void setArticleId(Long articleId) 
    {
        this.articleId = articleId;
    }

    public Long getArticleId() 
    {
        return articleId;
    }

    public void setCountDate(Date countDate) 
    {
        this.countDate = countDate;
    }

    public Date getCountDate() 
    {
        return countDate;
    }

    public void setViews(Long views) 
    {
        this.views = views;
    }

    public Long getViews() 
    {
        return views;
    }

    public void setComments(Long comments) 
    {
        this.comments = comments;
    }

    public Long getComments() 
    {
        return comments;
    }

    public void setDownloads(Long downloads) 
    {
        this.downloads = downloads;
    }

    public Long getDownloads() 
    {
        return downloads;
    }

    public void setUps(Long ups) 
    {
        this.ups = ups;
    }

    public Long getUps() 
    {
        return ups;
    }

    public void setDowns(Long downs) 
    {
        this.downs = downs;
    }

    public Long getDowns() 
    {
        return downs;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("countId", getCountId())
            .append("articleId", getArticleId())
            .append("countDate", getCountDate())
            .append("views", getViews())
            .append("comments", getComments())
            .append("downloads", getDownloads())
            .append("ups", getUps())
            .append("downs", getDowns())
            .append("remarks", getRemarks())
            .append("extendS1", getExtendS1())
            .append("extendS2", getExtendS2())
            .append("extendI1", getExtendI1())
            .append("extendI2", getExtendI2())
            .toString();
    }
}
