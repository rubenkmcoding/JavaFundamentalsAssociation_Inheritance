/*package be.intecbrussel.boookexercises.exerciseschap9.Logo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaring objects
        Logo logoDesign;
        Scanner kbd = new Scanner(System.in);
        Rectangle[] rectangles;
        Circle[] circles;
        //declaring variables
        int amountOfRectangles = 0;
        int amountOfCircles = 0;
        double rectHeight = 0;
        double rectWidth = 0;
        double circleRadius = 0;
        String text = "";

        //requesting input
        System.out.println("How many rectangles does the logo contain?");
        amountOfRectangles = kbd.nextInt();
        rectangles = new Rectangle[amountOfRectangles];
        System.out.println("How many circles does the logo contain?");
        amountOfCircles = kbd.nextInt();
        circles = new Circle[amountOfCircles];

        //initializing logo
        logoDesign = new Logo(rectangles,circles,text);
        logoDesign.setR(rectangles);
        logoDesign.setC(circles);

        //values input
        for (int i = 0; i<amountOfRectangles; i++) {
            rectangles[i]= new Rectangle();
            System.out.println("Give in the height of the rectangle number " + (i+1));
            rectHeight = kbd.nextDouble();
            rectangles[i].setHeight(rectHeight);
            System.out.println("Give in the width of the rectangle number " + (i+1));
            rectWidth = kbd.nextDouble();
            rectangles[i].setWidth(rectWidth);
        }
        for (int i = 0; i<amountOfCircles; i++) {
            circles[i]= new Circle();
            System.out.println("Give in the radius of the circle number " + (i+1));
            circleRadius = kbd.nextDouble();
            circles[i].setRadius(circleRadius);
        }


        System.out.println(String.format("%.2f", logoDesign.getArea()));


    }
}*/
