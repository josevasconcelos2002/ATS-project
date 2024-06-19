import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CarrinhoVazioExceptionTest {

    @Test
    void testExceptionMessage() {
        String mensagem = "Carrinho está vazio";
        CarrinhoVazioException exception = new CarrinhoVazioException(mensagem);
        assertEquals(mensagem, exception.getMessage());
    }

    @Test
    void testExceptionInheritance() {
        CarrinhoVazioException exception = new CarrinhoVazioException("Test message");
        assertTrue(exception instanceof Exception);
    }
}
