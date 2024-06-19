/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 21:00:36 GMT 2024
 */

package com.marketplace.vintage.view;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.command.CommandManager;
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
import com.marketplace.vintage.user.User;
import com.marketplace.vintage.user.UserController;
import com.marketplace.vintage.user.UserManager;
import com.marketplace.vintage.utils.VintageDate;
import com.marketplace.vintage.view.ViewFactory;
import com.marketplace.vintage.view.impl.AdminView;
import com.marketplace.vintage.view.impl.UserView;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseView_ESTest extends BaseView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SystemInUtil.addInputLine("");
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
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
      AdminView adminView0 = new AdminView(logger0, stdinInputPrompter0, vintage0);
      // Undeclared exception!
      try { 
        adminView0.run();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      SystemInUtil.addInputLine("carrier info <name>");
      AdminView adminView0 = new AdminView(javaLogger0, stdinInputPrompter0, (Vintage) null);
      // Undeclared exception!
      try { 
        adminView0.run();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      OrderManager orderManager0 = new OrderManager();
      OrderController orderController0 = new OrderController(orderManager0, (OrderFactory) null);
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController((ParcelCarrierManager) null);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      Vintage vintage0 = new Vintage(itemController0, orderController0, (TimeManager) null, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      AdminView adminView0 = new AdminView((Logger) null, stdinInputPrompter0, vintage0);
      Logger logger0 = adminView0.getLogger();
      assertNull(logger0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, (OrderController) null, (TimeManager) null, (ParcelCarrierController) null, exp4jExpressionSolver0, userController0, scriptController0);
      User user0 = userManager0.createUser("com.marketplace.vintage.view.BaseView", "com.marketplace.vintage.view.BaseView", "com.marketplace.vintage.view.BaseView", "com.marketplace.vintage.view.BaseView", "");
      UserView userView0 = new UserView(javaLogger0, stdinInputPrompter0, vintage0, user0);
      InputPrompter inputPrompter0 = userView0.getInputPrompter();
      assertSame(inputPrompter0, stdinInputPrompter0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(listIterator0);
      linkedList0.add("");
      AdminView adminView0 = new AdminView(javaLogger0, bufferedInputPrompter0, (Vintage) null);
      // Undeclared exception!
      try { 
        adminView0.run();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdminView adminView0 = new AdminView((Logger) null, (InputPrompter) null, (Vintage) null);
      // Undeclared exception!
      try { 
        adminView0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.view.impl.AdminView", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      stdinInputPrompter0.close();
      AdminView adminView0 = new AdminView(javaLogger0, stdinInputPrompter0, (Vintage) null);
      // Undeclared exception!
      try { 
        adminView0.run();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = PrefixLogger.of("", javaLogger0);
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController((ItemManager) null, itemFactory0);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      VintageDate vintageDate0 = VintageDate.of(3, 3, 3);
      TimeManager timeManager0 = new TimeManager(vintageDate0);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      AdminView adminView0 = new AdminView(logger0, (InputPrompter) null, vintage0);
      Logger logger1 = adminView0.getLogger();
      assertSame(logger0, logger1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = PrefixLogger.of("", javaLogger0);
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController((ItemManager) null, itemFactory0);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      VintageDate vintageDate0 = VintageDate.of(3, 3, 3);
      TimeManager timeManager0 = new TimeManager(vintageDate0);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      AdminView adminView0 = new AdminView(logger0, (InputPrompter) null, vintage0);
      InputPrompter inputPrompter0 = adminView0.getInputPrompter();
      assertNull(inputPrompter0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Logger logger0 = OnlyWarnLogger.of((Logger) null);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      AdminView adminView0 = new AdminView(logger0, stdinInputPrompter0, (Vintage) null);
      CommandManager commandManager0 = adminView0.getCommandManager();
      assertNotNull(commandManager0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      AdminView adminView0 = new AdminView(javaLogger0, stdinInputPrompter0, (Vintage) null);
      adminView0.setLogger(javaLogger0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      AdminView adminView0 = new AdminView(javaLogger0, stdinInputPrompter0, (Vintage) null);
      adminView0.setShouldExit();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator(0);
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(listIterator0);
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      UserController userController0 = new UserController((UserManager) null);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, (TimeManager) null, parcelCarrierController0, (ExpressionSolver) null, userController0, scriptController0);
      ViewFactory viewFactory0 = new ViewFactory(javaLogger0, bufferedInputPrompter0, vintage0);
      User user0 = new User("lS", "sq>MGM", "lS", "lS", "ParcelCarrier{name='");
      UserView userView0 = viewFactory0.createUserView(user0);
      // Undeclared exception!
      try { 
        userView0.run();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No more input available
         //
         verifyException("com.marketplace.vintage.input.impl.BufferedInputPrompter", e);
      }
  }
}
