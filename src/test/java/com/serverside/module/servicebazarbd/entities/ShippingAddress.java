package com.serverside.module.servicebazarbd.entities;

import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class ShippingAddress {

    private String flatNumber;
    private String roadNumber;
    private String houseNumber;
    private String blockNumber;
    private String sectorNumber;
    private String streetAddress;
    private Date shippingDate;
    private String localArea;


}
