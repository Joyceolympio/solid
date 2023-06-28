package org.example.openclosed;

public class Circulo extends Forma{
    private double radius;

    public Circulo(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
