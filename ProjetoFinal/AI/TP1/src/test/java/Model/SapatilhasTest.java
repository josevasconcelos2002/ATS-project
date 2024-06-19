package Model;

import Model.Artigo;
import Model.Sapatilhas;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class SapatilhasTest {

    @Test
    public void test1(){
        Sapatilhas sap = new Sapatilhas(38, true, "Preto", LocalDate.of(2022, 3, 14), Sapatilhas.Tipos_Sapatilhas.NORMAL, "T-shirt", Artigo.Estado.NOVO, 0, Artigo.Avaliacao.BOM, "Camiseta de algodão", "Nike", "12345", 30.0, 0.1, "M");
        assert sap.getTamanhoNumerico() == 38;
        assert sap.getAtilhos() == true;
        assert sap.getCor().equals("Preto");
        assert sap.getDataLancamento().equals(LocalDate.of(2022, 3, 14));
        assert sap.getTiposSapatilhas() == Sapatilhas.Tipos_Sapatilhas.NORMAL;

    }
    @Test
    public void test2(){
        Sapatilhas sap = new Sapatilhas();
        assert sap.getTamanhoNumerico() == 0;
        assert sap.getAtilhos() == false;
        assert sap.getCor().equals("");
        assert sap.getDataLancamento().equals(LocalDate.of(0, Month.JANUARY, 1));
        assert sap.getTiposSapatilhas() == null;

    }

    @Test
    public void test3(){
        Sapatilhas sap1 = new Sapatilhas(38, true, "Preto", LocalDate.of(2022, 3, 14), Sapatilhas.Tipos_Sapatilhas.NORMAL, "T-shirt", Artigo.Estado.NOVO, 0, Artigo.Avaliacao.SATISFATORIO, "Camiseta de algodão", "Nike", "12345", 30.0, 0.1, "M");
        Sapatilhas sap2 = new Sapatilhas(sap1);
        assert sap2.getTamanhoNumerico() == 38;
        assert sap2.getAtilhos() == true;
        assert sap2.getCor().equals("Preto");
        assert sap2.getDataLancamento().equals(LocalDate.of(2022, 3, 14));
        assert sap2.getTiposSapatilhas() == Sapatilhas.Tipos_Sapatilhas.NORMAL;

    }

    @Test
    public void test4(){
        Sapatilhas sap = new Sapatilhas();
        sap.setTamanhoNumerico(39);
        assert sap.getTamanhoNumerico() == 39;

        Sapatilhas sap2 = new Sapatilhas();
        sap2.setAtilhos(false);
        assert sap2.getAtilhos() == false;

        Sapatilhas sap3 = new Sapatilhas();
        sap3.setCor("Branco");
        assert sap3.getCor().equals("Branco");

        Sapatilhas sap4 = new Sapatilhas();
        sap4.setDataLancamento(LocalDate.of(2023, 5, 26));
        assert sap4.getDataLancamento().equals(LocalDate.of(2023, 5, 26));

        Sapatilhas sap5 = new Sapatilhas();
        sap5.setTiposSapatilhas(Sapatilhas.Tipos_Sapatilhas.PREMIUM);
        assert sap5.getTiposSapatilhas() == Sapatilhas.Tipos_Sapatilhas.PREMIUM;






    }
}
