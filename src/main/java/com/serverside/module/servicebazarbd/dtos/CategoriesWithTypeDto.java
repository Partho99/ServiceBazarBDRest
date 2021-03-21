package com.serverside.module.servicebazarbd.dtos;

import java.util.List;
import java.util.Set;

public class CategoriesWithTypeDto {
    private Integer id;
    private String title;
    private String slug;
    private String type;
    private String icon;
    private Set<ChildrenCategoriesDto> children;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Set<ChildrenCategoriesDto> getChildren() {
        return children;
    }

    public void setChildren(Set<ChildrenCategoriesDto> children) {
        this.children = children;
    }
}
