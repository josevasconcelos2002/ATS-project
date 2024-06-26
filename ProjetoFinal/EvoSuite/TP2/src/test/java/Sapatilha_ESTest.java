/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 14:33:21 GMT 2024
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sapatilha_ESTest extends Sapatilha_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double(0.01);
      Long long0 = new Long(1);
      Sapatilha sapatilha0 = new Sapatilha(" N\u00FAmero de utilizadores: ", " N\u00FAmero de utilizadores: ", double0, true, 1, 1, long0, long0, 1, false, " N\u00FAmero de utilizadores: ", (-2143121592), false, 1124.7989019978784);
      LocalDate localDate0 = sapatilha0.getData_venda();
      double double1 = sapatilha0.preco_atual(localDate0);
      assertEquals((-2143121592), sapatilha0.getAnoColecao());
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(0.01, double1, 0.01);
      assertEquals(1124.7989019978784, sapatilha0.getDesconto(), 0.01);
      assertEquals(1, sapatilha0.getTamanho());
      assertEquals(" N\u00FAmero de utilizadores: ", sapatilha0.getCor());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = new Double((-526.3708418052));
      Long long0 = new Long((-792L));
      Sapatilha sapatilha0 = new Sapatilha("ZA8N(Nu", "ZA8N(Nu", double0, false, (-2147483626), (-2147483626), long0, long0, 266, true, "ZA8N(Nu", (-2147483626), false, 0.9899999993497769);
      sapatilha0.setNovo(true);
      LocalDate localDate0 = sapatilha0.getData_venda();
      double double1 = sapatilha0.preco_atual(localDate0);
      assertEquals(0.01, double1, 0.01);
      assertFalse(sapatilha0.isPremium());
      assertEquals(0.9899999993497769, sapatilha0.getDesconto(), 0.01);
      assertEquals("ZA8N(Nu", sapatilha0.getCor());
      assertEquals(266, sapatilha0.getTamanho());
      assertTrue(sapatilha0.isAtacadores());
      assertEquals((-2147483626), sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setTamanho(45);
      sapatilha0.setNovo(true);
      double double0 = sapatilha0.preco_atual((LocalDate) null);
      assertEquals(45, sapatilha0.getTamanho());
      assertEquals(0.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double double0 = new Double(117.73510137);
      Long long0 = new Long(3272);
      Sapatilha sapatilha0 = new Sapatilha("\u20AC ", "\u20AC ", double0, false, (-3156), 3272, long0, long0, (-3156), false, "\u20AC ", 3272, false, (-3156));
      LocalDate localDate0 = sapatilha0.getData_venda();
      double double1 = sapatilha0.preco_atual(localDate0);
      assertEquals((-3156), sapatilha0.getTamanho());
      assertEquals("\u20AC ", sapatilha0.getCor());
      assertEquals(4230.890402343156, double1, 0.01);
      assertEquals(3272, sapatilha0.getAnoColecao());
      assertFalse(sapatilha0.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      assertFalse(sapatilha0.isPremium());
      
      LocalDate localDate0 = MockLocalDate.now();
      sapatilha0.setPremium(true);
      sapatilha0.setPreco_base(0.01);
      sapatilha0.setData_venda(localDate0);
      double double0 = sapatilha0.preco_atual(localDate0);
      assertTrue(sapatilha0.isPremium());
      assertEquals(2.024, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      LocalDate localDate0 = MockLocalDate.now();
      sapatilha0.setPremium(true);
      sapatilha0.setAnoColecao(934);
      sapatilha0.setData_venda(localDate0);
      double double0 = sapatilha0.preco_atual(localDate0);
      assertEquals(934, sapatilha0.getAnoColecao());
      assertEquals(0.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Double double0 = new Double((-1047.5691834));
      Long long0 = new Long(152L);
      Sapatilha sapatilha0 = new Sapatilha("", "", double0, true, 10, (-2166), long0, long0, (-2166), true, "", 10, true, (-1.0));
      Period period0 = Period.ofMonths((-2166));
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      double double1 = sapatilha0.preco_atual(localDate0);
      assertEquals(0.01, double1, 0.01);
      assertTrue(sapatilha0.isPremium());
      assertEquals((-1.0), sapatilha0.getDesconto(), 0.01);
      assertEquals((-2166), sapatilha0.getTamanho());
      assertEquals("", sapatilha0.getCor());
      assertEquals(10, sapatilha0.getAnoColecao());
      assertTrue(sapatilha0.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setMarca("");
      sapatilha0.setDescricao("");
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha1.setDesconto(10.0);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals(10.0, sapatilha1.getDesconto(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha1.setAnoColecao(928);
      boolean boolean0 = sapatilha0.equals(sapatilha1);
      assertEquals(928, sapatilha1.getAnoColecao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha1.setTamanho((-740));
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals((-740), sapatilha1.getTamanho());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      assertFalse(sapatilha0.isPremium());
      
      sapatilha0.setPremium(true);
      boolean boolean0 = sapatilha0.isPremium();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double double0 = new Double(117.73510137);
      Long long0 = new Long(3272);
      Sapatilha sapatilha0 = new Sapatilha("\u20AC ", "\u20AC ", double0, false, (-3156), 3272, long0, long0, (-3156), false, "\u20AC ", 3272, false, (-3156));
      boolean boolean0 = sapatilha0.isAtacadores();
      assertEquals((-3156), sapatilha0.getTamanho());
      assertFalse(boolean0);
      assertEquals("\u20AC ", sapatilha0.getCor());
      assertEquals(3272, sapatilha0.getAnoColecao());
      assertFalse(sapatilha0.isPremium());
      assertEquals((-3156.0), sapatilha0.getDesconto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double double0 = new Double(1014.5124494552786);
      Long long0 = new Long((-2164L));
      Sapatilha sapatilha0 = new Sapatilha("?KPZjyX-MA:,ZS/xP", "?KPZjyX-MA:,ZS/xP", double0, false, 389, 389, long0, long0, 10, true, "?KPZjyX-MA:,ZS/xP", (-1), false, 389);
      int int0 = sapatilha0.getTamanho();
      assertFalse(sapatilha0.isPremium());
      assertEquals("?KPZjyX-MA:,ZS/xP", sapatilha0.getCor());
      assertEquals(10, int0);
      assertTrue(sapatilha0.isAtacadores());
      assertEquals(389.0, sapatilha0.getDesconto(), 0.01);
      assertEquals((-1), sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double double0 = new Double((-1047.5691834));
      Long long0 = new Long(152L);
      Sapatilha sapatilha0 = new Sapatilha("", "", double0, true, 10, (-2166), long0, long0, (-2166), true, "", 10, true, (-1.0));
      int int0 = sapatilha0.getTamanho();
      assertTrue(sapatilha0.isPremium());
      assertEquals(10, sapatilha0.getAnoColecao());
      assertEquals((-2166), int0);
      assertEquals((-1.0), sapatilha0.getDesconto(), 0.01);
      assertEquals("", sapatilha0.getCor());
      assertTrue(sapatilha0.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double double0 = new Double(100.0);
      Long long0 = new Long(1058);
      Sapatilha sapatilha0 = new Sapatilha("", "", double0, false, 1058, 1058, long0, long0, 0, true, " Data de venda: ", 0, false, 1058);
      double double1 = sapatilha0.getDesconto();
      assertEquals(0, sapatilha0.getTamanho());
      assertFalse(sapatilha0.isPremium());
      assertEquals(1058.0, double1, 0.01);
      assertTrue(sapatilha0.isAtacadores());
      assertEquals(" Data de venda: ", sapatilha0.getCor());
      assertEquals(0, sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double double0 = new Double((-1198.0274325));
      Long long0 = new Long((-466));
      Sapatilha sapatilha0 = new Sapatilha("", "yI*DWEoHwI^w+0Z}j", double0, false, (-466), (-466), long0, long0, 0, false, "", (-466), true, 0);
      assertEquals("", sapatilha0.getCor());
      
      sapatilha0.setCor((String) null);
      sapatilha0.getCor();
      assertEquals((-466), sapatilha0.getAnoColecao());
      assertTrue(sapatilha0.isPremium());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(0, sapatilha0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double double0 = new Double(117.73510137);
      Long long0 = new Long(3272);
      Sapatilha sapatilha0 = new Sapatilha("\u20AC ", "\u20AC ", double0, false, (-3156), 3272, long0, long0, (-3156), false, "\u20AC ", 3272, false, (-3156));
      String string0 = sapatilha0.getCor();
      assertEquals((-3156), sapatilha0.getTamanho());
      assertFalse(sapatilha0.isPremium());
      assertEquals("\u20AC ", string0);
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(3272, sapatilha0.getAnoColecao());
      assertEquals((-3156.0), sapatilha0.getDesconto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      int int0 = sapatilha0.getAnoColecao();
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isAtacadores());
      assertFalse(sapatilha0.isPremium());
      assertEquals(0, int0);
      assertEquals(0, sapatilha0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Double double0 = new Double((-1198.0274325));
      Long long0 = new Long((-466));
      Sapatilha sapatilha0 = new Sapatilha("", "yI*DWEoHwI^w+0Z}j", double0, false, (-466), (-466), long0, long0, 0, false, "", (-466), true, 0);
      int int0 = sapatilha0.getAnoColecao();
      assertEquals(0, sapatilha0.getTamanho());
      assertEquals((-466), int0);
      assertTrue(sapatilha0.isPremium());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isAtacadores());
      assertEquals("", sapatilha0.getCor());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setNovo(true);
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertFalse(sapatilha1.isPremium());
      assertEquals(0, sapatilha1.getTamanho());
      assertEquals(0, sapatilha1.getAnoColecao());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertEquals("", sapatilha1.getCor());
      assertFalse(sapatilha1.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Double double0 = new Double((-2293.852500854946));
      Long long0 = new Long((-1456L));
      Long long1 = new Long(0);
      Sapatilha sapatilha0 = new Sapatilha(" Premium: ", " Premium: ", double0, false, (-771), 0, long0, long1, 3492, false, "J|7?A-I", (-771), false, (-2293.852500854946));
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals("J|7?A-I", sapatilha1.getCor());
      assertEquals(3492, sapatilha1.getTamanho());
      assertEquals((-2293.852500854946), sapatilha1.getDesconto(), 0.01);
      assertEquals((-771), sapatilha1.getAnoColecao());
      assertEquals((-2293.852500854946), sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha1.isAtacadores());
      assertFalse(sapatilha1.isPremium());
      assertEquals((-771), sapatilha0.getAnoColecao());
      assertEquals(3492, sapatilha0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setTransportadora(0L);
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals(0, sapatilha1.getAnoColecao());
      assertEquals("", sapatilha1.getCor());
      assertFalse(sapatilha1.isAtacadores());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertEquals(0, sapatilha1.getTamanho());
      assertFalse(sapatilha1.isPremium());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setEstado_uso(0);
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals("", sapatilha1.getCor());
      assertEquals(0, sapatilha1.getAnoColecao());
      assertFalse(sapatilha1.isAtacadores());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha1.isPremium());
      assertEquals(0, sapatilha1.getTamanho());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Double double0 = new Double(1014.5124494552786);
      Long long0 = new Long((-2164L));
      Sapatilha sapatilha0 = new Sapatilha("?KPZjyX-MA:,ZS/xP", "?KPZjyX-MA:,ZS/xP", double0, false, 389, 389, long0, long0, 10, true, "?KPZjyX-MA:,ZS/xP", (-1), false, 389);
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals((-1), sapatilha0.getAnoColecao());
      assertEquals(389.0, sapatilha0.getDesconto(), 0.01);
      assertEquals((-1), sapatilha1.getAnoColecao());
      assertEquals(389.0, sapatilha1.getDesconto(), 0.01);
      assertEquals(10, sapatilha1.getTamanho());
      assertTrue(sapatilha1.isAtacadores());
      assertEquals(10, sapatilha0.getTamanho());
      assertFalse(sapatilha1.isPremium());
      assertEquals("?KPZjyX-MA:,ZS/xP", sapatilha1.getCor());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Artigo.contador = (long) 0;
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals(0, sapatilha1.getTamanho());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha1.isAtacadores());
      assertEquals(0, sapatilha1.getAnoColecao());
      assertEquals("", sapatilha1.getCor());
      assertFalse(sapatilha1.isPremium());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Artigo.setContador((-1L));
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals(0, sapatilha1.getTamanho());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha1.isAtacadores());
      assertEquals("", sapatilha1.getCor());
      assertEquals(0, sapatilha1.getAnoColecao());
      assertFalse(sapatilha1.isPremium());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Double double0 = new Double(117.73510137);
      Long long0 = new Long(3272);
      Sapatilha sapatilha0 = new Sapatilha("\u20AC ", "\u20AC ", double0, false, (-3156), 3272, long0, long0, (-3156), false, "\u20AC ", 3272, false, (-3156));
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals("\u20AC ", sapatilha1.getCor());
      assertEquals((-3156), sapatilha0.getTamanho());
      assertEquals(3272, sapatilha1.getAnoColecao());
      assertEquals(3272, sapatilha0.getAnoColecao());
      assertFalse(sapatilha1.isAtacadores());
      assertEquals((-3156), sapatilha1.getTamanho());
      assertFalse(sapatilha1.isPremium());
      assertEquals((-3156.0), sapatilha0.getDesconto(), 0.01);
      assertEquals((-3156.0), sapatilha1.getDesconto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Double double0 = new Double((-1198.0274325));
      Long long0 = new Long((-466));
      Sapatilha sapatilha0 = new Sapatilha("", "yI*DWEoHwI^w+0Z}j", double0, false, (-466), (-466), long0, long0, 0, false, "", (-466), true, 0);
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals((-466), sapatilha1.getAnoColecao());
      assertEquals("", sapatilha1.getCor());
      assertEquals(0, sapatilha1.getTamanho());
      assertEquals((-466), sapatilha0.getAnoColecao());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertTrue(sapatilha1.isPremium());
      assertFalse(sapatilha1.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setData_venda((LocalDate) null);
      // Undeclared exception!
      try { 
        sapatilha0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha1.setDescricao((String) null);
      // Undeclared exception!
      try { 
        sapatilha1.equals(sapatilha0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Sapatilha sapatilha0 = null;
      try {
        sapatilha0 = new Sapatilha((Sapatilha) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Double double0 = new Double((-1047.5691834));
      Long long0 = new Long(152L);
      Sapatilha sapatilha0 = new Sapatilha("", "", double0, true, 10, (-2166), long0, long0, (-2166), true, "", 10, true, (-1.0));
      String string0 = sapatilha0.toString();
      assertEquals("Sapatilhas:: {Artigo:: { C\u00F3digo de barras: A1 Descri\u00E7\u00E3o:  Marca:  Pre\u00E7o base: -1047.5691834 Novo: true Estado de uso: 10 N\u00FAmero de utilizadores: -2166 Disponivel: true Id da transportadora: 152 Id do vendedor: 152 } Tamanho: -2166 Atacadores: true Cor:  Data da Cole\u00E7\u00E3o: 10 Premium: true Desconto: -1.0}", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Double double0 = new Double(1014.5124494552786);
      Long long0 = new Long((-2164L));
      Sapatilha sapatilha0 = new Sapatilha("?KPZjyX-MA:,ZS/xP", "?KPZjyX-MA:,ZS/xP", double0, false, 389, 389, long0, long0, 10, true, "?KPZjyX-MA:,ZS/xP", (-1), false, 389);
      boolean boolean0 = sapatilha0.isAtacadores();
      assertFalse(sapatilha0.isPremium());
      assertEquals((-1), sapatilha0.getAnoColecao());
      assertTrue(boolean0);
      assertEquals(389.0, sapatilha0.getDesconto(), 0.01);
      assertEquals(10, sapatilha0.getTamanho());
      assertEquals("?KPZjyX-MA:,ZS/xP", sapatilha0.getCor());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Double double0 = new Double((-1198.0274325));
      Long long0 = new Long((-466));
      Sapatilha sapatilha0 = new Sapatilha("", "yI*DWEoHwI^w+0Z}j", double0, false, (-466), (-466), long0, long0, 0, false, "", (-466), true, 0);
      String string0 = sapatilha0.getCor();
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertTrue(sapatilha0.isPremium());
      assertEquals("", string0);
      assertFalse(sapatilha0.isAtacadores());
      assertEquals((-466), sapatilha0.getAnoColecao());
      assertEquals(0, sapatilha0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Double double0 = new Double((-1047.5691834));
      Long long0 = new Long(152L);
      Sapatilha sapatilha0 = new Sapatilha("", "", double0, true, 10, (-2166), long0, long0, (-2166), true, "", 10, true, (-1.0));
      int int0 = sapatilha0.getAnoColecao();
      assertTrue(sapatilha0.isPremium());
      assertEquals((-2166), sapatilha0.getTamanho());
      assertEquals((-1.0), sapatilha0.getDesconto(), 0.01);
      assertTrue(sapatilha0.isAtacadores());
      assertEquals(10, int0);
      assertEquals("", sapatilha0.getCor());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Double double0 = new Double((-1.0));
      Long long0 = new Long((-2889));
      Sapatilha sapatilha0 = new Sapatilha("z3`ajZ+:lfytao3Q", "z3`ajZ+:lfytao3Q", double0, true, (-2889), (-2889), long0, long0, (-2889), true, "z3`ajZ+:lfytao3Q", (-2889), false, (-1534.0));
      double double1 = sapatilha0.getDesconto();
      assertEquals("z3`ajZ+:lfytao3Q", sapatilha0.getCor());
      assertEquals((-2889), sapatilha0.getAnoColecao());
      assertTrue(sapatilha0.isAtacadores());
      assertEquals((-1534.0), double1, 0.01);
      assertFalse(sapatilha0.isPremium());
      assertEquals((-2889), sapatilha0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      double double0 = sapatilha0.getDesconto();
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, sapatilha0.getTamanho());
      assertEquals(0, sapatilha0.getAnoColecao());
      assertFalse(sapatilha0.isPremium());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      int int0 = sapatilha0.getTamanho();
      assertFalse(sapatilha0.isAtacadores());
      assertFalse(sapatilha0.isPremium());
      assertEquals(0, sapatilha0.getAnoColecao());
      assertEquals(0, int0);
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha0.setDesconto(2L);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals(2.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setMarca("");
      sapatilha0.setDescricao("");
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha0.setPremium(true);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertTrue(sapatilha0.isPremium());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha0.setAnoColecao(Integer.MAX_VALUE);
      boolean boolean0 = sapatilha0.equals(sapatilha1);
      assertEquals(Integer.MAX_VALUE, sapatilha0.getAnoColecao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals("", sapatilha1.getCor());
      
      sapatilha1.setCor("A");
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertFalse(sapatilha1.isAtacadores());
      assertEquals(0, sapatilha1.getTamanho());
      assertFalse(sapatilha1.isPremium());
      assertEquals(0, sapatilha1.getAnoColecao());
      assertTrue(sapatilha0.equals((Object)sapatilha1));
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha1.setTamanho(Integer.MAX_VALUE);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals(Integer.MAX_VALUE, sapatilha1.getTamanho());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Object object0 = new Object();
      boolean boolean0 = sapatilha0.equals(object0);
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isPremium());
      assertEquals(0, sapatilha0.getTamanho());
      assertFalse(boolean0);
      assertEquals(0, sapatilha0.getAnoColecao());
      assertFalse(sapatilha0.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      boolean boolean0 = sapatilha0.equals((Object) null);
      assertFalse(sapatilha0.isPremium());
      assertEquals(0, sapatilha0.getTamanho());
      assertFalse(boolean0);
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(0, sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      boolean boolean0 = sapatilha0.equals(sapatilha0);
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertEquals(0, sapatilha0.getTamanho());
      assertFalse(sapatilha0.isPremium());
      assertFalse(sapatilha0.isAtacadores());
      assertTrue(boolean0);
      assertEquals(0, sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertTrue(sapatilha1.equals((Object)sapatilha0));
      
      sapatilha1.setVendedor(2L);
      boolean boolean0 = sapatilha0.equals(sapatilha1);
      assertFalse(sapatilha1.equals((Object)sapatilha0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setPremium(true);
      // Undeclared exception!
      try { 
        sapatilha0.preco_atual((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Sapatilha", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha1.setAtacadores(true);
      boolean boolean0 = sapatilha0.equals(sapatilha1);
      assertTrue(sapatilha1.isAtacadores());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Double double0 = new Double((-2552.1062263837616));
      Long long0 = new Long(766L);
      Sapatilha sapatilha0 = null;
      try {
        sapatilha0 = new Sapatilha("HToRs-x2nr}$T|7", "HToRs-x2nr}$T|7", double0, true, 252, 252, (Long) null, long0, 252, true, "HToRs-x2nr}$T|7", (-1442), false, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      boolean boolean0 = sapatilha0.isPremium();
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertEquals(0, sapatilha0.getAnoColecao());
      assertFalse(sapatilha0.isAtacadores());
      assertFalse(boolean0);
      assertEquals(0, sapatilha0.getTamanho());
  }
}
