package com.ruoyi.cms.mapper;

import java.util.List;
import com.ruoyi.cms.domain.CmsArticle;

/**
 * 文章管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
public interface CmsArticleMapper 
{
    /**
     * 查询文章管理
     * 
     * @param articleId 文章管理主键
     * @return 文章管理
     */
    public CmsArticle selectCmsArticleByArticleId(Long articleId);

    /**
     * 查询文章管理列表
     * 
     * @param cmsArticle 文章管理
     * @return 文章管理集合
     */
    public List<CmsArticle> selectCmsArticleList(CmsArticle cmsArticle);

    /**
     * 新增文章管理
     * 
     * @param cmsArticle 文章管理
     * @return 结果
     */
    public int insertCmsArticle(CmsArticle cmsArticle);

    /**
     * 修改文章管理
     * 
     * @param cmsArticle 文章管理
     * @return 结果
     */
    public int updateCmsArticle(CmsArticle cmsArticle);

    /**
     * 删除文章管理
     * 
     * @param articleId 文章管理主键
     * @return 结果
     */
    public int deleteCmsArticleByArticleId(Long articleId);

    /**
     * 批量删除文章管理
     * 
     * @param articleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmsArticleByArticleIds(Long[] articleIds);
}
