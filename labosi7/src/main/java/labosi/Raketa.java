/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi;

/**
 *
 * @author student
 */
public class Raketa extends Thread{
    
    private Thread t;
    private final String ime;
    LansirnaRampa imeRampe;
    
    Raketa(String ime1, LansirnaRampa imeRampe1){
        ime = ime1;
        imeRampe = imeRampe1;
    }
    
    @Override
    public void run(){
         synchronized(imeRampe){
            System.out.println(ime);
            System.out.println("Pocetak lansiranja");
            imeRampe.lansiraj();
            System.out.println(ime);
            System.out.println("Polijetanje");
         }
    }
}
