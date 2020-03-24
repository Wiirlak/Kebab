package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Kebab client1 = new Kebab();
        System.out.println(client1.toString());
        System.out.println("Vegetarien ? " + client1.isVegetarian());

        ArrayList<Ingredient> i = new ArrayList<>();
        ArrayList<Sauce> j = new ArrayList<>();
        i.add(new Ingredient("bulot",false,true));
        i.add(new Ingredient("Salade",true,true));
        i.add(new Ingredient("Tomate",true,true));
        i.add(new Ingredient("Oignon",true,true));
        i.add(new Ingredient("Galette",true,true));
        j.add(new Sauce("Blanche"));
        Kebab client2 = new Kebab(i);
        System.out.println(client2.toString());
        System.out.println("Pescetarien ? " + client2.isPescetarian());
    }

}
