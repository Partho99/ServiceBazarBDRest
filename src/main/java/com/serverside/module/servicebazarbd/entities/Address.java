package com.serverside.module.servicebazarbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Simple JavaBean domain object representing an Address.
 * This Address is used by of all user like
 * customer,serviceProvider,Admin,manager etc
 *
 * @author Partho Das
 */

@MappedSuperclass
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flatNumber;
    private String roadNumber;
    private String houseNumber;
    private String blockNumber;
    private String sectorNumber;
    private String streetAddress;
    private String localArea;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isActive;

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getRoadNumber() {
        return roadNumber;
    }

    public void setRoadNumber(String roadNumber) {
        this.roadNumber = roadNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getSectorNumber() {
        return sectorNumber;
    }

    public void setSectorNumber(String sectorNumber) {
        this.sectorNumber = sectorNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
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

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", flatNumber='" + flatNumber + '\'' +
                ", roadNumber='" + roadNumber + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", blockNumber='" + blockNumber + '\'' +
                ", sectorNumber='" + sectorNumber + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", localArea='" + localArea + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", isActive=" + isActive +
                '}';
    }
}
