/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 13:47:36 GMT 2024
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Artigo;
import Model.Malas;
import java.time.LocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Malas_ESTest extends Malas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.IMPEC�VEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "Transportadora: ", 1, "Transportadora: ", artigo_Estado0, 2, artigo_Avalia��o0, "[t/AiYQK[", "C\u00F3digo: ", "C\u00F3digo: ", (-1473.2), 1, "[t/AiYQK[");
      LocalDate localDate0 = MockLocalDate.of(0, 1, 1);
      malas0.setAno_da_colecao(2);
      malas0.setDim(10.0F);
      malas0.toString(localDate0);
      assertEquals(10.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.IMPEC�VEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "Transportadora: ", 1, "Transportadora: ", artigo_Estado0, 2, artigo_Avalia��o0, "[t/AiYQK[", "C\u00F3digo: ", "C\u00F3digo: ", (-1473.2), 1, "[t/AiYQK[");
      assertEquals(1, malas0.getAno_da_colecao());
      
      LocalDate localDate0 = MockLocalDate.of(0, 1, 1);
      malas0.setAno_da_colecao(2);
      double double0 = malas0.precoFinal(localDate0);
      assertEquals((-1474.2), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.IMPEC�VEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "{pfa#{QY?=", (-1), "I3Mi->ax&x`CbY@z]", artigo_Estado0, 0, artigo_Avalia��o0, "I3Mi->ax&x`CbY@z]", "Dimens\u00F5es: ", "", 770.0, (-982.4), "{pfa#{QY?=");
      Malas malas1 = new Malas(malas0);
      malas0.setAno_da_colecao(1);
      boolean boolean0 = malas1.equals(malas0);
      assertEquals(1, malas0.getAno_da_colecao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Malas malas0 = new Malas();
      LocalDate localDate0 = MockLocalDate.now();
      double double0 = malas0.precoFinal(localDate0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, malas0.getAno_da_colecao());
      assertEquals(0.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-583.3033F), (String) null, 2, "c.$JDjD]2g/}<2E6,zR", artigo_Estado0, 2, artigo_Avalia��o0, "c.$JDjD]2g/}<2E6,zR", "", "q", 0.0, 2, "=?!$W[OB'9#pZd5+#6");
      String string0 = malas0.getMaterial();
      assertNull(string0);
      assertEquals((-583.3033F), malas0.getDim(), 0.01F);
      assertEquals(2, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.getMaterial();
      assertEquals(0, malas0.getAno_da_colecao());
      assertEquals(0.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 4517.984F, "Model.Artigo$Estado", 113, "Model.Artigo$Estado", artigo_Estado0, 4640, artigo_Avalia��o0, "Model.Artigo$Estado", "Model.Artigo$Estado", "Preco Final: ", 2505.0, (-1.0), "Model.Artigo$Estado");
      float float0 = malas0.getDim();
      assertEquals("Model.Artigo$Estado", malas0.getMaterial());
      assertEquals(4517.984F, float0, 0.01F);
      assertEquals(113, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Malas malas0 = new Malas();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      
      malas0.setDim((-1.0F));
      float float0 = malas0.getDim();
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setAno_da_colecao(3);
      int int0 = malas0.getAno_da_colecao();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-1939.1083F), "Material: ", (-1988), "sO", artigo_Estado0, (-1988), artigo_Avalia��o0, "Material: ", "J", "Model.Artigo$Estado", (-1988), (-307.0), "");
      int int0 = malas0.getAno_da_colecao();
      assertEquals((-1988), int0);
      assertEquals("Material: ", malas0.getMaterial());
      assertEquals((-1939.1083F), malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setNumeroDonos((-2405));
      Malas malas1 = malas0.clone();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-1561.838F), "Material: ", 1, "@\"#R6H#N:_{hdb0", artigo_Estado0, 0, artigo_Avalia��o0, "Material: ", "@\"#R6H#N:_{hdb0", "", (-1561.838F), 1, "BLVsLm]~3hB");
      malas0.setId(0);
      Malas malas1 = malas0.clone();
      assertEquals("Material: ", malas1.getMaterial());
      assertEquals((-1561.838F), malas1.getDim(), 0.01F);
      assertEquals((-1561.838F), malas0.getDim(), 0.01F);
      assertTrue(malas1.equals((Object)malas0));
      assertEquals(1, malas1.getAno_da_colecao());
      assertEquals(1, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setId((-1340));
      Malas malas1 = malas0.clone();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 30.0F, "/8ECNLep", (-1), "/8ECNLep", artigo_Estado0, 3542, artigo_Avalia��o0, "Avalia\u00E7\u00E3o: ", "/8ECNLep", "/8ECNLep", 30.0F, (-1), "BYHl_n/Ub4qY");
      Malas malas1 = malas0.clone();
      assertEquals(30.0F, malas0.getDim(), 0.01F);
      assertEquals("/8ECNLep", malas1.getMaterial());
      assertEquals((-1), malas0.getAno_da_colecao());
      assertTrue(malas1.equals((Object)malas0));
      assertEquals((-1), malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Malas malas0 = new Malas();
      // Undeclared exception!
      try { 
        malas0.precoFinal((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Malas", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setMaterial((String) null);
      Malas malas1 = new Malas();
      // Undeclared exception!
      try { 
        malas0.equals(malas1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Malas malas0 = null;
      try {
        malas0 = new Malas((Malas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.IMPEC�VEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "Transportadora: ", 1, "Transportadora: ", artigo_Estado0, 2, artigo_Avalia��o0, "[t/AiYQK[", "C\u00F3digo: ", "C\u00F3digo: ", (-1473.2), 1, "[t/AiYQK[");
      LocalDate localDate0 = MockLocalDate.of(0, 1, 1);
      malas0.setDim(10.0F);
      double double0 = malas0.precoFinal(localDate0);
      assertEquals(10.0F, malas0.getDim(), 0.01F);
      assertEquals((-1474.2), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1768.5623F, "", 784, "", artigo_Estado0, 0, artigo_Avalia��o0, "", "", "", 0.0, 1.0, ",`@");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0);
      double double0 = malas0.precoFinal(localDate0);
      assertEquals("", malas0.getMaterial());
      assertEquals(1779.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.IMPEC�VEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "'|bdQyvQ", 1, "", artigo_Estado0, 3, artigo_Avalia��o0, "'|bdQyvQ", "", "'|bdQyvQ", 0.0, 0.5, "");
      String string0 = malas0.getMaterial();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals("'|bdQyvQ", string0);
      assertEquals(1, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.IMPEC�VEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-2593.65F), "Ew9!kL(YJb&0NWx]Sh", 0, "Model.Artigo$Avalia\u00E7\u00E3o", artigo_Estado0, 0, artigo_Avalia��o0, "Ew9!kL(YJb&0NWx]Sh", "7S?E=", "'Bt+:%te_K:foF>?x", (-2011.0), 0, "Model.Artigo$Avalia\u00E7\u00E3o");
      int int0 = malas0.getAno_da_colecao();
      assertEquals("Ew9!kL(YJb&0NWx]Sh", malas0.getMaterial());
      assertEquals(0, int0);
      assertEquals((-2593.65F), malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.getTipo_mala();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setDim(30.0F);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-584L));
      malas0.toString(localDate0);
      assertEquals(30.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas malas1 = new Malas(malas0);
      assertTrue(malas1.equals((Object)malas0));
      
      malas1.setMaterial("2rD");
      boolean boolean0 = malas0.equals(malas1);
      assertFalse(malas1.equals((Object)malas0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      malas0.setTipo_mala(malas_Tipos_Malas0);
      Malas malas1 = new Malas();
      boolean boolean0 = malas0.equals(malas1);
      assertEquals(0, malas1.getAno_da_colecao());
      assertFalse(boolean0);
      assertEquals(0.0F, malas1.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas malas1 = new Malas();
      boolean boolean0 = malas0.equals(malas1);
      assertEquals(0.0F, malas1.getDim(), 0.01F);
      assertEquals(0, malas1.getAno_da_colecao());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Malas malas0 = new Malas();
      boolean boolean0 = malas0.equals(malas0);
      assertTrue(boolean0);
      assertEquals(0, malas0.getAno_da_colecao());
      assertEquals(0.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Malas malas0 = new Malas();
      Object object0 = new Object();
      boolean boolean0 = malas0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Malas malas0 = new Malas();
      // Undeclared exception!
      try { 
        malas0.toString((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Malas", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas malas1 = malas0.clone();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      
      malas0.setDim((-1.0F));
      boolean boolean0 = malas1.equals(malas0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      malas0.setTipo_mala(malas_Tipos_Malas0);
      malas0.getTipo_mala();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas0.getAno_da_colecao());
  }
}
