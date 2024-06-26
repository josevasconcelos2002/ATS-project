/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 13:46:20 GMT 2024
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Artigo;
import Model.Sapatilhas;
import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sapatilhas_ESTest extends Sapatilhas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setPrecoBase(1436.6);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      sapatilhas0.setTiposSapatilhas(sapatilhas_Tipos_Sapatilhas0);
      Clock clock0 = MockClock.systemUTC();
      LocalDate localDate0 = MockLocalDate.now(clock0);
      double double0 = sapatilhas0.precoFinal(localDate0);
      assertFalse(sapatilhas0.getAtilhos());
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
      assertEquals(2894749.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      sapatilhas0.setTiposSapatilhas(sapatilhas_Tipos_Sapatilhas0);
      Clock clock0 = MockClock.systemUTC();
      LocalDate localDate0 = MockLocalDate.now(clock0);
      double double0 = sapatilhas0.precoFinal(localDate0);
      assertFalse(sapatilhas0.getAtilhos());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(2, true, (String) null, (LocalDate) null, sapatilhas_Tipos_Sapatilhas0, (String) null, artigo_Estado0, 1, artigo_Avalia��o0, (String) null, "Model.Artigo", "Descri\u00E7\u00E3o: ", 2, (-1.0), "IMPEC\u00C1VEL");
      double double0 = sapatilhas0.precoFinal((LocalDate) null);
      assertEquals(2.5, double0, 0.01);
      assertTrue(sapatilhas0.getAtilhos());
      assertEquals(2, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofYearDay(0, 45);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      Sapatilhas sapatilhas0 = new Sapatilhas(45, true, "$VALUES", localDate0, sapatilhas_Tipos_Sapatilhas0, "P'5oFga", artigo_Estado0, 0, artigo_Avalia��o0, "$VALUES", "$VALUES", "P'5oFga", 0.0, 0.0, "Model.Sapatilhas");
      String string0 = sapatilhas0.toString(localDate0);
      assertEquals("ID: 1\nTipo: P'5oFga\nEstado: USADO\nN\u00FAmero de Donos: 0\nAvalia\u00E7\u00E3o: SATISFAT\u00D3RIO\nDescri\u00E7\u00E3o: $VALUES\nMarca: $VALUES\nC\u00F3digo: P'5oFga\nPre\u00E7o Base: 0.0\nCorre\u00E7\u00E3o do Pre\u00E7o: 0.0\nTransportadora: Model.Sapatilhas\nTamanho Numerico: 45\nAtilhos: true\nCor: $VALUES\nData de Lancamento: 0000-02-14\nTipo de Sapatilhas: PREMIUM\nPreco Final: 0.0\n", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      Sapatilhas sapatilhas0 = new Sapatilhas(0, true, "", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, 0, artigo_Avalia��o0, "", "", "", (-1166.965373), 0, "");
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      sapatilhas1.setTamanhoNumerico((-530));
      boolean boolean0 = sapatilhas0.equals(sapatilhas1);
      assertEquals((-530), sapatilhas1.getTamanhoNumerico());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getTiposSapatilhas();
      assertFalse(sapatilhas0.getAtilhos());
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDate localDate0 = MockLocalDate.now(clock0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      Sapatilhas sapatilhas0 = new Sapatilhas((-1795), true, (String) null, localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, (-1795), artigo_Avalia��o0, (String) null, "Tipo de Sapatilhas: ", "Tipo de Sapatilhas: ", (-1795), 1434.129, "");
      int int0 = sapatilhas0.getTamanhoNumerico();
      assertEquals((-1795), int0);
      assertTrue(sapatilhas0.getAtilhos());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setDataLancamento((LocalDate) null);
      sapatilhas0.getDataLancamento();
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
      assertFalse(sapatilhas0.getAtilhos());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.ofMonths(41);
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.IMPEC�VEL;
      Sapatilhas sapatilhas0 = new Sapatilhas(41, true, (String) null, localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, (-1318), artigo_Avalia��o0, "", (String) null, (String) null, (-1318), 0.0, "");
      String string0 = sapatilhas0.getCor();
      assertEquals(41, sapatilhas0.getTamanhoNumerico());
      assertTrue(sapatilhas0.getAtilhos());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getCor();
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
      assertFalse(sapatilhas0.getAtilhos());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      boolean boolean0 = sapatilhas0.getAtilhos();
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setNumeroDonos(2222);
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      assertFalse(sapatilhas1.getAtilhos());
      assertEquals(0, sapatilhas1.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setId((-1));
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      assertEquals(0, sapatilhas1.getTamanhoNumerico());
      assertFalse(sapatilhas1.getAtilhos());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      // Undeclared exception!
      try { 
        sapatilhas1.equals(sapatilhas0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sapatilhas sapatilhas0 = null;
      try {
        sapatilhas0 = new Sapatilhas((Sapatilhas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      int int0 = sapatilhas0.getTamanhoNumerico();
      assertEquals(0, int0);
      assertFalse(sapatilhas0.getAtilhos());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1867);
      sapatilhas0.setTamanhoNumerico(1867);
      double double0 = sapatilhas0.precoFinal(localDate0);
      assertEquals(1867, sapatilhas0.getTamanhoNumerico());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas();
      boolean boolean0 = sapatilhas1.equals(sapatilhas0);
      assertEquals(0, sapatilhas1.getTamanhoNumerico());
      assertFalse(sapatilhas1.getAtilhos());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      boolean boolean0 = sapatilhas0.equals((Object) null);
      assertFalse(boolean0);
      assertFalse(sapatilhas0.getAtilhos());
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      boolean boolean0 = sapatilhas0.equals(sapatilhas0);
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
      assertTrue(boolean0);
      assertFalse(sapatilhas0.getAtilhos());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTamanhoNumerico(612);
      int int0 = sapatilhas0.getTamanhoNumerico();
      assertEquals(612, int0);
  }
}
