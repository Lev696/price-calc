package com.epam.brest;

import java.util.Scanner;

/**
 * 1-st main class. priceCalc=pricePerKg*kg + pricePerKm*km
 */

public class Main {

    public static void main(String[] args) {

        String pricePerKg, pricePerKm, kg, km;

        System.out.println("HELLO!");

        System.out.println("Pleace input pricePerKg: ");
        Scanner sc = new Scanner(System.in);
        pricePerKg=sc.next();
        System.out.println("pricePerKg = " + pricePerKg + " USD");

        System.out.println("Pleace input kg: ");
        kg=sc.next();
        System.out.println("weight = " + kg + " kg");

        System.out.println("Pleace input pricePerKm: ");
        pricePerKm=sc.next();
        System.out.println("pricePerKm = " + pricePerKm + " USD");

        System.out.println("Pleace input distance: ");
        km=sc.next();
        System.out.println("distance = " + km + " km");

        double result = Double.valueOf(pricePerKg)*Double.valueOf(kg)+Double.valueOf(pricePerKm)*Double.valueOf(km);
        System.out.println("priceCalc = " +result + " USD");
    }
}

