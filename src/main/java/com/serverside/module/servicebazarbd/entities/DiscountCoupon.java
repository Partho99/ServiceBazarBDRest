package com.serverside.module.servicebazarbd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class DiscountCoupon implements Serializable {
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

    public DiscountCoupon() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUses() {
        return uses;
    }

    public void setUses(Integer uses) {
        this.uses = uses;
    }

    public Integer getMaxCouponUses() {
        return maxCouponUses;
    }

    public void setMaxCouponUses(Integer maxCouponUses) {
        this.maxCouponUses = maxCouponUses;
    }

    public Integer getMaxUsesUser() {
        return maxUsesUser;
    }

    public void setMaxUsesUser(Integer maxUsesUser) {
        this.maxUsesUser = maxUsesUser;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
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

    @Override
    public String toString() {
        return "DiscountCoupon{" +
                "id=" + id +
                ", couponCode='" + couponCode + '\'' +
                ", couponName='" + couponName + '\'' +
                ", description='" + description + '\'' +
                ", uses=" + uses +
                ", maxCouponUses=" + maxCouponUses +
                ", maxUsesUser=" + maxUsesUser +
                ", type=" + type +
                ", discountAmount=" + discountAmount +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", activeStatus=" + activeStatus +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
