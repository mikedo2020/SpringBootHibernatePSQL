package com.forex.entity;


import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Account implements Serializable {

    public Account() {
    }


    @Id
    private int accountId;

    @Column
    private double balance;

    @Column
    private double euroBalance;

    @Column
    private String currency;

    @Column
    private double variation;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getEuroBalance() {
        return euroBalance;
    }

    public void setEuroBalance(double euroBalance) {
        this.euroBalance = euroBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getVariation() {
        return variation;
    }

    public void setVariation(double variation) {
        this.variation = variation;
    }
}
