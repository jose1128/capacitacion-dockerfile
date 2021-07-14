package com.back.products.services;

import com.back.products.models.DTO.CategoryDTO;
import com.back.products.models.entities.Category;
import com.back.products.repositories.CategoryRepository;
import com.back.products.services.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<CategoryDTO> getAllCategories() {
        List<CategoryDTO> category = categoryRepository.findAll().stream().map(cat -> {
            return new CategoryDTO()
                    .setProductName(cat.getProductName())
                    .setDescription(cat.getDescription());
        }).collect(Collectors.toList());
        return category;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CategoryDTO> getCategoryById(Long id) {
        Category categoryDB = categoryRepository.getById(id);
        Optional<CategoryDTO> categoryDTO = Optional.of(new CategoryDTO()
                .setProductName(categoryDB.getProductName())
                .setDescription(categoryDB.getDescription())
        );
        return categoryDTO;
    }

    @Override
    @Transactional
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    @Transactional
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
