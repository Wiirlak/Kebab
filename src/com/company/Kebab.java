package com.company;

import java.util.ArrayList;

public class Kebab {
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Sauce> sauces;

    public Kebab() {
        ingredients = new ArrayList<>();
        sauces = new ArrayList<>();
        defaultKebab();
    }

    public Kebab(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isVegetarian(){
        for (Ingredient item : ingredients) {
            if(!item.vegetarian) return false;
        }
        return true;
    }

    public boolean isPescetarian(){
        for (Ingredient item : ingredients) {
            if(!item.pescetarian) return false;
        }
        return true;
    }

    public void addIngredient(Ingredient i){
        ingredients.add(i);
    }

    public void addSauce(Sauce i){
        sauces.add(i);
    }

    public void defaultKebab(){
        ingredients.add(new Ingredient("Kebab",false,false));
        ingredients.add(new Ingredient("Salade",true,true));
        ingredients.add(new Ingredient("Tomate",true,true));
        ingredients.add(new Ingredient("Oignon",true,true));
        ingredients.add(new Ingredient("Galette",true,true));
        sauces.add(new Sauce("Blanche"));
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("Kebab {\n");
        for(Ingredient i : ingredients)
            out.append("\t" + i.name + "\n");
        out.append('}');
        return out.toString();
    }
}
