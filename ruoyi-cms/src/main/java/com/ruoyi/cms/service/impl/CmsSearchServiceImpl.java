package com.ruoyi.cms.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cms.mapper.CmsSearchMapper;
import com.ruoyi.cms.domain.CmsSearch;
import com.ruoyi.cms.service.ICmsSearchService;

/**
 * 网站搜索Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
@Service
public class CmsSearchServiceImpl implements ICmsSearchService 
{
    @Autowired
    private CmsSearchMapper cmsSearchMapper;

    /**
     * 查询网站搜索
     * 
     * @param searchId 网站搜索主键
     * @return 网站搜索
     */
    @Override
    public CmsSearch selectCmsSearchBySearchId(Long searchId)
    {
        return cmsSearchMapper.selectCmsSearchBySearchId(searchId);
    }

    /**
     * 查询网站搜索列表
     * 
     * @param cmsSearch 网站搜索
     * @return 网站搜索
     */
    @Override
    public List<CmsSearch> selectCmsSearchList(CmsSearch cmsSearch)
    {
        return cmsSearchMapper.selectCmsSearchList(cmsSearch);
    }

    /**
     * 查询网站搜索关键字频率列表
     *
     * @param cmsSearch 网站搜索
     * @return 网站搜索集合
     */
    @Override
    public List<CmsSearch> selectCmsSearchKeywordsGroupList(CmsSearch cmsSearch)
    {
        return cmsSearchMapper.selectCmsSearchKeywordsGroupList(cmsSearch);
    }

    /**
     * 新增网站搜索
     * 
     * @param cmsSearch 网站搜索
     * @return 结果
     */
    @Override
    public int insertCmsSearch(CmsSearch cmsSearch)
    {
        cmsSearch.setCreateTime(DateUtils.getNowDate());
        return cmsSearchMapper.insertCmsSearch(cmsSearch);
    }

    /**
     * 修改网站搜索
     * 
     * @param cmsSearch 网站搜索
     * @return 结果
     */
    @Override
    public int updateCmsSearch(CmsSearch cmsSearch)
    {
        return cmsSearchMapper.updateCmsSearch(cmsSearch);
    }

    /**
     * 批量删除网站搜索
     * 
     * @param searchIds 需要删除的网站搜索主键
     * @return 结果
     */
    @Override
    public int deleteCmsSearchBySearchIds(Long[] searchIds)
    {
        return cmsSearchMapper.deleteCmsSearchBySearchIds(searchIds);
    }

    /**
     * 删除网站搜索信息
     * 
     * @param searchId 网站搜索主键
     * @return 结果
     */
    @Override
    public int deleteCmsSearchBySearchId(Long searchId)
    {
        return cmsSearchMapper.deleteCmsSearchBySearchId(searchId);
    }
}
