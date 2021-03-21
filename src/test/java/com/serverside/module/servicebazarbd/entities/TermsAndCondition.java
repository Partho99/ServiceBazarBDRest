package com.serverside.module.servicebazarbd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TermsAndCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String termsAndCondition;
    private Boolean activeStatus;
    private Date createdAt;
    private Date updatedAt;
}
