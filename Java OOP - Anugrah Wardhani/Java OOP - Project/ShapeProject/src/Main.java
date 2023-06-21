import childs.Circle;
import childs.Triangle;
import parents.Shape;

public class Main {
    public static void main(String[] args) {
        Shape lingkaran = new Circle(20, "Biru");
        Shape segitiga = new Triangle(10, 15, "Merah");

        System.out.println("Luas lingkaran warna " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
        System.out.println("Luas segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());
    }
}