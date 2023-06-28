package org.example.inversao;

public class Main {
    public static void main(String[] args) {
        Remetente emailSender = new EmailRemetente();
        Remetente smsSender = new SmsRemetente();

        ServicoDeMensagem emailService = new ServicoDeMensagem(emailSender);
        emailService.enviarMensagem("Olá, isso é um e-mail!");

        ServicoDeMensagem smsService = new ServicoDeMensagem(smsSender);
        smsService.enviarMensagem("Olá, isso é uma mensagem de SMS!");
    }
}
