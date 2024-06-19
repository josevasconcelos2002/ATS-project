/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:58:56 GMT 2024
 */

package com.marketplace.vintage.view.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
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
import com.marketplace.vintage.user.User;
import com.marketplace.vintage.user.UserController;
import com.marketplace.vintage.user.UserManager;
import com.marketplace.vintage.view.ViewFactory;
import com.marketplace.vintage.view.impl.UserView;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserView_ESTest extends UserView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(listIterator0);
      ItemManager itemManager0 = new ItemManager();
      ItemController itemController0 = new ItemController(itemManager0, (ItemFactory) null);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      linkedList0.add("4:{c;gpBdr");
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, (TimeManager) null, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      ViewFactory viewFactory0 = new ViewFactory(javaLogger0, bufferedInputPrompter0, vintage0);
      User user0 = userManager0.createUser("!D^mM^TJ", ")Ls}.;;V8{23|NnS", ")*40+I(Jow,}", "!D^mM^TJ", ")Ls}.;;V8{23|NnS");
      UserView userView0 = viewFactory0.createUserView(user0);
      // Undeclared exception!
      try { 
        userView0.run();
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
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(listIterator0);
      User user0 = new User("", "", "", "", "");
      UserView userView0 = new UserView((Logger) null, bufferedInputPrompter0, (Vintage) null, user0);
      // Undeclared exception!
      try { 
        userView0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.logging.PrefixLogger", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      OnlyWarnLogger onlyWarnLogger0 = new OnlyWarnLogger(javaLogger0);
      Logger logger0 = PrefixLogger.of("h17LqE]R6`", onlyWarnLogger0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      ViewFactory viewFactory0 = new ViewFactory(logger0, stdinInputPrompter0, (Vintage) null);
      UserManager userManager0 = new UserManager();
      User user0 = userManager0.createUser("\"f", "\"f", "\"f", "Couldn't read scripts file: ", "\"f");
      stdinInputPrompter0.close();
      UserView userView0 = viewFactory0.createUserView(user0);
      // Undeclared exception!
      try { 
        userView0.run();
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
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      UserView userView0 = null;
      try {
        userView0 = new UserView(javaLogger0, stdinInputPrompter0, (Vintage) null, (User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.view.impl.UserView", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      User user0 = new User("]1JrYOC3", "]1JrYOC3", "]1JrYOC3", "]1JrYOC3", "]1JrYOC3");
      JavaLogger javaLogger0 = new JavaLogger();
      UserView userView0 = new UserView(javaLogger0, stdinInputPrompter0, (Vintage) null, user0);
      // Undeclared exception!
      try { 
        userView0.run();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      OnlyWarnLogger onlyWarnLogger0 = new OnlyWarnLogger(javaLogger0);
      Logger logger0 = PrefixLogger.of("h17LqE]R6`", onlyWarnLogger0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      ViewFactory viewFactory0 = new ViewFactory(logger0, stdinInputPrompter0, (Vintage) null);
      UserManager userManager0 = new UserManager();
      User user0 = userManager0.createUser("\"f", "\"f", "\"f", "Couldn't read scripts file: ", "\"f");
      UserView userView0 = viewFactory0.createUserView(user0);
      User user1 = userView0.getCurrentLoggedInUser();
      assertEquals("\"f", user1.getEmail());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JavaLogger javaLogger0 = new JavaLogger();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(listIterator0);
      ItemManager itemManager0 = new ItemManager();
      ItemController itemController0 = new ItemController(itemManager0, (ItemFactory) null);
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
      ViewFactory viewFactory0 = new ViewFactory(javaLogger0, bufferedInputPrompter0, vintage0);
      User user0 = userManager0.createUser("!D^mM^TJ", ")Ls}.;;V8{23|NnS", ")*40+I(Jow,}", "!D^mM^TJ", ")Ls}.;;V8{23|NnS");
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
