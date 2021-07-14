package com.back.products.services.interfaces;

import com.back.products.models.DTO.CategoryDTO;
import com.back.products.models.entities.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {

    List<CategoryDTO> getAllCategories();

    Optional<CategoryDTO> getCategoryById(Long id);

    Category createCategory(Category category);

    void deleteCategory(Long id);
}
