import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TransportadoraTest {

    private Transportadora transportadora;

    @BeforeEach
    public void setUp() {
        transportadora = new Transportadora("Transportadora A", 10, 20, 30, 0.1, 0.2, true, 1);
    }

    @Test
    public void testConstrutorVazio() {
        Transportadora t = new Transportadora();
        Assertions.assertEquals("Transportadora Invalida", t.getNome());
        Assertions.assertEquals(0, t.getValor_pequenas());
        Assertions.assertEquals(0, t.getValor_medio());
        Assertions.assertEquals(0, t.getValor_grande());
        Assertions.assertEquals(0, t.getImpostos());
        Assertions.assertEquals(0, t.getMargemlucro());
        Assertions.assertEquals(0, t.getTotalLucro());
        Assertions.assertFalse(t.isPremium());
        Assertions.assertEquals(0, t.getFormula());
    }

    @Test
    public void testConstrutorParametrizado() {
        Assertions.assertEquals("Transportadora A", transportadora.getNome());
        Assertions.assertEquals(10, transportadora.getValor_pequenas());
        Assertions.assertEquals(20, transportadora.getValor_medio());
        Assertions.assertEquals(30, transportadora.getValor_grande());
        Assertions.assertEquals(0.1, transportadora.getImpostos());
        Assertions.assertEquals(0.2, transportadora.getMargemlucro());
        Assertions.assertEquals(0, transportadora.getTotalLucro());
        Assertions.assertTrue(transportadora.isPremium());
        Assertions.assertEquals(1, transportadora.getFormula());
    }

    @Test
    public void testConstrutorCopia() {
        Transportadora copia = new Transportadora(transportadora);
        Assertions.assertEquals(transportadora, copia);
    }

    @Test
    public void testSetNome() {
        transportadora.setNome("Transportadora B");
        Assertions.assertEquals("Transportadora B", transportadora.getNome());
    }

    @Test
    public void testSetValorPequenas() {
        transportadora.setValor_pequenas(15);
        Assertions.assertEquals(15, transportadora.getValor_pequenas());
    }

    @Test
    public void testSetValorMedio() {
        transportadora.setValor_medio(25);
        Assertions.assertEquals(25, transportadora.getValor_medio());
    }

    @Test
    public void testSetValorGrande() {
        transportadora.setValor_grande(35);
        Assertions.assertEquals(35, transportadora.getValor_grande());
    }

    @Test
    public void testSetMargemLucro() {
        transportadora.setMargemlucro(0.5);
        Assertions.assertEquals(0.5, transportadora.getMargemlucro());
    }

    @Test
    public void testSetTotalLucro() {
        transportadora.setTotalLucro(100);
        Assertions.assertEquals(100, transportadora.getTotalLucro());
    }

    @Test
    public void testSetImpostos() {
        transportadora.setImpostos(0.25);
        Assertions.assertEquals(0.25, transportadora.getImpostos());
    }

    @Test
    public void testSetId() {
        transportadora.setId(5);
        Assertions.assertEquals(5, transportadora.getId());
    }

    @Test
    public void testSetPremium() {
        transportadora.setPremium(true);
        Assertions.assertTrue(transportadora.isPremium());
    }

    @Test
    public void testSetFormula() {
        transportadora.setFormula(3);
        Assertions.assertEquals(3, transportadora.getFormula());
    }
    /*
    @Test
    public void testPrecoTransportadora1() {
        double preco = transportadora.preco_transportadora1(1);
        assertEquals(2.16, preco, 0.01);
    }

    @Test
    public void testPrecoTransportadora2() {
        double preco = transportadora.preco_transportadora2(1);
        assertEquals(2.1, preco, 0.01);
    }*/

    @Test
    public void testPrecoTransportadora3() {
        double preco = transportadora.preco_transportadora3(1);
        assertEquals(3.30, preco, 0.01);
    }

    @Test
    public void testToString() {
        String expected = "Transportadora:: { Id: " + transportadora.getId() +
                " Nome: Transportadora A Valor da encomenda pequena: 10.0 Valor da encomenda média: 20.0 Valor da encomenda grande: 30.0 Imposto: 0.1 Margem de lucro: 0.2 É premium: true Formula atual: 1 Total lucro: 0.0}";
        Assertions.assertEquals(expected, transportadora.toString());
    }

    @Test
    public void testClone() {
        Transportadora clone = transportadora.clone();
        Assertions.assertEquals(transportadora, clone);
    }
}
