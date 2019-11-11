package be.intecbrussel.boookexercises.exerciseschap9.Logo;

public class Rectangle {
    private double height;
    private double width;
    private int x;
    private int y;
    private int d;
    private static int counter = 0;

    public Rectangle () {
        this(0,0);
    }

    public Rectangle (int width, int height) {
        this(width,height,0,0);
    }

    public Rectangle (int width, int height, int x, int y) {
        this.setWidth(width);
        this.setHeight(height);
        this.setPosition(x,y);
        counter++;
    }

    public Rectangle (Rectangle toDuplicate) {
        this.height = toDuplicate.getHeight();
        this.width = toDuplicate.getWidth();
        counter++;
    }


    public double getArea () {
        double area =  height * width;
        return area;
    }

    public double getPerimeter () {
        double perimeter = 2 * (height + width);
        return perimeter;
    }

    public void setHeight (double height) {
        this.height = height<0?-height:height;
    }

    public void setWidth (double width) {
        this.width = width<0?-width:width;
    }

    public double getHeight () {
        return this.height;
    }

    public double getWidth () {
        return this.width;
    }

    //ex4
    public void setPosition (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }

    public void grow (int factor) {
        if (factor<0) {
            factor = -factor;
        }
        this.height = height * factor;
        this.width = width * factor;
    }


    public static int amountOfCorners = 4;


    public static int amountOfRectangles () {
        return counter;
    }
}
