package com.ruoyi.cms.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cms.mapper.CmsArticleMapper;
import com.ruoyi.cms.domain.CmsArticle;
import com.ruoyi.cms.service.ICmsArticleService;

/**
 * 文章管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
@Service
public class CmsArticleServiceImpl implements ICmsArticleService 
{
    @Autowired
    private CmsArticleMapper cmsArticleMapper;

    /**
     * 查询文章管理
     * 
     * @param articleId 文章管理主键
     * @return 文章管理
     */
    @Override
    public CmsArticle selectCmsArticleByArticleId(Long articleId)
    {
        return cmsArticleMapper.selectCmsArticleByArticleId(articleId);
    }

    /**
     * 查询文章管理列表
     * 
     * @param cmsArticle 文章管理
     * @return 文章管理
     */
    @Override
    public List<CmsArticle> selectCmsArticleList(CmsArticle cmsArticle)
    {
        return cmsArticleMapper.selectCmsArticleList(cmsArticle);
    }

    /**
     * 新增文章管理
     * 
     * @param cmsArticle 文章管理
     * @return 结果
     */
    @Override
    public int insertCmsArticle(CmsArticle cmsArticle)
    {
        cmsArticle.setCreateTime(DateUtils.getNowDate());
        return cmsArticleMapper.insertCmsArticle(cmsArticle);
    }

    /**
     * 修改文章管理
     * 
     * @param cmsArticle 文章管理
     * @return 结果
     */
    @Override
    public int updateCmsArticle(CmsArticle cmsArticle)
    {
        cmsArticle.setUpdateTime(DateUtils.getNowDate());
        return cmsArticleMapper.updateCmsArticle(cmsArticle);
    }

    /**
     * 批量删除文章管理
     * 
     * @param articleIds 需要删除的文章管理主键
     * @return 结果
     */
    @Override
    public int deleteCmsArticleByArticleIds(Long[] articleIds)
    {
        return cmsArticleMapper.deleteCmsArticleByArticleIds(articleIds);
    }

    /**
     * 删除文章管理信息
     * 
     * @param articleId 文章管理主键
     * @return 结果
     */
    @Override
    public int deleteCmsArticleByArticleId(Long articleId)
    {
        return cmsArticleMapper.deleteCmsArticleByArticleId(articleId);
    }
}
