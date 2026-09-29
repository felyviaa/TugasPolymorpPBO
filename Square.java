public class Square extends Shape {
    private double side;

    // Constructor untuk menginisialisasi side dan color
    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    // Menghitung luas persegi
    public double area() {
        return side * side;
    }

    // Menampilkan informasi persegi
    @Override
    public void printInfo() {
        System.out.println("Square colored " + color + ", area = " + area());
    }
}