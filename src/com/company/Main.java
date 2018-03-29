package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main ( String[] args )
    {
        //Done will be used when the program prompts the user on guessing again.
        //Scanner class was used to get an input from user.
        //Result will be used to show the result (possibly the number of failed attempts, etc.).
        boolean done = false;
        String result;
        Scanner scan = new Scanner(System.in);

        //Generating random numbers.
        Random randomNumber = new Random();
        int secretNumber = 1 + randomNumber.nextInt(10);
        System.out.println("Guess a number between 1 and 10.");

        //int guess;

        // guess == secretNumber print congratulations, you guess the secret number

        while (done != true) {

            System.out.print("Enter your number: ");
            int guess = scan.nextInt(); //grab an int for the guess
            scan.nextLine(); //clear out the scanner with the next line

            //can have as many elseif statements as you want.
            //if there is only one line of code in your if statement, then you won't need curly braces. {}
            if (guess == secretNumber)
                System.out.print("Congratulations, you guess the secret number " + secretNumber);
            else if (guess > secretNumber)
                System.out.print("Too high.");
            else
                System.out.print("Too low.");

            System.out.print("\n");
            if (guess == secretNumber) {
                System.out.print("Do you want to play again? (Y/N) ");
                result = scan.next();
                if (result.equalsIgnoreCase("n")) {
                    done = true;
                } else if (result.equalsIgnoreCase("y")) {
                    done = false;
                } else {
                    System.out.print("Invalid entry.");
                    done = true;
                    System.out.print("\n");
                }
            } else {
                System.out.print("You guessed too low, try again? (Y/N) ");
                result = scan.next();
                if (result.equalsIgnoreCase("n")) {
                    done = true;
                } else if (result.equalsIgnoreCase("y")) {
                    done = false;
                } else {
                    System.out.print("Invalid entry.");
                    System.out.print("\n");
                    System.out.print("Would you like to try again? (Y/N) ");
                    result = scan.next();
                    if (result.equalsIgnoreCase("n")) {
                        done = true;
                    } else if (result.equalsIgnoreCase("y")) {
                        done = false;
                    } else {
                        System.out.print("Please enter a valid entry.");
                        System.out.print("\n");
                        System.out.print("Do you want to try again? (Y/N) ");
                        result = scan.next();
                        if (result.equalsIgnoreCase("n")) {
                            done = true;
                        } else if (result.equalsIgnoreCase("y")) {
                            done = false;
                        } else {
                            System.out.print("You're fired!");
                            done = true;
                        }
                    }
                    System.out.print("\n");
                }
            }

        }
        System.out.println("Goodbye!");
    }
}


//RandomNumberGenerator
//          Random r = new Random(55);
//
//        int x = 1 + r.nextInt(10);
//
//        System.out.println( "My random number is " + x );
//
//        System.out.println( "Here are some numbers from 1 to 5!" );
//        System.out.print(3 + r.nextInt(5) + " " );
//        System.out.print(3 + r.nextInt(5) + " " );
//        System.out.print(3 + r.nextInt(5) + " " );
//        System.out.print(3 + r.nextInt(5) + " " );
//        System.out.print(3 + r.nextInt(5) + " " );
//        System.out.print(3 + r.nextInt(5) + " " );
//        System.out.println();
//
//        System.out.println( "Here are some numbers from 1 to 100!" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.print( 1 + r.nextInt(100) + "\t" );
//        System.out.println();
//
//        int num1 = 1 + r.nextInt(10);
//        int num2 = 1 + r.nextInt(10);
//
//        if ( num1 == num2 )
//        {
//            System.out.println( "The random numbers were the same! Weird." );
//        }
//        if ( num1 != num2 )
//        {
//            System.out.println( "The random numbers were different! Not too surprising, actually." );
//        }