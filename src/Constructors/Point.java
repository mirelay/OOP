package Constructors;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance () {
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

    public double distance (int newX, int newY) {
        return Math.sqrt((x - newX)*(x-newX) + (y-newY)*(y-newY));
    }

    public double distance (Point newPoint) {
        int newX = newPoint.getX();
        int newY = newPoint.getY();
        return distance(newX, newY);
    }
}
