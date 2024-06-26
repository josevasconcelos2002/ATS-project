/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:11:02 GMT 2024
 */

package com.marketplace.vintage.commands.item;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.commands.item.ItemCreateCommand;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
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
import com.marketplace.vintage.view.ViewFactory;
import com.marketplace.vintage.view.impl.UserView;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ItemCreateCommand_ESTest extends ItemCreateCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = PrefixLogger.of("Insert the item color:", javaLogger0);
      OnlyWarnLogger onlyWarnLogger0 = new OnlyWarnLogger(logger0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Iterator<String> iterator0 = linkedList0.iterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(iterator0);
      User user0 = new User("Insert the item color:", "Insert the item color:", "Insert the item color:", "Insert the item color:", "Insert the item parcel carier to use:");
      UserView userView0 = new UserView(onlyWarnLogger0, bufferedInputPrompter0, (Vintage) null, user0);
      ItemCreateCommand itemCreateCommand0 = new ItemCreateCommand(userView0, (Vintage) null);
      String[] stringArray0 = new String[2];
      linkedList0.add("Insert the item parcel carier to use:");
      // Undeclared exception!
      try { 
        itemCreateCommand0.executeSafely(javaLogger0, bufferedInputPrompter0, stringArray0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      OnlyWarnLogger onlyWarnLogger0 = new OnlyWarnLogger(javaLogger0);
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      User user0 = userController0.createUser("T6wxU", "T6wxU", "T6wxU", "T6wxU", "T6wxU");
      UserView userView0 = new UserView(onlyWarnLogger0, (InputPrompter) null, (Vintage) null, user0);
      ItemCreateCommand itemCreateCommand0 = new ItemCreateCommand(userView0, (Vintage) null);
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        itemCreateCommand0.executeSafely(onlyWarnLogger0, (InputPrompter) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.item.ItemCreateCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      ItemCreateCommand itemCreateCommand0 = new ItemCreateCommand((UserView) null, (Vintage) null);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      stdinInputPrompter0.close();
      // Undeclared exception!
      try { 
        itemCreateCommand0.executeSafely(javaLogger0, stdinInputPrompter0, (String[]) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Iterator<String> iterator0 = linkedList0.iterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(iterator0);
      ViewFactory viewFactory0 = new ViewFactory(javaLogger0, bufferedInputPrompter0, (Vintage) null);
      UUID uUID0 = MockUUID.fromString("`mW_{wXvR6zX)]:jm,");
      User user0 = new User(uUID0, "j|PmxFL6", "`mW_{wXvR6zX)]:jm,", "`mW_{wXvR6zX)]:jm,", "h[f5r~Xd", "");
      UserView userView0 = viewFactory0.createUserView(user0);
      ItemCreateCommand itemCreateCommand0 = new ItemCreateCommand(userView0, (Vintage) null);
      // Undeclared exception!
      try { 
        itemCreateCommand0.executeSafely(javaLogger0, bufferedInputPrompter0, (String[]) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No more input available
         //
         verifyException("com.marketplace.vintage.input.impl.BufferedInputPrompter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
      ItemCreateCommand itemCreateCommand0 = new ItemCreateCommand((UserView) null, vintage0);
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        itemCreateCommand0.executeSafely(logger0, stdinInputPrompter0, stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }
}
