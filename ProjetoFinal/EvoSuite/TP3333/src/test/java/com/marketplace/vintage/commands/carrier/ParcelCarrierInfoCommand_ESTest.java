/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:59:16 GMT 2024
 */

package com.marketplace.vintage.commands.carrier;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.carrier.PremiumParcelCarrier;
import com.marketplace.vintage.commands.carrier.ParcelCarrierInfoCommand;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
import com.marketplace.vintage.input.InputPrompter;
import com.marketplace.vintage.input.impl.StdinInputPrompter;
import com.marketplace.vintage.item.ItemController;
import com.marketplace.vintage.item.ItemFactory;
import com.marketplace.vintage.item.ItemManager;
import com.marketplace.vintage.logging.JavaLogger;
import com.marketplace.vintage.logging.Logger;
import com.marketplace.vintage.logging.OnlyWarnLogger;
import com.marketplace.vintage.order.OrderController;
import com.marketplace.vintage.order.OrderFactory;
import com.marketplace.vintage.order.OrderManager;
import com.marketplace.vintage.scripting.ScriptController;
import com.marketplace.vintage.time.TimeManager;
import com.marketplace.vintage.user.UserController;
import com.marketplace.vintage.user.UserManager;
import com.marketplace.vintage.utils.VintageDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParcelCarrierInfoCommand_ESTest extends ParcelCarrierInfoCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParcelCarrierInfoCommand parcelCarrierInfoCommand0 = new ParcelCarrierInfoCommand((Vintage) null);
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        parcelCarrierInfoCommand0.executeSafely((Logger) null, (InputPrompter) null, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.marketplace.vintage.commands.carrier.ParcelCarrierInfoCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      TimeManager timeManager0 = new TimeManager((VintageDate) null);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, parcelCarrierController0, exp4jExpressionSolver0, (UserController) null, scriptController0);
      ParcelCarrierInfoCommand parcelCarrierInfoCommand0 = new ParcelCarrierInfoCommand(vintage0);
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[1];
      parcelCarrierInfoCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
      assertEquals("info", parcelCarrierInfoCommand0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      TimeManager timeManager0 = new TimeManager((VintageDate) null);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, parcelCarrierController0, exp4jExpressionSolver0, (UserController) null, scriptController0);
      ParcelCarrierInfoCommand parcelCarrierInfoCommand0 = new ParcelCarrierInfoCommand(vintage0);
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "com.marketplace.vintage.order.OrderFactory";
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("com.marketplace.vintage.order.OrderFactory", (String) null);
      parcelCarrierManager0.registerParcelCarrier(premiumParcelCarrier0);
      parcelCarrierInfoCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
      assertEquals("carrier info <name>", parcelCarrierInfoCommand0.getUsage());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      Vintage vintage0 = new Vintage(itemController0, orderController0, (TimeManager) null, parcelCarrierController0, exp4jExpressionSolver0, userController0, (ScriptController) null);
      ParcelCarrierInfoCommand parcelCarrierInfoCommand0 = new ParcelCarrierInfoCommand(vintage0);
      Logger logger0 = OnlyWarnLogger.of((Logger) null);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        parcelCarrierInfoCommand0.executeSafely(logger0, stdinInputPrompter0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.logging.OnlyWarnLogger", e);
      }
  }
}