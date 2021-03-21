package com.serverside.module.servicebazarbd.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class OptionTypesAndPrices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String optionName;
    private Date createdAt;
    private Date updatedAt;
    private  Boolean activeStatus;
    @ManyToOne
    @JoinColumn(name = "option_type")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private OptionTypesAndPrices optionType;
    private BigDecimal price;

}
