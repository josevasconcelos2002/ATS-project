package Model;
import static org.junit.jupiter.api.Assertions.*;

import Model.Artigo;
import Model.Encomenda;
import Model.TShirt;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EncomendaTest {

    @Test
    public void testDefaultConstructor() {
        Encomenda encomenda = new Encomenda();

        assertEquals(5, encomenda.getId());
        assertEquals("", encomenda.getDono());
        assertEquals(0, encomenda.getTamanho());
        assertNotNull(encomenda.getArtigos());
        assertEquals(0, encomenda.getArtigos().size());
        assertNull(encomenda.getEmbalagem());
        assertEquals(0, encomenda.getPrecoFinal());
        assertEquals(0, encomenda.getCustosExpedicao());
        assertEquals(Encomenda.Estado_Encomenda.PENDENTE, encomenda.getEstado());
        assertEquals(LocalDate.now(), encomenda.getDataCriacao());
        assertEquals(LocalDate.now().plusDays(2), encomenda.getPrazoLimite());
        assertNotNull(encomenda.getVendedores());
        assertEquals(0, encomenda.getVendedores().size());
    }

    @Test
    public void testParameterizedConstructor() {
        List<Artigo> artigos = new ArrayList<>();
        artigos.add(new TShirt(/* parameters */));
        Map<Integer, String> vendedores = new HashMap<>();
        vendedores.put(1, "Vendedor1");

        LocalDate dataCriacao = LocalDate.of(2023, 5, 26);
        Encomenda encomenda = new Encomenda("Dono1", artigos, 10.0, dataCriacao, vendedores);

        assertEquals(2, encomenda.getId());
        assertEquals("Dono1", encomenda.getDono());
        assertEquals(1, encomenda.getTamanho());
        assertEquals(artigos.size(), encomenda.getArtigos().size());
        assertEquals(Encomenda.Dimensao_Embalagem.PEQUENO, encomenda.getEmbalagem());
        assertEquals(10.25 + artigos.get(0).precoFinal(dataCriacao), encomenda.getPrecoFinal());
        assertEquals(10.0, encomenda.getCustosExpedicao());
        assertEquals(Encomenda.Estado_Encomenda.EXPEDIDA, encomenda.getEstado());
        assertEquals(dataCriacao, encomenda.getDataCriacao());
        assertEquals(dataCriacao.plusDays(2), encomenda.getPrazoLimite());
        assertEquals(vendedores, encomenda.getVendedores());
    }

    @Test
    public void testSetters() {
        Encomenda encomenda = new Encomenda();

        encomenda.setDono("New Owner");
        assertEquals("New Owner", encomenda.getDono());

        encomenda.setTamanho(3);
        assertEquals(3, encomenda.getTamanho());

        List<Artigo> artigos = new ArrayList<>();
        artigos.add(new TShirt(/* parameters */));
        encomenda.setArtigos(artigos);
        assertEquals(artigos.size(), encomenda.getArtigos().size());

        encomenda.setEmbalagem(Encomenda.Dimensao_Embalagem.GRANDE);
        assertEquals(Encomenda.Dimensao_Embalagem.GRANDE, encomenda.getEmbalagem());

        encomenda.setPrecoFinal(100.0);
        assertEquals(100.0, encomenda.getPrecoFinal());

        encomenda.setCustosExpedicao(20.0);
        assertEquals(20.0, encomenda.getCustosExpedicao());

        encomenda.setEstado(Encomenda.Estado_Encomenda.DEVOLVIDA);
        assertEquals(Encomenda.Estado_Encomenda.DEVOLVIDA, encomenda.getEstado());

        LocalDate newDate = LocalDate.of(2023, 6, 1);
        encomenda.setDataCriacao(newDate);
        assertEquals(newDate, encomenda.getDataCriacao());

        LocalDate newPrazo = newDate.plusDays(3);
        encomenda.setPrazoLimite(newPrazo);
        assertEquals(newPrazo, encomenda.getPrazoLimite());

        Map<Integer, String> vendedores = new HashMap<>();
        vendedores.put(2, "Vendedor2");
        encomenda.setVendedores(vendedores);
        assertEquals(vendedores, encomenda.getVendedores());
    }

    @Test
    public void testClone() {
        List<Artigo> artigos = new ArrayList<>();
        artigos.add(new TShirt(/* parameters */));
        Map<Integer, String> vendedores = new HashMap<>();
        vendedores.put(1, "Vendedor1");

        LocalDate dataCriacao = LocalDate.of(2023, 5, 26);
        Encomenda encomenda = new Encomenda("Dono1", artigos, 10.0, dataCriacao, vendedores);
        Encomenda clone = encomenda.clone();

        assertEquals(encomenda, clone);
    }

    @Test
    public void testToString() {
        List<Artigo> artigos = new ArrayList<>();
        artigos.add(new TShirt(/* parameters */));
        Map<Integer, String> vendedores = new HashMap<>();
        vendedores.put(1, "Vendedor1");

        LocalDate dataCriacao = LocalDate.of(2023, 5, 26);
        Encomenda encomenda = new Encomenda("Dono1", artigos, 10.0, dataCriacao, vendedores);

        String expectedString = "==========  Encomenda  ==========\n" +
                "ID da Encomenda: " + encomenda.getId() + "\n" +
                "Encomenda criada em: " + encomenda.getDataCriacao() + "\n" +
                "Prazo Limite: " + encomenda.getPrazoLimite() + "\n" +
                "==========   Artigos   ==========\n" +
                artigos.get(0).toString(dataCriacao) + "\n" +
                "========== Fim Artigos ==========\n" +
                "Dimensão da embalagem: " + encomenda.getEmbalagem() + "\n" +
                "Custo Expedição: " + encomenda.getCustosExpedicao() + "\n" +
                "Preço final: " + encomenda.getPrecoFinal() + "\n" +
                "Estado da encomenda: " + encomenda.getEstado() + "\n";

        assertEquals(expectedString, encomenda.toString());
    }




}
