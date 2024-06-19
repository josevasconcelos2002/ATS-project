import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncomendaExistenteExceptionTest {

    @Test
    void testExceptionMessage() {
        String mensagem = "Encomenda já existe";
        EncomendaExistenteException exception = new EncomendaExistenteException(mensagem);
        assertEquals(mensagem, exception.getMessage());
    }

    @Test
    void testExceptionInheritance() {
        EncomendaExistenteException exception = new EncomendaExistenteException("Test message");
        assertTrue(exception instanceof Exception);
    }
}
