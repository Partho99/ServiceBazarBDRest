package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class OverviewComponents implements Serializable {
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

    public OverviewComponents() {
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

    public Overview getOverview() {
        return overview;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    @Override
    public String toString() {
        return "OverviewComponents{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", activeStatus=" + activeStatus +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", overviewComponentDescription=" + overviewComponentDescription +
                ", overview=" + overview +
                '}';
    }
}
