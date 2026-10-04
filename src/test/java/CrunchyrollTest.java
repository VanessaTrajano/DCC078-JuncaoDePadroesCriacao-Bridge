import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrunchyrollTest {
    @Test
    void deveRetornarPrecoCrunchyrollPlanoBase() {
        FabricaAbstrataDeStreamings fabrica = StreamingsFactory.getInstance().obterFabrica("PlanoBase");
        Streaming streaming = fabrica.criaCrunchyroll();
        assertEquals(10, streaming.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCrunchyrollPlanoPlus() {
        try{
            FabricaAbstrataDeStreamings fabrica = StreamingsFactory.getInstance().obterFabrica("PlanoPlus");
            Streaming streaming = fabrica.criaCrunchyroll();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Crunchyroll não tem plano plus!", e.getMessage());
        }
    }

    @Test
    void deveRetornarPrecoCrunchyrollPlanoPremium() {
        FabricaAbstrataDeStreamings fabrica = StreamingsFactory.getInstance().obterFabrica("PlanoPremium");
        Streaming streaming = fabrica.criaCrunchyroll();
        assertEquals(40, streaming.calcularPreco(), 0.01f);
    }
}
