package com.ruoyi.cms.mapper;

import java.util.List;
import com.ruoyi.cms.domain.CmsThemeConfig;

/**
 * 主题配置Mapper接口
 * 
 * @author ruoyi
 * @date 2025-08-24
 */
public interface CmsThemeConfigMapper 
{
    /**
     * 查询主题配置
     * 
     * @param configId 主题配置主键
     * @return 主题配置
     */
    public CmsThemeConfig selectCmsThemeConfigByConfigId(Long configId);

    /**
     * 查询主题配置列表
     * 
     * @param cmsThemeConfig 主题配置
     * @return 主题配置集合
     */
    public List<CmsThemeConfig> selectCmsThemeConfigList(CmsThemeConfig cmsThemeConfig);

    /**
     * 新增主题配置
     * 
     * @param cmsThemeConfig 主题配置
     * @return 结果
     */
    public int insertCmsThemeConfig(CmsThemeConfig cmsThemeConfig);

    /**
     * 修改主题配置
     * 
     * @param cmsThemeConfig 主题配置
     * @return 结果
     */
    public int updateCmsThemeConfig(CmsThemeConfig cmsThemeConfig);

    /**
     * 删除主题配置
     * 
     * @param configId 主题配置主键
     * @return 结果
     */
    public int deleteCmsThemeConfigByConfigId(Long configId);

    /**
     * 批量删除主题配置
     * 
     * @param configIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmsThemeConfigByConfigIds(Long[] configIds);
}
