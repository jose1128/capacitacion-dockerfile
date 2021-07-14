package com.back.products.services.interfaces;

import com.back.products.models.entities.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);

    Product createProduct(Product product);

    void deleteProduct(Long id);
}
