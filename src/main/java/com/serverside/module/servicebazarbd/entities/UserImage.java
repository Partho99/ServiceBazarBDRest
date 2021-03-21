package com.serverside.module.servicebazarbd.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class UserImage extends Image implements Serializable {
    @ManyToOne
    @JoinColumn(name = "user_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;
    private String nationalIdImage;


    public UserImage() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNationalIdImage() {
        return nationalIdImage;
    }

    public void setNationalIdImage(String nationalIdImage) {
        this.nationalIdImage = nationalIdImage;
    }

    @Override
    public String toString() {
        return "UserImage{" +
                "user=" + user +
                ", nationalIdImage='" + nationalIdImage + '\'' +
                '}';
    }
}
