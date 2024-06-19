import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class UtilizadorTest {

    private Utilizador user;

    @BeforeEach
    public void setUp() {
        Utilizador.setCodigo(1);
        user = new Utilizador("email@example.com", "Nome", "Morada", 123456789L, "password");
    }
    /*
    @Test
    public void testConstrutorPadrao() {
        Utilizador u = new Utilizador();
        Assertions.assertEquals(1, u.getId());
        Assertions.assertEquals("n/d", u.getEmail());
        Assertions.assertEquals("n/d", u.getNome());
        Assertions.assertEquals("n/d", u.getMorada());
        Assertions.assertEquals(-1, u.getNif());
        Assertions.assertEquals("n/d", u.getPassword());
        Assertions.assertEquals(0, u.getN_vendidos());
        Assertions.assertEquals(0, u.getN_comprados());
        Assertions.assertTrue(u.getProdutosVendidos().isEmpty());
        Assertions.assertTrue(u.getProdutosVender().isEmpty());
        Assertions.assertTrue(u.getPendentes().isEmpty());
        Assertions.assertTrue(u.getFaturasVendas().isEmpty());
        Assertions.assertTrue(u.getFaturasCompras().isEmpty());
        Assertions.assertTrue(u.getComprei().isEmpty());
        Assertions.assertTrue(u.getDevolvidos().isEmpty());
        assertNotNull(u.getCarrinho());
    }

    @Test
    public void testConstrutorParametrizado() {
        Assertions.assertEquals(2, user.getId());
        Assertions.assertEquals("email@example.com", user.getEmail());
        Assertions.assertEquals("Nome", user.getNome());
        Assertions.assertEquals("Morada", user.getMorada());
        Assertions.assertEquals(123456789L, user.getNif());
        Assertions.assertEquals("password", user.getPassword());
        Assertions.assertEquals(0, user.getN_vendidos());
        Assertions.assertEquals(0, user.getN_comprados());
        Assertions.assertTrue(user.getProdutosVendidos().isEmpty());
        Assertions.assertTrue(user.getProdutosVender().isEmpty());
        Assertions.assertTrue(user.getPendentes().isEmpty());
        Assertions.assertTrue(user.getFaturasVendas().isEmpty());
        Assertions.assertTrue(user.getFaturasCompras().isEmpty());
        Assertions.assertTrue(user.getComprei().isEmpty());
        Assertions.assertTrue(user.getDevolvidos().isEmpty());
        assertNotNull(user.getCarrinho());
    }

    @Test
    public void testConstrutorCopia() {
        Utilizador copia = new Utilizador(user);
        Assertions.assertEquals(user, copia);
    }*/

    @Test
    public void testSetId() {
        user.setId(2);
        Assertions.assertEquals(2, user.getId());
    }

    @Test
    public void testSetEmail() {
        user.setEmail("email2@example.com");
        Assertions.assertEquals("email2@example.com", user.getEmail());
    }

    @Test
    public void testSetNome() {
        user.setNome("Nome2");
        Assertions.assertEquals("Nome2", user.getNome());
    }

    @Test
    public void testSetMorada() {
        user.setMorada("Morada2");
        Assertions.assertEquals("Morada2", user.getMorada());
    }

    @Test
    public void testSetNif() {
        user.setNif(987654321L);
        Assertions.assertEquals(987654321L, user.getNif());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("password2");
        Assertions.assertEquals("password2", user.getPassword());
    }

    @Test
    public void testSetProdutosVendidos() {
        Set<String> produtosVendidos = new HashSet<>();
        produtosVendidos.add("artigo1");
        user.setProdutosVendidos(produtosVendidos);
        Assertions.assertEquals(produtosVendidos, user.getProdutosVendidos());
    }

    @Test
    public void testSetProdutosVender() {
        Set<String> produtosVender = new HashSet<>();
        produtosVender.add("artigo2");
        user.setProdutosVender(produtosVender);
        Assertions.assertEquals(produtosVender, user.getProdutosVender());
    }

    @Test
    public void testSetPendentes() {
        Set<String> pendentes = new HashSet<>();
        pendentes.add("artigo3");
        user.setPendentes(pendentes);
        Assertions.assertEquals(pendentes, user.getPendentes());
    }

    @Test
    public void testSetNComprados() {
        user.setN_comprados(1);
        Assertions.assertEquals(1, user.getN_comprados());
    }

    @Test
    public void testSetNVendidos() {
        user.setN_vendidos(1);
        Assertions.assertEquals(1, user.getN_vendidos());
    }

    @Test
    public void testSetComprei() {
        Set<Long> comprei = new HashSet<>();
        comprei.add(1L);
        user.setComprei(comprei);
        Assertions.assertEquals(comprei, user.getComprei());
    }

    @Test
    public void testSetDevolvidos() {
        Set<Long> devolvidos = new HashSet<>();
        devolvidos.add(1L);
        user.setDevolvidos(devolvidos);
        Assertions.assertEquals(devolvidos, user.getDevolvidos());
    }
    /*
    @Test
    public void testSetCarrinho() {
        Encomenda carrinho = new Encomenda();
        user.setCarrinho(carrinho);
        Assertions.assertEquals(carrinho, user.getCarrinho());
    }

    @Test
    public void testEquals() {
        String email = "email1@example.com";
        String nome = "Nome 1";
        String morada = "Morada1";
        String password = "password1";
        Utilizador u1 = new Utilizador(email, nome, morada, 123456789L, password);
        Utilizador u2 = new Utilizador(email, nome, morada, 123456789L, password);
        Utilizador u3 = new Utilizador("email2@example.com", "Nome2", "Morada2", 987654321L, "password2");

        Assertions.assertTrue(u1.equals(u2));
        Assertions.assertFalse(u1.equals(u3));
    }*/

    @Test
    public void testInsereNovoArtigo() {
        try {
            user.insereNovoArtigo("artigo1");
            Assertions.assertTrue(user.getProdutosVender().contains("artigo1"));
            assertThrows(ArtigoExistenteException.class, () -> {
                user.insereNovoArtigo("artigo1");
            });
        } catch (ArtigoExistenteException e) {
            fail("ArtigoExistenteException should not have been thrown.");
        }
    }

    @Test
    public void testEliminaArtigo() {
        try {
            user.insereNovoArtigo("artigo1");
            user.eliminaArtigo("artigo1");
            Assertions.assertFalse(user.getProdutosVender().contains("artigo1"));
            assertThrows(ArtigoNaoEncontradoException.class, () -> {
                user.eliminaArtigo("artigo1");
            });
        } catch (Exception e) {
            fail("No exception should have been thrown.");
        }
    }

    @Test
    public void testAVendaToPendente() {
        try {
            user.insereNovoArtigo("artigo1");
            user.aVendaToPendente("artigo1");
            Assertions.assertFalse(user.getProdutosVender().contains("artigo1"));
            Assertions.assertTrue(user.getPendentes().contains("artigo1"));
        } catch (Exception e) {
            fail("No exception should have been thrown.");
        }
    }

    @Test
    public void testPendenteToVendido() {
        try {
            user.insereNovoArtigo("artigo1");
            user.aVendaToPendente("artigo1");
            user.pendenteToVendido("artigo1");
            Assertions.assertFalse(user.getPendentes().contains("artigo1"));
            Assertions.assertTrue(user.getProdutosVendidos().contains("artigo1"));
        } catch (Exception e) {
            fail("No exception should have been thrown.");
        }
    }

    @Test
    public void testFinalizaEncomenda() {
        try {
            LocalDate data = LocalDate.now();
            user.adicionaArtigo("artigo1");
            Encomenda e = user.finalizaEncomenda(data);
            Assertions.assertTrue(user.verificaComprei(e.getId()));
        } catch (Exception e) {
            fail("No exception should have been thrown.");
        }
    }

    @Test
    public void testRemoveCarrinho() {
        try {
            user.adicionaArtigo("artigo1");
            Set<String> artigos = user.removeCarrinho();
            assertTrue(artigos.contains("artigo1"));
            Assertions.assertTrue(user.artigosCarrinho().isEmpty());
        } catch (Exception e) {
            fail("No exception should have been thrown.");
        }
    }

    @Test
    public void testAdicionaArtigoCarrinho() {
        try {
            String artigoId = user.adicionaArtigo("artigo1");
            assertEquals("artigo1", artigoId);
            Assertions.assertTrue(user.artigosCarrinho().contains("artigo1"));
        } catch (ArtigoExistenteException e) {
            fail("ArtigoExistenteException should not have been thrown.");
        }
    }

    @Test
    public void testCompreiToDevolvido() {
        try {
            LocalDate data = LocalDate.now();
            user.adicionaArtigo("artigo1");
            Encomenda e = user.finalizaEncomenda(data);
            long idEncomenda = user.compreiToDevolvido(e.getId());
            Assertions.assertTrue(user.getDevolvidos().contains(idEncomenda));
        } catch (Exception e) {
            fail("No exception should have been thrown.");
        }
    }
}
