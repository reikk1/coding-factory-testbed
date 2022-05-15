package gr.aueb.cf.testbed.week8;

import java.util.Random;

public class PointXYZ {

    private int x;
    private int y;
    private int z;

    private PointXYZ() {}

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static PointXYZ getInstance() {
        return new PointXYZ();
    }

    public static PointXYZ probableZero() {
        Random r = new Random();
        return new PointXYZ(r.nextInt(201) - 100, r.nextInt(201) - 100, r.nextInt(201) - 100);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String convertToString() {
        return "(x = " + x + ", y = " + y + ", z = " + z + ")";
    }
}
