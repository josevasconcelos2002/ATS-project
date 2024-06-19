import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;


public class VintageTest {

    private Vintage vintage;

    @Before
    public void setUp() {
        vintage = new Vintage();
    }

    @Test
    public void testLoad() {
        assertNotNull(Vintage.load());
    }

    @Test
    public void testPovoamento1() {
        try {
            vintage.povoamento();
            // Verifica se o povoamento ocorreu sem erros
            assertTrue(vintage.existeEmail("admin"));
            assertTrue(vintage.existeEmail("joaogamer"));
        } catch (ArtigoExistenteException e) {
            fail("Erro durante o povoamento: " + e.getMessage());
        }
    }

    @Test
    public void testAddAdmin() {
        try {
            vintage.add_admin();
            assertTrue(vintage.existeEmail("admin"));
        } catch (ArtigoExistenteException e) {
            fail("Erro ao adicionar administrador: " + e.getMessage());
        }
    }

    @Test
    public void testAddTransportadoras() {
        vintage.add_trasportadoras();
        // Verifica se as transportadoras foram adicionadas corretamente
        assertNotNull(vintage.getGestor_Trasportadoras().getTransportadoras());
    }

    @Test
    public void testAddPoo() {
        try {
            vintage.add_poo();
            assertTrue(vintage.existeEmail("joaogamer"));
        } catch (ArtigoExistenteException e) {
            fail("Erro ao adicionar usuário para o povoamento: " + e.getMessage());
        }
    }

    @Test
    public void testPovoamento2() {
        try {
            vintage.povoamento();
            assertTrue(vintage.existeEmail("admin"));
            assertTrue(vintage.existeEmail("joaogamer"));
        } catch (ArtigoExistenteException e) {
            fail("Erro durante o povoamento: " + e.getMessage());
        }
    }

    @Test
    public void testGettersAndSetters() {
        Gestor_Artigos gestorArtigos = new Gestor_Artigos();
        Gestor_Utilizadores gestorUtilizadores = new Gestor_Utilizadores();
        GestorEncomendas gestorEncomendas = new GestorEncomendas();
        Gestor_Transportadoras gestorTransportadoras = new Gestor_Transportadoras();
        Menu menu = new Menu();

        Vintage v1 = new Vintage(gestorArtigos, gestorUtilizadores, gestorEncomendas, gestorTransportadoras, menu, 1);
        Vintage v2 = new Vintage(gestorArtigos, gestorUtilizadores, gestorEncomendas, gestorTransportadoras, menu);

        //Assert.assertEquals(gestorArtigos, v1.getGestor_Artigos());
        Assert.assertEquals(gestorUtilizadores, v1.getGestor_Utilizadores());
        Assert.assertEquals(gestorEncomendas, v1.getGestor_Encomendas());
        Assert.assertEquals(gestorTransportadoras, v1.getGestor_Trasportadoras());
        Assert.assertEquals(1, v1.getUtilizador());
        Assert.assertEquals(-1L, v2.getUtilizador());

        v2.setUtilizador(2);
        Assert.assertEquals(2, v2.getUtilizador());

        LocalDate today = LocalDate.now();
        v2.setData(today);
        Assert.assertEquals(today, v2.getData());
    }


    @Test
    public void testExisteEmail() {
        assertFalse(vintage.existeEmail("admin"));
        assertFalse(vintage.existeEmail("joaogamer"));
    }

    @Test
    public void testExisteIdUtilizador() {
        assertFalse(vintage.existeIdUtilizador(1));
        assertFalse(vintage.existeIdUtilizador(2));
    }

    @Test
    public void testVerificaPassword() {
        assertFalse(vintage.verificaPassword("admin", "admin"));
        assertFalse(vintage.verificaPassword("joaogamer", "joao"));
    }

    @Test
    public void testTodosArtigos() {
        Assert.assertEquals("", vintage.todosArtigos());
    }


    @Test
    public void testLoginUtilizador() {
        vintage.adicionaUtilizador("admin@email.com","admin", "Morada", 244444235L, "pass");
        vintage.login_utlizador("admin@email.com");
        Assert.assertEquals(1, vintage.getUtilizador());
    }

    @Test
    public void testFiltraAMarcaSapatilhas() {
        Assert.assertEquals("", vintage.filtraAMarcaSapatilhas("Nike"));
    }

    @Test
    public void testFiltraSapatilhasNovo() {
        Assert.assertEquals("", vintage.filtraSapatilhasNovo(true));
    }

    @Test
    public void testFiltraSapatilhasTamanho() {
        Assert.assertEquals("", vintage.filtraSapatilhasTamanho(42));
    }

    @Test
    public void testFiltraSapatilhasCor() {
        Assert.assertEquals("", vintage.filtraSapatilhasCor("Branco"));
    }

    @Test
    public void testFiltraTshirtsMarca() {
        Assert.assertEquals("", vintage.filtraTshirtsMarca("Adidas"));
    }

    @Test
    public void testFiltraTshirtsNovo() {
        Assert.assertEquals("", vintage.filtraTshirtsNovo(true));
    }

    @Test
    public void testFiltraTshirtsTamanho() {
        Assert.assertEquals("", vintage.filtraTshirtsTamanho(Tamanho.S));
    }

    @Test
    public void testFiltraTshirtsPadrao() {
        Assert.assertEquals("", vintage.filtraTshirtsPadrao(Padrao.liso));
    }

    @Test
    public void testFiltraMalasMarca() {
        Assert.assertEquals("", vintage.filtraMalasMarca("Samsonite"));
    }

    @Test
    public void testFiltraMalasNovo() {
        Assert.assertEquals("", vintage.filtraMalasNovo(false));
    }

    @Test
    public void testFiltraMalasDimensao() {
        Assert.assertEquals("", vintage.filtraMalasDimensao(60));
    }

    @Test
    public void testFiltraMalasMaterial() {
        Assert.assertEquals("", vintage.filtraMalasMaterial("Poliéster"));
    }

    @Test
    public void testFiltraMalasColecao() {
        Assert.assertEquals("", vintage.filtraMalasColecao(2022));
    }
    /*
    @Test
    public void testImprimeTransportadoras() {
        Assert.assertEquals("", vintage.imprimeTransportadoras());
    }*/

    @Test
    public void testImprimeTransportadorasNormais() {
        Assert.assertEquals("", vintage.imprimeTransportadorasNormais());
    }

    @Test
    public void testExisteTranspotadora() {
        assertFalse(vintage.existeTranspotadora(1));
    }

    @Test
    public void testExisteTranspotadoraNormal() {
        assertFalse(vintage.existe_transpotadoraNormal(1));
    }

    @Test
    public void testExisteTranspotadoraPremium() {
        assertFalse(vintage.existe_transpotadoraPremium(1));
    }
    /*
    @Test
    public void testCriaSapatilha() {
        try {
            vintage.criaSapatilha("Confortáveis", "Nike AIR", 250, true, 2, 10, 1L, 42, true, "Branca", 2022, true,
                    0.0);
        } catch (ArtigoExistenteException e) {
            fail("Exceção ArtigoExistenteException não deveria ser lançada.");
        }
    }

    @Test
    public void testCriaTshirt() {
        try {
            vintage.criaTshirt("Descrição", "Marca", 50.0, true, 1, 10, 1L, Tamanho.M, Padrao.liso);
        } catch (ArtigoExistenteException e) {
            fail("Exceção ArtigoExistenteException não deveria ser lançada.");
        }
    }

    @Test
    public void testCriaMala() {
        try {
            vintage.criaMala("Descrição", "Marca", 100.0, true, 2, 15, 2L, 50, "Material", 2023, true, 5.0f);
        } catch (ArtigoExistenteException e) {
            fail("Exceção ArtigoExistenteException não deveria ser lançada.");
        }
    }

    @Test
    public void testArtigoDisponivel() {
        try {
            Assert.assertEquals(0, vintage.artigoDisponivel("id_artigo"));
        } catch (ArtigoNaoEncontradoException e) {
            fail("Exceção ArtigoNaoEncontradoException não deveria ser lançada.");
        }
    }

    @Test
    public void testArtigoIndisponivel() {
        try {
            Assert.assertEquals(0, vintage.artigoIndisponivel("id_artigo"));
        } catch (ArtigoNaoEncontradoException e) {
            fail("Exceção ArtigoNaoEncontradoException não deveria ser lançada.");
        }
    }

    @Test
    public void testImprimeCarrinho() {
        Assert.assertEquals("", vintage.imprimeCarrinho());
    }

    @Test
    public void testAdicionarArtigoCarrinho() {
        try {
            vintage.adicionarArtigoCarrinho("id_artigo");
        } catch (ArtigoNaoEncontradoException | ArtigoExistenteException e) {
            fail("Exceção não deveria ser lançada.");
        }
    }

    @Test
    public void testAdicionarArtigoCarrinhoPorID() {
        try {
            vintage.adicionarArtigoCarrinhoPorID("id_artigo", 1L, LocalDate.now());
        } catch (ArtigoNaoEncontradoException | ArtigoExistenteException e) {
            fail("Exceção não deveria ser lançada.");
        }
    }

    @Test
    public void testRemoverTodosArtigosCarrinho() {
        try {
            vintage.removerTodosArtigosCarrinho();
        } catch (ArtigoNaoEncontradoException e) {
            fail("Exceção ArtigoNaoEncontradoException não deveria ser lançada.");
        }
    }

    @Test
    public void testRemoverArtigosCarrinho() {
        try {
            vintage.removerArtigosCarrinho("id_artigo");
        } catch (ArtigoNaoEncontradoException e) {
            fail("Exceção ArtigoNaoEncontradoException não deveria ser lançada.");
        }
    }

    @Test
    public void testEncomendasRealizadas() {
        Assert.assertEquals("", vintage.encomendasRealizadas());
    }

    @Test
    public void testEncomendasDevolvidas() {
        Assert.assertEquals("", vintage.encomendasDevolvidas());
    }

    @Test
    public void testEncomendasDevolver() {
        try {
            assertFalse(vintage.encomendasDevolver(1L));
        } catch (EncomendaNaoEncontradaException | EncomendaDevolucaoImpossivelException
                 | ArtigoNaoEncontradoException e) {
            fail("Exceção não deveria ser lançada.");
        }
    }

    @Test
    public void testTamanhoEncomenda() {
        Assert.assertEquals(0, vintage.tamanhoEncomenda(1L));
    }

    @Test
    public void testMeusArtigos() {
        Assert.assertEquals("", vintage.meusArtigos());
    }*/

    @Test
    public void testAdicinonarTransportadora() {
        vintage.adicinonarTransportadora("Transportadora", 10.0, 20.0, 30.0, 0.2, 0.5, true, 1);
    }
    /*
    @Test
    public void testFinalizarEncomenda() {
        try {
            Assert.assertEquals(0.0, vintage.finalizarEncomenda(), 0.01);
        } catch (CarrinhoVazioException | ArtigoNaoEncontradoException | EncomendaExistenteException
                 | EncomendaNaoEncontradaException e) {
            fail("Exceção não deveria ser lançada.");
        }
    }*/
}
