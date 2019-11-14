package be.intecbrussel.boookexercises.exerciseschap10.square;

public class Triangle extends Shape {
    private double width;
    private double height;
    private double perpenticular;
    private double area;
    private double perimeter;

    //creating the object
    Triangle () {
        this (0,0,0);
    }

    Triangle (double width, double height, double perpenticular) {
        this(width, height, perpenticular, 0,0);
    }

    Triangle (double width, double height, double perpenticular, int x, int y) {
        setWidth(width);
        setHeight(height);
        setPerpenticular(perpenticular);
        setPosition(x,y);
    }

    Triangle (Triangle triangle) {
        this(triangle.getWidth(), triangle.getHeight(), triangle.getPerpenticular(), triangle.getX(), triangle.getY());
    }

    //setters
    void setWidth (double width) {
        this.width = width;
    }

    void setHeight (double height) {
        this.height = height;
    }

    void setPerpenticular (double perpenticular) {
        this.perpenticular = perpenticular;
    }

    //getters
    double getWidth () {
        return width;
    }

    double getHeight () {
        return height;
    }

    double getPerpenticular () {
        return perpenticular;
    }

    //calculations
    @Override
    protected double getArea() {
        this.area = (this.width * this.height) / 2;
        return area;
    }

    @Override
    protected double getPerimeter() {
        this.perimeter = this.height + this.width + this.perpenticular;
        return perimeter;
    }
}
