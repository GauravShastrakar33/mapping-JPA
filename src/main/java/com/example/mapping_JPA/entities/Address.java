package com.example.mapping_JPA.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_address")
public class Address {

    private int addressId;
    private String street;
    private String city;
    private String country;

    public Address() {
    }

    public Address(int addressId, String street, String city, String country) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.country = country;
    }
}
