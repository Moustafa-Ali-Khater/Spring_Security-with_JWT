package com.spring.springsecurity.Controller;

import com.spring.springsecurity.dto.ResponseLogin;
import com.spring.springsecurity.model.JwtLogin;
import com.spring.springsecurity.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// https://localhost:8082
@RestController
@RequestMapping("/")
public class LoginController {
    private TokenService tokenService;


    @Autowired
    public LoginController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    // https://localhost:8082/signup
    @PostMapping("/signup")
    public ResponseLogin login(@RequestBody JwtLogin jwtLogin) throws Exception {
        return tokenService.successfulAuthentication(jwtLogin);
    }
}
