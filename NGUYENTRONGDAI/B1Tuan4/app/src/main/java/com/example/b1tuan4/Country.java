package com.example.b1tuan4;

public class Country {
    int img;
    String population;
    String name;

    public Country(int img, String population, String name) {
        this.img = img;
        this.population = population;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
