package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Services implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean activeStatus;
    private String serviceName;
    private Integer unitInStock;
    private Date createdAt;
    private Date updatedAt;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OptionTypesAndPrices> optionTypesAndPrices;
    @OneToMany(mappedBy = "service")
    private List<ServiceImage> images;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "service_tags", joinColumns = @JoinColumn(name = "service_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
    private List<Tags> tags;
    @ManyToMany
    @JoinTable(name = "categories_service", joinColumns = @JoinColumn(name = "service_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "categories_id", referencedColumnName = "id"))
    private List<Categories> categories;
    @OneToMany(mappedBy = "service", fetch = FetchType.LAZY)
    private List<Reviews> reviews;
    @ManyToMany
    @JoinTable(name = "service_faqs", joinColumns = @JoinColumn(name = "service_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "faq_id", referencedColumnName = "id"))
    private List<Faqs> faqs;
    @ManyToMany
    @JoinTable(name = "service_features", joinColumns = @JoinColumn(name = "service_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id", referencedColumnName = "id"))
    private List<Features> features;
    @OneToMany(cascade = CascadeType.ALL)
    private List<TermsAndCondition> termsAndConditions;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<DiscountCoupon> discountCoupons;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String details;

    public Services() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(Integer unitInStock) {
        this.unitInStock = unitInStock;
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

    public List<OptionTypesAndPrices> getOptionTypesAndPrices() {
        return optionTypesAndPrices;
    }

    public void setOptionTypesAndPrices(List<OptionTypesAndPrices> optionTypesAndPrices) {
        this.optionTypesAndPrices = optionTypesAndPrices;
    }

    public List<ServiceImage> getImages() {
        return images;
    }

    public void setImages(List<ServiceImage> images) {
        this.images = images;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }

    public List<Faqs> getFaqs() {
        return faqs;
    }

    public void setFaqs(List<Faqs> faqs) {
        this.faqs = faqs;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
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

    @Override
    public String toString() {
        return "Services{" +
                "id=" + id +
                ", activeStatus=" + activeStatus +
                ", serviceName='" + serviceName + '\'' +
                ", unitInStock=" + unitInStock +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", optionTypesAndPrices=" + optionTypesAndPrices +
                ", images=" + images +
                ", tags=" + tags +
                ", categories=" + categories +
                ", reviews=" + reviews +
                ", faqs=" + faqs +
                ", features=" + features +
                ", termsAndConditions=" + termsAndConditions +
                ", discountCoupons=" + discountCoupons +
                ", details='" + details + '\'' +
                '}';
    }
}
