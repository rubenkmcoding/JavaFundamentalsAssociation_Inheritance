package be.intecbrussel.boookexercises.exerciseschap9.higher_lower_game;

import java.util.Random;

public class HigherLower {
    public int value;
    public int max;
    public Random rand;

    public HigherLower (int max) {
        this.max = max;
        rand= new Random ();
        reset ();
    }

    public void reset () {
        value = rand.nextInt(max+1);
    }

    public int guess(int guessValue) {
        if (guessValue<value) {
            return -1;
        }
        else if (guessValue>value){
            return 1;
        }
        else {
            return 0;
        }
    }


}