package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Client {
    @Id
    @GeneratedValue()
    private Long clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String LastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisorId")
    private Advisor advisor;

    @OneToOne(mappedBy = "client",cascade = CascadeType.ALL)
    private Portfolio portfolio;

    public Client(){
    }
    
    public Client(String firstName,String LastName,String address,String phone,String email,Advisor advisor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.advisor = advisor;
    }

    public Long getClientid() {
        return clientId;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public Advisor getAdvisor(){
        return advisor;
    }
    public void setAdvisor(Advisor advisor){
        this.advisor = advisor;
    }

    public Portfolio getPortfolio(){
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio){
        this.portfolio = portfolio;
    }
}

