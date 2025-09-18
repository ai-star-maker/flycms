package com.ruoyi.cms.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cms.mapper.CmsAdvertiseMapper;
import com.ruoyi.cms.domain.CmsAdvertise;
import com.ruoyi.cms.service.ICmsAdvertiseService;

/**
 * 广告管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
@Service
public class CmsAdvertiseServiceImpl implements ICmsAdvertiseService 
{
    @Autowired
    private CmsAdvertiseMapper cmsAdvertiseMapper;

    /**
     * 查询广告管理
     * 
     * @param advertiseId 广告管理主键
     * @return 广告管理
     */
    @Override
    public CmsAdvertise selectCmsAdvertiseByAdvertiseId(Long advertiseId)
    {
        return cmsAdvertiseMapper.selectCmsAdvertiseByAdvertiseId(advertiseId);
    }

    /**
     * 查询广告管理列表
     * 
     * @param cmsAdvertise 广告管理
     * @return 广告管理
     */
    @Override
    public List<CmsAdvertise> selectCmsAdvertiseList(CmsAdvertise cmsAdvertise)
    {
        return cmsAdvertiseMapper.selectCmsAdvertiseList(cmsAdvertise);
    }

    /**
     * 新增广告管理
     * 
     * @param cmsAdvertise 广告管理
     * @return 结果
     */
    @Override
    public int insertCmsAdvertise(CmsAdvertise cmsAdvertise)
    {
        cmsAdvertise.setCreateTime(DateUtils.getNowDate());
        return cmsAdvertiseMapper.insertCmsAdvertise(cmsAdvertise);
    }

    /**
     * 修改广告管理
     * 
     * @param cmsAdvertise 广告管理
     * @return 结果
     */
    @Override
    public int updateCmsAdvertise(CmsAdvertise cmsAdvertise)
    {
        cmsAdvertise.setUpdateTime(DateUtils.getNowDate());
        return cmsAdvertiseMapper.updateCmsAdvertise(cmsAdvertise);
    }

    /**
     * 批量删除广告管理
     * 
     * @param advertiseIds 需要删除的广告管理主键
     * @return 结果
     */
    @Override
    public int deleteCmsAdvertiseByAdvertiseIds(Long[] advertiseIds)
    {
        return cmsAdvertiseMapper.deleteCmsAdvertiseByAdvertiseIds(advertiseIds);
    }

    /**
     * 删除广告管理信息
     * 
     * @param advertiseId 广告管理主键
     * @return 结果
     */
    @Override
    public int deleteCmsAdvertiseByAdvertiseId(Long advertiseId)
    {
        return cmsAdvertiseMapper.deleteCmsAdvertiseByAdvertiseId(advertiseId);
    }
}
