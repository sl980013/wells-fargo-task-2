package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name="clientId", nullable = false)
    private Client clientId;

    @Column(nullable = false)
    private LocalDate creationDate;

    protected Portfolio(){

    }

    public Portfolio(Client clientId, LocalDate creationDate){
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId(){
        return portfolioId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId){
        this.clientId = clientId;
    }

    public LocalDate getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate){
        this.creationDate = creationDate;
    }
}
