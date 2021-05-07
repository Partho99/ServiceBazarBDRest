package com.serverside.module.servicebazarbd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Simple JavaBean domain object representing an Categories.
 * This Categories is determined by all type of Products and Services
 *
 * @author Partho Das
 */

@Entity
public class Categories  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String icon;
    @Column(unique = true)
    private String slug;
    private String title;

    /*
     * This parentId represents an hierarchical tree
     * like categories,subcategories and so on so forth
     * this hierarchical tree is created using
     * adjacency list.
     */
    @ManyToOne
    @JoinColumn(name = "parent_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Categories parentId;
    @OneToMany(mappedBy = "parentId", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JsonIgnore
    private List<Categories> children;
    private Date createdAt;
    private Date updatedAt;
    private Boolean activeStatus;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "overview_id")
    private Overview overview;
    @ManyToMany
    @JoinTable(name = "categories_faqs", joinColumns = @JoinColumn(name = "categories_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "faq_id", referencedColumnName = "id"))
    private List<Faqs> faqs;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "categories_tags", joinColumns = @JoinColumn(name = "categories_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
    private List<Tags> tags;

    public Categories() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Categories getParentId() {
        return parentId;
    }

    public void setParentId(Categories parentId) {
        this.parentId = parentId;
    }

    public List<Categories> getChildren() {
        return children;
    }

    public void setChildren(List<Categories> children) {
        this.children = children;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Overview getOverview() {
        return overview;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    public List<Faqs> getFaqs() {
        return faqs;
    }

    public void setFaqs(List<Faqs> faqs) {
        this.faqs = faqs;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }
}
