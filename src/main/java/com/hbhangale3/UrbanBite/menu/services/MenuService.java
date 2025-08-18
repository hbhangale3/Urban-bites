package com.hbhangale3.UrbanBite.menu.services;

import com.hbhangale3.UrbanBite.menu.dtos.MenuDTO;
import com.hbhangale3.UrbanBite.response.Response;

import java.util.List;

public interface MenuService {

    Response<MenuDTO> createMenu(MenuDTO menuDTO);
    Response<MenuDTO> updateMenu(MenuDTO menuDTO);
    Response<MenuDTO> getMenuById(Long id);
    Response<?> deleteMenu(Long id);
    Response<List<MenuDTO>> getMenus(Long categoryId, String search);

}
