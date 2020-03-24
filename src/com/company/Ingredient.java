package com.company;

public class Ingredient {
    public String name;
    public boolean vegetarian;
    public boolean pescetarian;

    public Ingredient(String name) {
        this.name = name;
        this.vegetarian = false;
        this.pescetarian = false;
    }

    public Ingredient(String name, boolean vegetarian, boolean pescetarian) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.pescetarian = pescetarian;
    }
}
