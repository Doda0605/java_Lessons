/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Radnik {

    public int placa() {
        int kolicina = 5000;
        return kolicina;
    }

    public void brojRadnihSati() {
        int brojSati = 50;
        System.out.println("Broj radnih sati: " + brojSati);
    }

    private void brojGodinaRadnika() {
        int brojGodina = 18;
        System.out.println("Broj godina radnika: " + brojGodina);
    }

    public void ispisBrojGod() {
        this.brojGodinaRadnika();
    }

    public String sMetoda() {
        return "WORK!";
    }
}
