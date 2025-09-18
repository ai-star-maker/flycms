package com.ruoyi.cms.mapper;

import java.util.List;
import com.ruoyi.cms.domain.CmsCategory;

/**
 * 栏目管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-14
 */
public interface CmsCategoryMapper 
{
    /**
     * 查询栏目管理
     * 
     * @param categoryId 栏目管理主键
     * @return 栏目管理
     */
    public CmsCategory selectCmsCategoryByCategoryId(Long categoryId);

    /**
     * 查询栏目管理列表
     * 
     * @param cmsCategory 栏目管理
     * @return 栏目管理集合
     */
    public List<CmsCategory> selectCmsCategoryList(CmsCategory cmsCategory);

    /**
     * 新增栏目管理
     * 
     * @param cmsCategory 栏目管理
     * @return 结果
     */
    public int insertCmsCategory(CmsCategory cmsCategory);

    /**
     * 修改栏目管理
     * 
     * @param cmsCategory 栏目管理
     * @return 结果
     */
    public int updateCmsCategory(CmsCategory cmsCategory);

    /**
     * 删除栏目管理
     * 
     * @param categoryId 栏目管理主键
     * @return 结果
     */
    public int deleteCmsCategoryByCategoryId(Long categoryId);

    /**
     * 批量删除栏目管理
     * 
     * @param categoryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmsCategoryByCategoryIds(Long[] categoryIds);
}
