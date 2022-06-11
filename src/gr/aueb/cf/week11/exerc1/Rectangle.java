package gr.aueb.cf.week11.exerc1;

public class Rectangle extends AbstractShape implements TwoDimensional {

    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public long getId() {
        return 1;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
