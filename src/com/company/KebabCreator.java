package com.company;

public class KebabCreator {

    public KebabCreator() {
    }

    public Kebab sto(){
        Kebab out = new Kebab();
        out.addIngredient(new Ingredient("Salade",true,true));
        out.addIngredient(new Ingredient("Tomate",true,true));
        out.addIngredient(new Ingredient("Oignon",true,true));
        return out;
    }

    public Kebab classic(){
        Kebab out = sto();
        out.addIngredient(new Ingredient("Kebab",false,false));
        out.addSauce(new Sauce("Blanche"));
        return out;
    }

    public Kebab haleineFraiche(){
        Kebab out = classic();
        out.sansOignon();
        return out;
    }

    public Kebab terremer(){
        Kebab out = sto();
        out.addIngredient(new Ingredient("Bulot",false,true));
        out.addIngredient(new Ingredient("Galette",true,true));
        out.addSauce(new Sauce("Ketchup"));
        out.addSauce(new Sauce("Yaourt"));
        return out;
    }

    public Kebab cheesy(){
        Kebab out = classic();
        out.supplementFromage();
        out.supplementFromage();
        out.supplementFromage();
        return out;
    }

    public Kebab veggy(){
        Kebab out = sto();
        out.addIngredient(new Ingredient("Galette",true,true));
        out.addSauce(new Sauce("Salade"));
        return out;
    }

    public Kebab pescetruc(){
        Kebab out = sto();
        out.addIngredient(new Ingredient("Baleine",true,true));
        out.addIngredient(new Ingredient("Galette",true,true));
        out.addSauce(new Sauce("Mer"));
        return out;
    }

}
