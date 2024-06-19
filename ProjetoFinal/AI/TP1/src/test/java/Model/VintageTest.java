package Model;

import Model.Encomenda;
import Model.Transportadoras;
import Model.Utilizador;
import Model.Vintage;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VintageTest {

    @Test
    public void test1(){
        Vintage v = new Vintage();
        assert v.getSessaoAtual() == null;
        assert v.getUtilizadores().isEmpty();
        assert v.getEncomendas().isEmpty();
        assert v.getTransportadoras().isEmpty();
        assert v.getDataPrograma().equals(LocalDate.now());

    }

    @Test
    public void test2(){
        LocalDate dataPrograma = LocalDate.now();
        Map<String, Utilizador> users = new HashMap<>();
        List<Encomenda> encomendas = new ArrayList<>();
        Map<String, Transportadoras> transportadoras = new HashMap<>();

        Vintage v = new Vintage("user123", users, encomendas, transportadoras, dataPrograma);
        assert v.getSessaoAtual().equals("user123");
        assert v.getUtilizadores().isEmpty();
        assert v.getEncomendas().isEmpty();
        assert v.getTransportadoras().isEmpty();
        assert v.getDataPrograma().equals(dataPrograma);

    }

    @Test
    public void test3(){
        LocalDate dataPrograma = LocalDate.now();
        Map<String, Utilizador> users = new HashMap<>();
        List<Encomenda> encomendas = new ArrayList<>();
        Map<String, Transportadoras> transportadoras = new HashMap<>();
        Transportadoras transportadora = new Transportadoras("TT-Rapido", 0.1, 10.0, true, 1);
        transportadoras.put(transportadora.getNome(), transportadora);

        Vintage v1 = new Vintage("user123", users, encomendas, transportadoras, dataPrograma);
        Vintage v2 = new Vintage(v1);
        assert v2.getSessaoAtual().equals("user123");
        assert v2.getEncomendas().isEmpty();
        assert v2.getTransportadoras().size() == 1;
        assert v2.getTransportadoras().get("TT-Rapido").getNome().equals("TT-Rapido");
        assert v2.getDataPrograma().equals(dataPrograma);



    }


}
