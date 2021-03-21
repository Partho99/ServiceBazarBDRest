package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Overview implements Serializable {
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

    public Overview() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOverviewTitle() {
        return overviewTitle;
    }

    public void setOverviewTitle(String overviewTitle) {
        this.overviewTitle = overviewTitle;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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

    public List<OverviewComponents> getOverviewComponents() {
        return overviewComponents;
    }

    public void setOverviewComponents(List<OverviewComponents> overviewComponents) {
        this.overviewComponents = overviewComponents;
    }

    @Override
    public String toString() {
        return "Overview{" +
                "id=" + id +
                ", overviewTitle='" + overviewTitle + '\'' +
                ", activeStatus=" + activeStatus +
                ", details='" + details + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", overviewComponents=" + overviewComponents +
                '}';
    }
}
