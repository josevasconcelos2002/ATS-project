/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 21:06:44 GMT 2024
 */

package com.marketplace.vintage.scripting.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import com.marketplace.vintage.scripting.exception.ScriptParseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScriptParseException_ESTest extends ScriptParseException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScriptParseException scriptParseException0 = new ScriptParseException("com.marketplace.vintage.scripting.exception.ScriptParseException");
  }
}
