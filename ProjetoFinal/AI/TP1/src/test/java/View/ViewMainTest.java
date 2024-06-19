package View;


import View.ViewMain;
import org.junit.Test;

public class ViewMainTest {

    @Test
    public void testWelcome() {
        ViewMain viewMain = new ViewMain();
        viewMain.welcome();
        // Manually verify the output
    }

    @Test
    public void testPrintMenuInicial() {
        ViewMain viewMain = new ViewMain();
        viewMain.printMenuInicial();
        // Manually verify the output
    }

    @Test
    public void testPrintMainMenuLogOut() {
        ViewMain viewMain = new ViewMain();
        viewMain.printMainMenuLogOut();
        // Manually verify the output
    }

    @Test
    public void testPrintMenuArtigo() {
        ViewMain viewMain = new ViewMain();
        viewMain.printMenuArtigo();
        // Manually verify the output
    }

    @Test
    public void testPrintMenuConsultas() {
        ViewMain viewMain = new ViewMain();
        viewMain.printMenuConsultas();
        // Manually verify the output
    }

    @Test
    public void testPrintMenuEstatisticas() {
        ViewMain viewMain = new ViewMain();
        viewMain.printMenuEstatisticas();
        // Manually verify the output
    }

    @Test
    public void testPrintMenuEncomenda() {
        ViewMain viewMain = new ViewMain();
        viewMain.printMenuEncomenda();
        // Manually verify the output
    }

    @Test
    public void testPrintErroComandoInvalido() {
        ViewMain viewMain = new ViewMain();
        viewMain.printErroComandoInvalido();
        // Manually verify the output
    }

    @Test
    public void testPrintFicheiroCarregado() {
        ViewMain viewMain = new ViewMain();
        viewMain.printFicheiroCarregado("example.txt");
        // Manually verify the output
    }

    @Test
    public void testPrintFicheiroGuardado() {
        ViewMain viewMain = new ViewMain();
        viewMain.printFicheiroGuardado("example.txt");
        // Manually verify the output
    }

    @Test
    public void testPrintSair() {
        ViewMain viewMain = new ViewMain();
        viewMain.printSair();
        // Manually verify the output
    }
}
