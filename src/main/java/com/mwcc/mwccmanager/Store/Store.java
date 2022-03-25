package com.mwcc.mwccmanager.Store;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String city;
    private String state;
    private String address;


    public Store(Long id, String city, String state, String address) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.address = address;
    }
    public Store(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
