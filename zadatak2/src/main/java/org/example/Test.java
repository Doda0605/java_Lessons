package org.example;

public class Test {
    public static void main(String[] args) {
        Ptica myPtica = new Ptica();
        Lastavica myLastavica = new Lastavica();

        myPtica.setIme("Goran");
        System.out.println(myPtica.getName());
        myPtica.glasajSe();

        myLastavica.setIme("Davor");
        System.out.println(myLastavica.getName());
        myLastavica.glasajSe();


        System.out.println("\n");
        Ptica[] arr1;
        arr1 = new Ptica[2];

        for(int i = 0;i<2;i++) {
            arr1[i] = new Ptica();
            arr1[i].getName();
            arr1[i].glasajSe();
        }
        System.out.println("\n");
        Lastavica[] arr2;
        arr2 = new Lastavica[2];

        for(int i = 0;i<2;i++) {
            arr2[i] = new Lastavica();
            arr2[i].getName();
            arr2[i].glasajSe();
        }
    }
}
