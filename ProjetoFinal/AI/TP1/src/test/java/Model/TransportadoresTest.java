package Model;

import Model.Transportadoras;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransportadoresTest {

    @Test
    public void testDefaultConstructor() {
        Transportadoras transportadora = new Transportadoras();
        assertEquals("", transportadora.getNome());
        assertEquals(0.3, transportadora.getImposto());
        assertEquals(0.10, transportadora.getLucro());
        assertFalse(transportadora.isPremium());
        assertEquals(0.0, transportadora.getVolFaturacao());
        assertEquals(1, transportadora.getFormula());
    }

    @Test
    public void testParameterizedConstructor() {
        Transportadoras transportadora = new Transportadoras("Nome", 0.2, 0.15, true, 500.0);
        assertEquals("Nome", transportadora.getNome());
        assertEquals(0.2, transportadora.getImposto());
        assertEquals(0.15, transportadora.getLucro());
        assertTrue(transportadora.isPremium());
        assertEquals(500.0, transportadora.getVolFaturacao());
        assertEquals(1, transportadora.getFormula());
    }

    @Test
    public void testCopyConstructor() {
        Transportadoras transportadora1 = new Transportadoras("Nome", 0.2, 0.15, true, 500.0);
        Transportadoras transportadora2 = new Transportadoras(transportadora1);
        assertEquals(transportadora1, transportadora2);
    }

    @Test
    public void testGetSetNome() {
        Transportadoras transportadora = new Transportadoras();
        transportadora.setNome("Nome");
        assertEquals("Nome", transportadora.getNome());
    }

    @Test
    public void testGetSetImposto() {
        Transportadoras transportadora = new Transportadoras();
        transportadora.setImposto(0.25);
        assertEquals(0.25, transportadora.getImposto());
    }

    @Test
    public void testGetSetLucro() {
        Transportadoras transportadora = new Transportadoras();
        transportadora.setLucro(0.2);
        assertEquals(0.2, transportadora.getLucro());
    }

    @Test
    public void testIsSetPremium() {
        Transportadoras transportadora = new Transportadoras();
        transportadora.setPremium(true);
        assertTrue(transportadora.isPremium());
    }

    @Test
    public void testGetSetVolFaturacao() {
        Transportadoras transportadora = new Transportadoras();
        transportadora.setVolFaturacao(1000.0);
        assertEquals(1000.0, transportadora.getVolFaturacao());
    }

    @Test
    public void testAddVolFaturacao() {
        Transportadoras transportadora = new Transportadoras();
        transportadora.addVolFaturacao(500.0);
        assertEquals(500.0, transportadora.getVolFaturacao());
    }

    @Test
    public void testGetSetFormula() {
        Transportadoras transportadora = new Transportadoras();
        transportadora.setFormula(2);
        assertEquals(2, transportadora.getFormula());
    }

    @Test
    public void testToString() {
        Transportadoras transportadora = new Transportadoras("Nome", 0.2, 0.15, true, 500.0);
        String expected = "Nome: Nome\nImposto: 0.2\nLucro: 0.15\nPremium: true\n# Formula: 1\n";
        assertEquals(expected, transportadora.toString());
    }

    @Test
    public void testEquals() {
        Transportadoras transportadora1 = new Transportadoras("Nome", 0.2, 0.15, true, 500.0);
        Transportadoras transportadora2 = new Transportadoras("Nome", 0.2, 0.15, true, 500.0);
        Transportadoras transportadora3 = new Transportadoras("OutroNome", 0.2, 0.15, true, 500.0);

        assertEquals(transportadora1, transportadora2);
        assertNotEquals(transportadora1, transportadora3);
    }

    @Test
    public void testClone() {
        Transportadoras transportadora1 = new Transportadoras("Nome", 0.2, 0.15, true, 500.0);
        Transportadoras transportadora2 = transportadora1.clone();
        assertEquals(transportadora1, transportadora2);
        assertNotSame(transportadora1, transportadora2);
    }


    @Test
    public void testAltera() {
        Transportadoras transportadora = new Transportadoras();
        transportadora.altera(0.25, 0.35, 2);
        assertEquals(0.25, transportadora.getLucro());
        assertEquals(0.35, transportadora.getImposto());
        assertEquals(2, transportadora.getFormula());
    }
}
