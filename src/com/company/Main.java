package com.company;


public class Main {

    public static void main(String[] args) {
        KebabCreator kc = new KebabCreator();

        Kebab client1 = kc.classic();
        System.out.println(client1.toString());

        Kebab client2 = kc.veggy();
        System.out.println(client2.toString());
        System.out.println("Vegetarien ? " + client2.isVegetarian());

        Kebab client3 = kc.pescetruc();
        System.out.println(client3.toString());
        System.out.println("Pescétarien ? " + client3.isPescetarian());

        Kebab client4 = kc.cheesy();
        System.out.println(client4.toString());

        Kebab client5 = kc.haleineFraiche();
        System.out.println(client5.toString());
    }

}
