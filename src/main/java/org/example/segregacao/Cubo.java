package org.example.segregacao;

public class Cubo implements Forma, FormaTresD{
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double calculateArea() {
        return 6 * lado * lado;
    }

    public double calculateVolume() {
        return lado * lado * lado;
    }
}
