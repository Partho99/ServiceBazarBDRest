package com.serverside.module.servicebazarbd.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class OrderedProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "order_id")
    private Orders orders;
    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id")
    private Products products;
    private Double quantity;
    private BigDecimal totalPrice;
    private Boolean activeStatus;
    private Date createdAt;
    private Date updatedAt;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String additionalNotes;
}
