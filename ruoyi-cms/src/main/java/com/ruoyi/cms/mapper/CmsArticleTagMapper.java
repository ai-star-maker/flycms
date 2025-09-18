package com.ruoyi.cms.mapper;

import java.util.List;
import com.ruoyi.cms.domain.CmsArticleTag;

/**
 * 标签管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
public interface CmsArticleTagMapper 
{
    /**
     * 查询标签管理
     * 
     * @param tagId 标签管理主键
     * @return 标签管理
     */
    public CmsArticleTag selectCmsArticleTagByTagId(Long tagId);

    /**
     * 查询标签管理列表
     * 
     * @param cmsArticleTag 标签管理
     * @return 标签管理集合
     */
    public List<CmsArticleTag> selectCmsArticleTagList(CmsArticleTag cmsArticleTag);

    /**
     * 新增标签管理
     * 
     * @param cmsArticleTag 标签管理
     * @return 结果
     */
    public int insertCmsArticleTag(CmsArticleTag cmsArticleTag);

    /**
     * 修改标签管理
     * 
     * @param cmsArticleTag 标签管理
     * @return 结果
     */
    public int updateCmsArticleTag(CmsArticleTag cmsArticleTag);

    /**
     * 删除标签管理
     * 
     * @param tagId 标签管理主键
     * @return 结果
     */
    public int deleteCmsArticleTagByTagId(Long tagId);

    /**
     * 批量删除标签管理
     * 
     * @param tagIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmsArticleTagByTagIds(Long[] tagIds);
}
