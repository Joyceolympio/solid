package org.example.inversao;

public class EmailRemetente implements Remetente{
    public void enviarMensagem(String message) {
        System.out.println("Enviando mensagem por e-mail: " + message);
    }
}
