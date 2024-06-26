/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:39:02 GMT 2024
 */

package com.marketplace.vintage.order;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.carrier.ParcelCarrier;
import com.marketplace.vintage.expression.Exp4jExpressionSolver;
import com.marketplace.vintage.item.Item;
import com.marketplace.vintage.logging.JavaLogger;
import com.marketplace.vintage.order.Order;
import com.marketplace.vintage.order.OrderController;
import com.marketplace.vintage.order.OrderFactory;
import com.marketplace.vintage.order.OrderManager;
import com.marketplace.vintage.order.OrderStatus;
import com.marketplace.vintage.order.OrderedItem;
import com.marketplace.vintage.order.invoice.InvoiceLine;
import com.marketplace.vintage.utils.VintageDate;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OrderController_ESTest extends OrderController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("ORD-AAAAAA", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      orderController0.registerOrder(order0);
      orderController0.returnOrder(order0);
      assertTrue(order0.hasBeenReturned());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order("ORD-AAAAAA", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      orderController0.registerOrder(order0);
      Order order1 = orderController0.getOrder("ORD-AAAAAA");
      assertTrue(order1.hasBeenReturned());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("ORD-AAAAAA", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      orderController0.registerOrder(order0);
      Order order1 = orderController0.getOrder("ORD-AAAAAA");
      assertEquals("ORD-AAAAAA", order1.getOrderId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("ORD-AAAAAA", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      orderController0.registerOrder(order0);
      List<Order> list0 = orderController0.getAll();
      assertFalse(list0.contains(order0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("ORD-AAAAAA", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      orderController0.registerOrder(order0);
      boolean boolean0 = orderController0.containsOrder("ORD-AAAAAA");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderController orderController0 = new OrderController(orderManager0, (OrderFactory) null);
      boolean boolean0 = orderController0.containsOrder("$} E[");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      VintageDate vintageDate0 = VintageDate.of(11, 11, 11);
      Supplier<VintageDate> supplier0 = (Supplier<VintageDate>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(vintageDate0).when(supplier0).get();
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      Order order0 = orderController0.buildOrder("mb)GSk;jvE QvIRCKa0", uUID0, linkedList0, (Function<String, ParcelCarrier>) null, supplier0, exp4jExpressionSolver0);
      assertEquals(OrderStatus.ORDERED, order0.getOrderStatus());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController((OrderManager) null, orderFactory0);
      VintageDate vintageDate0 = VintageDate.of(3, 3, 5755);
      // Undeclared exception!
      try { 
        orderController0.setOrderDelivered((Order) null, vintageDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderController", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.fromString("");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      VintageDate vintageDate0 = VintageDate.of(1, 1, (-1932));
      Order order0 = new Order("", uUID0, linkedList0, (List<InvoiceLine>) null, bigDecimal0, vintageDate0);
      // Undeclared exception!
      try { 
        orderController0.returnOrder(order0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An order with the id  was not found
         //
         verifyException("com.marketplace.vintage.order.OrderManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("ORD-AAAAAA", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      orderManager0.registerOrder(order0);
      // Undeclared exception!
      try { 
        orderController0.registerOrder(order0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An order with that id already exists
         //
         verifyException("com.marketplace.vintage.order.OrderManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      VintageDate vintageDate0 = VintageDate.of(2, 2, 2);
      // Undeclared exception!
      try { 
        orderController0.isOrderReturnable((Order) null, vintageDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderController", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController((OrderManager) null, orderFactory0);
      // Undeclared exception!
      try { 
        orderController0.getOrder("j]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderController", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController((OrderManager) null, orderFactory0);
      // Undeclared exception!
      try { 
        orderController0.getAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderController", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController((OrderManager) null, orderFactory0);
      // Undeclared exception!
      try { 
        orderController0.generateUniqueOrderId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderController", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.fromString("ORD-AAAAAA");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("ORD-AAAAAA", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      orderController0.registerOrder(order0);
      orderController0.setOrderDelivered(order0, (VintageDate) null);
      // Undeclared exception!
      try { 
        orderController0.isOrderReturnable(order0, (VintageDate) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Order has not been delivered yet
         //
         verifyException("com.marketplace.vintage.order.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("ORD-AAAAAA", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      boolean boolean0 = orderController0.isOrderReturnable(order0, (VintageDate) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("ORD-AAAAAA", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      orderController0.registerOrder(order0);
      JavaLogger javaLogger0 = new JavaLogger();
      // Undeclared exception!
      try { 
        orderController0.notifyTimeChange(javaLogger0, (VintageDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderController", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderController orderController0 = new OrderController(orderManager0, (OrderFactory) null);
      JavaLogger javaLogger0 = new JavaLogger();
      orderController0.notifyTimeChange(javaLogger0, (VintageDate) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderController orderController0 = new OrderController(orderManager0, (OrderFactory) null);
      List<Order> list0 = orderController0.getAll();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      // Undeclared exception!
      try { 
        orderController0.getOrder("ORD-AAAAAA");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An order with the id ORD-AAAAAA was not found
         //
         verifyException("com.marketplace.vintage.order.OrderManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      // Undeclared exception!
      try { 
        orderController0.returnOrder((Order) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderController", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      UUID uUID0 = MockUUID.fromString("ORD-AAAAAA");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("ORD-AAAAAA", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      // Undeclared exception!
      try { 
        orderController0.setOrderDelivered(order0, (VintageDate) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An order with the id ORD-AAAAAA was not found
         //
         verifyException("com.marketplace.vintage.order.OrderManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      String string0 = orderController0.generateUniqueOrderId();
      assertEquals("ORD-AAAAAA", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      // Undeclared exception!
      try { 
        orderController0.registerOrder((Order) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OrderManager orderManager0 = new OrderManager();
      LinkedList<Item> linkedList0 = new LinkedList<Item>();
      Exp4jExpressionSolver exp4jExpressionSolver0 = new Exp4jExpressionSolver();
      Supplier<VintageDate> supplier0 = (Supplier<VintageDate>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((VintageDate) null).when(supplier0).get();
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController(orderManager0, orderFactory0);
      // Undeclared exception!
      try { 
        orderController0.buildOrder(" orders.", (UUID) null, linkedList0, (Function<String, ParcelCarrier>) null, supplier0, exp4jExpressionSolver0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OrderFactory orderFactory0 = new OrderFactory();
      OrderController orderController0 = new OrderController((OrderManager) null, orderFactory0);
      // Undeclared exception!
      try { 
        orderController0.containsOrder("i8O05j]nD");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.OrderController", e);
      }
  }
}
