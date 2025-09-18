package com.ruoyi.cms.mapper;

import java.util.List;
import com.ruoyi.cms.domain.CmsAdvertise;

/**
 * 广告管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
public interface CmsAdvertiseMapper 
{
    /**
     * 查询广告管理
     * 
     * @param advertiseId 广告管理主键
     * @return 广告管理
     */
    public CmsAdvertise selectCmsAdvertiseByAdvertiseId(Long advertiseId);

    /**
     * 查询广告管理列表
     * 
     * @param cmsAdvertise 广告管理
     * @return 广告管理集合
     */
    public List<CmsAdvertise> selectCmsAdvertiseList(CmsAdvertise cmsAdvertise);

    /**
     * 新增广告管理
     * 
     * @param cmsAdvertise 广告管理
     * @return 结果
     */
    public int insertCmsAdvertise(CmsAdvertise cmsAdvertise);

    /**
     * 修改广告管理
     * 
     * @param cmsAdvertise 广告管理
     * @return 结果
     */
    public int updateCmsAdvertise(CmsAdvertise cmsAdvertise);

    /**
     * 删除广告管理
     * 
     * @param advertiseId 广告管理主键
     * @return 结果
     */
    public int deleteCmsAdvertiseByAdvertiseId(Long advertiseId);

    /**
     * 批量删除广告管理
     * 
     * @param advertiseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmsAdvertiseByAdvertiseIds(Long[] advertiseIds);
}
