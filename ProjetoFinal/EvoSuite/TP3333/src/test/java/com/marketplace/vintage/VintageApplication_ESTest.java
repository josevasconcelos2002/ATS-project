/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:48:20 GMT 2024
 */

package com.marketplace.vintage;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.VintageApplication;
import com.marketplace.vintage.persistent.PersistentManager;
import java.io.File;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VintageApplication_ESTest extends VintageApplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VintageApplication vintageApplication0 = new VintageApplication();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("scripts.txt");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Ziqs}iDCoT+Xwh");
      vintageApplication0.init();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VintageApplication vintageApplication0 = new VintageApplication();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("vintage_persistent_data.bin");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = vintageApplication0.getPersistentFile();
      assertEquals("vintage_persistent_data.bin", file0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("vintage_persistent_data.bin");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "parcelCarrierManager");
      VintageApplication vintageApplication0 = new VintageApplication();
      File file0 = vintageApplication0.getPersistentFile();
      assertEquals(21L, file0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SystemInUtil.addInputLine("exit");
      VintageApplication vintageApplication0 = new VintageApplication();
      vintageApplication0.init();
      // Undeclared exception!
      try { 
        vintageApplication0.start();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("com.marketplace.vintage.persistent.PersistentManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VintageApplication vintageApplication0 = new VintageApplication();
      // Undeclared exception!
      try { 
        vintageApplication0.shutdown();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.VintageApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VintageApplication vintageApplication0 = new VintageApplication();
      File file0 = vintageApplication0.getPersistentFile();
      PersistentManager persistentManager0 = new PersistentManager(file0);
      // Undeclared exception!
      try { 
        vintageApplication0.saveProgramState(persistentManager0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("com.marketplace.vintage.persistent.PersistentManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VintageApplication vintageApplication0 = new VintageApplication();
      MockFile mockFile0 = new MockFile("", "");
      PersistentManager persistentManager0 = new PersistentManager(mockFile0);
      vintageApplication0.loadSavedProgramState(persistentManager0);
  }

  /*
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VintageApplication vintageApplication0 = new VintageApplication();
      PersistentManager persistentManager0 = new PersistentManager((File) null);
      // Undeclared exception!
      try { 
        vintageApplication0.saveProgramState(persistentManager0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.persistent.PersistentManager", e);
      }
  }

   */

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VintageApplication vintageApplication0 = new VintageApplication();
      String string0 = vintageApplication0.buildAllViewsString();
      assertEquals("User (user), Admin (admin)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemInUtil.addInputLine("fxit");
      VintageApplication vintageApplication0 = new VintageApplication();
      // Undeclared exception!
      try { 
        vintageApplication0.start();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SystemInUtil.addInputLine("admin");
      VintageApplication vintageApplication0 = new VintageApplication();
      vintageApplication0.init();
      // Undeclared exception!
      try { 
        vintageApplication0.start();
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
      VintageApplication vintageApplication0 = new VintageApplication();
      vintageApplication0.init();
      // Undeclared exception!
      try { 
        vintageApplication0.shutdown();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Error in writing to file
         //
         verifyException("com.marketplace.vintage.persistent.PersistentManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SystemInUtil.addInputLine("exit");
      VintageApplication vintageApplication0 = new VintageApplication();
      // Undeclared exception!
      try { 
        vintageApplication0.start();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.VintageApplication", e);
      }
  }
}
