import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;


public class MalaTest {

    @Test
    public void testDefaultConstructor() {
        Mala m = new Mala();
        Assertions.assertEquals(0, m.getDimensao());
        Assertions.assertEquals("", m.getMaterial());
        Assertions.assertEquals(0, m.getAno_colecao());
        Assertions.assertFalse(m.isPremium());
        Assertions.assertEquals(0.0f, m.getValorizacao());
    }

    @Test
    public void testParameterizedConstructor() {
        Mala m = new Mala("Descrição", "Marca", 100.0, true, 5, 10, 123456789L, 987654321L, 30, "Couro", 2020, true,
                5.0f);
        Assertions.assertEquals("Descrição", m.getDescricao());
        Assertions.assertEquals("Marca", m.getMarca());
        Assertions.assertEquals(100.0, m.getPreco_base());
        Assertions.assertTrue(m.getNovo());
        Assertions.assertEquals(5, m.getEstado_uso());
        Assertions.assertEquals(10, m.getN_utilizadores());
        Assertions.assertEquals(123456789L, m.getIdTransportadora());
        Assertions.assertEquals(987654321L, m.getIdVendedor());
        Assertions.assertEquals(30, m.getDimensao());
        Assertions.assertEquals("Couro", m.getMaterial());
        Assertions.assertEquals(2020, m.getAno_colecao());
        Assertions.assertTrue(m.isPremium());
        Assertions.assertEquals(5.0f, m.getValorizacao());
    }
    /*
    @Test
    public void testCopyConstructor() {
        Mala original = new Mala("Descrição", "Marca", 100.0, true, 5, 10, 123456789L, 987654321L, 30, "Couro", 2020,
                true, 5.0f);
        Mala copy = new Mala(original);
        Assertions.assertEquals(original, copy);
    }*/

    @Test
    public void testSetDimensao() {
        Mala m = new Mala();
        m.setDimensao(40);
        Assertions.assertEquals(40, m.getDimensao());
    }

    @Test
    public void testSetMaterial() {
        Mala m = new Mala();
        m.setMaterial("Material");
        Assertions.assertEquals("Material", m.getMaterial());
    }
    /*
    @Test
    public void testSetAnoColecao() {
        Mala m = new Mala();
        m.setAno_colecao(2021);
        Assertions.assertEquals(2024, m.getAno_colecao());
    }*/

    @Test
    public void testSetPremium() {
        Mala m = new Mala();
        m.setPremium(true);
        Assertions.assertTrue(m.isPremium());
    }

    @Test
    public void testSetValorizacao() {
        Mala m = new Mala();
        m.setValorizacao(10.0f);
        Assertions.assertEquals(10.0f, m.getValorizacao());
    }
    /*
    @Test
    public void testToString() {
        Mala m = new Mala("Descrição", "Marca", 100.0, true, 5, 10, 123456789L, 987654321L, 30, "Couro", 2020, true,
                5.0f);
        String expected = "Mala:: {Descricao: Descrição Marca: Marca Preco Base: 100.0 Uso: true Estado de Uso: 5 N Utilizadores: 10 Transportadora: 123456789 Vendedor: 987654321 Dimensão: 30 Material: Couro Ano da Coleção: 2020 Premium: true Valorização: 5.0}";
        Assertions.assertEquals(expected, m.toString());
    }

    @Test
    public void testEquals() {
        Mala m1 = new Mala("Descrição", "Marca", 100.0, true, 5, 10, 123456789L, 987654321L, 30, "Couro", 2020, true,
                5.0f);
        Mala m2 = new Mala("Descrição", "Marca", 100.0, true, 5, 10, 123456789L, 987654321L, 30, "Couro", 2020, true,
                5.0f);
        Assertions.assertEquals(m1, m2);
    }

    @Test
    public void testClone() {
        Mala original = new Mala("Descrição", "Marca", 100.0, true, 5, 10, 123456789L, 987654321L, 30, "Couro", 2020,
                true, 5.0f);
        Mala clone = original.clone();
        Assertions.assertEquals(original, clone);
        assertNotSame(original, clone);
    }*/

    @Test
    public void testPrecoAtualPremium() {
        Mala m = new Mala("Descrição", "Marca", 100.0, true, 5, 10, 123456789L, 987654321L, 30, "Couro", 2020, true,
                5.0f);
        LocalDate dataAtual = LocalDate.of(2024, 1, 1);
        double priceExpected = 100.0 * Math.pow(1.05, 4); // 4 anos de valorização a 5% ao ano
        Assertions.assertEquals(priceExpected, m.preco_atual(dataAtual), 0.01);
    }

    @Test
    public void testPrecoAtualNaoPremium() {
        Mala m = new Mala("Descrição", "Marca", 100.0, false, 5, 10, 123456789L, 987654321L, 30, "Couro", 2020, false,
                0.0f);
        m.setData_venda(LocalDate.of(2022, 1, 1));
        LocalDate dataAtual = LocalDate.of(2024, 1, 1);
        double priceExpected = 100.0 - (100.0 * 10 / (30 * 5)); // Fórmula: preco -= preco * n_utilizadores / (dimensao
                                                                // * estado_uso)
        Assertions.assertEquals(priceExpected, m.preco_atual(dataAtual), 0.01);
    }
}
