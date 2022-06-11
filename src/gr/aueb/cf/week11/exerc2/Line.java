package gr.aueb.cf.week11.exerc2;

public class Line extends AbstractShape implements ILine {

    private double length;

    public Line() {}

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public long getId() {
        return 0;
    }
}
