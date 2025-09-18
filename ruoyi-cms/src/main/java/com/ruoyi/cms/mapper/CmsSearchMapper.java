package com.ruoyi.cms.mapper;

import java.util.List;
import com.ruoyi.cms.domain.CmsSearch;

/**
 * 网站搜索Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-17
 */
public interface CmsSearchMapper 
{
    /**
     * 查询网站搜索
     * 
     * @param searchId 网站搜索主键
     * @return 网站搜索
     */
    public CmsSearch selectCmsSearchBySearchId(Long searchId);

    /**
     * 查询网站搜索列表
     * 
     * @param cmsSearch 网站搜索
     * @return 网站搜索集合
     */
    public List<CmsSearch> selectCmsSearchList(CmsSearch cmsSearch);

    /**
     * 查询网站搜索关键字频率列表
     *
     * @param cmsSearch 网站搜索
     * @return 网站搜索集合
     */
    public List<CmsSearch> selectCmsSearchKeywordsGroupList(CmsSearch cmsSearch);

    /**
     * 新增网站搜索
     * 
     * @param cmsSearch 网站搜索
     * @return 结果
     */
    public int insertCmsSearch(CmsSearch cmsSearch);

    /**
     * 修改网站搜索
     * 
     * @param cmsSearch 网站搜索
     * @return 结果
     */
    public int updateCmsSearch(CmsSearch cmsSearch);

    /**
     * 删除网站搜索
     * 
     * @param searchId 网站搜索主键
     * @return 结果
     */
    public int deleteCmsSearchBySearchId(Long searchId);

    /**
     * 批量删除网站搜索
     * 
     * @param searchIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmsSearchBySearchIds(Long[] searchIds);
}
