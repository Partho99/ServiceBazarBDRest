package com.serverside.module.servicebazarbd.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class OptionTypesAndPrices implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String optionName;
    private Date createdAt;
    private Date updatedAt;
    private  Boolean activeStatus;
    @ManyToOne
    @JoinColumn(name = "option_type")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private OptionTypesAndPrices optionType;
    private BigDecimal price;

    public OptionTypesAndPrices() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
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

    public OptionTypesAndPrices getOptionType() {
        return optionType;
    }

    public void setOptionType(OptionTypesAndPrices optionType) {
        this.optionType = optionType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OptionTypesAndPrices{" +
                "id=" + id +
                ", optionName='" + optionName + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", activeStatus=" + activeStatus +
                ", optionType=" + optionType +
                ", price=" + price +
                '}';
    }
}
