import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class FaturaTest {

    private Fatura fatura;

    @BeforeEach
    public void setUp() {
        Set<String> artigos = new HashSet<>();
        artigos.add("Artigo1");
        artigos.add("Artigo2");
        fatura = new Fatura(true, 12345, 678910, artigos, 100.0, 10.0, 110.0);
    }

    @Test
    public void testConstrutorVazio() {
        Fatura f = new Fatura();
        Assertions.assertEquals(0, f.getIdEncomenda());
        Assertions.assertEquals(0, f.getNifComprador());
        Assertions.assertTrue(f.getArtigos().isEmpty());
        Assertions.assertEquals(0, f.getCustoProdutos());
        Assertions.assertEquals(0, f.getAlteracaoPreco());
        Assertions.assertEquals(0, f.getPrecoFinal());
        Assertions.assertFalse(f.isCompra());
    }

    @Test
    public void testConstrutorParametrizado() {
        Assertions.assertTrue(fatura.isCompra());
        Assertions.assertEquals(12345, fatura.getIdEncomenda());
        Assertions.assertEquals(678910, fatura.getNifComprador());
        Assertions.assertEquals(2, fatura.getArtigos().size());
        Assertions.assertEquals(100.0, fatura.getCustoProdutos());
        Assertions.assertEquals(10.0, fatura.getAlteracaoPreco());
        Assertions.assertEquals(110.0, fatura.getPrecoFinal());
    }
    /*
    @Test
    public void testConstrutorCopia() {
        Fatura copia = new Fatura(fatura);
        Assertions.assertEquals(fatura, copia);
    }*/

    @Test
    public void testSetId() {
        fatura.setId(12345);
        Assertions.assertEquals(12345, fatura.getId());
    }

    @Test
    public void testSetIdEncomenda() {
        fatura.setIdEncomenda(54321);
        Assertions.assertEquals(54321, fatura.getIdEncomenda());
    }

    @Test
    public void testSetNifComprador() {
        fatura.setNifComprador(101112);
        Assertions.assertEquals(101112, fatura.getNifComprador());
    }

    @Test
    public void testSetArtigos() {
        Set<String> novosArtigos = new HashSet<>();
        novosArtigos.add("Artigo3");
        fatura.setArtigos(novosArtigos);
        Assertions.assertEquals(1, fatura.getArtigos().size());
        Assertions.assertEquals("Artigo3", fatura.getArtigos().toArray()[0]);
    }

    @Test
    public void testSetCustoProdutos() {
        fatura.setCustoProdutos(200.0);
        Assertions.assertEquals(200.0, fatura.getCustoProdutos());
    }

    @Test
    public void testSetAlteracaoPreco() {
        fatura.setAlteracaoPreco(20.0);
        Assertions.assertEquals(20.0, fatura.getAlteracaoPreco());
    }

    @Test
    public void testSetPrecoFinal() {
        fatura.setPrecoFinal(220.0);
        Assertions.assertEquals(220.0, fatura.getPrecoFinal());
    }

    @Test
    public void testSetCompra() {
        fatura.setCompra(true);
        Assertions.assertTrue(fatura.isCompra());
    }
    /*
    @Test
    public void testEquals() {
        Fatura f1 = new Fatura(true, 12345, 678910, new HashSet<>(Set.of("Artigo1", "Artigo2")), 100.0, 10.0, 110.0);
        Fatura f2 = new Fatura(f1);
        Assertions.assertTrue(f1.equals(f2));
        f2.setIdEncomenda(54321);
        Assertions.assertFalse(f1.equals(f2));
    }

    @Test
    public void testToString() {
        String expected = "Fatura " + fatura.getId() + " - Compra\n" +
                "NIF do comprador: 678910\n" +
                "Artigos vendidos: [Artigo1, Artigo2]\n" +
                "\n" +
                "Custo dos produtos: 100.00€\n" +
                "Custo do transporte: 10.00€\n" +
                "Preço final: 110.00€\n";
        Assertions.assertEquals(expected, fatura.toString());
    }

    @Test
    public void testClone() {
        Fatura clone = fatura.clone();
        Assertions.assertEquals(fatura, clone);
    }*/

    @Test
    public void testAtualizaFatura() {
        fatura.atualizaFatura("Artigo3", 50.0, 5.0, 55.0);
        Assertions.assertTrue(fatura.getArtigos().contains("Artigo3"));
        Assertions.assertEquals(150.0, fatura.getCustoProdutos());
        Assertions.assertEquals(15.0, fatura.getAlteracaoPreco());
        Assertions.assertEquals(165.0, fatura.getPrecoFinal());
    }
}
