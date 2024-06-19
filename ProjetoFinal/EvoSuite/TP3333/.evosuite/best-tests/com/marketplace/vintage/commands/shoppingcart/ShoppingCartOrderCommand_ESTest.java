/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:33:27 GMT 2024
 */

package com.marketplace.vintage.commands.shoppingcart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.commands.shoppingcart.ShoppingCartOrderCommand;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
import com.marketplace.vintage.input.InputPrompter;
import com.marketplace.vintage.input.impl.StdinInputPrompter;
import com.marketplace.vintage.item.ItemController;
import com.marketplace.vintage.item.ItemFactory;
import com.marketplace.vintage.item.ItemManager;
import com.marketplace.vintage.logging.JavaLogger;
import com.marketplace.vintage.order.OrderController;
import com.marketplace.vintage.order.OrderFactory;
import com.marketplace.vintage.order.OrderManager;
import com.marketplace.vintage.scripting.ScriptController;
import com.marketplace.vintage.time.TimeManager;
import com.marketplace.vintage.user.User;
import com.marketplace.vintage.user.UserController;
import com.marketplace.vintage.user.UserManager;
import com.marketplace.vintage.view.ViewFactory;
import com.marketplace.vintage.view.impl.UserView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShoppingCartOrderCommand_ESTest extends ShoppingCartOrderCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      ViewFactory viewFactory0 = new ViewFactory(javaLogger0, (InputPrompter) null, (Vintage) null);
      User user0 = new User(": ", ": ", "CI~", "CI~", "lW-dRk_&HA$n");
      UserView userView0 = viewFactory0.createUserView(user0);
      ShoppingCartOrderCommand shoppingCartOrderCommand0 = new ShoppingCartOrderCommand(userView0, (Vintage) null);
      user0.addItemToShoppingCart(": ");
      // Undeclared exception!
      try { 
        shoppingCartOrderCommand0.executeSafely(javaLogger0, (InputPrompter) null, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.shoppingcart.ShoppingCartOrderCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      User user0 = new User("!EGD4\"", "!EGD4\"", "!EGD4\"", "!EGD4\"", "!EGD4\"");
      String[] stringArray0 = new String[31];
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      UserView userView0 = new UserView(javaLogger0, stdinInputPrompter0, (Vintage) null, user0);
      ShoppingCartOrderCommand shoppingCartOrderCommand0 = new ShoppingCartOrderCommand(userView0, (Vintage) null);
      shoppingCartOrderCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
      assertEquals("order", shoppingCartOrderCommand0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      User user0 = new User(": ", ": ", "", "", ": ");
      user0.addItemToShoppingCart("");
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
      ViewFactory viewFactory0 = new ViewFactory(javaLogger0, (InputPrompter) null, vintage0);
      UserView userView0 = viewFactory0.createUserView(user0);
      ShoppingCartOrderCommand shoppingCartOrderCommand0 = new ShoppingCartOrderCommand(userView0, vintage0);
      // Undeclared exception!
      try { 
        shoppingCartOrderCommand0.executeSafely(javaLogger0, (InputPrompter) null, (String[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with the id  was not found
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }
}