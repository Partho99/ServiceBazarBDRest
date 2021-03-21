package com.serverside.module.servicebazarbd.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ShippingAddress implements Serializable {

    private String flatNumber;
    private String roadNumber;
    private String houseNumber;
    private String blockNumber;
    private String sectorNumber;
    private String streetAddress;
    private Date shippingDate;
    private String localArea;

    public ShippingAddress() {
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

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "flatNumber='" + flatNumber + '\'' +
                ", roadNumber='" + roadNumber + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", blockNumber='" + blockNumber + '\'' +
                ", sectorNumber='" + sectorNumber + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", shippingDate=" + shippingDate +
                ", localArea='" + localArea + '\'' +
                '}';
    }
}
