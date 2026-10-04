package org.example;

public class FabricaPlanoBase implements FabricaAbstrataDeStreamings {
    @Override
    public AmazonPrime criaAmazonPrime() {
        AmazonPrime streaming = new AmazonPrime(20);
        streaming.setPlano(new PlanoBase());
        return streaming;
    }

    @Override
    public Crunchyroll criaCrunchyroll() {
        Crunchyroll streaming = new Crunchyroll(10);
        streaming.setPlano(new PlanoBase());
        return streaming;
    }

    @Override
    public Netflix criaNetflix() {
        throw new IllegalArgumentException(
                "Netflix não tem plano base!"
        );
    }
}
