package com.example.hibernatetest.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "ccNo")
    private String ccNo;
    @Column(name = "ccType")
    private String ccType;
    @Column(name = "maturity")
    private java.sql.Date maturity;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Payment", joinColumns = @JoinColumn(name = "customerId"),
            inverseJoinColumns = @JoinColumn(name = "merchantId"))
    private Collection<Merchant> merchants;

    public Customer() {
    }

    public Customer(String name, String address, String email, String ccNo, String ccType, Date maturity) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.ccNo = ccNo;
        this.ccType = ccType;
        this.maturity = maturity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCcNo() {
        return ccNo;
    }

    public void setCcNo(String ccNo) {
        this.ccNo = ccNo;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
    }

    public Date getMaturity() {
        return maturity;
    }

    public void setMaturity(Date maturity) {
        this.maturity = maturity;
    }

    public Collection<Merchant> getMerchants() {
        return merchants;
    }

    public void setMerchants(Collection<Merchant> merchants) {
        this.merchants = merchants;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", ccNo='" + ccNo + '\'' +
                ", ccType='" + ccType + '\'' +
                ", maturity=" + maturity +
                '}';
    }
}
