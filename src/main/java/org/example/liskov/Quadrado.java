package org.example.liskov;

public class Quadrado extends Forma{
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
    public static void printArea(Forma forma) {
        forma.setWidth(5);
        forma.setHeight(10);
        int area = forma.calculateArea();
        System.out.println("A área é: " + area);
    }
}

