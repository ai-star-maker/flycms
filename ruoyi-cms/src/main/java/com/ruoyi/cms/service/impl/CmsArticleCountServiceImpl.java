package com.ruoyi.cms.service.impl;

import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cms.mapper.CmsArticleCountMapper;
import com.ruoyi.cms.domain.CmsArticleCount;
import com.ruoyi.cms.service.ICmsArticleCountService;

/**
 * 文章统计Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
@Service
public class CmsArticleCountServiceImpl implements ICmsArticleCountService 
{
    @Autowired
    private CmsArticleCountMapper cmsArticleCountMapper;

    /**
     * 查询文章统计
     * 
     * @param countId 文章统计主键
     * @return 文章统计
     */
    @Override
    public CmsArticleCount selectCmsArticleCountByCountId(Long countId)
    {
        return cmsArticleCountMapper.selectCmsArticleCountByCountId(countId);
    }

    /**
     * 查询文章统计列表
     * 
     * @param cmsArticleCount 文章统计
     * @return 文章统计
     */
    @Override
    public List<CmsArticleCount> selectCmsArticleCountList(CmsArticleCount cmsArticleCount)
    {
        return cmsArticleCountMapper.selectCmsArticleCountList(cmsArticleCount);
    }

    /**
     * 新增文章统计
     * 
     * @param cmsArticleCount 文章统计
     * @return 结果
     */
    @Override
    public int insertCmsArticleCount(CmsArticleCount cmsArticleCount)
    {
        if (cmsArticleCount.getCountDate() == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            cmsArticleCount.setCountDate(calendar.getTime());
        }
        List<CmsArticleCount> list = selectCmsArticleCountList(cmsArticleCount);
        if (!list.isEmpty()) {
            CmsArticleCount count = list.get(0);
            count.setComments(count.getComments() + (cmsArticleCount.getComments() == null ? 0 : cmsArticleCount.getComments()));
            count.setDownloads(count.getDownloads() + (cmsArticleCount.getDownloads() == null ? 0 : cmsArticleCount.getDownloads()));
            count.setDowns(count.getDowns() + (cmsArticleCount.getDowns() == null ? 0 : cmsArticleCount.getDowns()));
            count.setViews((count.getViews() + (cmsArticleCount.getViews() == null ? 1 : cmsArticleCount.getViews()+1)));
            count.setUps(count.getUps() + (cmsArticleCount.getUps() == null ? 0 : cmsArticleCount.getUps()));
            cmsArticleCount.setViews(count.getViews());
            return updateCmsArticleCount(count);
        }
        return cmsArticleCountMapper.insertCmsArticleCount(cmsArticleCount);
    }

    /**
     * 修改文章统计
     * 
     * @param cmsArticleCount 文章统计
     * @return 结果
     */
    @Override
    public int updateCmsArticleCount(CmsArticleCount cmsArticleCount)
    {
        return cmsArticleCountMapper.updateCmsArticleCount(cmsArticleCount);
    }

    /**
     * 批量删除文章统计
     * 
     * @param countIds 需要删除的文章统计主键
     * @return 结果
     */
    @Override
    public int deleteCmsArticleCountByCountIds(Long[] countIds)
    {
        return cmsArticleCountMapper.deleteCmsArticleCountByCountIds(countIds);
    }

    /**
     * 删除文章统计信息
     * 
     * @param countId 文章统计主键
     * @return 结果
     */
    @Override
    public int deleteCmsArticleCountByCountId(Long countId)
    {
        return cmsArticleCountMapper.deleteCmsArticleCountByCountId(countId);
    }
}
