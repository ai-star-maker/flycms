package com.ruoyi.cms.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cms.mapper.CmsCategoryMapper;
import com.ruoyi.cms.domain.CmsCategory;
import com.ruoyi.cms.service.ICmsCategoryService;

/**
 * 栏目管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-14
 */
@Service
public class CmsCategoryServiceImpl implements ICmsCategoryService 
{
    @Autowired
    private CmsCategoryMapper cmsCategoryMapper;

    /**
     * 查询栏目管理
     * 
     * @param categoryId 栏目管理主键
     * @return 栏目管理
     */
    @Override
    public CmsCategory selectCmsCategoryByCategoryId(Long categoryId)
    {
        return cmsCategoryMapper.selectCmsCategoryByCategoryId(categoryId);
    }

    /**
     * 查询栏目管理列表
     * 
     * @param cmsCategory 栏目管理
     * @return 栏目管理
     */
    @Override
    public List<CmsCategory> selectCmsCategoryList(CmsCategory cmsCategory)
    {
        return cmsCategoryMapper.selectCmsCategoryList(cmsCategory);
    }

    /**
     * 新增栏目管理
     * 
     * @param cmsCategory 栏目管理
     * @return 结果
     */
    @Override
    public int insertCmsCategory(CmsCategory cmsCategory)
    {
        cmsCategory.setCreateTime(DateUtils.getNowDate());
        return cmsCategoryMapper.insertCmsCategory(cmsCategory);
    }

    /**
     * 修改栏目管理
     * 
     * @param cmsCategory 栏目管理
     * @return 结果
     */
    @Override
    public int updateCmsCategory(CmsCategory cmsCategory)
    {
        cmsCategory.setUpdateTime(DateUtils.getNowDate());
        return cmsCategoryMapper.updateCmsCategory(cmsCategory);
    }

    /**
     * 批量删除栏目管理
     * 
     * @param categoryIds 需要删除的栏目管理主键
     * @return 结果
     */
    @Override
    public int deleteCmsCategoryByCategoryIds(Long[] categoryIds)
    {
        return cmsCategoryMapper.deleteCmsCategoryByCategoryIds(categoryIds);
    }

    /**
     * 删除栏目管理信息
     * 
     * @param categoryId 栏目管理主键
     * @return 结果
     */
    @Override
    public int deleteCmsCategoryByCategoryId(Long categoryId)
    {
        return cmsCategoryMapper.deleteCmsCategoryByCategoryId(categoryId);
    }
}
