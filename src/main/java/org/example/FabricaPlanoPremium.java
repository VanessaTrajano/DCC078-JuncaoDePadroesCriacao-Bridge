package org.example;

public class FabricaPlanoPremium implements FabricaAbstrataDeStreamings {
    @Override
    public AmazonPrime criaAmazonPrime() {
        AmazonPrime streaming = new AmazonPrime(20);
        streaming.setPlano(new PlanoPremium());
        return streaming;
    }

    @Override
    public Crunchyroll criaCrunchyroll() {
        Crunchyroll streaming = new Crunchyroll(10);
        streaming.setPlano(new PlanoPremium());
        return streaming;
    }

    @Override
    public Netflix criaNetflix() {
        Netflix streaming = new Netflix(5);
        streaming.setPlano(new PlanoPremium());
        return streaming;
    }
}
