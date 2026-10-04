import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StreamingsFactoryTest {
    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FabricaAbstrataDeStreamings fabrica = StreamingsFactory.getInstance().obterFabrica("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }
}
