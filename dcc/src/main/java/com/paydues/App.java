package com.paydues;

import java.util.Scanner;

/**
 * Alice wants to join her school's Probability Student 
 * Club. Membership dues are computed via one of two 
 * simple probabilistic games.
 * 
 * The first game: roll a die repeatedly. Stop rolling once
 * you get a 5 followed by a 6. Your number of rolls is
 * the amount you pay in dollars.
 * 
 * The second game: same, except that the stopping 
 * condition is a 5 followed by a 5.
 * 
 * Which of the two games should Alice elect to play?
 * Does it even matter? Write a program to simulate the 
 * two games and calculate their expected value.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create scanner object
        Scanner scan = new Scanner(System.in);
        // Set vars
        char input = ' ';
        // Print menu
        Menu.print();
        // Get input
        while (input != '1' && input != '2') {
            System.out.printf("\nPlease select option [1] or [2]: ");
            input = scan.nextLine().charAt(0);
            switch (input) {
                case '1':
                    Dice.gameOne();
                    break;
                case '2':
                    Dice.gameTwo();
                    break;
                default:
                    System.out.printf("Input must be [1] or [2], please try again");

            }
        }
        Menu.goodbye();
        scan.close();
    }
}
