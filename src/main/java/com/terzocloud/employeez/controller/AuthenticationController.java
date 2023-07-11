package com.terzocloud.employeez.controller;

import com.terzocloud.employeez.dto.AuthenticationDto;
import com.terzocloud.employeez.dto.LoginDto;
import com.terzocloud.employeez.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    LoginService loginService;
    @Autowired
    public AuthenticationController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public AuthenticationDto login(@RequestBody LoginDto loginDto){
        AuthenticationDto responseDto = loginService.authenticate(loginDto);
        return responseDto;
    }


}
