/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 21:11:58 GMT 2024
 */

package com.marketplace.vintage.commands.item;

import org.junit.Test;
import static org.junit.Assert.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.commands.item.AdminItemCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AdminItemCommand_ESTest extends AdminItemCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdminItemCommand adminItemCommand0 = new AdminItemCommand((Vintage) null);
      assertEquals(1, adminItemCommand0.getMinArgs());
  }
}
