/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 21:03:02 GMT 2024
 */

package com.marketplace.vintage.commands.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.commands.time.CurrentTimeCommand;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
import com.marketplace.vintage.input.impl.BufferedInputPrompter;
import com.marketplace.vintage.input.impl.StdinInputPrompter;
import com.marketplace.vintage.item.ItemController;
import com.marketplace.vintage.item.ItemFactory;
import com.marketplace.vintage.item.ItemManager;
import com.marketplace.vintage.logging.JavaLogger;
import com.marketplace.vintage.logging.Logger;
import com.marketplace.vintage.logging.OnlyWarnLogger;
import com.marketplace.vintage.order.OrderController;
import com.marketplace.vintage.scripting.ScriptController;
import com.marketplace.vintage.time.TimeManager;
import com.marketplace.vintage.user.UserController;
import com.marketplace.vintage.user.UserManager;
import com.marketplace.vintage.utils.VintageDate;
import java.util.LinkedList;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CurrentTimeCommand_ESTest extends CurrentTimeCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, 0);
      TimeManager timeManager0 = new TimeManager(vintageDate0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, (OrderController) null, timeManager0, (ParcelCarrierController) null, exp4jExpressionSolver0, userController0, scriptController0);
      CurrentTimeCommand currentTimeCommand0 = new CurrentTimeCommand(vintage0, (String) null);
      JavaLogger javaLogger0 = new JavaLogger();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(listIterator0);
      String[] stringArray0 = new String[6];
      currentTimeCommand0.executeSafely(javaLogger0, bufferedInputPrompter0, stringArray0);
      assertEquals(0, currentTimeCommand0.getMinArgs());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CurrentTimeCommand currentTimeCommand0 = new CurrentTimeCommand((Vintage) null, "");
      OnlyWarnLogger onlyWarnLogger0 = new OnlyWarnLogger((Logger) null);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        currentTimeCommand0.executeSafely(onlyWarnLogger0, stdinInputPrompter0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.time.CurrentTimeCommand", e);
      }
  }
}
