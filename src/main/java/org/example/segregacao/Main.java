package org.example.segregacao;

public class Main {
    public static void main(String[] args) {
        Forma rectangle = new Retangulo(5, 10);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Área do retângulo: " + rectangleArea);

        FormaTresD cube = new Cubo(3);
        double cubeArea = cube.calculateVolume(); // area
        double cubeVolume = cube.calculateVolume();
        System.out.println("Área do cubo: " + cubeArea);
        System.out.println("Volume do cubo: " + cubeVolume);
    }
}
