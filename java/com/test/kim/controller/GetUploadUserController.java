package com.test.kim.controller;

import com.test.kim.dto.UserDto;
import com.test.kim.service.GetUploadedUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Slf4j
@Controller
public class GetUploadUserController {

    private GetUploadedUserService getUploadedUsersService;

    public GetUploadUserController(GetUploadedUserService getUploadedUsersService) {
        this.getUploadedUsersService = getUploadedUsersService;
    }

    @GetMapping("/uploadedUsers")
    @ResponseBody
    public ResponseEntity<List<UserDto>> getUploadedUsersJson() {
        List<UserDto> uploadedUsers = getUploadedUsersService.getUploadedUsers();
        log.info("업로드 된 유저 = "+uploadedUsers.toString());
        return ResponseEntity.ok(uploadedUsers);

    }



    // 데이터 삭체 코드 주석 처리 1
    @GetMapping("/deleteUsers")
    public String returnDelete() {
        return "upload";
    }

    @PostMapping("/deleteUsers")
    public String deleteUserAll(Model model) {
        getUploadedUsersService.deleteUsers();
        model.addAttribute("message","데이터 삭제 완료");
        log.info("Call GetUploadedUserConrtoller"+model);
        return "upload";
    }


}
