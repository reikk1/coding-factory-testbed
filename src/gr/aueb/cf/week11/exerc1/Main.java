package gr.aueb.cf.week11.exerc1;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5.5);

        TwoDimensional rectangle = new Rectangle(3, 8);

        AbstractShape line = new Line(4);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());

        circle.getId();


    }
}
