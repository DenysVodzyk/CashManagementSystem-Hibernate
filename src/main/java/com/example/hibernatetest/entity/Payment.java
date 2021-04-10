package com.example.hibernatetest.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime dt;
    private String goods;
    private double sumPaid;
    private double chargePaid;
    @ManyToOne
    @JoinColumn(name = "merchantId")
    private Merchant merchant;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    public Payment() {
    }

    public Payment(LocalDateTime dt, String goods, double sumPaid, double chargePaid, Merchant merchant, Customer customer) {
        this.dt = dt;
        this.goods = goods;
        this.sumPaid = sumPaid;
        this.chargePaid = chargePaid;
        this.merchant = merchant;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDt() {
        return dt;
    }

    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public double getSumPaid() {
        return sumPaid;
    }

    public void setSumPaid(double sumPaid) {
        this.sumPaid = sumPaid;
    }

    public double getChargePaid() {
        return chargePaid;
    }

    public void setChargePaid(double chargePaid) {
        this.chargePaid = chargePaid;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", dt=" + dt +
                ", goods='" + goods + '\'' +
                ", sumPaid=" + sumPaid +
                ", chargePaid=" + chargePaid +
                ", merchant=" + merchant +
                ", customer=" + customer +
                '}';
    }
}