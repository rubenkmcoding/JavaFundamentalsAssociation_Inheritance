package be.intecbrussel.boookexercises.exerciseschap9.higher_lower_game;

import java.util.Scanner;

public class Main {
    //declaring variables
    public Scanner kbd = new Scanner(System.in);
    public HigherLower game;
    public int max = 0;
    public int guessValue= 0;
    public String responseToGuess = "";
    public static int guess;

    public static void main(String[] args) {

        //declaring variables
        Scanner kbd = new Scanner(System.in);
        HigherLower game;
        int max = 0;
        int guessValue= 0;
        int guess;
        String responseToGuess = "";



        //requesting input
        System.out.println("We will be playing a game of higher lower.");
        System.out.println("Choose a max value that the system can use:");
        max = kbd.nextInt();
        game = new HigherLower(max);
        System.out.println("Please input your guess");
        guessValue = kbd.nextInt();


        //checking input
        guess = game.guess(guessValue);

        switch (guess) {
            case -1:
                responseToGuess = "Higher";
                System.out.println("You guessed: " + guessValue);
                System.out.println(responseToGuess);
                guessValue = kbd.nextInt();
            case 1:
                responseToGuess = "Lower";
                System.out.println("You guessed: " + guessValue);
                System.out.println(responseToGuess);
                guessValue = kbd.nextInt();
            case 0:
                responseToGuess = "Correct";
                System.out.println("You guessed: " + guessValue);
                System.out.println(responseToGuess);
        }

    }
}
