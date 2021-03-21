package com.serverside.module.servicebazarbd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class DiscountCoupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String couponCode;
    private String couponName;
    private String description;
    private Integer uses;
    private Integer maxCouponUses;
    private Integer maxUsesUser;
    private Short type;
    private BigDecimal discountAmount;
    private Date startTime;
    private Date endTime;
    private Boolean activeStatus;
    private Date createdAt;
    private Date updatedAt;

}
