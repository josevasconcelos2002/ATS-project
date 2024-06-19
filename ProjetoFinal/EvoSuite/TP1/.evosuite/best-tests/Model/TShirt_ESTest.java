/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 13:49:13 GMT 2024
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Artigo;
import Model.TShirt;
import java.time.LocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TShirt_ESTest extends TShirt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.S;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.IMPEC�VEL;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "pNnc-v91jRRO", artigo_Estado0, (-2409), artigo_Avalia��o0, "", "<V", "", (-2765.59624168297), (-2765.59624168297), "pNnc-v91jRRO");
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-393L));
      double double0 = tShirt0.precoFinal(localDate0);
      assertEquals((-2765.59624168297), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      boolean boolean0 = tShirt0.equals(tShirt0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.M;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.IMPEC�VEL;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "^a}O2]/", artigo_Estado0, 835, artigo_Avalia��o0, "^a}O2]/", "wXvk><hO^%2>*:", "wXvk><hO^%2>*:", (-887.9963340979), 0.0, "wXvk><hO^%2>*:");
      tShirt0.setPrecoBase(1667.0);
      LocalDate localDate0 = MockLocalDate.now();
      double double0 = tShirt0.precoFinal(localDate0);
      assertEquals(833.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.M;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.IMPEC�VEL;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "^a}O2]/", artigo_Estado0, 835, artigo_Avalia��o0, "^a}O2]/", "wXvk><hO^%2>*:", "wXvk><hO^%2>*:", (-887.9963340979), 0.0, "wXvk><hO^%2>*:");
      TShirt.Tamanho tShirt_Tamanho1 = tShirt0.getTamanho();
      assertSame(tShirt_Tamanho1, tShirt_Tamanho0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.XL;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.LISO;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "", artigo_Estado0, 0, artigo_Avalia��o0, "<V-sJKSOe$=", "", (String) null, 0, 0, "");
      TShirt.Padrao tShirt_Padrao1 = tShirt0.getPadrao();
      assertSame(tShirt_Padrao0, tShirt_Padrao1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.setId(0);
      TShirt tShirt1 = tShirt0.clone();
      assertNull(tShirt1.getPadrao());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.setId((-1174));
      TShirt tShirt1 = tShirt0.clone();
      assertNull(tShirt1.getEstado());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      TShirt tShirt1 = tShirt0.clone();
      assertEquals(0.0, tShirt1.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.M;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, (String) null, artigo_Estado0, (-1979), artigo_Avalia��o0, "", "", "RISCAS", (-1.0), (-1979), "RISCAS");
      TShirt tShirt1 = tShirt0.clone();
      assertTrue(tShirt1.equals((Object)tShirt0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TShirt tShirt0 = null;
      try {
        tShirt0 = new TShirt((TShirt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1200L);
      double double0 = tShirt0.precoFinal(localDate0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.RISCAS;
      tShirt0.setPadrao(tShirt_Padrao0);
      double double0 = tShirt0.precoFinal((LocalDate) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.getPadrao();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.getTamanho();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      String string0 = tShirt0.toString((LocalDate) null);
      assertEquals("ID: 1\nTipo: \nEstado: null\nN\u00FAmero de Donos: 0\nAvalia\u00E7\u00E3o: null\nDescri\u00E7\u00E3o: \nMarca: \nC\u00F3digo: \nPre\u00E7o Base: 0.0\nCorre\u00E7\u00E3o do Pre\u00E7o: 0.0\nTransportadora: null\nTamanho: null\nPadrao: null\nPre\u00E7o Final: 0.0\n", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.M;
      boolean boolean0 = tShirt0.equals(tShirt_Tamanho0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      TShirt tShirt1 = new TShirt();
      assertTrue(tShirt1.equals((Object)tShirt0));
      
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.LISO;
      tShirt1.setPadrao(tShirt_Padrao0);
      boolean boolean0 = tShirt0.equals(tShirt1);
      assertFalse(tShirt1.equals((Object)tShirt0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      TShirt tShirt1 = new TShirt(tShirt0);
      assertEquals("", tShirt1.getDescricao());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      TShirt tShirt1 = new TShirt();
      boolean boolean0 = tShirt0.equals(tShirt1);
      assertTrue(boolean0);
  }
}