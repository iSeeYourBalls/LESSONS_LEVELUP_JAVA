package com.company;

public enum Gender {
    male("Мужской");

    String nameMale;

    public String getMale() {
        return nameMale;
    }

    Gender(String nameMale) {
        this.nameMale = nameMale;
    }
}
