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
public class Zaposlenik {
    private int staz;
    private int starost;
    private int placa;
    
    public Zaposlenik(int Zstaz, int Zstarost, int Zplaca){
        this.staz = Zstaz;
        this.starost = Zstarost;
        this.placa = Zplaca;
    }
    
    public void Zarada1(){
        int Zarada;
        Zarada = (staz * 12) * placa;
        System.out.println("Ukupna zarada: " + Zarada);
    }
   
    public void Zarada2(Zaposlenik Zaposlenik1){
        int Zarada;
        Zarada = (Zaposlenik1.staz * 12) * Zaposlenik1.placa;
        System.out.println("Ukupna zarada: " + Zarada);
    }
}