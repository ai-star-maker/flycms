package com.ruoyi.cms.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.List;

/**
 * 站点管理对象 cms_site
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
public class CmsSite extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 站点ID */
    private Long siteId;

    /** 站点编码 */
    @Excel(name = "站点编码")
    private String siteCode;

    /** 站点名称 */
    @Excel(name = "站点名称")
    private String siteName;

    /** 站点排序号 */
    @Excel(name = "站点排序号")
    private Long siteSort;

    /** 站点标题 */
    @Excel(name = "站点标题")
    private String title;

    /** 站点Logo */
    @Excel(name = "站点Logo")
    private String logo;

    /** 站点域名 */
    @Excel(name = "站点域名")
    private String domain;

    /** 关键字 */
    @Excel(name = "关键字")
    private String keywords;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 主题 */
    @Excel(name = "主题")
    private String theme;

    /** 联系电话 */
    private String phone;

    /** 电子邮箱 */
    private String email;

    /** 公司地址 */
    private String address;

    /** icp备案号 */
    @Excel(name = "icp备案号")
    private String icp;

    /** 网安备案号 */
    @Excel(name = "网安备案号")
    private String registerNo;

    /** 版权信息 */
    @Excel(name = "版权信息")
    private String copyright;

    /** 状态（0正常 1删除 2停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=删除,2=停用")
    private String status;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** 站点的栏目信息 */
    private List<CmsCategory> categories;

    public void setSiteId(Long siteId) 
    {
        this.siteId = siteId;
    }

    public Long getSiteId() 
    {
        return siteId;
    }

    public void setSiteCode(String siteCode) 
    {
        this.siteCode = siteCode;
    }

    public String getSiteCode() 
    {
        return siteCode;
    }

    public void setSiteName(String siteName) 
    {
        this.siteName = siteName;
    }

    public String getSiteName() 
    {
        return siteName;
    }

    public void setSiteSort(Long siteSort) 
    {
        this.siteSort = siteSort;
    }

    public Long getSiteSort() 
    {
        return siteSort;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setLogo(String logo) 
    {
        this.logo = logo;
    }

    public String getLogo() 
    {
        return logo;
    }

    public void setDomain(String domain) 
    {
        this.domain = domain;
    }

    public String getDomain() 
    {
        return domain;
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

    public void setTheme(String theme) 
    {
        this.theme = theme;
    }

    public String getTheme() 
    {
        return theme;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }

    public void setIcp(String icp)
    {
        this.icp = icp;
    }

    public String getIcp()
    {
        return icp;
    }
    public void setRegisterNo(String registerNo)
    {
        this.registerNo = registerNo;
    }

    public String getRegisterNo()
    {
        return registerNo;
    }

    public void setCopyright(String copyright) 
    {
        this.copyright = copyright;
    }

    public String getCopyright() 
    {
        return copyright;
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
    public List<CmsCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<CmsCategory> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("siteId", getSiteId())
            .append("siteCode", getSiteCode())
            .append("siteName", getSiteName())
            .append("siteSort", getSiteSort())
            .append("title", getTitle())
            .append("logo", getLogo())
            .append("domain", getDomain())
            .append("keywords", getKeywords())
            .append("description", getDescription())
            .append("theme", getTheme())
            .append("copyright", getCopyright())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remarks", getRemarks())
            .toString();
    }
}
