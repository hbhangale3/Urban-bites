package com.hbhangale3.UrbanBite.role.services;

import com.hbhangale3.UrbanBite.response.Response;
import com.hbhangale3.UrbanBite.role.dtos.RoleDTO;

import java.util.List;

public interface RoleService {


    Response<RoleDTO> createRole(RoleDTO roleDTO);

    Response<RoleDTO> updateRole(RoleDTO roleDTO);

    Response<List<RoleDTO>> getAllRoles();

    Response<?> deleteRole(Long id);
}
