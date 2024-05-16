package com.wellsfargo.counselor.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Portfolio {
    @Id
    @GeneratedValue()
    private Long portfolioId;

    @Column(nullable = false)
    private String creationdate;

    @OneToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @OneToMany(mappedBy = "portfolio",cascade = CascadeType.ALL)
    private List<Security> securitites;

    private List<Security> securities;

    public Portfolio(){
    }

    public Portfolio(String creationdate,Client client){
        this.creationdate = creationdate;
        this.client = client;
    }

    public Long getPortfolioid() {
        return portfolioId;
    }

    public String getCreationDate(){
        return creationdate;
    }
    public void setCreationDate(String creationdate){
        this.creationdate = creationdate;
    }

    public Client getClient(){
        return client;
    }
    public void setClient(Client client){
        this.client = client;
    }

    public List<Security> getSecurities(){
        return securities;
    }
    public void setSecurities(List<Security> securities){
        this.securities = securities;
    }   
}
