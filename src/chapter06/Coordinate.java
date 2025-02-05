package chapter06;

public class Coordinate {
    private double x; // Longitude 경도

    private double y; // Latitude 위도

    public Coordinate() {}

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(Coordinate c) {
        this.x = c.x;
        this.y = c.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equalTo(Coordinate c) {
        return this.x == c.x && this.y == c.y;
    }
}
