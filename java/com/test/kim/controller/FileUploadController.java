package com.test.kim.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import org.springframework.web.bind.annotation.GetMapping;


import com.test.kim.model.Result;
import com.test.kim.service.FileUploadService;
import java.io.IOException;


@Slf4j
@Controller
public class FileUploadController {
    private  FileUploadService fileUploadService;

    public FileUploadController(FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }

    
    /*@GetMapping("/")
    public String redirectToUpload() {
    	log.info("/----> /upload");1
        return "redirect:/upload";
    }*/
    

    @GetMapping("/")
    public String uploadForm() {
        log.info("redirect upload");
        return "upload";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file, Model model) throws Exception {
        Result result = fileUploadService.uploadFile(file);
        model.addAttribute("result", result);
        log.info("업로드 버튼이 눌림, upload PostMapping 발생" + result);
        return "upload"; //view Resolver
    }
}
