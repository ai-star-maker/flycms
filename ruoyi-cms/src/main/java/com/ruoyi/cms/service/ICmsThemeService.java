package com.ruoyi.cms.service;

import java.util.List;
import com.ruoyi.cms.domain.CmsTheme;

/**
 * 网站主题Service接口
 * 
 * @author ruoyi
 * @date 2025-08-24
 */
public interface ICmsThemeService 
{
    /**
     * 查询网站主题
     * 
     * @param themeId 网站主题主键
     * @return 网站主题
     */
    public CmsTheme selectCmsThemeByThemeId(Long themeId);

    /**
     * 查询网站主题列表
     * 
     * @param cmsTheme 网站主题
     * @return 网站主题集合
     */
    public List<CmsTheme> selectCmsThemeList(CmsTheme cmsTheme);

    /**
     * 新增网站主题
     * 
     * @param cmsTheme 网站主题
     * @return 结果
     */
    public int insertCmsTheme(CmsTheme cmsTheme);

    /**
     * 修改网站主题
     * 
     * @param cmsTheme 网站主题
     * @return 结果
     */
    public int updateCmsTheme(CmsTheme cmsTheme);

    /**
     * 批量删除网站主题
     * 
     * @param themeIds 需要删除的网站主题主键集合
     * @return 结果
     */
    public int deleteCmsThemeByThemeIds(Long[] themeIds);

    /**
     * 删除网站主题信息
     * 
     * @param themeId 网站主题主键
     * @return 结果
     */
    public int deleteCmsThemeByThemeId(Long themeId);
}
