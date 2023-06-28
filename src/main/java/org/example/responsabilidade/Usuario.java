package org.example.responsabilidade;

// Classe responsável por interagir com o usuário
public class Usuario {

    private Calculadora calculator;

    public Usuario(Calculadora calculator) {
        this.calculator = calculator;
    }

    public void start() {
        System.out.println("Bem-vindo à calculadora!");

        int a = 10;
        int b = 5;

        int sum = calculator.add(a, b);
        System.out.println("A soma de " + a + " e " + b + " é: " + sum);

        int difference = calculator.subtract(a, b);
        System.out.println("A diferença entre " + a + " e " + b + " é: " + difference);

        // Outras interações com o usuário e chamadas de métodos da calculadora podem ser adicionadas aqui
    }

}
