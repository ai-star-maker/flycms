package com.ruoyi.cms.controller;

import com.ruoyi.cms.domain.CmsSite;
import com.ruoyi.cms.service.ICmsSiteService;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.file.FileUploadUtils;
import com.ruoyi.common.utils.file.FileUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 通用工具Controller
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
@RestController
@RequestMapping("/cms/utils")
public class CmsUtilsController extends BaseController
{
    @Autowired
    private ServerConfig serverConfig;

    /**
     * 上传网站栏目和广告图片文件保存在sys目录下（单个）
     */
    @Log(title = "上传系统图片", businessType = BusinessType.OTHER)
    @Anonymous
    @PostMapping("/upload")
    public AjaxResult uploadFile(MultipartFile file) throws Exception
    {
        try
        {
            // 上传文件路径
            String filePath = getUploadSysImagePath();
            // 上传并返回新文件名称
            String fileName = FileUploadUtils.upload(filePath, file);
            String url = serverConfig.getUrl() + fileName;
            AjaxResult ajax = AjaxResult.success();
            ajax.put("url", url);
            ajax.put("fileName", fileName);
            ajax.put("newFileName", FileUtils.getName(fileName));
            ajax.put("originalFilename", file.getOriginalFilename());
            return ajax;
        }
        catch (Exception e)
        {
            return AjaxResult.error(e.getMessage());
        }
    }

    private String getUploadSysImagePath()
    {
        return RuoYiConfig.getProfile() + "/sys";
    }
}
