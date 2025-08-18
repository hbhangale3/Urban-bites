package com.hbhangale3.UrbanBite.auth_users.services;

import com.hbhangale3.UrbanBite.auth_users.dtos.LoginRequest;
import com.hbhangale3.UrbanBite.auth_users.dtos.LoginResponse;
import com.hbhangale3.UrbanBite.auth_users.dtos.RegistrationRequest;
import com.hbhangale3.UrbanBite.response.Response;

public interface AuthService {
    Response<?> register(RegistrationRequest registrationRequest);
    Response<LoginResponse> login(LoginRequest loginRequest);
}
