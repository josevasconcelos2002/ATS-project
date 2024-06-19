/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 14:54:18 GMT 2024
 */

package Files;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Files.Estados;
import Model.Vintage;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamCorruptedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Estados_ESTest extends Estados_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Estados estados0 = new Estados();
      Vintage vintage0 = new Vintage();
      int int0 = estados0.dadosGuardar("", vintage0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Estados estados0 = new Estados();
      estados0.dadosGuardar("Premium: ", (Vintage) null);
      Vintage vintage0 = estados0.dadoscarregar("Premium: ");
      assertNull(vintage0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Estados estados0 = new Estados();
      // Undeclared exception!
      try { 
        estados0.dadoscarregar((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Estados estados0 = new Estados();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Files.Estados");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      try { 
        estados0.dadoscarregar("Files.Estados");
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 00000000
         //
         verifyException("java.io.ObjectInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Estados estados0 = new Estados();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Files.Estados");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        estados0.dadoscarregar("Files.Estados");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Estados estados0 = new Estados();
      Vintage vintage0 = new Vintage();
      estados0.dadosGuardar("2z9RuFgTyw?Irqs(1", vintage0);
      try { 
        estados0.dadoscarregar("2z9RuFgTyw?Irqs(1");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ObjectInputStream$BlockDataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Estados estados0 = new Estados();
      Vintage vintage0 = new Vintage();
      // Undeclared exception!
      try { 
        estados0.dadosGuardar((String) null, vintage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Estados estados0 = new Estados();
      try { 
        estados0.dadoscarregar("Files.Estados");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
}
