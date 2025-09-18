package com.ruoyi.cms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cms.mapper.CmsArticleTagMapper;
import com.ruoyi.cms.domain.CmsArticleTag;
import com.ruoyi.cms.service.ICmsArticleTagService;

/**
 * 标签管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
@Service
public class CmsArticleTagServiceImpl implements ICmsArticleTagService 
{
    @Autowired
    private CmsArticleTagMapper cmsArticleTagMapper;

    /**
     * 查询标签管理
     * 
     * @param tagId 标签管理主键
     * @return 标签管理
     */
    @Override
    public CmsArticleTag selectCmsArticleTagByTagId(Long tagId)
    {
        return cmsArticleTagMapper.selectCmsArticleTagByTagId(tagId);
    }

    /**
     * 查询标签管理列表
     * 
     * @param cmsArticleTag 标签管理
     * @return 标签管理
     */
    @Override
    public List<CmsArticleTag> selectCmsArticleTagList(CmsArticleTag cmsArticleTag)
    {
        return cmsArticleTagMapper.selectCmsArticleTagList(cmsArticleTag);
    }

    /**
     * 新增标签管理
     * 
     * @param cmsArticleTag 标签管理
     * @return 结果
     */
    @Override
    public int insertCmsArticleTag(CmsArticleTag cmsArticleTag)
    {
        return cmsArticleTagMapper.insertCmsArticleTag(cmsArticleTag);
    }

    /**
     * 修改标签管理
     * 
     * @param cmsArticleTag 标签管理
     * @return 结果
     */
    @Override
    public int updateCmsArticleTag(CmsArticleTag cmsArticleTag)
    {
        return cmsArticleTagMapper.updateCmsArticleTag(cmsArticleTag);
    }

    /**
     * 批量删除标签管理
     * 
     * @param tagIds 需要删除的标签管理主键
     * @return 结果
     */
    @Override
    public int deleteCmsArticleTagByTagIds(Long[] tagIds)
    {
        return cmsArticleTagMapper.deleteCmsArticleTagByTagIds(tagIds);
    }

    /**
     * 删除标签管理信息
     * 
     * @param tagId 标签管理主键
     * @return 结果
     */
    @Override
    public int deleteCmsArticleTagByTagId(Long tagId)
    {
        return cmsArticleTagMapper.deleteCmsArticleTagByTagId(tagId);
    }
}
