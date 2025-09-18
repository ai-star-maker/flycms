package com.ruoyi.cms.service;

import java.util.List;
import com.ruoyi.cms.domain.CmsSite;

/**
 * 站点管理Service接口
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
public interface ICmsSiteService 
{
    /**
     * 查询站点管理
     * 
     * @param siteId 站点管理主键
     * @return 站点管理
     */
    public CmsSite selectCmsSiteBySiteId(Long siteId);

    /**
     * 查询站点管理列表
     * 
     * @param cmsSite 站点管理
     * @return 站点管理集合
     */
    public List<CmsSite> selectCmsSiteList(CmsSite cmsSite);

    /**
     * 新增站点管理
     * 
     * @param cmsSite 站点管理
     * @return 结果
     */
    public int insertCmsSite(CmsSite cmsSite);

    /**
     * 修改站点管理
     * 
     * @param cmsSite 站点管理
     * @return 结果
     */
    public int updateCmsSite(CmsSite cmsSite);

    /**
     * 批量删除站点管理
     * 
     * @param siteIds 需要删除的站点管理主键集合
     * @return 结果
     */
    public int deleteCmsSiteBySiteIds(Long[] siteIds);

    /**
     * 删除站点管理信息
     * 
     * @param siteId 站点管理主键
     * @return 结果
     */
    public int deleteCmsSiteBySiteId(Long siteId);
}
