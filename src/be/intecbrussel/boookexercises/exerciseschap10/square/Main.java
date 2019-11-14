package be.intecbrussel.boookexercises.exerciseschap10.square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables
        Square square = new Square();
        Scanner kbd = new Scanner(System.in);
        double side=0;
        int x =0;
        int y = 0;

        //asking input
        System.out.println("Please give in the measurement of the side:");
        side = kbd.nextDouble();
        square.setMeasurements(side);
        System.out.println("Please give in the x position:");
        x = kbd.nextInt();
        System.out.println("Please give in the y position:");
        y = kbd.nextInt();
        square.setPosition(x,y);


        //printing side and area and perimeter
        System.out.println(square.getHeight());
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.getPosition());



    }
}
