package gr.aueb.cf.week7;

/**
 * Driver Class for data type: Class Vehicle
 * @author reyke
 */

public class VehicleApp {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("4x4", 2010, 4500, true);
        Vehicle v3 = new Vehicle("Compact", 2009, 1000, false);

        v1.setType("Limousine");
        v1.setReleaseYear(2020);
        v1.setCubicCapacity(3000);
        v1.isLongVehicle(true);

        System.out.println("Vehicle 1 info:");
        System.out.printf("Type: %s, Release Year: %d, Cubic Capacity: %d, This vehicle is%s considered long", v1.getType(), v1.getReleaseYear(), v1.getCubicCapacity(),
                (v1.isLongVehicle() ? "" : " not"));
        System.out.println();

        System.out.println("Vehicle 2 info:");
        System.out.printf("Type: %s, Release Year: %d, Cubic Capacity: %d, This vehicle is%s considered long", v2.getType(), v2.getReleaseYear(), v2.getCubicCapacity(),
                (v2.isLongVehicle() ? "" : " not"));
        System.out.println();

        System.out.println("Vehicle 3 info:");
        System.out.printf("Type: %s, Release Year: %d, Cubic Capacity: %d, This vehicle is%s considered long", v3.getType(), v3.getReleaseYear(), v3.getCubicCapacity(),
                (v3.isLongVehicle() ? "" : " not"));
        System.out.println();

        System.out.printf("Total number of vehicles: %d", Vehicle.getCounter());
    }
}
