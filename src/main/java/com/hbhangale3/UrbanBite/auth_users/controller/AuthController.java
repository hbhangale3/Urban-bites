package com.hbhangale3.UrbanBite.auth_users.controller;

import com.hbhangale3.UrbanBite.auth_users.dtos.LoginRequest;
import com.hbhangale3.UrbanBite.auth_users.dtos.LoginResponse;
import com.hbhangale3.UrbanBite.auth_users.dtos.RegistrationRequest;
import com.hbhangale3.UrbanBite.auth_users.services.AuthService;
import com.hbhangale3.UrbanBite.response.Response;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Response<?>> register(@Valid @RequestBody RegistrationRequest registrationRequest) {
        return ResponseEntity.ok(authService.register(registrationRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<Response<LoginResponse>> login(@Valid @RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.login(loginRequest));
    }
}