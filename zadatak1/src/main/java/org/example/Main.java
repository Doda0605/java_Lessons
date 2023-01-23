package org.example;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        int answer,guess;

        final int MAX = 100;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        boolean correct = false;

        answer = rand.nextInt(MAX) + 1;

        while(!correct) {
            System.out.println("Guess a number between 1 and 100: ");

            guess = in.nextInt();

            if (guess > answer) {
                System.out.println("Too high, try again");
            } else if (guess < answer) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("You guessed the number!");

                correct = true;
            }
        }
        System.exit(0);
    }
}