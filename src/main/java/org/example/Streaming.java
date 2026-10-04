package org.example;

public abstract class Streaming {
    protected Plano plano;

    protected float precoBase;

    public Streaming(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
