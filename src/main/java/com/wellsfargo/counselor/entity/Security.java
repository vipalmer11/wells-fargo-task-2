package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column(nullable = false, unique = true)
    private String ticker;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String assetClass; // e.g., Equity, Bond, ETF

    // JPA requires a no-arg constructor
    protected Security() {}

    // Full constructor initializing all instance variables (except the auto-generated id)
    public Security(String ticker, String name, String assetClass) {
        this.ticker = ticker;
        this.name = name;
        this.assetClass = assetClass;
    }

    // Getters (no setter for ID required)
    public Long getSecurityId() {
        return securityId;
    }

    public String getTicker() {
        return ticker;
    }
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAssetClass() {
        return assetClass;
    }
    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }
}