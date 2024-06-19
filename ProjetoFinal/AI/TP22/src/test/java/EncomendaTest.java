import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class EncomendaTest {
    /*
    @Test
    public void testDefaultConstructor() {
        Encomenda e = new Encomenda();
        Assertions.assertEquals(new HashSet<>(), e.getEncomenda());
        Assertions.assertEquals(1, e.getId()); // assuming this is the first test run
        Assertions.assertEquals(-1, e.getIdComprador());
        Assertions.assertEquals(Dimensao.Pequeno, e.getDimensao());
        Assertions.assertEquals(Estado.Pendente, e.getEstado());
        Assertions.assertEquals(LocalDate.now(), e.getData());
        assertNull(e.getDataEntrega());
    }

    @Test
    public void testParameterizedConstructor() {
        Set<String> artigos = new HashSet<>();
        artigos.add("A1");
        artigos.add("A2");
        Encomenda e = new Encomenda(artigos, 12345L, Dimensao.Medio, LocalDate.of(2024, 5, 20));
        Assertions.assertEquals(artigos, e.getEncomenda());
        Assertions.assertEquals(2, e.getId()); // assuming this is the second test run
        Assertions.assertEquals(12345L, e.getIdComprador());
        Assertions.assertEquals(Dimensao.Medio, e.getDimensao());
        Assertions.assertEquals(Estado.Pendente, e.getEstado());
        Assertions.assertEquals(LocalDate.of(2024, 5, 20), e.getData());
        assertNull(e.getDataEntrega());
    }

    @Test
    public void testCopyConstructor() {
        Set<String> artigos = new HashSet<>();
        artigos.add("A1");
        artigos.add("A2");
        Encomenda original = new Encomenda(artigos, 12345L, Dimensao.Medio, LocalDate.of(2024, 5, 20));
        Encomenda copy = new Encomenda(original);
        Assertions.assertEquals(original, copy);
    }*/

    @Test
    public void testSetEncomenda() {
        Encomenda e = new Encomenda();
        Set<String> artigos = new HashSet<>();
        artigos.add("A1");
        e.setEncomenda(artigos);
        Assertions.assertEquals(artigos, e.getEncomenda());
    }

    @Test
    public void testSetId() {
        Encomenda e = new Encomenda();
        e.setId(12345L);
        Assertions.assertEquals(12345L, e.getId());
    }

    @Test
    public void testSetIdComprador() {
        Encomenda e = new Encomenda();
        e.setIdComprador(12345L);
        Assertions.assertEquals(12345L, e.getIdComprador());
    }

    @Test
    public void testSetDimensao() {
        Encomenda e = new Encomenda();
        e.setDimensao(Dimensao.Medio);
        Assertions.assertEquals(Dimensao.Medio, e.getDimensao());
    }

    @Test
    public void testSetEstado() {
        Encomenda e = new Encomenda();
        e.setEstado(Estado.Pendente);
        Assertions.assertEquals(Estado.Pendente, e.getEstado());
    }

    @Test
    public void testSetData() {
        Encomenda e = new Encomenda();
        e.setData(LocalDate.of(2024, 5, 20));
        Assertions.assertEquals(LocalDate.of(2024, 5, 20), e.getData());
    }

    @Test
    public void testSetDataEntrega() {
        Encomenda e = new Encomenda();
        e.setDataEntrega(LocalDate.of(2024, 5, 20));
        Assertions.assertEquals(LocalDate.of(2024, 5, 20), e.getDataEntrega());
    }
    /*
    @Test
    public void testToString() {
        Set<String> artigos = new HashSet<>();
        artigos.add("A1");
        artigos.add("A2");
        Encomenda e = new Encomenda(artigos, 12345L, Dimensao.Medio, LocalDate.of(2024, 5, 20));
        String expected = "Encomenda:: { Artigos: [A1, A2] Código: 3 Dimensão: Medio Estado: Pendente Data de criação: 2024-05-20 Data de entrega: N/A}";
        Assertions.assertEquals(expected, e.toString());
    }

    @Test
    public void testEquals() {
        Set<String> artigos1 = new HashSet<>();
        artigos1.add("A1");
        artigos1.add("A2");
        Encomenda e1 = new Encomenda(artigos1, 12345L, Dimensao.Medio, LocalDate.of(2024, 5, 20));

        Set<String> artigos2 = new HashSet<>();
        artigos2.add("A1");
        artigos2.add("A2");
        Encomenda e2 = new Encomenda(artigos2, 12345L, Dimensao.Medio, LocalDate.of(2024, 5, 20));

        Assertions.assertEquals(e1, e2);
    }

    @Test
    public void testClone() {
        Set<String> artigos = new HashSet<>();
        artigos.add("A1");
        artigos.add("A2");
        Encomenda original = new Encomenda(artigos, 12345L, Dimensao.Medio, LocalDate.of(2024, 5, 20));
        Encomenda clone = original.clone();
        Assertions.assertEquals(original, clone);
        assertNotSame(original, clone);
    }*/

    @Test
    public void testAdicionaArtigo() throws ArtigoExistenteException {
        Encomenda e = new Encomenda();
        String artigoId = "A1";
        Assertions.assertEquals(artigoId, e.adicionaArtigo(artigoId));
        Assertions.assertTrue(e.getEncomenda().contains(artigoId));

        Exception exception = assertThrows(ArtigoExistenteException.class, () -> {
            e.adicionaArtigo(artigoId);
        });

        String expectedMessage = "O artigo A1 já existe na encomenda";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testRemoveArtigo() throws ArtigoNaoEncontradoException, ArtigoExistenteException {
        Encomenda e = new Encomenda();
        String artigoId = "A1";
        e.adicionaArtigo(artigoId);
        Assertions.assertEquals(artigoId, e.removeArtigo(artigoId));
        Assertions.assertFalse(e.getEncomenda().contains(artigoId));

        Exception exception = assertThrows(ArtigoNaoEncontradoException.class, () -> {
            e.removeArtigo(artigoId);
        });

        String expectedMessage = "O artigo A1 não existe na encomenda";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testRemoveTudo() throws ArtigoExistenteException {
        Encomenda e = new Encomenda();

        e.adicionaArtigo("A1");
        e.adicionaArtigo("A2");

        Set<String> removed = e.removeTudo();

        assertTrue(removed.contains("A1"));
        assertTrue(removed.contains("A2"));
        Assertions.assertTrue(e.getEncomenda().isEmpty());
    }

    @Test
    public void testPodeDevolver() {
        Encomenda e = new Encomenda();
        e.setEstado(Estado.Expedida);
        e.setDataEntrega(LocalDate.now().minusDays(1));
        Assertions.assertTrue(e.podeDevolver(LocalDate.now()));

        e.setDataEntrega(LocalDate.now().minusDays(3));
        Assertions.assertFalse(e.podeDevolver(LocalDate.now()));
    }
    /*
    @Test
    public void testDefineTamanho() throws ArtigoExistenteException {
        Encomenda e = new Encomenda();
        e.adicionaArtigo("A1");
        Assertions.assertEquals(Dimensao.Pequeno, e.getDimensao());

        e.adicionaArtigo("A2");
        Assertions.assertEquals(Dimensao.Medio, e.getDimensao());

        e.adicionaArtigo("A3");
        e.adicionaArtigo("A4");
        e.adicionaArtigo("A5");
        Assertions.assertEquals(Dimensao.Medio, e.getDimensao());

        e.adicionaArtigo("A6");
        Assertions.assertEquals(Dimensao.Grande, e.getDimensao());
    }*/

    @Test
    public void testNumeroArtigos() throws ArtigoExistenteException, ArtigoNaoEncontradoException {
        Encomenda e = new Encomenda();
        e.adicionaArtigo("A1");
        e.adicionaArtigo("A2");
        Assertions.assertEquals(2, e.numeroArtigos());

        e.removeArtigo("A1");
        Assertions.assertEquals(1, e.numeroArtigos());
    }
}
