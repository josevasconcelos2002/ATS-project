import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncomendaNaoEncontradaExceptionTest {

    @Test
    void testExceptionMessage() {
        String mensagem = "Encomenda não encontrada";
        EncomendaNaoEncontradaException exception = new EncomendaNaoEncontradaException(mensagem);
        assertEquals(mensagem, exception.getMessage());
    }

    @Test
    void testExceptionInheritance() {
        EncomendaNaoEncontradaException exception = new EncomendaNaoEncontradaException("Test message");
        assertTrue(exception instanceof Exception);
    }
}
