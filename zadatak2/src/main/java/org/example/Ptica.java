package org.example;

public class Ptica implements Zivotinja{


    private String name;

    public String getName(){
        return name;
    }

    public void setIme(String newName){
        this.name = newName;
    }
    public void glasajSe(){
        System.out.println("The brid says chirp chirp");
    }
}