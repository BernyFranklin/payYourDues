package com.paydues;

import java.util.Random;
import java.util.Stack;

public class Dice {
    // Constants
    public static final int FIVE = 5;
    public static final int SIX = 6;
    // Roll function
    protected static int rollOne(){
        // Initialize Var
        int rolled = 0;
        // Create new random object
        Random rand = new Random();
        // Loop until we generate number 1-6
        while(rolled == 0) {
            rolled = rand.nextInt(7);
        }
        // Return value
        return rolled;
    }
    // Plays game one mentioned in prompt
    protected static void gameOne() {
        // Initialize some vars
        // updates throughout game
        int die = 0;
        int count = 0;
        Stack<Integer> previousRolls = new Stack<Integer>();
        // Add a value so stack isn't empty
        previousRolls.push(0);
        // Flag to exit loop
        Boolean fiveAndSix = false;

        // Loop rolling a die until a 5 followed by 6 happens
        while (!fiveAndSix) {
            // Roll, keep count, and print roll
            die = rollOne();
            count++;
            System.out.printf("Die Value: %d\n", die);
            // Peek at the stack to see if last value was a 5 and current is a 6
            if(previousRolls.peek() == FIVE && die == SIX) {
                // Set flag
                fiveAndSix = true;
                // Skip rest of loop
                continue;
            }
            // Push last roll onto stack
            previousRolls.push(die);
        }
        // Print dues
        System.out.printf("Total Dues Owed: $%d\n", count);
    }
    // Plays game two mentioned in prompt
    protected static void gameTwo() {
        // Initialize some vars
        // updates throughout game
        int die = 0;
        int count = 0;
        Stack<Integer> previousRolls = new Stack<Integer>();
        // Add a value so stack isn't empty
        previousRolls.push(0);
        // Flag to exit loop
        Boolean fiveAndSix = false;

        // Loop rolling a die until a 5 followed by 6 happens
        while (!fiveAndSix) {
            // Roll, keep count, and print roll
            die = rollOne();
            count++;
            System.out.printf("Die Value: %d\n", die);
            // Peek at the stack to see if last value was a 5 and current is a 6
            if(previousRolls.peek() == FIVE && die == FIVE) {
                // Set flag
                fiveAndSix = true;
                // Skip rest of loop
                continue;
            }
            // Push last roll onto stack
            previousRolls.push(die);
        }
        // Print dues
        System.out.printf("Total Dues Owed: $%d\n", count);
    }
}
