package com.serverside.module.servicebazarbd.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class UserAddress extends Address implements Serializable {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UserAddress() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "user=" + user +
                '}';
    }
}
