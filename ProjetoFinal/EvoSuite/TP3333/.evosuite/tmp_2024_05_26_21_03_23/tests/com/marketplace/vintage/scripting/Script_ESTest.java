/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 21:06:32 GMT 2024
 */

package com.marketplace.vintage.scripting;

import org.junit.Test;
import static org.junit.Assert.*;
import com.marketplace.vintage.scripting.Script;
import com.marketplace.vintage.utils.VintageDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Script_ESTest extends Script_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Script script0 = new Script((VintageDate) null, (String) null);
      String string0 = script0.getScriptText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      Script script0 = new Script(vintageDate0, "");
      String string0 = script0.getScriptText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      Script script0 = new Script(vintageDate0, "");
      VintageDate vintageDate1 = script0.getRunDate();
      assertSame(vintageDate1, vintageDate0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Script script0 = new Script((VintageDate) null, "54R4|d&");
      String string0 = script0.getScriptText();
      assertEquals("54R4|d&", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Script script0 = new Script((VintageDate) null, "54R4|d&");
      VintageDate vintageDate0 = script0.getRunDate();
      assertNull(vintageDate0);
  }
}
