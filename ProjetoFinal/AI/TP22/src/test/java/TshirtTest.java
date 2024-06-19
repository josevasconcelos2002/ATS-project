import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class TshirtTest {

    @Test
    public void testConstrutorPadrao() {
        Tshirt tshirt = new Tshirt();
        assertNull(tshirt.getTamanho());
        assertNull(tshirt.getPadrao());
    }

    @Test
    public void testConstrutorParametrizado() {
        Tshirt tshirt = new Tshirt("T-Shirt 1", "Marca A", 50.0, false, 1, 10, 123L, 456L, Tamanho.M, Padrao.riscas);
        Assertions.assertEquals("T-Shirt 1", tshirt.getDescricao());
        Assertions.assertEquals("Marca A", tshirt.getMarca());
        Assertions.assertEquals(50.0, tshirt.getPreco_base());
        Assertions.assertFalse(tshirt.getNovo());
        Assertions.assertEquals(1, tshirt.getEstado_uso());
        Assertions.assertEquals(10, tshirt.getN_utilizadores());
        assertEquals(123L, tshirt.getIdTransportadora());
        Assertions.assertEquals(456L, tshirt.getIdVendedor());
        Assertions.assertEquals(Tamanho.M, tshirt.getTamanho());
        Assertions.assertEquals(Padrao.riscas, tshirt.getPadrao());
    }
    /*
    @Test
    public void testConstrutorCopia() {
        Tshirt tshirt1 = new Tshirt("T-Shirt 1", "Marca A", 50.0, false, 1, 10, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt(tshirt1);
        Assertions.assertEquals(tshirt1, tshirt2);
    }*/

    @Test
    public void testSetTamanho() {
        Tshirt tshirt = new Tshirt();
        tshirt.setTamanho(Tamanho.L);
        Assertions.assertEquals(Tamanho.L, tshirt.getTamanho());
    }

    @Test
    public void testSetPadrao() {
        Tshirt tshirt = new Tshirt();
        tshirt.setPadrao(Padrao.palmeiras);
        Assertions.assertEquals(Padrao.palmeiras, tshirt.getPadrao());
    }
    /*
    @Test
    public void testToString() {
        Tshirt tshirt = new Tshirt("T-Shirt 1", "Marca A", 50.0, false, 1, 10, 123L, 456L, Tamanho.M, Padrao.riscas);
        String esperado = "T-shirt:: {Descricao: T-Shirt 1 Marca: Marca A Preco base: 50.0 Novo: false Estado de uso: 1 N utilizadores: 10 Transportadora: 123 Vendedor: 456 Tamanho: M Padrão: riscas}";
        Assertions.assertEquals(esperado, tshirt.toString());
    }

    @Test
    public void testEquals() {
        Tshirt tshirt1 = new Tshirt("T-Shirt 1", "Marca A", 50.0, false, 1, 10, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = new Tshirt("T-Shirt 1", "Marca A", 50.0, false, 1, 10, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt3 = new Tshirt("T-Shirt 2", "Marca B", 60.0, true, 2, 5, 789L, 123L, Tamanho.L,
                Padrao.liso);
        Assertions.assertEquals(tshirt1, tshirt2);
        Assertions.assertNotEquals(tshirt1, tshirt3);
    }

    @Test
    public void testClone() {
        Tshirt tshirt1 = new Tshirt("T-Shirt 1", "Marca A", 50.0, false, 1, 10, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt2 = tshirt1.clone();
        Assertions.assertEquals(tshirt1, tshirt2);
    }*/

    @Test
    public void testPrecoAtual() {
        Tshirt tshirt1 = new Tshirt("T-Shirt 1", "Marca A", 50.0, false, 1, 10, 123L, 456L, Tamanho.M, Padrao.liso);
        Tshirt tshirt2 = new Tshirt("T-Shirt 1", "Marca A", 50.0, true, 1, 10, 123L, 456L, Tamanho.M, Padrao.riscas);
        Tshirt tshirt3 = new Tshirt("T-Shirt 1", "Marca A", 50.0, false, 1, 10, 123L, 456L, Tamanho.M,
                Padrao.palmeiras);

        LocalDate dataAtual = LocalDate.now();

        Assertions.assertEquals(50.0, tshirt1.preco_atual(dataAtual));
        Assertions.assertEquals(50.0, tshirt2.preco_atual(dataAtual));
        Assertions.assertEquals(25.0, tshirt3.preco_atual(dataAtual));
    }
}
