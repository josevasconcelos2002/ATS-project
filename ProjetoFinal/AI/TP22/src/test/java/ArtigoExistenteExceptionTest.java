import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtigoExistenteExceptionTest {

    @Test
    void testExceptionMessage() {
        String mensagem = "Artigo já existe";
        ArtigoExistenteException exception = new ArtigoExistenteException(mensagem);
        assertEquals(mensagem, exception.getMessage());
    }

    @Test
    void testExceptionInheritance() {
        ArtigoExistenteException exception = new ArtigoExistenteException("Test message");
        assertTrue(exception instanceof Exception);
    }
}
