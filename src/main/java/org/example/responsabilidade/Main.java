package org.example.responsabilidade;

public class Main {
    // Exemplo de uso
    public static void main(String[] args) {
        Calculadora calculator = new Calculadora();
        Usuario usuario = new Usuario(calculator);
        usuario.start();
    }
}
