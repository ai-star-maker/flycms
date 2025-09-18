package com.ruoyi.cms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 标签管理对象 cms_article_tag
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
public class CmsArticleTag extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标签编号 */
    private Long tagId;

    /** 文章编号 */
    @Excel(name = "文章编号")
    private Long articleId;

    /** tag名称(来自字典) */
    @Excel(name = "tag名称(来自字典)")
    private String tagName;

    public void setTagId(Long tagId) 
    {
        this.tagId = tagId;
    }

    public Long getTagId() 
    {
        return tagId;
    }

    public void setArticleId(Long articleId) 
    {
        this.articleId = articleId;
    }

    public Long getArticleId() 
    {
        return articleId;
    }

    public void setTagName(String tagName) 
    {
        this.tagName = tagName;
    }

    public String getTagName() 
    {
        return tagName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tagId", getTagId())
            .append("articleId", getArticleId())
            .append("tagName", getTagName())
            .toString();
    }
}
