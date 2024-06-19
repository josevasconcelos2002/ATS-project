import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Gestor_UtilizadoresTest {
    private Gestor_Utilizadores gestorUtilizadores;
    private Utilizador user1;
    private Utilizador user2;

    @BeforeEach
    public void setUp() {
        gestorUtilizadores = new Gestor_Utilizadores();
        user1 = new Utilizador("email1@example.com", "User 1", "Morada 1", 123456789L, "password1");
        user2 = new Utilizador("email2@example.com", "User 2", "Morada 2", 987654321L, "password2");
        gestorUtilizadores.adicionaUtilizador("email1@example.com", "User 1", "Morada 1", 123456789, "password1");
        gestorUtilizadores.adicionaUtilizador("email2@example.com", "User 2", "Morada 2", 987654321, "password2");
    }
    /*
    @Test
    public void testSetUtilizadores() {
        Map<Long, Utilizador> utilizadores = new HashMap<>();
        utilizadores.put(1L, user1);
        utilizadores.put(2L, user2);
        gestorUtilizadores.setUtilizadores(utilizadores);
        assertEquals(utilizadores, gestorUtilizadores.getUtilizadores());
    }*/

    @Test
    public void testSetIdUtilizadores() {
        Map<String, Long> idUtilizadores = new HashMap<>();
        idUtilizadores.put("email1@example.com", 1L);
        idUtilizadores.put("email2@example.com", 2L);
        gestorUtilizadores.setIdUtilizadores(idUtilizadores);
        assertEquals(idUtilizadores, gestorUtilizadores.getIdUtilizadores());
    }

    @Test
    public void testAdicionaUtilizador() {
        long id3 = gestorUtilizadores.adicionaUtilizador("email3@example.com", "User 3", "Morada 3", 123456389,
                "password3");
        assertTrue(gestorUtilizadores.existeUtilizador(id3));
        assertTrue(gestorUtilizadores.existeIdUtilizador("email3@example.com"));
    }

    @Test
    public void testVerificaPassword() {
        long id1 = gestorUtilizadores.verificaPassword("email1@example.com", "password1");
        assertTrue(gestorUtilizadores.existeUtilizador(id1));
        assertEquals(-1, gestorUtilizadores.verificaPassword("email1@example.com", "wrongpassword"));
        assertEquals(-2, gestorUtilizadores.verificaPassword("wrongemail@example.com", "password1"));
    }

    /*
    @Test
    public void testExisteUtilizador() {
        assertTrue(gestorUtilizadores.existeUtilizador(user1.getId()));
        assertFalse(gestorUtilizadores.existeUtilizador(9999));
    }*/

    @Test
    public void testExisteIdUtilizador() {
        assertTrue(gestorUtilizadores.existeIdUtilizador("email1@example.com"));
        assertFalse(gestorUtilizadores.existeIdUtilizador("wrongemail@example.com"));
    }
    /*
    @Test
    public void testClone() {
        Gestor_Utilizadores clonedGestor = gestorUtilizadores.clone();
        assertEquals(gestorUtilizadores, clonedGestor);
    }

    @Test
    public void testEquals() {
        Gestor_Utilizadores gestorUtilizadores2 = new Gestor_Utilizadores();
        assertNotEquals(gestorUtilizadores, gestorUtilizadores2);
        gestorUtilizadores2.adicionaUtilizador("email1@example.com", "User 1", "Morada 1", 123456789, "password1");
        gestorUtilizadores2.adicionaUtilizador("email2@example.com", "User 2", "Morada 2", 987654321, "password2");
        assertEquals(gestorUtilizadores, gestorUtilizadores2);
    }

    @Test
    public void testVendeArtigo() throws ArtigoExistenteException {
        String idArtigo = "artigo1";
        String result = gestorUtilizadores.vendeArtigo(idArtigo, user1.getId());
        assertEquals("Artigo adicionado com sucesso", result);
    }

    @Test
    public void testRetiraArtigo() throws ArtigoNaoEncontradoException, ArtigoExistenteException {
        String idArtigo = "artigo1";
        gestorUtilizadores.vendeArtigo(idArtigo, user1.getId());
        String result = gestorUtilizadores.retiraArtigo(idArtigo, user1.getId());
        assertEquals("Artigo removido com sucesso", result);
    }

    @Test
    public void testMeusArtigos() throws ArtigoExistenteException {
        String idArtigo1 = "artigo1";
        String idArtigo2 = "artigo2";
        gestorUtilizadores.vendeArtigo(idArtigo1, user1.getId());
        gestorUtilizadores.vendeArtigo(idArtigo2, user1.getId());
        Set<String> expectedArtigos = new HashSet<>();
        expectedArtigos.add(idArtigo1);
        expectedArtigos.add(idArtigo2);
        assertEquals(expectedArtigos, gestorUtilizadores.meusArtigos(user1.getId()));
    }

    @Test
    public void testRemoveArtigoEncomenda() throws ArtigoNaoEncontradoException, ArtigoExistenteException {
        String idArtigo = "artigo1";
        gestorUtilizadores.vendeArtigo(idArtigo, user1.getId());
        gestorUtilizadores.adicionaArtigoEncomenda(idArtigo, user1.getId(), user2.getId(), LocalDate.now());
        gestorUtilizadores.removeArtigoEncomenda(idArtigo, user1.getId(), user2.getId());
        Set<String> expectedArtigos = new HashSet<>();
        assertEquals(expectedArtigos, gestorUtilizadores.meusArtigos(user1.getId()));
    }

    @Test
    public void testRemoveTodosComprador() throws ArtigoExistenteException, ArtigoNaoEncontradoException {
        String idArtigo1 = "artigo1";
        String idArtigo2 = "artigo2";
        gestorUtilizadores.vendeArtigo(idArtigo1, user1.getId());
        gestorUtilizadores.vendeArtigo(idArtigo2, user1.getId());
        gestorUtilizadores.adicionaArtigoEncomenda(idArtigo1, user1.getId(), user2.getId(), LocalDate.now());
        gestorUtilizadores.adicionaArtigoEncomenda(idArtigo2, user1.getId(), user2.getId(), LocalDate.now());
        Set<String> result = gestorUtilizadores.removeTodosComprador(user2.getId());
        assertTrue(result.contains(idArtigo1));
        assertTrue(result.contains(idArtigo2));
    }

    @Test
    public void testNovoCarrinho() {
        gestorUtilizadores.novoCarrinho(user2.getId());
        assertTrue(gestorUtilizadores.verCarrinho(user2.getId()).isEmpty());
    }

    @Test
    public void testVoltaAVenderArtigo() throws ArtigoNaoEncontradoException, ArtigoExistenteException {
        String idArtigo = "artigo1";
        gestorUtilizadores.vendeArtigo(idArtigo, user1.getId());
        gestorUtilizadores.adicionaArtigoEncomenda(idArtigo, user1.getId(), user2.getId(), LocalDate.now());
        gestorUtilizadores.removeArtigoEncomenda(idArtigo, user1.getId(), user2.getId());
        gestorUtilizadores.voltaAVenderArtigo(idArtigo, user1.getId());
        assertTrue(gestorUtilizadores.meusArtigos(user1.getId()).contains(idArtigo));
    }

    @Test
    public void testVerCarrinho() throws ArtigoExistenteException, ArtigoNaoEncontradoException {
        String idArtigo = "artigo1";
        gestorUtilizadores.vendeArtigo(idArtigo, user1.getId());
        gestorUtilizadores.adicionaArtigoEncomenda(idArtigo, user1.getId(), user2.getId(), LocalDate.now());
        assertTrue(gestorUtilizadores.verCarrinho(user2.getId()).contains(idArtigo));
    }

    @Test
    public void testGetIdCarrinho() {
        long idCarrinho = gestorUtilizadores.getIdCarrinho(user2.getId());
        assertEquals(user2.getCarrinho().getId(), idCarrinho);
    }

    @Test
    public void testGetCarrinho() throws ArtigoExistenteException, ArtigoNaoEncontradoException {
        String idArtigo = "artigo1";
        gestorUtilizadores.vendeArtigo(idArtigo, user1.getId());
        gestorUtilizadores.adicionaArtigoEncomenda(idArtigo, user1.getId(), user2.getId(), LocalDate.now());
        assertEquals(user2.getCarrinho().toString(), gestorUtilizadores.getCarrinho(user2.getId()));
    }

    @Test
    public void testGetEncomendas()
            throws ArtigoExistenteException, EncomendaExistenteException, CarrinhoVazioException, ArtigoNaoEncontradoException {
        long idUtilizador = user2.getId();
        gestorUtilizadores.adicionaArtigoEncomenda("artigo1", user1.getId(), idUtilizador, LocalDate.now());
        gestorUtilizadores.finalizaEncomenda(idUtilizador, LocalDate.now());
        assertTrue(gestorUtilizadores.getEncomendas(idUtilizador).size() > 0);
    }

    @Test
    public void testGetEncomendasDevolvidas() throws EncomendaNaoEncontradaException {
        long idUtilizador = user2.getId();
        gestorUtilizadores.devolveEncomenda(idUtilizador, 1);
        assertTrue(gestorUtilizadores.getEncomendasDevolvidas(idUtilizador).contains(1L));
    }

    @Test
    public void testFinalizaEncomenda() throws ArtigoExistenteException, CarrinhoVazioException, ArtigoNaoEncontradoException, EncomendaExistenteException {
        long idUtilizador = user2.getId();
        gestorUtilizadores.adicionaArtigoEncomenda("artigo1", user1.getId(), idUtilizador, LocalDate.now());
        gestorUtilizadores.adicionaArtigoEncomenda("artigo2", user1.getId(), idUtilizador, LocalDate.now());
        Encomenda encomenda = gestorUtilizadores.finalizaEncomenda(idUtilizador, LocalDate.now());
        assertNotNull(encomenda);
    }

    @Test
    public void testPassaArtigoParaVendido() throws ArtigoNaoEncontradoException, ArtigoExistenteException, CarrinhoVazioException, EncomendaExistenteException {
        String idArtigo = "artigo1";
        gestorUtilizadores.vendeArtigo(idArtigo, user1.getId());
        gestorUtilizadores.finalizaEncomenda(user2.getId(), LocalDate.now());
        gestorUtilizadores.passaArtigoParaVendido(idArtigo, user1.getId());
        assertFalse(gestorUtilizadores.meusArtigos(user1.getId()).contains(idArtigo));
    }

    @Test
    public void testDevolveEncomenda() throws EncomendaNaoEncontradaException {
        long idUtilizador = user2.getId();
        gestorUtilizadores.devolveEncomenda(idUtilizador, 1);
        assertTrue(gestorUtilizadores.getEncomendasDevolvidas(idUtilizador).contains(1L));
    }

    @Test
    public void testImprimeFaturasCompras() {
        long idUtilizador = user2.getId();
        String result = gestorUtilizadores.imprimeFaturasCompras(idUtilizador);
        assertNotNull(result);
    }

    @Test
    public void testImprimeFaturasVendas() {
        long idUtilizador = user2.getId();
        String result = gestorUtilizadores.imprimeFaturasVendas(idUtilizador);
        assertNotNull(result);
    }

    @Test
    public void testImprime1FaturaCompra() {
        long idUtilizador = user2.getId();
        String result = gestorUtilizadores.imprime1FaturaCompra(1, idUtilizador);
        assertNotNull(result);
    }

    @Test
    public void testImprime1FaturaVenda() {
        long idUtilizador = user2.getId();
        String result = gestorUtilizadores.imprime1FaturaVenda(1, idUtilizador);
        assertNotNull(result);
    }*/

}