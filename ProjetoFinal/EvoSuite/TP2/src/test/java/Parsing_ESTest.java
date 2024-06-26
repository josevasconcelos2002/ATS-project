/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 14:27:32 GMT 2024
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parsing_ESTest extends Parsing_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Menu menu0 = new Menu();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      HashMap<Integer, Artigo> hashMap0 = new HashMap<Integer, Artigo>();
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos(hashMap0);
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Transportadora> hashMap1 = new HashMap<Long, Transportadora>();
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras(hashMap1);
      Vintage vintage0 = new Vintage(gestor_Artigos0, gestor_Utilizadores0, gestorEncomendas0, gestor_Transportadoras0, menu0);
      Parsing parsing0 = new Parsing(vintage0, menu0);
      String[] stringArray0 = new String[9];
      stringArray0[6] = "2";
      stringArray0[8] = "2";
      parsing0.venderTshit(0L, localDate0, stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing((Vintage) null, menu0);
      String[] stringArray0 = new String[25];
      stringArray0[7] = "1";
      parsing0.venderSapatilha((-331L), (LocalDate) null, stringArray0);
      assertEquals(25, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Menu menu0 = new Menu();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      HashMap<Integer, Artigo> hashMap0 = new HashMap<Integer, Artigo>();
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos(hashMap0);
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Transportadora> hashMap1 = new HashMap<Long, Transportadora>();
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras(hashMap1);
      Vintage vintage0 = new Vintage(gestor_Artigos0, gestor_Utilizadores0, gestorEncomendas0, gestor_Transportadoras0, menu0);
      Parsing parsing0 = new Parsing(vintage0, menu0);
      String[] stringArray0 = new String[9];
      stringArray0[6] = "2";
      stringArray0[8] = "2";
      parsing0.venderMala((-2L), localDate0, stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing((Vintage) null, menu0);
      Vintage vintage0 = parsing0.getVintage();
      assertNull(vintage0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras();
      Menu menu0 = new Menu();
      Vintage vintage0 = new Vintage(gestor_Artigos0, gestor_Utilizadores0, gestorEncomendas0, gestor_Transportadoras0, menu0);
      Parsing parsing0 = new Parsing(vintage0, menu0);
      Vintage vintage1 = parsing0.getVintage();
      assertSame(vintage1, vintage0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Integer, Artigo> hashMap0 = new HashMap<Integer, Artigo>();
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos(hashMap0);
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Menu menu0 = new Menu();
      Vintage vintage0 = new Vintage(gestor_Artigos0, (Gestor_Utilizadores) null, gestorEncomendas0, (Gestor_Transportadoras) null, menu0, 2053);
      Parsing parsing0 = new Parsing(vintage0, menu0);
      Vintage vintage1 = parsing0.getVintage();
      assertEquals(2053L, vintage1.getUtilizador());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      Parsing parsing0 = new Parsing(vintage0, (Menu) null);
      Menu menu0 = parsing0.getMenu();
      assertNull(menu0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras();
      Vintage vintage0 = new Vintage((Gestor_Artigos) null, gestor_Utilizadores0, gestorEncomendas0, gestor_Transportadoras0, (Menu) null);
      Parsing parsing0 = new Parsing(vintage0, (Menu) null);
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        parsing0.venderTshit(882L, (LocalDate) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parsing parsing0 = new Parsing((Vintage) null, (Menu) null);
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        parsing0.venderSapatilha(1621L, (LocalDate) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parsing parsing0 = new Parsing((Vintage) null, (Menu) null);
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        parsing0.venderMala((-1968L), (LocalDate) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Menu menu0 = new Menu();
      Vintage vintage0 = new Vintage(gestor_Artigos0, (Gestor_Utilizadores) null, gestorEncomendas0, (Gestor_Transportadoras) null, menu0);
      Parsing parsing0 = new Parsing(vintage0, menu0);
      // Undeclared exception!
      try { 
        parsing0.leitura_ficheiro("5vT94{o", (LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Integer, Artigo> hashMap0 = new HashMap<Integer, Artigo>();
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos(hashMap0);
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras();
      Menu menu0 = new Menu();
      Vintage vintage0 = new Vintage(gestor_Artigos0, (Gestor_Utilizadores) null, gestorEncomendas0, gestor_Transportadoras0, menu0);
      Parsing parsing0 = new Parsing(vintage0, menu0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "%z*s_<it+(.1n8";
      // Undeclared exception!
      try { 
        parsing0.adicionar_comando(stringArray0, (LocalDate) null);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"%z*s_<it+(.1n8\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing((Vintage) null, menu0);
      String[] stringArray0 = new String[25];
      // Undeclared exception!
      try { 
        parsing0.adicionar_comando(stringArray0, (LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vintage vintage0 = new Vintage();
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing(vintage0, menu0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(3350L);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "2";
      // Undeclared exception!
      try { 
        parsing0.adicionar_comando(stringArray0, localDate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vintage vintage0 = new Vintage();
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing(vintage0, menu0);
      parsing0.setMenu(menu0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      Parsing parsing0 = new Parsing(vintage0, (Menu) null);
      Vintage vintage1 = parsing0.getVintage();
      assertEquals((-1L), vintage1.getUtilizador());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing((Vintage) null, menu0);
      Vintage vintage0 = Vintage.load();
      parsing0.setVintage(vintage0);
      assertEquals((-1L), vintage0.getUtilizador());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing((Vintage) null, menu0);
      Menu menu1 = parsing0.getMenu();
      assertSame(menu0, menu1);
  }
}
