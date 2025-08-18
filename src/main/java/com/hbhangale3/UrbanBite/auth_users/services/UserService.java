package com.hbhangale3.UrbanBite.auth_users.services;

import com.hbhangale3.UrbanBite.auth_users.dtos.UserDTO;
import com.hbhangale3.UrbanBite.auth_users.entity.User;
import com.hbhangale3.UrbanBite.response.Response;

import java.util.List;

public interface UserService {


    User getCurrentLoggedInUser();

    Response<List<UserDTO>> getAllUsers();

    Response<UserDTO> getOwnAccountDetails();

    Response<?> updateOwnAccount(UserDTO userDTO);

    Response<?> deactivateOwnAccount();

}
