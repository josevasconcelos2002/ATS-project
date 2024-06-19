import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportadoraNaoEncontradaExceptionTest {

    @Test
    void testExceptionMessage() {
        String mensagem = "Transportadora não encontrada";
        TransportadoraNaoEncontradaException exception = new TransportadoraNaoEncontradaException(mensagem);
        assertEquals(mensagem, exception.getMessage());
    }

    @Test
    void testExceptionInheritance() {
        TransportadoraNaoEncontradaException exception = new TransportadoraNaoEncontradaException("Test message");
        assertTrue(exception instanceof Exception);
    }
}
