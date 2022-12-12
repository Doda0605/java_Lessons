/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class main {
    public static void main(String[] args){
        Radnik Ivica = new Ivica();
        Radnik Juraj = new Juraj();
        
        int placa1;
        int placa2;
        
        placa1 = Ivica.placa();
        placa2 = Juraj.placa();
        
        System.out.println("Placa Ivica = " + placa1);
        System.out.println("Placa Juraj = " + placa2);
        
        Ivica.brojRadnihSati();
        Juraj.brojRadnihSati();
        Ivica.ispisBrojGod();
        Juraj.ispisBrojGod();
        String work = Ivica.sMetoda();
        System.out.println("Vraceni string = " + work);
    }
}
