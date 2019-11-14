package be.intecbrussel.boookexercises.exerciseschap9.Logo;


public class Logo {

    private Rectangle[] r;
    private Circle[] c;

    private String text;

    //aanroepen van de rectangle
    public Rectangle[] getR() {
        return r;
    }

    //instellen van de rectangle
    public void setR(Rectangle[] r) {
        this.r = r;
    }

    //aanroepen van de cirkel
    public Circle[] getC() {
        return c;
    }

    //instellen van de circle
    public void setC(Circle[] c) {
        this.c = c;
    }

    //instellen van de arrays
    Logo(Rectangle[] rectArray, Circle[] circArray, String text) {
        this.r = rectArray;
        this.c = circArray;
        this.text = text;
    }

    //bereken van de oppervlakte
    public double getArea() {
        double totalArea = 0;

        for (int i = 0; i < r.length; i++) {
            System.out.println("Rectangle number " + (i+1) + " has an area of " + String.format("%.2f", r[i].getArea()));
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("Circle number " + (i+1) + " has an area of " + String.format("%.2f", c[i].getArea()));
        }

        for (Rectangle rect : r
        ) {
            totalArea += rect.getArea();

        }

        for (Circle circ : c
        ) {
            totalArea += circ.getArea();

        }
        return totalArea;

    }

    //aanroepen van de string
    public String getText() {
        return text;
    }

    //instellen van de string
    public void setText(String text) {
        this.text = text;
    }

}