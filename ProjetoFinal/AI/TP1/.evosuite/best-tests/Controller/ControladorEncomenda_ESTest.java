/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 14:50:38 GMT 2024
 */

package Controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Controller.ControladorEncomenda;
import Model.Vintage;
import View.Apresentacao;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControladorEncomenda_ESTest extends ControladorEncomenda_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      Apresentacao apresentacao0 = new Apresentacao();
      SystemInUtil.addInputLine("14");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        controladorEncomenda0.adicionarArtigo(apresentacao0, linkedList1, linkedList0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      Apresentacao apresentacao0 = new Apresentacao();
      SystemInUtil.addInputLine("14");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1));
      linkedList0.addFirst(integer0);
      Integer integer1 = Integer.decode("14");
      linkedList0.add(integer1);
      controladorEncomenda0.removerArtigo(apresentacao0, linkedList0);
      assertFalse(linkedList0.contains(integer1));
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        controladorEncomenda0.removerArtigo((Apresentacao) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      Apresentacao apresentacao0 = new Apresentacao();
      // Undeclared exception!
      try { 
        controladorEncomenda0.interpretadorDevolver(apresentacao0, (Vintage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.ControladorEncomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      // Undeclared exception!
      try { 
        controladorEncomenda0.interpretadorAdiar((Apresentacao) null, (Vintage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.ControladorEncomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      Apresentacao apresentacao0 = new Apresentacao();
      // Undeclared exception!
      try { 
        controladorEncomenda0.interpretador(apresentacao0, (Vintage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.ControladorEncomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        controladorEncomenda0.adicionarArtigo((Apresentacao) null, linkedList0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      Apresentacao apresentacao0 = new Apresentacao();
      Vintage vintage0 = new Vintage();
      controladorEncomenda0.interpretadorAdiar(apresentacao0, vintage0);
      assertNull(vintage0.getSessaoAtual());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      Apresentacao apresentacao0 = new Apresentacao();
      Vintage vintage0 = new Vintage();
      controladorEncomenda0.interpretadorDevolver(apresentacao0, vintage0);
      assertNull(vintage0.getSessaoAtual());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      Apresentacao apresentacao0 = new Apresentacao();
      Vintage vintage0 = new Vintage();
      controladorEncomenda0.interpretador(apresentacao0, vintage0);
      assertNull(vintage0.getSessaoAtual());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Apresentacao apresentacao0 = new Apresentacao();
      SystemInUtil.addInputLine("14");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      // Undeclared exception!
      try { 
        controladorEncomenda0.removerArtigo(apresentacao0, linkedList0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      Apresentacao apresentacao0 = new Apresentacao();
      SystemInUtil.addInputLine("14");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = Integer.decode("14");
      linkedList0.add(integer0);
      controladorEncomenda0.removerArtigo(apresentacao0, linkedList0);
      assertFalse(linkedList0.contains(integer0));
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      Apresentacao apresentacao0 = new Apresentacao();
      SystemInUtil.addInputLine("14");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = Integer.valueOf("14");
      linkedList0.add(integer0);
      // Undeclared exception!
      try { 
        controladorEncomenda0.adicionarArtigo(apresentacao0, linkedList0, linkedList0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ControladorEncomenda controladorEncomenda0 = new ControladorEncomenda();
      Apresentacao apresentacao0 = new Apresentacao();
      SystemInUtil.addInputLine("14");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = Integer.valueOf("14");
      linkedList0.add(integer0);
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      controladorEncomenda0.adicionarArtigo(apresentacao0, linkedList1, linkedList0);
      assertEquals(1, linkedList0.size());
      assertTrue(linkedList0.equals((Object)linkedList1));
  }
}
