package com.serverside.module.servicebazarbd.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Orders {
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


}
