package org.example;

public class Main {
    public static void main(String[] args) {
        TestAutomobila auto1 = new TestAutomobila();
        TestAutomobila auto2 = new TestAutomobila();

        auto1.setNaziv("Audi A6");
        auto1.setPrijedjenPut(100);
        auto1.setPotrosioGoriva(20);

        auto2.setNaziv("Mercedes 318d");
        auto2.setPrijedjenPut(150);
        auto2.setPotrosioGoriva(30);

        UsporedbaPotrosnje usporedba = new UsporedbaPotrosnje();

        usporedba.usporedi(auto1, auto2);
    }
}