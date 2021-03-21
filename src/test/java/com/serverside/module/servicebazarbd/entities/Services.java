package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Services {
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

}
