import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class SapatilhaTest {

    @Test
    public void testDefaultConstructor() {
        Sapatilha s = new Sapatilha();
        Assertions.assertEquals(0, s.getTamanho());
        Assertions.assertFalse(s.isAtacadores());
        Assertions.assertEquals("", s.getCor());
        Assertions.assertEquals(0, s.getAnoColecao());
        Assertions.assertFalse(s.isPremium());
        Assertions.assertEquals(0.0, s.getDesconto());
    }

    @Test
    public void testParameterizedConstructor() {
        Sapatilha s = new Sapatilha("Sapatilha Desportiva", "Nike", 120.0, false, 3, 5, 2233445566L, 6655443322L, 38,
                true, "Azul", 2021, false, 5.0);
        Assertions.assertEquals("Sapatilha Desportiva", s.getDescricao());
        Assertions.assertEquals("Nike", s.getMarca());
        Assertions.assertEquals(120.0, s.getPreco_base());
        assertFalse(s.getNovo());
        Assertions.assertEquals(3, s.getEstado_uso());
        Assertions.assertEquals(5, s.getN_utilizadores());
        assertEquals(2233445566L, s.getIdTransportadora());
        assertEquals(6655443322L, s.getIdVendedor());
        Assertions.assertEquals(38, s.getTamanho());
        Assertions.assertTrue(s.isAtacadores());
        Assertions.assertEquals("Azul", s.getCor());
        Assertions.assertEquals(2021, s.getAnoColecao());
        Assertions.assertFalse(s.isPremium());
        Assertions.assertEquals(5.0, s.getDesconto());
    }
    /*
    @Test
    public void testCopyConstructor() {
        Sapatilha original = new Sapatilha("Sapatilha Casual", "Adidas", 95.0, true, 2, 7, 1122334455L, 5544332211L, 40,
                false, "Vermelho", 2022, true, 8.0);
        Sapatilha copy = new Sapatilha(original);
        Assertions.assertEquals(original, copy);
    }*/

    @Test
    public void testSetTamanho() {
        Sapatilha s = new Sapatilha();
        s.setTamanho(44);
        Assertions.assertEquals(44, s.getTamanho());
    }

    @Test
    public void testSetAtacadores() {
        Sapatilha s = new Sapatilha();
        s.setAtacadores(true);
        Assertions.assertTrue(s.isAtacadores());
    }

    @Test
    public void testSetCor() {
        Sapatilha s = new Sapatilha();
        s.setCor("Verde");
        Assertions.assertEquals("Verde", s.getCor());
    }

    @Test
    public void testSetAnoColecao() {
        Sapatilha s = new Sapatilha();
        s.setAnoColecao(2020);
        Assertions.assertEquals(2020, s.getAnoColecao());
    }

    @Test
    public void testSetPremium() {
        Sapatilha s = new Sapatilha();
        s.setPremium(true);
        Assertions.assertTrue(s.isPremium());
    }

    @Test
    public void testSetDesconto() {
        Sapatilha s = new Sapatilha();
        s.setDesconto(15.0);
        Assertions.assertEquals(15.0, s.getDesconto());
    }
    /*
    @Test
    public void testToString() {
        Sapatilha s = new Sapatilha("Sapatilha de Corrida", "Puma", 150.0, false, 1, 3, 9988776655L, 5566778899L, 41,
                true, "Preto", 2019, false, 10.0);
        String expected = "Sapatilhas:: {Descricao: Sapatilha de Corrida Marca: Puma Preco Base: 150.0 Uso: false Estado de Uso: 1 N Utilizadores: 3 Transportadora: 9988776655 Vendedor: 5566778899 Tamanho: 41 Atacadores: true Cor: Preto Data da Coleção: 2019 Premium: false Desconto: 10.0}";
        Assertions.assertEquals(expected, s.toString());
    }

    @Test
    public void testEquals() {
        Sapatilha s1 = new Sapatilha("Sapatilha de Caminhada", "Reebok", 80.0, true, 4, 6, 6677889900L, 9900887766L, 39,
                false, "Branco", 2021, true, 15.0);
        Sapatilha s2 = new Sapatilha("Sapatilha de Caminhada", "Reebok", 80.0, true, 4, 6, 6677889900L, 9900887766L, 39,
                false, "Branco", 2021, true, 15.0);
        Assertions.assertEquals(s1, s2);
    }

    @Test
    public void testClone() {
        Sapatilha original = new Sapatilha("Sapatilha Formal", "Gucci", 250.0, false, 1, 1, 1111222233L, 3333222211L,
                42, true, "Cinza", 2018, false, 5.0);
        Sapatilha clone = original.clone();
        Assertions.assertEquals(original, clone);
        assertNotSame(original, clone);
    }*/

    @Test
    public void testPrecoAtualPremium() {
        Sapatilha s = new Sapatilha("Sapatilha Luxo", "Louis Vuitton", 300.0, true, 2, 5, 4444555566L, 6655444433L, 43,
                true, "Dourado", 2019, true, 20.0);
        LocalDate dataAtual = LocalDate.of(2024, 1, 1);
        double expectedPreco = 300.0 + (300.0 * 5 / 10); // 5 anos de valorização a 10% a cada ano
        Assertions.assertEquals(expectedPreco, s.preco_atual(dataAtual), 0.01);
    }

    @Test
    public void testPrecoAtualNaoPremium() {
        Sapatilha s = new Sapatilha("Sapatilha Básica", "New Balance", 50.0, false, 3, 8, 2233445566L, 6677889900L, 37,
                true, "Amarelo", 2020, false, 10.0);
        s.setData_venda(LocalDate.of(2023, 1, 1));
        LocalDate dataAtual = LocalDate.of(2024, 1, 1);
        double priceExpected = 50.0 - (50.0 * 8 / (10 * 3)); // Fórmula: preco -= preco * n_utilizadores / (10 *
                                                             // estado_uso)
        priceExpected *= (100 - 10.0) / 100; // Aplicando o desconto
        Assertions.assertEquals(priceExpected, s.preco_atual(dataAtual), 0.01);
    }

    @Test
    public void testPrecoAtualNovoDesconto() {
        Sapatilha s = new Sapatilha("Sapatilha Inovadora", "Balenciaga", 500.0, true, 1, 1, 123456789L, 987654321L, 46,
                false, "Prata", 2023, false, 25.0);
        LocalDate dataAtual = LocalDate.of(2024, 1, 1);
        double priceExpected = 500.0 * (100 - 25.0) / 100; // Aplicando o desconto de 25%
        Assertions.assertEquals(priceExpected, s.preco_atual(dataAtual), 0.01);
    }
}
