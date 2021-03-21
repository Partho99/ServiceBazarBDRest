package com.serverside.module.servicebazarbd.dtos;

import java.util.ArrayList;
import java.util.List;

public class ChildrenCategoriesDto {
    private Integer id;
    private String title;
    private String slug;
    private List<ProductDto> product = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public List<ProductDto> getProduct() {
        return product;
    }

    public void setProduct(List<ProductDto> product) {
        this.product = product;
    }
}
