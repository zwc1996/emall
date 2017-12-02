package com.emall.service.iservice;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zwc
 */
public interface FileService {
    String upload(MultipartFile file, String path);
}
