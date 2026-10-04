package org.example;

public class AmazonPrime extends Streaming{
    public AmazonPrime(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + this.plano.aumentoPreco();
    }
}
