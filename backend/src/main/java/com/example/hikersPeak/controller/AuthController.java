package com.example.hikersPeak.controller;

import com.example.hikersPeak.service.TokenService;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AuthController {
    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

//    @PostMapping("/login")

    @GetMapping("/login")
    public HashMap<String, String> login() {
        Authentication authentication = new UsernamePasswordAuthenticationToken("User1", "password1");
        HashMap<String, String> tokenObj = token(authentication);
        return tokenObj;
    }

    @GetMapping("/token")
    public HashMap<String, String> token(Authentication authentication) {
        System.out.println(authentication.getPrincipal());
        System.out.println(authentication.getCredentials());
        System.out.println("Entered token endpoint definition");
        String token = tokenService.generateToken(authentication);
        HashMap<String, String> tokenObj = new HashMap<String, String>();
        tokenObj.put("token", token);
        return tokenObj;
    }
}
