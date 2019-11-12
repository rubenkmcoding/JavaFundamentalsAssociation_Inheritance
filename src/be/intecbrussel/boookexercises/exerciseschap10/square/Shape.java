package be.intecbrussel.boookexercises.exerciseschap10.square;

public abstract class Shape {
    private int count;
    private int x;
    private int y;
    private int factor;

    public Shape () {
        this(0,0);
    }

    public Shape (int x, int y)  {

    }

    void setX (int x) {
        this.x = x;
    }

    int getX () {
        return this.x;
    }

    void setY (int x) {
        this.y = y;
    }

    int getY () {
        return this.y;
    }

    void setPosition (int x, int y) {
        setX(x);
        setY(y);
    }

    protected abstract double getArea();

    protected abstract double getPerimeter();

    public int getCount() {
        return count;
    }

}
