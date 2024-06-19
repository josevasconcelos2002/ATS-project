import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gestor_TransportadorasTest {
    private Gestor_Transportadoras gestor;
    private Transportadora transportadora1;
    private Transportadora transportadora2;

    @BeforeEach
    public void setUp() {
        gestor = new Gestor_Transportadoras();
        transportadora1 = new Transportadora("Transportadora 1", 10.0, 20.0, 30.0, 0.1, 0.2, false, 1);
        transportadora2 = new Transportadora("Transportadora 2", 15.0, 25.0, 35.0, 0.2, 0.3, true, 2);
    }

    @Test
    public void testSetTransportadoras() {
        Map<Long, Transportadora> transportadoras = new HashMap<>();
        transportadoras.put(transportadora1.getId(), transportadora1);
        transportadoras.put(transportadora2.getId(), transportadora2);
        gestor.setTransportadoras(transportadoras);
        Assertions.assertEquals(transportadoras, gestor.getTransportadoras());
    }

    /*
    @Test
    public void testRemoveTransportadora() {
        Assertions.assertDoesNotThrow(() -> gestor.removeTransportadora(transportadora1.getId()));
        Assertions.assertFalse(gestor.existe_transpotadora(transportadora1.getId()));
    }*/

    @Test
    public void testRemoveTransportadoraInexistente() {
        assertThrows(TransportadoraNaoEncontradaException.class, () -> gestor.removeTransportadora(999L));
    }

    /*
    @Test
    public void testPrecoTransporte() {
        List<Long> ids = List.of(transportadora1.getId(), transportadora2.getId(), transportadora1.getId());

        // Assuming predefined formulas for calculating prices
        double expectedTotal = transportadora1.preco_transportadora1(2) + transportadora2.preco_transportadora2(1);
        Assertions.assertEquals(expectedTotal, gestor.precoTransporte(ids));
    }

    @Test
    public void testTransportadorasNormais() {
        String expectedOutput = transportadora1.toString() + "\n";
        Assertions.assertEquals(expectedOutput, gestor.transportadorasNormais());
    }

    @Test
    public void testTransportadorasPremium() {
        String expectedOutput = transportadora2.toString() + "\n";
        Assertions.assertEquals(expectedOutput, gestor.transportadorasPremium());
    }

    @Test
    public void testAlteraFormula() {
        long id = transportadora1.getId();
        gestor.alteraFormula(id, 3);
        Assertions.assertEquals(3, gestor.getTransportadoras().get(id).getFormula());
    }

    @Test
    public void testEquals() {
        Map<Long, Transportadora> transportadorasMap = new HashMap<>();
        transportadorasMap.put(transportadora1.getId(), transportadora1);
        Gestor_Transportadoras anotherGestor = new Gestor_Transportadoras(transportadorasMap);

        Assertions.assertTrue(gestor.equals(anotherGestor));
    }*/

    @Test
    public void testClone() {
        Gestor_Transportadoras clonedGestor = gestor.clone();

        Assertions.assertEquals(gestor, clonedGestor);
        assertNotSame(gestor, clonedGestor);
    }
}
