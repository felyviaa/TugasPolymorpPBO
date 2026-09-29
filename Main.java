public class Main {
    public static void main(String[] args) {

        // Object Shape
        Shape shape = new Shape("Yellow");
        System.out.println("Color: " + shape.getColor());
        shape.setColor("Orange");
        System.out.println("Color setelah diubah: " + shape.getColor());
        shape.printInfo();

        System.out.println();

        // Object Circle
        Circle circle = new Circle(7, "Red");
        System.out.println("Radius: " + circle.getRadius());
        circle.setRadius(10);
        System.out.println("Radius setelah diubah: " + circle.getRadius());
        circle.printInfo();

        System.out.println();

        // Object Cylinder
        Cylinder cylinder = new Cylinder(10, 7, "Blue");
        System.out.println("Height: " + cylinder.getHeight());
        cylinder.setHeight(15);
        System.out.println("Height setelah diubah: " + cylinder.getHeight());
        cylinder.printInfo();

        System.out.println();

        // Object Square
        Square square = new Square(5, "Green");
        square.printInfo();
    }
}