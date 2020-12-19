/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_highlow2;

/**
 *
 * @author Shanell A. Spann
 */
public class gameController 
{
    char runAgain;
    public void gameController()
    {
//        Game g = new Game();
//        do{
//                g.reset();
////                g.getRandomNumber();
//                g.play();
//                g.runAgain();
//        } while (runAgain == 'Y');
        
        Game2 g2 = new Game2();
        do{
             
                g2.play();
                
        } while (runAgain == 'Y');
    }    
    
}
