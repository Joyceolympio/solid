package org.example.liskov;

public class Main {
    public static void main(String[] args) {
        Forma rectangle = new Forma();
        System.out.println("Retângulo:");
        System.out.println(rectangle);

        Forma square = new Quadrado();
        System.out.println("Quadrado:");
        System.out.println(square);
    }
}
