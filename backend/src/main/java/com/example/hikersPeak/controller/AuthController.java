package com.example.hikersPeak.controller;

import com.example.hikersPeak.service.TokenService;

import com.example.hikersPeak.users.UserService;
import com.example.hikersPeak.users.Users;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class AuthController {
    private final TokenService tokenService;
    private final UserService userService;

    public AuthController(TokenService tokenService, UserService userService) {
        this.tokenService = tokenService;
        this.userService = userService;
    }

//    @PostMapping("/login")

    @GetMapping("/login")
    public HashMap<String, String> login(@RequestBody Users userInfo) {
//        Authentication authentication = new UsernamePasswordAuthenticationToken("User1", "password1");
        System.out.println(userInfo.getUsername() + " " + userInfo.getPassword());
        //check if this pair exists in the database or not
        Authentication authentication = new UsernamePasswordAuthenticationToken(userInfo.getUsername(), userInfo.getPassword());
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

    @PostMapping("/register")
    public String register(@RequestBody Users user) {

        System.out.println(user.getUsername() + " " + user.getPassword());
        String password = user.getPassword();
        password = new BCryptPasswordEncoder().encode(password);
        user.setPassword(password);
        userService.saveData(user);
        return "User has been added to the database";
    }
}
