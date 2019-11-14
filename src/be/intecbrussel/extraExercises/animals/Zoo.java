package be.intecbrussel.extraExercises.animals;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Zoo {


    //properties
    private AfricanPenguin[] penguins;
    private Gorilla[] gorillas;
    private Lion[] lions;
    private SaltwaterCrocodile[] crocodiles;
    private TimberWolf[] wolves;
    int penguinCounter = 0;
    int gorillaCounter = 0;
    int lionCounter = 0;
    int crocodileCounter = 0;
    int wolfCounter = 0;
    String printOut = "";


    Zoo () {
        penguins = new AfricanPenguin[0];
        gorillas = new Gorilla[0];
        lions = new Lion[0];
        crocodiles = new SaltwaterCrocodile[0];
        wolves = new TimberWolf[0];
    }

    //adding objects to zoo
    void setNewPenguin (String name, String gender, int age) {
        AfricanPenguin[] temp = Arrays.copyOf(penguins, penguins.length +1);
        temp[penguinCounter] = new AfricanPenguin(name, gender, age);
        this.penguins = temp;
        penguinCounter++;
    }

    void setGorilla (String name, String gender, int age) {
        Gorilla[] temp = Arrays.copyOf(gorillas, gorillas.length +1);
        temp[gorillaCounter] = new Gorilla(name, gender, age);
        this.gorillas = temp;
        gorillaCounter++;
    }

    void setLion (String name, String gender, int age) {
        Lion[] temp = Arrays.copyOf(lions, lions.length +1);
        temp[lionCounter] = new Lion(name, gender, age);
        this.lions = temp;
        lionCounter++;
    }

    void setCrocodile (String name, String gender, int age) {
        SaltwaterCrocodile[] temp = Arrays.copyOf(crocodiles, crocodiles.length +1);
        temp[crocodileCounter] = new SaltwaterCrocodile(name, gender, age);
        this.crocodiles = temp;
        crocodileCounter++;
    }

    void setWolf (String name, String gender, int age) {
        TimberWolf[] temp = Arrays.copyOf(wolves, wolves.length +1);
        temp[wolfCounter] = new TimberWolf(name, gender, age);
        this.wolves = temp;
        wolfCounter++;
    }


    //print out
    void printingList (Object[] objects) {
        for (int i = 0; i < objects.length ; i++) {
            System.out.println(objects[i]);
        }
    }

    void printingAll () {
        printingList(penguins);
        printingList(gorillas);
        printingList(lions);
        printingList(crocodiles);
        printingList(wolves);
    }




}
