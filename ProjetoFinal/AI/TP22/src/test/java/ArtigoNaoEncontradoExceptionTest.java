import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtigoNaoEncontradoExceptionTest {

    @Test
    void testExceptionMessage() {
        String mensagem = "Artigo não encontrado";
        ArtigoNaoEncontradoException exception = new ArtigoNaoEncontradoException(mensagem);
        assertEquals(mensagem, exception.getMessage());
    }

    @Test
    void testExceptionInheritance() {
        ArtigoNaoEncontradoException exception = new ArtigoNaoEncontradoException("Test message");
        assertTrue(exception instanceof Exception);
    }
}
