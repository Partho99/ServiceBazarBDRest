package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Overview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String overviewTitle;
    private Boolean activeStatus;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String details;
    private Date createdAt;
    private Date updatedAt;
    @OneToMany(mappedBy = "overview",cascade = CascadeType.ALL)
    private List<OverviewComponents> overviewComponents;

}
