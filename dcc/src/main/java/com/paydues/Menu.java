package com.paydues;

public class Menu {
    // Prints big line of #
    protected static void bigLine(){
        System.out.println("----------------------------------------");
    }
    // Prints the message
    protected static void rules(){
        System.out.println("#   Welcome to the Probability Club    #");
        System.out.println("#                                      #");
        System.out.println("# Dues are established by playing one  #");
        System.out.println("# of two games                         #");
        System.out.println("#                                      #");
        System.out.println("# Game One: Roll a 5 followed by a 6   #");
        System.out.println("# Game Two: Roll a 5 followed by a 5   #");
        System.out.println("#                                      #");
        System.out.println("# Dues are $1 per 1 roll               #");
    }
    // Prints options
    protected static void options() {
        System.out.println("#  [1]Play Game One [2]Play Game Two   #");
    }
    // Full menu
    protected static void print() {
        bigLine();
        rules();
        bigLine();
        options();
        bigLine();
    }
    // Prints goodbye
    protected static void goodbye(){
        bigLine();
        System.out.println("#   Thank you for your contribution!   #");
        bigLine();
    }

}
