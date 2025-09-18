package com.ruoyi.cms.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cms.mapper.CmsThemeConfigMapper;
import com.ruoyi.cms.domain.CmsThemeConfig;
import com.ruoyi.cms.service.ICmsThemeConfigService;

/**
 * 主题配置Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-08-24
 */
@Service
public class CmsThemeConfigServiceImpl implements ICmsThemeConfigService 
{
    @Autowired
    private CmsThemeConfigMapper cmsThemeConfigMapper;

    /**
     * 查询主题配置
     * 
     * @param configId 主题配置主键
     * @return 主题配置
     */
    @Override
    public CmsThemeConfig selectCmsThemeConfigByConfigId(Long configId)
    {
        return cmsThemeConfigMapper.selectCmsThemeConfigByConfigId(configId);
    }

    /**
     * 查询主题配置列表
     * 
     * @param cmsThemeConfig 主题配置
     * @return 主题配置
     */
    @Override
    public List<CmsThemeConfig> selectCmsThemeConfigList(CmsThemeConfig cmsThemeConfig)
    {
        return cmsThemeConfigMapper.selectCmsThemeConfigList(cmsThemeConfig);
    }

    /**
     * 新增主题配置
     * 
     * @param cmsThemeConfig 主题配置
     * @return 结果
     */
    @Override
    public int insertCmsThemeConfig(CmsThemeConfig cmsThemeConfig)
    {
        cmsThemeConfig.setCreateTime(DateUtils.getNowDate());
        return cmsThemeConfigMapper.insertCmsThemeConfig(cmsThemeConfig);
    }

    /**
     * 修改主题配置
     * 
     * @param cmsThemeConfig 主题配置
     * @return 结果
     */
    @Override
    public int updateCmsThemeConfig(CmsThemeConfig cmsThemeConfig)
    {
        cmsThemeConfig.setUpdateTime(DateUtils.getNowDate());
        return cmsThemeConfigMapper.updateCmsThemeConfig(cmsThemeConfig);
    }

    /**
     * 批量删除主题配置
     * 
     * @param configIds 需要删除的主题配置主键
     * @return 结果
     */
    @Override
    public int deleteCmsThemeConfigByConfigIds(Long[] configIds)
    {
        return cmsThemeConfigMapper.deleteCmsThemeConfigByConfigIds(configIds);
    }

    /**
     * 删除主题配置信息
     * 
     * @param configId 主题配置主键
     * @return 结果
     */
    @Override
    public int deleteCmsThemeConfigByConfigId(Long configId)
    {
        return cmsThemeConfigMapper.deleteCmsThemeConfigByConfigId(configId);
    }
}
