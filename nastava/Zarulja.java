/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nastava;

/**
 *
 * @author student
 */
public class Zarulja{
    private boolean stanjeZarulje;
    
    public void turnOff(){
        this.stanjeZarulje = false;
    }
    
    public void pritisniPrekidac(){
        this.stanjeZarulje = !this.stanjeZarulje;
    }
    
    public String Provjeri(){
        String provjera;
        if(this.stanjeZarulje == false){
            provjera = "mrak";
            //System.out.println("mrak");
            return provjera;
        }else{
            provjera = "svijetli";
            //System.out.println("svijetli");
            return provjera;
        }
    }
}
