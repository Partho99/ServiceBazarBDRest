package com.serverside.module.servicebazarbd.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user_id")
    private User user;
    private Date orderDate;
    private Boolean activeStatus;
    private Date createdAt;
    private Date updatedAt;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "localArea", column = @Column(name = "order_area"))
    })
    private ShippingAddress shippingAddress;
    @OneToOne
    private PreferredOrderDate preferredOrderDate;

    public Orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public PreferredOrderDate getPreferredOrderDate() {
        return preferredOrderDate;
    }

    public void setPreferredOrderDate(PreferredOrderDate preferredOrderDate) {
        this.preferredOrderDate = preferredOrderDate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", user=" + user +
                ", orderDate=" + orderDate +
                ", activeStatus=" + activeStatus +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", shippingAddress=" + shippingAddress +
                ", preferredOrderDate=" + preferredOrderDate +
                '}';
    }
}
