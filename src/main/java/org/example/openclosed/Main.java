package org.example.openclosed;

public class Main {
    public static void main(String[] args) {
        // Criação das formas geométricas
        Forma[] formas = new Forma[2];
        formas[0] = new Retangulo(5, 10);
        formas[1] = new Circulo(7);

        // Criação do calculador de áreas
        Area calculator = new Area(formas);

        // Cálculo da soma das áreas
        double totalArea = calculator.sumAreas();
        System.out.println("A área total é: " + totalArea);
    }

}
