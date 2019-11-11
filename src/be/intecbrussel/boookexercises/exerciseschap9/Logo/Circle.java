package be.intecbrussel.boookexercises.exerciseschap9.Logo;

public class Circle {
    private double radius;

    public Circle () {
        this(0);
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

    //area of a circle
    public static double areaOfCircle (double radius) {
        double area = (Math.PI) * (radius * radius);
        return area;
    }


    //perimeter of a circle
    public static double perimeterOfCircle (double radius) {
        double perimeter = (2*radius) * Math.PI;
        return perimeter;
    }
}
