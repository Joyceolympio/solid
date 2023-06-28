package org.example.inversao;

public class ServicoDeMensagem {
    private Remetente remetente;

    public ServicoDeMensagem(Remetente remetente) {
        this.remetente = remetente;
    }

    public void enviarMensagem(String message) {
        remetente.enviarMensagem(message);
    }
}
