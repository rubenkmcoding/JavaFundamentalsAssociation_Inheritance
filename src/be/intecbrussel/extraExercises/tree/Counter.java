package be.intecbrussel.extraExercises.tree;

public class Counter {
    //properties
    private int counter = 0;

    //keeping track of the tree count
    void increment () {
        this.counter++;
    }

    void removeCount () {
        this.counter--;
    }

    int giveCounter () {
        return this.counter;
    }
}
