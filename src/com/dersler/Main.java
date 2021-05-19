package com.dersler;

import com.dersler.oyun.Bebek;
import com.dersler.oyun.Yemekler;

public class Main {

    public static void main(String[] args) {
        Bebek sanal = new Bebek("sanalcık");

        System.out.println(sanal.toString());

        sanal.Besle(Yemekler.Et);
        System.out.println("Et yedi.");
        System.out.println(sanal.toString());

        sanal.Besle(Yemekler.Fastfood);
        System.out.println("Fastfood yedi.");
        System.out.println(sanal.toString());

        sanal.Besle(Yemekler.Balik);
        System.out.println(Yemekler.Balik +" yedi.");
        System.out.println(sanal.toString());

        sanal.Temizle();
        System.out.println("Temizlendi.");
        System.out.println(sanal.toString());
    }
}
