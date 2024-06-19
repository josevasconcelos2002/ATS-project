package Model;
import static org.junit.jupiter.api.Assertions.*;

import Model.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilizadorTest {

    @Test
    public void testDefaultConstructor() {
        Utilizador user = new Utilizador();

        assertEquals(5, user.getId());
        assertEquals("", user.getEmail());
        assertEquals("", user.getPassword());
        assertEquals("", user.getNome());
        assertEquals("", user.getMorada());
        assertEquals(0, user.getNif());
        assertNotNull(user.getCompras());
        assertEquals(0, user.getCompras().size());
        assertNotNull(user.getPorVender());
        assertEquals(0, user.getPorVender().size());
        assertNotNull(user.getFaturacao());
        assertEquals(0, user.getFaturacao().size());
    }

    @Test
    public void testParameterizedConstructor() {
        List<Artigo> compras = new ArrayList<>();
        List<Artigo> porVender = new ArrayList<>();
        List<Artigo> vendas = new ArrayList<>();
        Map<LocalDate, Double> faturacao = new HashMap<>();

        LocalDate date = LocalDate.now();
        compras.add(new TShirt(/* parameters */));
        porVender.add(new Sapatilhas(/* parameters */));
        vendas.add(new Malas(/* parameters */));
        faturacao.put(date, 100.0);

        Utilizador user = new Utilizador("test@example.com", "password", "John Doe", "123 Main St", 123456789, compras, porVender, vendas, faturacao);

        assertEquals(2, user.getId());
        assertEquals("test@example.com", user.getEmail());
        assertEquals("password", user.getPassword());
        assertEquals("John Doe", user.getNome());
        assertEquals("123 Main St", user.getMorada());
        assertEquals(123456789, user.getNif());
        assertEquals(compras.size(), user.getCompras().size());
        assertEquals(porVender.size(), user.getPorVender().size());
        assertEquals(vendas.size(), user.getVendas().size());
        assertEquals(faturacao.size(), user.getFaturacao().size());
        assertEquals(100.0, user.getFaturacao().get(date));
    }

    @Test
    public void testSetters() {
        Utilizador user = new Utilizador();

        user.setEmail("new@example.com");
        assertEquals("new@example.com", user.getEmail());

        user.setPassword("newpassword");
        assertEquals("newpassword", user.getPassword());

        user.setNome("Jane Doe");
        assertEquals("Jane Doe", user.getNome());

        user.setMorada("456 Elm St");
        assertEquals("456 Elm St", user.getMorada());

        user.setNif(987654321);
        assertEquals(987654321, user.getNif());

        List<Artigo> compras = new ArrayList<>();
        compras.add(new TShirt(/* parameters */));
        user.setCompras(compras);
        assertEquals(compras.size(), user.getCompras().size());

        List<Artigo> porVender = new ArrayList<>();
        porVender.add(new Sapatilhas(/* parameters */));
        user.setPorVender(porVender);
        assertEquals(porVender.size(), user.getPorVender().size());

        List<Artigo> vendas = new ArrayList<>();
        vendas.add(new Malas(/* parameters */));
        user.setVendas(vendas);
        assertEquals(vendas.size(), user.getVendas().size());

        Map<LocalDate, Double> faturacao = new HashMap<>();
        LocalDate date = LocalDate.now();
        faturacao.put(date, 200.0);
        user.setFaturacao(faturacao);
        assertEquals(faturacao.size(), user.getFaturacao().size());
        assertEquals(200.0, user.getFaturacao().get(date));
    }

    @Test
    public void testEquals() {
        List<Artigo> compras = new ArrayList<>();
        List<Artigo> porVender = new ArrayList<>();
        List<Artigo> vendas = new ArrayList<>();
        Map<LocalDate, Double> faturacao = new HashMap<>();

        LocalDate date = LocalDate.now();
        compras.add(new TShirt(/* parameters */));
        porVender.add(new Sapatilhas(/* parameters */));
        vendas.add(new Malas(/* parameters */));
        faturacao.put(date, 100.0);

        Utilizador user1 = new Utilizador("test@example.com", "password", "John Doe", "123 Main St", 123456789, compras, porVender, vendas, faturacao);
        Utilizador user2 = new Utilizador(user1);


        user2.setEmail("another@example.com");
        assertNotEquals(user1, user2);
    }

    @Test
    public void testClone() {
        List<Artigo> compras = new ArrayList<>();
        List<Artigo> porVender = new ArrayList<>();
        List<Artigo> vendas = new ArrayList<>();
        Map<LocalDate, Double> faturacao = new HashMap<>();

        LocalDate date = LocalDate.now();
        compras.add(new TShirt(/* parameters */));
        porVender.add(new Sapatilhas(/* parameters */));
        vendas.add(new Malas(/* parameters */));
        faturacao.put(date, 100.0);

        Utilizador user = new Utilizador("test@example.com", "password", "John Doe", "123 Main St", 123456789, compras, porVender, vendas, faturacao);
        Utilizador clone = user.clone();


        clone.setEmail("changed@example.com");
        assertNotEquals(user, clone);
    }







}

