package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class OverviewComponentDescription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @OneToMany(mappedBy = "overviewComponentDescription",cascade = CascadeType.ALL)
    private Set<OverviewComponentValue> overviewComponentValue;
    private Date createdAt;
    private Date updatedAt;
    private Boolean activeStatus;

    public OverviewComponentDescription() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<OverviewComponentValue> getOverviewComponentValue() {
        return overviewComponentValue;
    }

    public void setOverviewComponentValue(Set<OverviewComponentValue> overviewComponentValue) {
        this.overviewComponentValue = overviewComponentValue;
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

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "OverviewComponentDescription{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", overviewComponentValue=" + overviewComponentValue +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
