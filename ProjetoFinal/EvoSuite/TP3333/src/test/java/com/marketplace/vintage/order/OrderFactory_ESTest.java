/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:35:23 GMT 2024
 */

package com.marketplace.vintage.order;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.carrier.ParcelCarrier;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
import com.marketplace.vintage.item.Item;
import com.marketplace.vintage.item.condition.UsedItemCondition;
import com.marketplace.vintage.utils.VintageDate;
import impl.PremiumSapatilhasItem;
import impl.SapatilhasItem;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OrderFactory_ESTest extends OrderFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrderFactory orderFactory0 = new OrderFactory();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Map<String, List<Item>> map0 = orderFactory0.separateItemsByParcelCarrier(linkedList0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OrderFactory orderFactory0 = new OrderFactory();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      linkedList0.add((Item) null);
      // Undeclared exception!
      try { 
        orderFactory0.separateItemsByParcelCarrier(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OrderFactory orderFactory0 = new OrderFactory();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      UUID uUID0 = MockUUID.fromString("%<75gp0z");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(1, 1);
      BigInteger bigInteger0 = BigInteger.ONE;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "%<75gp0z", 1, usedItemCondition0, "%<75gp0z", "", bigDecimal0, "%<75gp0z", 1, false, ";&ssN5Ng}vBzj/MEbw", 1);
      linkedList0.add((Item) sapatilhasItem0);
      Map<String, List<Item>> map0 = orderFactory0.separateItemsByParcelCarrier(linkedList0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OrderFactory orderFactory0 = new OrderFactory();
      UUID uUID0 = MockUUID.randomUUID();
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      Supplier<VintageDate> supplier0 = (Supplier<VintageDate>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(vintageDate0).when(supplier0).get();
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(1, 1);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "@,v2 d'YIMHx9#-", 1, usedItemCondition0, "@,v2 d'YIMHx9#-", "@,v2 d'YIMHx9#-", bigDecimal0, "@,v2 d'YIMHx9#-", 1, false, "@,v2 d'YIMHx9#-", 1, 1);
      linkedList0.add((Item) premiumSapatilhasItem0);
      // Undeclared exception!
      try { 
        orderFactory0.buildOrder("@,v2 d'YIMHx9#-", uUID0, linkedList0, (Function<String, ParcelCarrier>) null, supplier0, exp4jExpressionSolver0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OrderFactory orderFactory0 = new OrderFactory();
      UUID uUID0 = MockUUID.randomUUID();
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      Supplier<VintageDate> supplier0 = (Supplier<VintageDate>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(vintageDate0).when(supplier0).get();
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Order order0 = orderFactory0.buildOrder("aA6Vz\u0002t", uUID0, linkedList0, (Function<String, ParcelCarrier>) null, supplier0, exp4jExpressionSolver0);
      assertEquals(OrderStatus.ORDERED, order0.getOrderStatus());
  }
}
