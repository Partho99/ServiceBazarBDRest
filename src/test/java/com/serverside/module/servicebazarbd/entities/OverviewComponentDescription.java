package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class OverviewComponentDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @OneToMany(mappedBy = "overviewComponentDescription",cascade = CascadeType.ALL)
    private Set<OverviewComponentValue> overviewComponentValue;
    private Date createdAt;
    private Date updatedAt;
    private Boolean activeStatus;

}
