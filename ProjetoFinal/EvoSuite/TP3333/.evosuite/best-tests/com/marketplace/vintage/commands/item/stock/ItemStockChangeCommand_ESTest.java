/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:42:56 GMT 2024
 */

package com.marketplace.vintage.commands.item.stock;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.commands.item.stock.ItemStockAddCommand;
import com.marketplace.vintage.commands.item.stock.ItemStockRemoveCommand;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
import com.marketplace.vintage.expression.ExpressionSolver;
import com.marketplace.vintage.input.InputPrompter;
import com.marketplace.vintage.input.impl.BufferedInputPrompter;
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
import com.marketplace.vintage.user.User;
import com.marketplace.vintage.user.UserController;
import com.marketplace.vintage.user.UserManager;
import com.marketplace.vintage.utils.VintageDate;
import com.marketplace.vintage.view.ViewFactory;
import com.marketplace.vintage.view.impl.UserView;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ItemStockChangeCommand_ESTest extends ItemStockChangeCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      OnlyWarnLogger onlyWarnLogger0 = new OnlyWarnLogger(javaLogger0);
      User user0 = new User((UUID) null, "-%N|`y'U6n", "-%N|`y'U6n", "' does not exist", "'", "-%N|`y'U6n");
      UserView userView0 = new UserView(onlyWarnLogger0, (InputPrompter) null, (Vintage) null, user0);
      ItemStockAddCommand itemStockAddCommand0 = new ItemStockAddCommand(userView0, (Vintage) null);
      Vintage vintage0 = itemStockAddCommand0.getVintage();
      assertNull(vintage0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      VintageDate vintageDate0 = VintageDate.of(7, 7, 800);
      TimeManager timeManager0 = new TimeManager(vintageDate0);
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController((ParcelCarrierManager) null);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, parcelCarrierController0, exp4jExpressionSolver0, (UserController) null, scriptController0);
      ItemStockRemoveCommand itemStockRemoveCommand0 = new ItemStockRemoveCommand((UserView) null, vintage0);
      Vintage vintage1 = itemStockRemoveCommand0.getVintage();
      assertSame(vintage0, vintage1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = PrefixLogger.of("", javaLogger0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(listIterator0);
      UUID uUID0 = MockUUID.randomUUID();
      User user0 = new User(uUID0, "", "", "RrH", "RrH", "Stock '");
      UserView userView0 = new UserView(logger0, bufferedInputPrompter0, (Vintage) null, user0);
      ItemStockAddCommand itemStockAddCommand0 = new ItemStockAddCommand(userView0, (Vintage) null);
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        itemStockAddCommand0.executeSafely(javaLogger0, bufferedInputPrompter0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.item.stock.ItemStockChangeCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      ItemManager itemManager0 = new ItemManager();
      ItemController itemController0 = new ItemController(itemManager0, (ItemFactory) null);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      VintageDate vintageDate0 = VintageDate.of(10, 10, 10);
      TimeManager timeManager0 = new TimeManager(vintageDate0);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, parcelCarrierController0, (ExpressionSolver) null, userController0, scriptController0);
      ViewFactory viewFactory0 = new ViewFactory(javaLogger0, (InputPrompter) null, vintage0);
      User user0 = vintage0.createUser("=ujLm^7~34c5ZsM", "=ujLm^7~34c5ZsM", "=ujLm^7~34c5ZsM", "=ujLm^7~34c5ZsM", "=ujLm^7~34c5ZsM");
      UserView userView0 = viewFactory0.createUserView(user0);
      ItemStockRemoveCommand itemStockRemoveCommand0 = new ItemStockRemoveCommand(userView0, vintage0);
      String[] stringArray0 = new String[27];
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      itemStockRemoveCommand0.executeSafely(logger0, (InputPrompter) null, stringArray0);
      assertEquals(27, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderManager orderManager0 = new OrderManager();
      OrderController orderController0 = new OrderController(orderManager0, (OrderFactory) null);
      TimeManager timeManager0 = new TimeManager((VintageDate) null);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      ItemStockAddCommand itemStockAddCommand0 = new ItemStockAddCommand((UserView) null, vintage0);
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(listIterator0);
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        itemStockAddCommand0.executeSafely(logger0, bufferedInputPrompter0, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.marketplace.vintage.commands.item.stock.ItemStockChangeCommand", e);
      }
  }
}
