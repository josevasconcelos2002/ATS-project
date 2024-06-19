/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 21:09:41 GMT 2024
 */

package com.marketplace.vintage.commands.item.stock;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.command.ParentCommand;
import com.marketplace.vintage.commands.item.stock.ItemStockCommand;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
import com.marketplace.vintage.input.impl.StdinInputPrompter;
import com.marketplace.vintage.item.ItemController;
import com.marketplace.vintage.item.ItemFactory;
import com.marketplace.vintage.item.ItemManager;
import com.marketplace.vintage.logging.JavaLogger;
import com.marketplace.vintage.logging.OnlyWarnLogger;
import com.marketplace.vintage.order.OrderController;
import com.marketplace.vintage.order.OrderFactory;
import com.marketplace.vintage.order.OrderManager;
import com.marketplace.vintage.scripting.ScriptController;
import com.marketplace.vintage.time.TimeManager;
import com.marketplace.vintage.user.User;
import com.marketplace.vintage.user.UserController;
import com.marketplace.vintage.user.UserManager;
import com.marketplace.vintage.utils.VintageDate;
import com.marketplace.vintage.view.impl.UserView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ItemStockCommand_ESTest extends ItemStockCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParentCommand parentCommand0 = new ParentCommand("com.marketplace.vintage.view.impl.UserView", "com.marketplace.vintage.view.impl.UserView");
      ItemManager itemManager0 = new ItemManager();
      ItemController itemController0 = new ItemController(itemManager0, (ItemFactory) null);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      VintageDate vintageDate0 = VintageDate.of(10, 10, 10);
      TimeManager timeManager0 = new TimeManager(vintageDate0);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      ItemStockCommand itemStockCommand0 = new ItemStockCommand(parentCommand0, (UserView) null, vintage0);
      assertEquals("stock", itemStockCommand0.getName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      OnlyWarnLogger onlyWarnLogger0 = new OnlyWarnLogger(javaLogger0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      User user0 = new User("", "", "", "", "");
      UserView userView0 = new UserView(onlyWarnLogger0, stdinInputPrompter0, (Vintage) null, user0);
      ItemStockCommand itemStockCommand0 = null;
      try {
        itemStockCommand0 = new ItemStockCommand((ParentCommand) null, userView0, (Vintage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.command.ParentCommand", e);
      }
  }
}
