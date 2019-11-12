package be.intecbrussel.boookexercises.exerciseschap9.Logo;

import be.intecbrussel.boookexercises.exerciseschap10.square.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle () {
        this(0);
    }

    @Override
    protected double getArea() {
        double area = (Math.PI) * (radius * radius);
        return area;
    }

    @Override
    protected double getPerimeter() {
        double perimeter = (2*radius) * Math.PI;
        return perimeter;
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    //setting the value of radius

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }

    public void grow (int factor) {
        if (factor<0) {
            factor = -factor;
        }
        this.radius = radius * factor;
    }
}
