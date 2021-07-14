package com.back.products.models.DTO;

import java.io.Serializable;

public class CategoryDTO implements Serializable {

    private String productName;
    private String description;

    public String getProductName() {
        return productName;
    }

    public CategoryDTO setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoryDTO setDescription(String description) {
        this.description = description;
        return this;
    }
}
