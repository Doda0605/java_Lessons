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
public class termin2zad1 {
    public static void main(String[] args){
        String provjera;
        Zarulja Osram = new Zarulja();
        provjera = Osram.Provjeri();
        System.out.println(provjera);
        Osram.pritisniPrekidac();
        provjera = Osram.Provjeri();
        System.out.println(provjera);
        Osram.pritisniPrekidac();
        provjera = Osram.Provjeri();
        System.out.println(provjera);
        
        Zaposlenik Zaposlenik1 = new Zaposlenik(20, 50, 7000);
        Zaposlenik1.Zarada1();
        
        Zaposlenik1.Zarada2(Zaposlenik1);
    }
}