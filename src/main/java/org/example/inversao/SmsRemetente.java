package org.example.inversao;

public class SmsRemetente implements Remetente{
    public void enviarMensagem(String message) {
        System.out.println("Enviando mensagem por SMS: " + message);
    }
}
