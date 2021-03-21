package com.serverside.module.servicebazarbd.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Simple JavaBean domain object representing an Address.
 * This Address is used by of all user like
 * customer,serviceProvider,Admin,manager etc
 *
 * @author Partho Das
 */

@MappedSuperclass
public class Address {

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
}
