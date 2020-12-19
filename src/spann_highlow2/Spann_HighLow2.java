/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_highlow2;

import java.awt.Toolkit;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Shanell Spann
 * ITDEV ITOOP
 * Assignment #8
 * Due: 11/07/2019
 */
public class Spann_HighLow2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws javax.sound.sampled.LineUnavailableException
     */
    public static void main(String[] args) throws InterruptedException, LineUnavailableException {
        
        Toolkit.getDefaultToolkit().beep();
        SoundUtils su = new SoundUtils();
        su.tone(261,300);
        
        Admin a = new Admin();
        a.Greeting();
        gameController gc = new gameController();
        gc.gameController();
        a.goodBye();
        su.tone(261,300);
        
    }
    
}
