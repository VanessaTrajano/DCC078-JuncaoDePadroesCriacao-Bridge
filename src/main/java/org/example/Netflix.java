package org.example;

public class Netflix extends Streaming{
    public Netflix(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + this.plano.aumentoPreco();
    }
}
