package com.company;

import java.util.ArrayList;

public class Kebab {
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Sauce> sauces;

    public Kebab() {
        ingredients = new ArrayList<>();
        sauces = new ArrayList<>();
    }

    public Kebab(ArrayList<Ingredient> ingredients, ArrayList<Sauce> sauces) {
        this.ingredients = ingredients;
        this.sauces = sauces;
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

    public Kebab sansOignon(){
        return removeIngredient("Oignon");
    }

    public Kebab supplementFromage(){
        int nbFromage = 0;
        for(Ingredient i: ingredients)
            if(i.fromage) nbFromage++;
        if(nbFromage == 0) nbFromage = 1;
        for (int i = 0; i < nbFromage; i++) {
            ingredients.add(new Ingredient("fromage",true,true,true));
        }
        return this;
    }

    public void addIngredient(Ingredient i){
        ingredients.add(i);
    }

    public Kebab removeIngredient(String name){
        for (int i = ingredients.size() - 1 ; i >= 0 ; i--) {
            if(ingredients.get(i).name.equals(name))
                ingredients.remove(ingredients.get(i));
        }
        return this;
    }

    public void addSauce(Sauce i){
        sauces.add(i);
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
