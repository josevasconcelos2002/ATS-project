/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 21:01:30 GMT 2024
 */

package com.marketplace.vintage.commands.stats;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.Vintage;
import com.marketplace.vintage.carrier.ParcelCarrierController;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.commands.stats.TopListStatsCommand;
import com.marketplace.vintage.commands.stats.TopParcelCarrierStatsCommand;
import com.marketplace.vintage.commands.stats.TopSellerStatsCommand;
import com.marketplace.vintage.commands.stats.VintageTotalStatsCommand;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
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
import com.marketplace.vintage.user.UserController;
import com.marketplace.vintage.user.UserManager;
import com.marketplace.vintage.utils.VintageDate;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseStatsCommand_ESTest extends BaseStatsCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TopParcelCarrierStatsCommand topParcelCarrierStatsCommand0 = new TopParcelCarrierStatsCommand((Vintage) null);
      String[] stringArray0 = new String[11];
      Predicate<VintageDate> predicate0 = topParcelCarrierStatsCommand0.getDatePredicate(stringArray0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TopParcelCarrierStatsCommand topParcelCarrierStatsCommand0 = new TopParcelCarrierStatsCommand((Vintage) null);
      Vintage vintage0 = topParcelCarrierStatsCommand0.getVintage();
      assertNull(vintage0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      ItemFactory itemFactory0 = new ItemFactory();
      ItemController itemController0 = new ItemController(itemManager0, itemFactory0);
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController((OrderManager) null, orderFactory0);
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ParcelCarrierController parcelCarrierController0 = new ParcelCarrierController(parcelCarrierManager0);
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      ScriptController scriptController0 = new ScriptController();
      Vintage vintage0 = new Vintage(itemController0, orderController0, (TimeManager) null, parcelCarrierController0, exp4jExpressionSolver0, userController0, scriptController0);
      TopParcelCarrierStatsCommand topParcelCarrierStatsCommand0 = new TopParcelCarrierStatsCommand(vintage0);
      Vintage vintage1 = topParcelCarrierStatsCommand0.getVintage();
      assertSame(vintage1, vintage0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TopListStatsCommand topListStatsCommand0 = new TopListStatsCommand((Vintage) null);
      String[] stringArray0 = new String[0];
      Predicate<VintageDate> predicate0 = topListStatsCommand0.getDatePredicate(stringArray0);
      assertNotNull(predicate0);
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
      VintageTotalStatsCommand vintageTotalStatsCommand0 = new VintageTotalStatsCommand(vintage0);
      // Undeclared exception!
      try { 
        vintageTotalStatsCommand0.getDatePredicate((String[]) null, 97);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.stats.BaseStatsCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TopParcelCarrierStatsCommand topParcelCarrierStatsCommand0 = new TopParcelCarrierStatsCommand((Vintage) null);
      String[] stringArray0 = new String[11];
      Predicate<VintageDate> predicate0 = topParcelCarrierStatsCommand0.getDatePredicate(stringArray0, 2023);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
      TopSellerStatsCommand topSellerStatsCommand0 = new TopSellerStatsCommand(vintage0);
      JavaLogger javaLogger0 = new JavaLogger();
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        topSellerStatsCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
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
      TopParcelCarrierStatsCommand topParcelCarrierStatsCommand0 = new TopParcelCarrierStatsCommand(vintage0);
      // Undeclared exception!
      try { 
        topParcelCarrierStatsCommand0.getDatePredicate((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.stats.BaseStatsCommand", e);
      }
  }
}