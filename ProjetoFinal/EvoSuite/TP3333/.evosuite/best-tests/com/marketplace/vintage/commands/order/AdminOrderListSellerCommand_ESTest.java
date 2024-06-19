/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:44:22 GMT 2024
 */

package com.marketplace.vintage.commands.order;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.commands.order.AdminOrderListSellerCommand;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
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
import com.marketplace.vintage.utils.VintageDate;
import java.util.LinkedList;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AdminOrderListSellerCommand_ESTest extends AdminOrderListSellerCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      AdminOrderListSellerCommand adminOrderListSellerCommand0 = new AdminOrderListSellerCommand(vintage0);
      JavaLogger javaLogger0 = new JavaLogger();
      OnlyWarnLogger onlyWarnLogger0 = new OnlyWarnLogger(javaLogger0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        adminOrderListSellerCommand0.executeSafely(onlyWarnLogger0, stdinInputPrompter0, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.marketplace.vintage.commands.order.AdminOrderListSellerCommand", e);
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
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, (ParcelCarrierController) null, exp4jExpressionSolver0, userController0, (ScriptController) null);
      AdminOrderListSellerCommand adminOrderListSellerCommand0 = new AdminOrderListSellerCommand(vintage0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[1];
      JavaLogger javaLogger0 = new JavaLogger();
      adminOrderListSellerCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
      assertEquals("order listseller <seller username>", adminOrderListSellerCommand0.getUsage());
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
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, (ParcelCarrierController) null, exp4jExpressionSolver0, userController0, (ScriptController) null);
      AdminOrderListSellerCommand adminOrderListSellerCommand0 = new AdminOrderListSellerCommand(vintage0);
      userController0.createUser("0u$xZWAo2}I", "0u$xZWAo2}I", "0u$xZWAo2}I", "0u$xZWAo2}I", "0u$xZWAo2}I");
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "0u$xZWAo2}I";
      JavaLogger javaLogger0 = new JavaLogger();
      adminOrderListSellerCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
      assertEquals("listseller", adminOrderListSellerCommand0.getName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AdminOrderListSellerCommand adminOrderListSellerCommand0 = new AdminOrderListSellerCommand((Vintage) null);
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      Logger logger1 = PrefixLogger.of("6lTu!a=i?1TQ(S.5BR", logger0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator(0);
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(listIterator0);
      // Undeclared exception!
      try { 
        adminOrderListSellerCommand0.executeSafely(logger1, bufferedInputPrompter0, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.order.AdminOrderListSellerCommand", e);
      }
  }
}