package com.mwcc.mwccmanager.Store;

import javax.persistence.*;

@Entity
@Table(name="store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="city", nullable = false)
    private String city;
    @Column(name="state", nullable = false)
    private String state;
    @Column(name="addreses", nullable=false)
    private String address;


    public Store(String city, String state, String address) {
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

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
