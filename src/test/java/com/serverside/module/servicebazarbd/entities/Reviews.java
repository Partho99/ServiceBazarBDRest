package com.serverside.module.servicebazarbd.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reviews {
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

}
