package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean activeStatus;
    private String productName;
    private Double unitWeight;
    private Double unitInStock;
    private String productDetails;
    @OneToMany(mappedBy = "product")
    private List<ProductImage> images;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_tags", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
    private List<Tags> tags;
    @ManyToMany
    @JoinTable(name = "categories_product", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "categories_id", referencedColumnName = "id"))
    private List<Categories> categories;
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
}
