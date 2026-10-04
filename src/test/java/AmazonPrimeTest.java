import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AmazonPrimeTest {
    @Test
    void deveRetornarPrecoAmazonPrimePlanoBase() {
        FabricaAbstrataDeStreamings fabrica = StreamingsFactory.getInstance().obterFabrica("PlanoBase");
        Streaming streaming = fabrica.criaAmazonPrime();
        assertEquals(20, streaming.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoAmazonPrimePlanoPlus() {
        FabricaAbstrataDeStreamings fabrica = StreamingsFactory.getInstance().obterFabrica("PlanoPlus");
        Streaming streaming = fabrica.criaAmazonPrime();
        assertEquals(35, streaming.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoAmazonPrimePlanoPremium() {
        FabricaAbstrataDeStreamings fabrica = StreamingsFactory.getInstance().obterFabrica("PlanoPremium");
        Streaming streaming = fabrica.criaAmazonPrime();
        assertEquals(50, streaming.calcularPreco(), 0.01f);
    }
}
