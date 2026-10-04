package org.example;

public class FabricaPlanoPlus implements FabricaAbstrataDeStreamings {
    @Override
    public AmazonPrime criaAmazonPrime() {
        AmazonPrime streaming = new AmazonPrime(20);
        streaming.setPlano(new PlanoPlus());
        return streaming;
    }

    @Override
    public Crunchyroll criaCrunchyroll() {
        throw new IllegalArgumentException(
                "Crunchyroll não tem plano plus!"
        );
    }

    @Override
    public Netflix criaNetflix() {
        throw new IllegalArgumentException(
                "Netflix não tem plano plus!"
        );
    }
}
