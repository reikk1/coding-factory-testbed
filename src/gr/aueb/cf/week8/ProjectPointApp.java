package gr.aueb.cf.week8;

public class ProjectPointApp {

    public static void main(String[] args) {

        PointXYZ p1 = new PointXYZ(5, 3, 12);
        PointXYZ p2 = PointXYZ.getInstance();

        PointXYZ p3 = PointXYZ.probableZero();
        PointXYZ p4 = PointXYZ.probableZero();
        PointXYZ p5 = PointXYZ.probableZero();

        System.out.println(p1.convertToString());
        System.out.println(p2.convertToString());
        System.out.println(p3.convertToString());
        System.out.println(p4.convertToString());
        System.out.println(p5.convertToString());
    }
}
