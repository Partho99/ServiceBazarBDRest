package com.serverside.module.servicebazarbd.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class ServiceImage extends Image implements Serializable {
    @ManyToOne
    @JoinColumn(name = "service_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Services service;

    public ServiceImage() {
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "ServiceImage{" +
                "service=" + service +
                '}';
    }
}
