package Constructors;

public class Wall {
    private double width;
    private double height;

    public Wall () {
        this.height = 0;
        this.width = 0;
    }

    public Wall (double width, double height) {
        if(height<0) {
            this.height = 0;
        } else {
            this.height = height;
        }

        if(width<0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getArea () {
        return this.height * this.width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if(width<0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height<0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
}
