package com.company;

public class Main {

    public static void main(String[] args) {
        Kebab client1 = new Kebab();
        System.out.println(client1.toString());
        System.out.println("Vegetarien ? " + client1.isVegetarian());
    }

}
