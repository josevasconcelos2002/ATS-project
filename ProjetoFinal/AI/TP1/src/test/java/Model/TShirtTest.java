package Model;

import Model.Artigo;
import Model.TShirt;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class TShirtTest {

    @Test
    public void testDefaultConstructor() {
        TShirt tshirt = new TShirt();
        assertNull(tshirt.getTamanho());
        assertNull(tshirt.getPadrao());
    }

    @Test
    public void testParameterizedConstructor() {
        TShirt tshirt = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.LISO, "T-Shirt", Artigo.Estado.NOVO, 0, Artigo.Avaliacao.SATISFATORIO, "Descrição", "Marca", "Código", 100, 1.0, "Transportadora");
        assertEquals(TShirt.Tamanho.M, tshirt.getTamanho());
        assertEquals(TShirt.Padrao.LISO, tshirt.getPadrao());
    }

    @Test
    public void testCopyConstructor() {
        TShirt tshirt1 = new TShirt(TShirt.Tamanho.L, TShirt.Padrao.PALMEIRAS, "T-Shirt", Artigo.Estado.USADO, 1, Artigo.Avaliacao.SATISFATORIO, "Descrição", "Marca", "Código", 100, 1.0, "Transportadora");
        TShirt tshirt2 = new TShirt(tshirt1);
        assertEquals(tshirt1, tshirt2);
    }

    @Test
    public void testGetSetTamanho() {
        TShirt tshirt = new TShirt();
        tshirt.setTamanho(TShirt.Tamanho.XL);
        assertEquals(TShirt.Tamanho.XL, tshirt.getTamanho());
    }

    @Test
    public void testGetSetPadrao() {
        TShirt tshirt = new TShirt();
        tshirt.setPadrao(TShirt.Padrao.RISCAS);
        assertEquals(TShirt.Padrao.RISCAS, tshirt.getPadrao());
    }

    @Test
    public void testEquals() {
        TShirt tshirt1 = new TShirt(TShirt.Tamanho.S, TShirt.Padrao.LISO, "T-Shirt", Artigo.Estado.NOVO, 0, Artigo.Avaliacao.SATISFATORIO, "Descrição", "Marca", "Código", 100, 1.0, "Transportadora");
        TShirt tshirt2 = new TShirt(TShirt.Tamanho.S, TShirt.Padrao.LISO, "T-Shirt", Artigo.Estado.NOVO, 0, Artigo.Avaliacao.SATISFATORIO, "Descrição", "Marca", "Código", 100, 1.0, "Transportadora");
        TShirt tshirt3 = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.RISCAS, "T-Shirt", Artigo.Estado.NOVO, 0, Artigo.Avaliacao.IMPECAVEL, "Descrição", "Marca", "Código", 100, 1.0, "Transportadora");

        assertEquals(tshirt1, tshirt2);
        assertNotEquals(tshirt1, tshirt3);
    }


    @Test
    public void testClone() {
        TShirt tshirt1 = new TShirt(TShirt.Tamanho.L, TShirt.Padrao.RISCAS, "T-Shirt", Artigo.Estado.USADO, 1, Artigo.Avaliacao.IMPECAVEL, "Descrição", "Marca", "Código", 100, 1.0, "Transportadora");
        TShirt tshirt2 = tshirt1.clone();
        assertEquals(tshirt1, tshirt2);
        assertNotSame(tshirt1, tshirt2);
    }

    @Test
    public void testPrecoFinal() {
        TShirt tshirt1 = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.PALMEIRAS, "T-Shirt", Artigo.Estado.NOVO, 0, Artigo.Avaliacao.BOM, "Descrição", "Marca", "Código", 100, 1.0, "Transportadora");
        TShirt tshirt2 = new TShirt(TShirt.Tamanho.S, TShirt.Padrao.RISCAS, "T-Shirt", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Descrição", "Marca", "Código", 100, 1.0, "Transportadora");

        assertEquals(100, tshirt1.precoFinal(LocalDate.now()));
        assertEquals(50, tshirt2.precoFinal(LocalDate.now()));
    }
}
