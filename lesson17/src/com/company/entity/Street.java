package com.company.entity;

public class Street extends Entity {
    private String streetName;

    public Street(String streetName) {
        this.streetName = streetName;
    }

    public Street(Long id, String streetName) {
        super(id);
        this.streetName = streetName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
