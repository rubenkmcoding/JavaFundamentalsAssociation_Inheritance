package be.intecbrussel.boookexercises.exerciseschap10.square;

public class IsoScelesTriangle extends Triangle {

    //properties
    private static int counter = 0;

    //creating objects
    IsoScelesTriangle () {
        this (0,0);
    }

    IsoScelesTriangle (double width, double height) {
        this (width, height, 0,0);
    }

    IsoScelesTriangle (double width, double height, int x, int y) {
        this.setWidth(width);
        this.setHeight(height);
        this.setPosition(x,y);
        counter++;
    }

    IsoScelesTriangle (IsoScelesTriangle isoScelesTriangle) {
        this(isoScelesTriangle.getWidth(), isoScelesTriangle.getHeight(), isoScelesTriangle.getX(), isoScelesTriangle.getY());
    }

    @Override
    public int getCount () {
        return counter;
    }

}
