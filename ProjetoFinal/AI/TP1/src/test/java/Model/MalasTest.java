package Model;

import Model.Artigo;
import Model.Malas;
import org.junit.jupiter.api.Test;

public class MalasTest {

    @Test
    public void test1(){
        Malas mala = new Malas(Malas.Tipos_Malas.PREMIUM, 25.5f, "Polipropileno", 2020, "Mala", Artigo.Estado.NOVO, 0, Artigo.Avaliacao.BOM, "Mala de viagem grande", "Samsonite", "123456", 50.0, 2.0, "M");
        assert mala.getTipo_mala() == Malas.Tipos_Malas.PREMIUM;
        assert mala.getDim() == 25.5f;
        assert mala.getMaterial().equals("Polipropileno");
        assert mala.getAno_da_colecao() == 2020;

        Malas mala2 = new Malas();
        assert mala2.getTipo_mala() == null;
        assert mala2.getDim() == 0.0f;
        assert mala2.getMaterial().equals("");
        assert mala2.getAno_da_colecao() == 0;

        Malas mala1 = new Malas(Malas.Tipos_Malas.NORMAL, 15.0f, "Nylon", 2022, "Mala", Artigo.Estado.USADO, 1, Artigo.Avaliacao.IMPECAVEL, "Mochila escolar", "Eastpak", "987654", 30.0, 1.5, "M");
        Malas mala3 = new Malas(mala1);
        assert mala3.getTipo_mala() == Malas.Tipos_Malas.NORMAL;
        assert mala3.getDim() == 15.0f;
        assert mala3.getMaterial().equals("Nylon");
        assert mala3.getAno_da_colecao() == 2022;

        Malas mala4 = new Malas();
        mala4.setTipo_mala(Malas.Tipos_Malas.PREMIUM);
        assert mala4.getTipo_mala() == Malas.Tipos_Malas.PREMIUM;

        Malas mala6 = new Malas();
        mala6.setDim(32.0f);
        assert mala6.getDim() == 32.0f;

        Malas mala7 = new Malas();
        mala7.setMaterial("Couro");
        assert mala7.getMaterial().equals("Couro");

        Malas mala8 = new Malas();
        mala8.setAno_da_colecao(2021);
        assert mala8.getAno_da_colecao() == 2021;

        Malas mala9 = new Malas(Malas.Tipos_Malas.NORMAL, 15.0f, "Nylon", 2022, "Mala", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Mochila escolar", "Eastpak", "987654", 30.0, 1.5, "M");
        Malas mala10 = new Malas(Malas.Tipos_Malas.NORMAL, 15.0f, "Nylon", 2022, "Mala", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Mochila escolar", "Eastpak", "987654", 30.0, 1.5, "M");
        assert mala9.equals(mala10);



    }
}
