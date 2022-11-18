package com.paydues;

import java.util.Random;
import java.util.Stack;

public class Dice {
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

    protected static void gameOne() {
        // Initialize some vars
        // updates throughout game
        int die = 0;
        Stack<Integer> previousRolls = new Stack<Integer>();

        // Test loop
        for (int i = 0; i < 10; i++) {
            die = rollOne();
            previousRolls.push(die);
            System.out.printf("Die value: %d\n", die);
        }

        System.out.printf("peek(): %d\n", previousRolls.peek());
        System.out.printf("last(): %d\n", previousRolls.lastElement());
    }
}
