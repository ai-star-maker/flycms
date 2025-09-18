package com.ruoyi.cms.mapper;

import java.util.List;
import com.ruoyi.cms.domain.CmsArticleCount;

/**
 * 文章统计Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
public interface CmsArticleCountMapper 
{
    /**
     * 查询文章统计
     * 
     * @param countId 文章统计主键
     * @return 文章统计
     */
    public CmsArticleCount selectCmsArticleCountByCountId(Long countId);

    /**
     * 查询文章统计列表
     * 
     * @param cmsArticleCount 文章统计
     * @return 文章统计集合
     */
    public List<CmsArticleCount> selectCmsArticleCountList(CmsArticleCount cmsArticleCount);

    /**
     * 新增文章统计
     * 
     * @param cmsArticleCount 文章统计
     * @return 结果
     */
    public int insertCmsArticleCount(CmsArticleCount cmsArticleCount);

    /**
     * 修改文章统计
     * 
     * @param cmsArticleCount 文章统计
     * @return 结果
     */
    public int updateCmsArticleCount(CmsArticleCount cmsArticleCount);

    /**
     * 删除文章统计
     * 
     * @param countId 文章统计主键
     * @return 结果
     */
    public int deleteCmsArticleCountByCountId(Long countId);

    /**
     * 批量删除文章统计
     * 
     * @param countIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmsArticleCountByCountIds(Long[] countIds);
}
