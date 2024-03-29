package be.intecbrussel.boookexercises.exerciseschap10.square;

import be.intecbrussel.boookexercises.exerciseschap9.Logo.Rectangle;

public class Square extends Rectangle {
    private double side;
    private int count;

    public Square () {
        this (0);
    }

    public Square (double side) {
        this(side, 0,0);
    }

    public Square (double side, int x, int y) {
        setMeasurements(side);
        setPosition(x,y);
        count++;
    }

    public Square (Square square) {
        this(square.getSide(),square.getX(), square.getY());
    }

    //sides are the same size so equalizing them
    public  void setMeasurements(double side) {
        this.setHeight(side);
        this.setWidth(side);
    }

    public void setSide (double side) {
        this.side = side;
        this.setMeasurements(side);
    }

    double getSide () {
        return side;
    }


    //position
    public String getPosition () {
        String position = "";
        position = "(" + getX() + "," + getY() + ")";
        return position;
    }

    @Override
    public int getCountShapes() {
        return count;
    }
}
