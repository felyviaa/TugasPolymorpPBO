public class Circle extends Shape {
    private double radius;
    public static final double PI = Math.PI;

    // Constructor untuk menginisialisasi radius dan color
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    // Mengembalikan nilai radius
    public double getRadius() {
        return radius;
    }

    // Mengubah nilai radius
    public void setRadius(double r) {
        this.radius = r;
    }

    // Menghitung luas lingkaran
    public double area() {
        return PI * radius * radius;
    }

    // Menampilkan informasi lingkaran
    @Override
    public void printInfo() {
        System.out.println("Circle " + color + ", area = " + area());
    }
}