package com.ruoyi.cms.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 广告管理对象 cms_advertise
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
public class CmsAdvertise extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 广告编号 */
    private Long advertiseId;

    /** 站点编码 */
    @Excel(name = "站点编码")
    private String siteCode;

    /** 广告名称 */
    @Excel(name = "广告名称")
    private String advertiseName;

    /** 广告类型 */
    @Excel(name = "广告类型")
    private String advertiseType;

    /** 广告权重 */
    private Long advertiseWeight;

    /** 广告图片 */
    @Excel(name = "广告图片")
    private String image;

    /** 描述 */
    private String description;

    /** 链接 */
    private String href;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 状态（0正常 1删除 2停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=删除,2=停用")
    private String status;

    /** 备注信息 */
    private String remarks;

    public void setAdvertiseId(Long advertiseId) 
    {
        this.advertiseId = advertiseId;
    }

    public Long getAdvertiseId() 
    {
        return advertiseId;
    }

    public void setSiteCode(String siteCode) 
    {
        this.siteCode = siteCode;
    }

    public String getSiteCode() 
    {
        return siteCode;
    }

    public void setAdvertiseName(String advertiseName) 
    {
        this.advertiseName = advertiseName;
    }

    public String getAdvertiseName() 
    {
        return advertiseName;
    }

    public void setAdvertiseType(String advertiseType) 
    {
        this.advertiseType = advertiseType;
    }

    public String getAdvertiseType() 
    {
        return advertiseType;
    }

    public void setAdvertiseWeight(Long advertiseWeight) 
    {
        this.advertiseWeight = advertiseWeight;
    }

    public Long getAdvertiseWeight() 
    {
        return advertiseWeight;
    }

    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setHref(String href) 
    {
        this.href = href;
    }

    public String getHref() 
    {
        return href;
    }

    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }

    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
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
            .append("advertiseId", getAdvertiseId())
            .append("siteCode", getSiteCode())
            .append("advertiseName", getAdvertiseName())
            .append("advertiseType", getAdvertiseType())
            .append("advertiseWeight", getAdvertiseWeight())
            .append("image", getImage())
            .append("description", getDescription())
            .append("href", getHref())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remarks", getRemarks())
            .toString();
    }
}
