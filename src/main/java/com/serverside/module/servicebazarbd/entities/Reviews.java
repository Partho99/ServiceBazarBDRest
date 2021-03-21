package com.serverside.module.servicebazarbd.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Reviews implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer rating;
    @ManyToOne
    @JoinColumn(name = "user_id" )
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;
    @ManyToOne
    @JoinColumn(name = "product_id" )
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Products product;
    @ManyToOne
    @JoinColumn(name = "service_id" )
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Services service;
    private Date createdAt;
    private Date updatedAt;
    private Boolean activeStatus;

    public Reviews() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
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

    @Override
    public String toString() {
        return "Reviews{" +
                "id=" + id +
                ", rating=" + rating +
                ", user=" + user +
                ", product=" + product +
                ", service=" + service +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
