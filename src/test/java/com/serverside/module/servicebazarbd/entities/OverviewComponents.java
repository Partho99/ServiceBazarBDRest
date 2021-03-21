package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OverviewComponents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Boolean activeStatus;
    private Date createdAt;
    private Date updatedAt;
    @OneToOne
    @JoinColumn(name = "overview_component_description_id")
    private OverviewComponentDescription overviewComponentDescription;
    @ManyToOne
    @JoinColumn(name = "overview_id")
    private Overview overview;

}
