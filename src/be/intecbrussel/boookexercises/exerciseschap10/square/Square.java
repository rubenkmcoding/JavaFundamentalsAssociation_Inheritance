package be.intecbrussel.boookexercises.exerciseschap10.square;

import be.intecbrussel.boookexercises.exerciseschap9.Logo.Rectangle;

public class Square extends Rectangle {
    private double side;

    public Square () {
        this (0);
    }

    public Square (int side) {
        this(side, 0,0);
    }

    public Square (int side, int x, int y) {
        setMeasurements(side);
        setPosition(x,y);
    }

    public Square (Square square) {
        this.side = square.getHeight();
        setPosition(square.getX(), square.getY());
    }

    //sides are the same size so equalizing them
    public  void setMeasurements(double side) {
        this.setHeight(side);
        this.setWidth(side);
    }

    public void setSide (double side) {
        this.side = side;
    }


    //position
    public String getPosition () {
        String position = "";
        position = "(" + getX() + "," + getY() + ")";
        return position;
    }

}
