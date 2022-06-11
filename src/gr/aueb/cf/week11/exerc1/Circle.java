package gr.aueb.cf.week11.exerc1;

public class Circle extends AbstractShape implements TwoDimensional{

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.sqrt(radius);
    }
}
