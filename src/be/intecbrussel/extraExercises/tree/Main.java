package be.intecbrussel.extraExercises.tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //properties
        Scanner kbd = new Scanner(System.in);
        Tree tree = new Tree ();
        TreeElements e = new TreeElements();
        int choice = 0;

        //program start info to user
        System.out.println("Lets make a Tree together");
        System.out.println("Your tree has 20 branches can you give us the direction of every branch");
        System.out.println("");

        //giving a choice
        System.out.println("Would you like to set:");
        System.out.println(" 1. the whole list");
        System.out.println(" 2. A specific branch ");
        System.out.println(" 3. remove a branch");
        System.out.println("Input your choice number");
        choice = kbd.nextInt();

        //giving back the right choice
        switch (choice) {
            default:

                System.out.println("Wrong option, run again");
                break;

            case 1:
                for (int i = 0; i<tree.treeElementsLength(); i++) {
                    tree.setElement(e);
                }
                break;

            case 2:
                System.out.println("Give in the number of the branch you'd like to set");
                choice = kbd.nextInt();
                tree.setElement(e);
                break;
            case 3:
                System.out.println("Give in the number of the branch you'd like to empty");
                choice = kbd.nextInt();
                tree.removeElement(choice-1);
                break;
        }

    tree.showNumberOfBranches();

    }
}
