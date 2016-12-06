package com.company;

/**
 * Created by morozovu on 06.12.2016.
 */
public class Country implements Cloneable{
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj instanceof Country) {
            Country country = (Country) obj;
            if(this.name != null && country.getName() != null)
            return country.getName().equals(this.name) && country.getPopulation() == this.population;
        }
        return false;
    }
}
