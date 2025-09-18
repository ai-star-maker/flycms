package com.ruoyi.cms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 网站搜索对象 cms_search
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
public class CmsSearch extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long searchId;

    /** 站点编码 */
    @Excel(name = "站点编码")
    private String siteCode;

    /** 关键字 */
    @Excel(name = "关键字")
    private String keyword;

    /** 使用次数 */
    @Excel(name = "使用次数")
    private Long searchTimes;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** 扩展 String 1 */
    private String extendS1;

    /** 扩展 Integer 1 */
    private Long extendI1;

    public void setSearchId(Long searchId) 
    {
        this.searchId = searchId;
    }

    public Long getSearchId() 
    {
        return searchId;
    }

    public void setSiteCode(String siteCode) 
    {
        this.siteCode = siteCode;
    }

    public String getSiteCode() 
    {
        return siteCode;
    }

    public void setKeyword(String keyword) 
    {
        this.keyword = keyword;
    }

    public String getKeyword() 
    {
        return keyword;
    }

    public void setSearchTimes(Long searchTimes) 
    {
        this.searchTimes = searchTimes;
    }

    public Long getSearchTimes() 
    {
        return searchTimes;
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

    public void setExtendI1(Long extendI1) 
    {
        this.extendI1 = extendI1;
    }

    public Long getExtendI1() 
    {
        return extendI1;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("searchId", getSearchId())
            .append("siteCode", getSiteCode())
            .append("keyword", getKeyword())
            .append("searchTimes", getSearchTimes())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("remarks", getRemarks())
            .append("extendS1", getExtendS1())
            .append("extendI1", getExtendI1())
            .toString();
    }
}
