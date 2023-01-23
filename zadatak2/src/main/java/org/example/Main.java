package org.example;

public class Main {
    public static void main(String[] args) {
        Ptica myPtica = new Ptica();
        Lastavica myLastavica = new Lastavica();

        myPtica.setIme("Goran");
        System.out.println(myPtica.getName());
        myPtica.glasajSe();

        myLastavica.setIme("Davor");
        System.out.println(myLastavica.getName());
        myLastavica.glasajSe();


    }
}