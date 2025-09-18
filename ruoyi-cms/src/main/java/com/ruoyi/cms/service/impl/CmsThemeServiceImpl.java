package com.ruoyi.cms.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cms.mapper.CmsThemeMapper;
import com.ruoyi.cms.domain.CmsTheme;
import com.ruoyi.cms.service.ICmsThemeService;

/**
 * 网站主题Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-08-24
 */
@Service
public class CmsThemeServiceImpl implements ICmsThemeService 
{
    @Autowired
    private CmsThemeMapper cmsThemeMapper;

    /**
     * 查询网站主题
     * 
     * @param themeId 网站主题主键
     * @return 网站主题
     */
    @Override
    public CmsTheme selectCmsThemeByThemeId(Long themeId)
    {
        return cmsThemeMapper.selectCmsThemeByThemeId(themeId);
    }

    /**
     * 查询网站主题列表
     * 
     * @param cmsTheme 网站主题
     * @return 网站主题
     */
    @Override
    public List<CmsTheme> selectCmsThemeList(CmsTheme cmsTheme)
    {
        return cmsThemeMapper.selectCmsThemeList(cmsTheme);
    }

    /**
     * 新增网站主题
     * 
     * @param cmsTheme 网站主题
     * @return 结果
     */
    @Override
    public int insertCmsTheme(CmsTheme cmsTheme)
    {
        cmsTheme.setCreateTime(DateUtils.getNowDate());
        return cmsThemeMapper.insertCmsTheme(cmsTheme);
    }

    /**
     * 修改网站主题
     * 
     * @param cmsTheme 网站主题
     * @return 结果
     */
    @Override
    public int updateCmsTheme(CmsTheme cmsTheme)
    {
        cmsTheme.setUpdateTime(DateUtils.getNowDate());
        return cmsThemeMapper.updateCmsTheme(cmsTheme);
    }

    /**
     * 批量删除网站主题
     * 
     * @param themeIds 需要删除的网站主题主键
     * @return 结果
     */
    @Override
    public int deleteCmsThemeByThemeIds(Long[] themeIds)
    {
        return cmsThemeMapper.deleteCmsThemeByThemeIds(themeIds);
    }

    /**
     * 删除网站主题信息
     * 
     * @param themeId 网站主题主键
     * @return 结果
     */
    @Override
    public int deleteCmsThemeByThemeId(Long themeId)
    {
        return cmsThemeMapper.deleteCmsThemeByThemeId(themeId);
    }
}
