package gr.aueb.cf.week7;

/**
 * Java Bean
 * Chapter: 11. Classes-POJOs-JavaBeans
 * Mini Exercise
 * @author reyke
 */

public class Vehicle {

    private static int counter = 0;

    private String type;
    private int releaseYear;
    private int cubicCapacity;
    private boolean longVehicle;

    // Default constructor
    public Vehicle() {
        counter++;
    }

    //Overloaded constructor
    public Vehicle(String type, int releaseYear, int cubicCapacity, boolean longVehicle) {
        this.type = type;
        this.releaseYear = releaseYear;
        this.cubicCapacity = cubicCapacity;
        this.longVehicle = longVehicle;

        counter++;
    }

    //Static get counter
    public static int getCounter() {
        return counter;
    }

    //Object setters - Java beans
    public void setType(String type) {
        this.type = type;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public void isLongVehicle(boolean longVehicle) {
        this.longVehicle = longVehicle;
    }

    //Object getters - Java beans
    public String getType() {
        return this.type;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public boolean isLongVehicle() {
        return longVehicle;
    }
}
