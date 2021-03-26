package com.example.hibernatetest.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "merchant")
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "bankName")
    private String bankName;
    @Column(name = "swift")
    private String swift;
    @Column(name = "account")
    private String account;
    @Column(name = "charge")
    private Double charge;
    @Column(name = "period")
    private int period;
    @Column(name = "minSum")
    private Double minSum;
    @Column(name = "needToSend")
    private Double needToSend;
    @Column(name = "sent")
    private Double sent;
    @Column(name = "lastSent")
    private java.sql.Date lastSent;

    public Merchant() {
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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Double getMinSum() {
        return minSum;
    }

    public void setMinSum(Double minSum) {
        this.minSum = minSum;
    }

    public Double getNeedToSend() {
        return needToSend;
    }

    public void setNeedToSend(Double needToSend) {
        this.needToSend = needToSend;
    }

    public Double getSent() {
        return sent;
    }

    public void setSent(Double sent) {
        this.sent = sent;
    }

    public Date getLastSent() {
        return lastSent;
    }

    public void setLastSent(Date lastSent) {
        this.lastSent = lastSent;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bankName='" + bankName + '\'' +
                ", swift='" + swift + '\'' +
                ", account='" + account + '\'' +
                ", charge=" + charge +
                ", period=" + period +
                ", minSum=" + minSum +
                ", needToSend=" + needToSend +
                ", sent=" + sent +
                ", lastSent=" + lastSent +
                '}';
    }
}
