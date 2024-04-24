package com.example.hikersPeak.controller;

import com.example.hikersPeak.service.TokenService;

import com.example.hikersPeak.users.Users;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class AuthController {
    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

//    @PostMapping("/login")

    @GetMapping("/login")
    public HashMap<String, String> login(@RequestBody Users userInfo) {
//        Authentication authentication = new UsernamePasswordAuthenticationToken("User1", "password1");
        System.out.println(userInfo.getUserName() + " " + userInfo.getPassword());
        //check if this pair exists in the database or not
        Authentication authentication = new UsernamePasswordAuthenticationToken(userInfo.getUserName(), userInfo.getPassword());
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
