package com.ruoyi.cms.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cms.mapper.CmsSiteMapper;
import com.ruoyi.cms.domain.CmsSite;
import com.ruoyi.cms.service.ICmsSiteService;

/**
 * 站点管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
@Service
public class CmsSiteServiceImpl implements ICmsSiteService 
{
    @Autowired
    private CmsSiteMapper cmsSiteMapper;

    /**
     * 查询站点管理
     * 
     * @param siteId 站点管理主键
     * @return 站点管理
     */
    @Override
    public CmsSite selectCmsSiteBySiteId(Long siteId)
    {
        return cmsSiteMapper.selectCmsSiteBySiteId(siteId);
    }

    /**
     * 查询站点管理列表
     * 
     * @param cmsSite 站点管理
     * @return 站点管理
     */
    @Override
    public List<CmsSite> selectCmsSiteList(CmsSite cmsSite)
    {
        return cmsSiteMapper.selectCmsSiteList(cmsSite);
    }

    /**
     * 新增站点管理
     * 
     * @param cmsSite 站点管理
     * @return 结果
     */
    @Override
    public int insertCmsSite(CmsSite cmsSite)
    {
        cmsSite.setCreateTime(DateUtils.getNowDate());
        return cmsSiteMapper.insertCmsSite(cmsSite);
    }

    /**
     * 修改站点管理
     * 
     * @param cmsSite 站点管理
     * @return 结果
     */
    @Override
    public int updateCmsSite(CmsSite cmsSite)
    {
        cmsSite.setUpdateTime(DateUtils.getNowDate());
        return cmsSiteMapper.updateCmsSite(cmsSite);
    }

    /**
     * 批量删除站点管理
     * 
     * @param siteIds 需要删除的站点管理主键
     * @return 结果
     */
    @Override
    public int deleteCmsSiteBySiteIds(Long[] siteIds)
    {
        return cmsSiteMapper.deleteCmsSiteBySiteIds(siteIds);
    }

    /**
     * 删除站点管理信息
     * 
     * @param siteId 站点管理主键
     * @return 结果
     */
    @Override
    public int deleteCmsSiteBySiteId(Long siteId)
    {
        return cmsSiteMapper.deleteCmsSiteBySiteId(siteId);
    }
}
