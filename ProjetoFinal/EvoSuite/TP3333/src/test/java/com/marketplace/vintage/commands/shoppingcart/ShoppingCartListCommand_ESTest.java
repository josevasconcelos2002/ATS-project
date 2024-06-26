/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:50:58 GMT 2024
 */

package com.marketplace.vintage.commands.shoppingcart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
import com.marketplace.vintage.input.impl.StdinInputPrompter;
import com.marketplace.vintage.item.ItemController;
import com.marketplace.vintage.item.ItemFactory;
import com.marketplace.vintage.item.ItemManager;
import com.marketplace.vintage.item.condition.UsedItemCondition;
import com.marketplace.vintage.logging.JavaLogger;
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
import impl.SapatilhasItem;
import java.math.BigDecimal;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShoppingCartListCommand_ESTest extends ShoppingCartListCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      User user0 = new User("", "r74]d v&LU", "l&Wm'j", "r74]d v&LU", "l&Wm'j");
      user0.addItemToShoppingCart("@]#31Hd<bpk");
      UserView userView0 = new UserView(javaLogger0, stdinInputPrompter0, (Vintage) null, user0);
      ShoppingCartListCommand shoppingCartListCommand0 = new ShoppingCartListCommand(userView0, (Vintage) null);
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        shoppingCartListCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.shoppingcart.ShoppingCartListCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      User user0 = new User("%#02d/%2d/%04d", "%#02d/%2d/%04d", "%#02d/%2d/%04d", "%#02d/%2d/%04d", "%#02d/%2d/%04d");
      String[] stringArray0 = new String[7];
      user0.addItemToShoppingCart("%#02d/%2d/%04d");
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController((OrderManager) null, orderFactory0);
      VintageDate vintageDate0 = VintageDate.of(4, 4, 4);
      TimeManager timeManager0 = new TimeManager(vintageDate0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(4, 4);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "%#02d/%2d/%04d", 4, usedItemCondition0, "%#02d/%2d/%04d", "%#02d/%2d/%04d", bigDecimal0, "%#02d/%2d/%04d", 4, true, "%#02d/%2d/%04d", 4);
      itemManager0.registerItem(sapatilhasItem0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, (ParcelCarrierController) null, exp4jExpressionSolver0, userController0, scriptController0);
      UserView userView0 = new UserView(javaLogger0, stdinInputPrompter0, vintage0, user0);
      ShoppingCartListCommand shoppingCartListCommand0 = new ShoppingCartListCommand(userView0, vintage0);
      shoppingCartListCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
      assertEquals(0, shoppingCartListCommand0.getMinArgs());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      User user0 = new User("\"F S81a-s|", "\"F S81a-s|", "\"F S81a-s|", "\"F S81a-s|", "\"F S81a-s|");
      UserView userView0 = new UserView(javaLogger0, stdinInputPrompter0, (Vintage) null, user0);
      ShoppingCartListCommand shoppingCartListCommand0 = new ShoppingCartListCommand(userView0, (Vintage) null);
      String[] stringArray0 = new String[10];
      shoppingCartListCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
      assertEquals(0, shoppingCartListCommand0.getMinArgs());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      User user0 = new User("%#02d/%2d/%04d", "%#02d/%2d/%04d", "%#02d/%2d/%04d", "%#02d/%2d/%04d", "%#02d/%2d/%04d");
      String[] stringArray0 = new String[7];
      user0.addItemToShoppingCart("%#02d/%2d/%04d");
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController((OrderManager) null, orderFactory0);
      VintageDate vintageDate0 = VintageDate.of(4, 4, 4);
      TimeManager timeManager0 = new TimeManager(vintageDate0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, (ParcelCarrierController) null, exp4jExpressionSolver0, userController0, scriptController0);
      UserView userView0 = new UserView(javaLogger0, stdinInputPrompter0, vintage0, user0);
      ShoppingCartListCommand shoppingCartListCommand0 = new ShoppingCartListCommand(userView0, vintage0);
      // Undeclared exception!
      try { 
        shoppingCartListCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with the id %#02d/%2d/%04d was not found
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }
}
