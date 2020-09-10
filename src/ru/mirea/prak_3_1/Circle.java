package ru.mirea.prak_3_1;

public class Circle {
    private double x;
    private double y;
    private double radius;
    private double S;

    public Circle(){
        x = 1;
        y = 1;
        radius = 1;
        S = 1;
    }

    public Circle(double x , double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setS(double s) {
        this.S = S;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getS(){
        return S;
    }

    public double getRadius(){
        return radius;
    }

    public double getDiameter(){
        return radius*2;
    }

    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
    public double calcS(){
        return (Math.PI * radius * radius);
    }
}
