/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:42:09 GMT 2024
 */

package com.marketplace.vintage.commands.carrier;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.NormalParcelCarrier;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.carrier.PremiumParcelCarrier;
import com.marketplace.vintage.commands.carrier.ParcelCarrierListCommand;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
import com.marketplace.vintage.expression.ExpressionSolver;
import com.marketplace.vintage.input.InputPrompter;
import com.marketplace.vintage.input.impl.BufferedInputPrompter;
import com.marketplace.vintage.input.impl.StdinInputPrompter;
import com.marketplace.vintage.item.ItemController;
import com.marketplace.vintage.item.ItemFactory;
import com.marketplace.vintage.item.ItemManager;
import com.marketplace.vintage.logging.JavaLogger;
import com.marketplace.vintage.logging.Logger;
import com.marketplace.vintage.logging.OnlyWarnLogger;
import com.marketplace.vintage.logging.PrefixLogger;
import com.marketplace.vintage.order.OrderController;
import com.marketplace.vintage.order.OrderFactory;
import com.marketplace.vintage.order.OrderManager;
import com.marketplace.vintage.scripting.ScriptController;
import com.marketplace.vintage.time.TimeManager;
import com.marketplace.vintage.user.UserController;
import com.marketplace.vintage.user.UserManager;
import java.util.Iterator;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParcelCarrierListCommand_ESTest extends ParcelCarrierListCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController((OrderManager) null, orderFactory0);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, (TimeManager) null, parcelCarrierController0, (ExpressionSolver) null, userController0, scriptController0);
      ParcelCarrierListCommand parcelCarrierListCommand0 = new ParcelCarrierListCommand(vintage0);
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      Logger logger1 = PrefixLogger.of(" +glbz`9u|K5B4s!o6", logger0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      parcelCarrierListCommand0.executeSafely(logger1, stdinInputPrompter0, (String[]) null);
      assertEquals("list", parcelCarrierListCommand0.getName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
      ParcelCarrierListCommand parcelCarrierListCommand0 = new ParcelCarrierListCommand(vintage0);
      JavaLogger javaLogger0 = new JavaLogger();
      OnlyWarnLogger onlyWarnLogger0 = new OnlyWarnLogger(javaLogger0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("NKZTWkfq*.y7c-#I.", "NKZTWkfq*.y7c-#I.");
      vintage0.registerParcelCarrier(premiumParcelCarrier0);
      Iterator<String> iterator0 = linkedList0.descendingIterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(iterator0);
      parcelCarrierListCommand0.executeSafely(onlyWarnLogger0, bufferedInputPrompter0, (String[]) null);
      assertEquals("list", parcelCarrierListCommand0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
      ScriptController scriptController0 = new ScriptController();
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      NormalParcelCarrier normalParcelCarrier0 = new NormalParcelCarrier("\"{MN\"UZ4t.v5", "\"{MN\"UZ4t.v5");
      parcelCarrierController0.registerParcelCarrier(normalParcelCarrier0);
      String[] stringArray0 = new String[3];
      Vintage vintage0 = new Vintage(itemController0, orderController0, (TimeManager) null, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      ParcelCarrierListCommand parcelCarrierListCommand0 = new ParcelCarrierListCommand(vintage0);
      parcelCarrierListCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
      assertEquals(0, parcelCarrierListCommand0.getMinArgs());
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
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, (TimeManager) null, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      ParcelCarrierListCommand parcelCarrierListCommand0 = new ParcelCarrierListCommand(vintage0);
      // Undeclared exception!
      try { 
        parcelCarrierListCommand0.executeSafely((Logger) null, (InputPrompter) null, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.carrier.ParcelCarrierListCommand", e);
      }
  }
}