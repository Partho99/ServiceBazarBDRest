package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Boolean activeStatus;
    private String slug;
    private Double unitWeight;
    private String unit;
    private String description;
    private Double discountInPercent;
    private Double price;
    private Double salePrice;
    private String image;
    @OneToMany(mappedBy = "product")
    private List<ProductImage> gallery;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_tags", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
    private List<Tags> tags;
    @ManyToMany
    @JoinTable(name = "categories_product", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "categories_id", referencedColumnName = "id"))
    private Set<Categories> categories;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<Reviews> reviews;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OptionTypesAndPrices> optionTypesAndPrices;
    @ManyToMany
    @JoinTable(name = "product_faqs", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "faq_id", referencedColumnName = "id"))
    private List<Faqs> faqs;
    @OneToMany
    private List<TermsAndCondition> termsAndConditions;
    @OneToMany
    private Set<DiscountCoupon> discountCoupons;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String details;

    public Products() {
    }

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

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Double getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDiscountInPercent() {
        return discountInPercent;
    }

    public void setDiscountInPercent(Double discountInPercent) {
        this.discountInPercent = discountInPercent;
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

    public List<ProductImage> getGallery() {
        return gallery;
    }

    public void setGallery(List<ProductImage> gallery) {
        this.gallery = gallery;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public Set<Categories> getCategories() {
        return categories;
    }

    public void setCategories(Set<Categories> categories) {
        this.categories = categories;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }

    public List<OptionTypesAndPrices> getOptionTypesAndPrices() {
        return optionTypesAndPrices;
    }

    public void setOptionTypesAndPrices(List<OptionTypesAndPrices> optionTypesAndPrices) {
        this.optionTypesAndPrices = optionTypesAndPrices;
    }

    public List<Faqs> getFaqs() {
        return faqs;
    }

    public void setFaqs(List<Faqs> faqs) {
        this.faqs = faqs;
    }

    public List<TermsAndCondition> getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(List<TermsAndCondition> termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public Set<DiscountCoupon> getDiscountCoupons() {
        return discountCoupons;
    }

    public void setDiscountCoupons(Set<DiscountCoupon> discountCoupons) {
        this.discountCoupons = discountCoupons;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

  


}
