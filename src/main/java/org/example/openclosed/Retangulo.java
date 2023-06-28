package org.example.openclosed;

public class Retangulo extends Forma{

    private double width;
    private double height;

    public Retangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

