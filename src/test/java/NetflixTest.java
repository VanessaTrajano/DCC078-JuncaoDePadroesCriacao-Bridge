import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NetflixTest {
    @Test
    void deveRetornarPrecoNetflixPlanoBase() {
        try{
            FabricaAbstrataDeStreamings fabrica = StreamingsFactory.getInstance().obterFabrica("PlanoBase");
            Streaming streaming = fabrica.criaNetflix();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Netflix não tem plano base!", e.getMessage());
        }
    }

    @Test
    void deveRetornarPrecoNetflixPlanoPlus() {
        try{
            FabricaAbstrataDeStreamings fabrica = StreamingsFactory.getInstance().obterFabrica("PlanoPlus");
            Streaming streaming = fabrica.criaNetflix();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Netflix não tem plano plus!", e.getMessage());
        }
    }

    @Test
    void deveRetornarPrecoNetflixPlanoPremium() {
        FabricaAbstrataDeStreamings fabrica = StreamingsFactory.getInstance().obterFabrica("PlanoPremium");
        Streaming streaming = fabrica.criaNetflix();
        assertEquals(35, streaming.calcularPreco(), 0.01f);
    }
}
