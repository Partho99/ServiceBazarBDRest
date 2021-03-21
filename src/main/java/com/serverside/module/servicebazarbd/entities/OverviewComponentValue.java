package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class OverviewComponentValue implements Serializable {
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

    public OverviewComponentValue() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOverviewComponentValue() {
        return overviewComponentValue;
    }

    public void setOverviewComponentValue(String overviewComponentValue) {
        this.overviewComponentValue = overviewComponentValue;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public OverviewComponentDescription getOverviewComponentDescription() {
        return overviewComponentDescription;
    }

    public void setOverviewComponentDescription(OverviewComponentDescription overviewComponentDescription) {
        this.overviewComponentDescription = overviewComponentDescription;
    }

    @Override
    public String toString() {
        return "OverviewComponentValue{" +
                "id=" + id +
                ", overviewComponentValue='" + overviewComponentValue + '\'' +
                ", activeStatus=" + activeStatus +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", overviewComponentDescription=" + overviewComponentDescription +
                '}';
    }
}
