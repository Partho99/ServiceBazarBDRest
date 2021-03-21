package com.serverside.module.servicebazarbd.dtos;

import com.serverside.module.servicebazarbd.entities.Categories;
import com.serverside.module.servicebazarbd.entities.ProductImage;

import java.util.List;

public class ProductDto {
    private Long id;
    private String title;
    private String slug;
    private String unit;
    private Double price;
    private Double salePrice;
    private Double discountInPercent;
    private String description;
    private String type;
    private String image;
    private List<ProductImageDto> gallery;
    private List<ChildrenCategoriesDto> categories;

    public ProductDto(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getDiscountInPercent() {
        return discountInPercent;
    }

    public void setDiscountInPercent(Double discountInPercent) {
        this.discountInPercent = discountInPercent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<ProductImageDto> getGallery() {
        return gallery;
    }

    public void setGallery(List<ProductImageDto> gallery) {
        this.gallery = gallery;
    }

    public List<ChildrenCategoriesDto> getCategories() {
        return categories;
    }

    public void setCategories(List<ChildrenCategoriesDto> categories) {
        this.categories = categories;
    }
}
