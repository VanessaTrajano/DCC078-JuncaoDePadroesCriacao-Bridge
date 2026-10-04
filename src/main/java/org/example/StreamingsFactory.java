package org.example;

public class StreamingsFactory {
    private StreamingsFactory() {};
    private static StreamingsFactory instance = new StreamingsFactory();
    public static StreamingsFactory getInstance() {
        return instance;
    }
    public FabricaAbstrataDeStreamings obterFabrica(String fabrica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Fabrica" + fabrica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrataDeStreamings)) {
            throw new IllegalArgumentException("Fábrica inválida");
        }
        return (FabricaAbstrataDeStreamings) objeto;
    }
}
