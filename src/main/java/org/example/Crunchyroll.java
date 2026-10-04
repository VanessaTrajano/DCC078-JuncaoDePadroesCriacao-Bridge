package org.example;

public class Crunchyroll extends Streaming{
    public Crunchyroll(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + this.plano.aumentoPreco();
    }
}
