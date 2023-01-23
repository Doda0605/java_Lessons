package org.example;

public class TestAutomobila {
    private String naziv;

    public String getNaziv(){
        return naziv;
    }

    public void setNaziv(String newNaziv){
        this.naziv = newNaziv;
    }

    private int potrosioGoriva;

    public int getPotrosioGoriva(){
        return this.potrosioGoriva;
    }

    public void setPotrosioGoriva(int potrosioGoriva){
        this.potrosioGoriva = potrosioGoriva;
    }

    private int prijedjenPut;

    public int getPrijedjenPut(){
        return this.prijedjenPut;
    }

    public void setPrijedjenPut(int prijedjenPut){
        this.prijedjenPut = prijedjenPut;
    }
}
