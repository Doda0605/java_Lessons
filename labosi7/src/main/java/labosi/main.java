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
public class main {
    public static void main(String[] args){
        LansirnaRampa jedan = new LansirnaRampa();
        Raketa r1 = new Raketa("Raketa - 1", jedan);
        Raketa r2 = new Raketa("Raketa - 2", jedan);
        
        r1.start();
        r2.start();
    }
}