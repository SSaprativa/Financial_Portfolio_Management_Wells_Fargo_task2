package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Security {
    @Id
    @GeneratedValue()
    private Long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchasedate;

    @Column(nullable = false)
    private double purchaseprice;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    public Security(){
    }

    public Security(String name, String category, Date purchasedate, double purchaseprice, int quantity){
        this.name = name;
        this.category = category;
        this.purchasedate = purchasedate;
        this.purchaseprice = purchaseprice;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }
    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public double getPurchaseprice() {
        return purchaseprice;
    }
    public void setPurchase_price(double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getClientPortfolio() {
        return portfolio;
    }

    public void setClientPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
