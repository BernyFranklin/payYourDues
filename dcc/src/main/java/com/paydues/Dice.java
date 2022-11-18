package com.paydues;

import java.util.Random;

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
}
