package ru.mirea.prak_3_1;

public class Loader {
    public static void main(String[] args) {
        Circle a = new Circle();
        a.setRadius(4.6);
        a.setX(2.9);
        a.setY(7.8);
        System.out.println("Радиус окружности: " + a.getRadius());
        System.out.println("Диаметр окружности: " + a.getDiameter());
        System.out.println("Координаты центра окружности: (" + a.getX() + "; " + a.getY() + ")");
        System.out.print("Площадь окружности: ");
        System.out.format("%.3f%n", a.calcS());

        Circle b = new Circle(4.5, 3.0, 2.6);
        System.out.println("\n" + "Радиус окружности: " + b.getRadius());
        System.out.println("Диаметр окружности: " + b.getDiameter());
        System.out.println("Координаты центра окружности: (" + b.getX() + "; " + b.getY() + ")");
        System.out.print("Площадь окружности: ");
        System.out.format("%.3f%n", b.calcS());
    }
}
