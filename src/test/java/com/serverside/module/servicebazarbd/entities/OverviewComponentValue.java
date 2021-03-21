package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OverviewComponentValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String overviewComponentValue;
    private Boolean activeStatus;
    private Date createdAt;
    private Date updatedAt;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "overview_component_description_id")
    private OverviewComponentDescription overviewComponentDescription;

}
