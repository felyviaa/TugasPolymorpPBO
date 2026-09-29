public class Cylinder extends Circle {
    private double height;

    // Constructor untuk menginisialisasi height, radius, dan color
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    // Mengembalikan nilai height
    public double getHeight() {
        return height;
    }

    // Mengubah nilai height
    public void setHeight(double t) {
        this.height = t;
    }

    // Menghitung volume silinder
    public double volume() {
        return area() * height;
    }

    // Menampilkan informasi silinder
    @Override
    public void printInfo() {
        System.out.println("Silinder warna " + color + ", volume = " + volume());
    }
}