package com.serverside.module.servicebazarbd.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserAddress extends Address {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
