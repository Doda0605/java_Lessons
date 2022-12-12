/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class LansirnaRampa {
    
    public void lansiraj(){
        for(int i = 10; i > 0; i--){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(LansirnaRampa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
