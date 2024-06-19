import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncomendaDevolucaoImpossivelExceptionTest {

    @Test
    void testExceptionMessage() {
        String mensagem = "Devolução da encomenda impossível";
        EncomendaDevolucaoImpossivelException exception = new EncomendaDevolucaoImpossivelException(mensagem);
        assertEquals(mensagem, exception.getMessage());
    }

    @Test
    void testExceptionInheritance() {
        EncomendaDevolucaoImpossivelException exception = new EncomendaDevolucaoImpossivelException("Test message");
        assertTrue(exception instanceof Exception);
    }
}
