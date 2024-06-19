/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:41:30 GMT 2024
 */

package com.marketplace.vintage.commands.carrier;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.NormalParcelCarrier;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.commands.carrier.ParcelCarrierCreateCommand;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
import com.marketplace.vintage.expression.ExpressionSolver;
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
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParcelCarrierCreateCommand_ESTest extends ParcelCarrierCreateCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("n");
      ParcelCarrierCreateCommand parcelCarrierCreateCommand0 = new ParcelCarrierCreateCommand((Vintage) null, "pe#mgx", linkedList0);
      JavaLogger javaLogger0 = new JavaLogger();
      Iterator<String> iterator0 = linkedList0.iterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(iterator0);
      String[] stringArray0 = new String[6];
      stringArray0[1] = "premiuq";
      parcelCarrierCreateCommand0.executeSafely(javaLogger0, bufferedInputPrompter0, stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ParcelCarrierCreateCommand parcelCarrierCreateCommand0 = new ParcelCarrierCreateCommand((Vintage) null, "TZ.V", linkedList0);
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      Logger logger1 = PrefixLogger.of("TZ.V", logger0);
      Iterator<String> iterator0 = linkedList0.iterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(iterator0);
      linkedList0.add("TZ.V");
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        parcelCarrierCreateCommand0.executeSafely(logger1, bufferedInputPrompter0, stringArray0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParcelCarrierCreateCommand parcelCarrierCreateCommand0 = new ParcelCarrierCreateCommand((Vintage) null, "E+>\"7+q/9{", (List<String>) null);
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[4];
      stringArray0[1] = "E+>\"7+q/9{";
      stdinInputPrompter0.close();
      // Undeclared exception!
      try { 
        parcelCarrierCreateCommand0.executeSafely(logger0, stdinInputPrompter0, stringArray0);
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
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, (TimeManager) null, (ParcelCarrierController) null, (ExpressionSolver) null, userController0, scriptController0);
      User user0 = new User("{8*d", "BA/Rl", "BA/Rl", "BA/Rl", "{8*d");
      List<String> list0 = user0.getCompletedOrderIdsList();
      ParcelCarrierCreateCommand parcelCarrierCreateCommand0 = new ParcelCarrierCreateCommand(vintage0, "%&I*", list0);
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      Logger logger1 = PrefixLogger.of("0^-1I", logger0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Iterator<String> iterator0 = linkedList0.iterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(iterator0);
      String[] stringArray0 = new String[5];
      stringArray0[1] = "BA/Rl";
      // Undeclared exception!
      try { 
        parcelCarrierCreateCommand0.executeSafely(logger1, bufferedInputPrompter0, stringArray0);
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
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("n");
      JavaLogger javaLogger0 = new JavaLogger();
      Iterator<String> iterator0 = linkedList0.iterator();
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(iterator0);
      String[] stringArray0 = new String[6];
      stringArray0[1] = "premiuq";
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, (OrderController) null, (TimeManager) null, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      ParcelCarrierCreateCommand parcelCarrierCreateCommand0 = new ParcelCarrierCreateCommand(vintage0, "premiuq", linkedList0);
      parcelCarrierCreateCommand0.executeSafely(javaLogger0, bufferedInputPrompter0, stringArray0);
      assertEquals(1, parcelCarrierCreateCommand0.getMinArgs());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[9];
      stringArray0[1] = "premium";
      ParcelCarrierCreateCommand parcelCarrierCreateCommand0 = new ParcelCarrierCreateCommand((Vintage) null, "premium", linkedList0);
      // Undeclared exception!
      try { 
        parcelCarrierCreateCommand0.executeSafely((Logger) null, stdinInputPrompter0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.carrier.ParcelCarrierCreateCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ParcelCarrierCreateCommand parcelCarrierCreateCommand0 = new ParcelCarrierCreateCommand((Vintage) null, "E+>\"7+q/9{", (List<String>) null);
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[4];
      stringArray0[1] = "E+>\"7+q/9{";
      // Undeclared exception!
      try { 
        parcelCarrierCreateCommand0.executeSafely(logger0, stdinInputPrompter0, stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController((OrderManager) null, orderFactory0);
      TimeManager timeManager0 = new TimeManager((VintageDate) null);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      Vintage vintage0 = new Vintage(itemController0, orderController0, timeManager0, parcelCarrierController0, exp4jExpressionSolver0, userController0, (ScriptController) null);
      NormalParcelCarrier normalParcelCarrier0 = new NormalParcelCarrier("LARGE", "LARGE");
      List<String> list0 = normalParcelCarrier0.getDeliveredOrders();
      ParcelCarrierCreateCommand parcelCarrierCreateCommand0 = new ParcelCarrierCreateCommand(vintage0, "LARGE", list0);
      JavaLogger javaLogger0 = new JavaLogger();
      Logger logger0 = OnlyWarnLogger.of(javaLogger0);
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        parcelCarrierCreateCommand0.executeSafely(logger0, stdinInputPrompter0, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.marketplace.vintage.commands.carrier.ParcelCarrierCreateCommand", e);
      }
  }
}