package View;

import View.Apresentacao;
import org.junit.jupiter.api.Test;

public class ApresentacaoTest {

    @Test
    public void test1(){
        Apresentacao app = new Apresentacao();
        assert app.am != null;
        assert app.al != null;
        assert app.out != null;

    }
}
