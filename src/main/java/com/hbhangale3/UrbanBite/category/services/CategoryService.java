package com.hbhangale3.UrbanBite.category.services;

import com.hbhangale3.UrbanBite.category.dtos.CategoryDTO;
import com.hbhangale3.UrbanBite.response.Response;

import java.util.List;

public interface CategoryService {

    Response<CategoryDTO> addCategory(CategoryDTO categoryDTO);

    Response<CategoryDTO> updateCategory(CategoryDTO categoryDTO);

    Response<CategoryDTO> getCategoryById(Long id);

    Response<List<CategoryDTO>> getAllCategories();

    Response<?> deleteCategory(Long id);
}