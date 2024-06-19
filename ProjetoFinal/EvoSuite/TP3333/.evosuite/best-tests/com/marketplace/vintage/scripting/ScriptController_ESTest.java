/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:40:39 GMT 2024
 */

package com.marketplace.vintage.scripting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.input.impl.StdinInputPrompter;
import com.marketplace.vintage.logging.JavaLogger;
import com.marketplace.vintage.scripting.ScriptController;
import com.marketplace.vintage.utils.VintageDate;
import com.marketplace.vintage.view.ViewFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScriptController_ESTest extends ScriptController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScriptController scriptController0 = new ScriptController();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("scripts.txt");
      FileSystemHandling.createFolder(evoSuiteFile0);
      // Undeclared exception!
      try { 
        scriptController0.loadScripts();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Couldn't read scripts file: scripts.txt
         //
         verifyException("com.marketplace.vintage.scripting.ScriptLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      ScriptController scriptController0 = new ScriptController();
      // Undeclared exception!
      try { 
        scriptController0.notifyTimeChange(javaLogger0, (VintageDate) null, (VintageDate) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // ScriptController not initialized. Call ScriptController.initialize() first.
         //
         verifyException("com.marketplace.vintage.scripting.ScriptController", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ScriptController scriptController0 = new ScriptController();
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      ViewFactory viewFactory0 = new ViewFactory(javaLogger0, stdinInputPrompter0, (Vintage) null);
      scriptController0.initialize(javaLogger0, viewFactory0, (Vintage) null);
      scriptController0.notifyTimeChange(javaLogger0, (VintageDate) null, (VintageDate) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScriptController scriptController0 = new ScriptController();
      int int0 = scriptController0.loadScripts();
      assertEquals(0, int0);
  }
}
