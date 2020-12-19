/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_highlow2;

/**
 *
 * @author Shanell Spann
 */
import java.util.Scanner;
public class Game2 
{
    
    int balance = 100;
    int newBalance;
    int wager;
    int wagerTotal;
    
    
    int guess;
    int randomNumber = 26;
    

    int numWagers = 0;
    char continueIndicator;
    Admin a = new Admin();
    Scanner keyboard = new Scanner(System.in);
    gameController c = new gameController();

    
    public void Wagers()
    {
        newBalance = balance - wager;
             
    }
    
    public void play()
    {
        boolean cont = true;
        System.out.println("\nWould you like to Continue Y or N?: \t");
        continueIndicator = keyboard.next().toUpperCase().charAt(0);
        if(continueIndicator == 'Y')
        {
            System.out.println("You have 100 points. Enter the amount of your wager, or -999 to QUIT"); 
            wager = keyboard.nextInt();
            Wagers();
            if (wager == -999)
            {
               cont = false;
            }
            else 
            {
                Ask();
                if (guess == -999)
                {
                    cont = false;
                }
                while(guess != randomNumber)
                {
                    Ask();    
                }
            
                System.out.println("\nWould you like to Continue Y or N?: \t");
                continueIndicator = keyboard.next().toUpperCase().charAt(0);
            }
            
        }

    }
    
    public void Ask()
    {
        boolean cont = true;
        int randomNumber = 26;
        
        System.out.println("Guess a number 1-30 or -999 to quit.");
        guess = keyboard.nextInt();
        

            if (guess == -999)
            {
                cont = false;
            }
            
            if (guess > randomNumber)
                {
                    System.out.println("You guessed too high");
                    
                }
            if (guess < randomNumber)
                {
                    System.out.println("You guessed too low");
                    
                }
            if (guess == randomNumber)
            {
                System.out.println("Congrats! You guessed correctly");
            
            }
            
            numWagers++;
            wagerTotal = numWagers * wager;
            newBalance = balance - wagerTotal;
            System.out.println("Your wager balance = " + newBalance);
    }
}
