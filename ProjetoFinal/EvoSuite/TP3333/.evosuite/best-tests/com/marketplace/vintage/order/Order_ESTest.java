/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:27:23 GMT 2024
 */

package com.marketplace.vintage.order;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.item.condition.UsedItemCondition;
import com.marketplace.vintage.order.Order;
import com.marketplace.vintage.order.OrderStatus;
import com.marketplace.vintage.order.OrderedItem;
import com.marketplace.vintage.order.invoice.InvoiceLine;
import com.marketplace.vintage.order.invoice.ItemSatisfactionInvoiceLine;
import com.marketplace.vintage.order.invoice.ParcelShipmentCostInvoiceLine;
import com.marketplace.vintage.utils.VintageDate;
import impl.SapatilhasItem;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Order_ESTest extends Order_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("com.marketplace.vintage.order.Order", uUID0, linkedList0, linkedList1, (BigDecimal) null, (VintageDate) null, orderStatus0);
      BigDecimal bigDecimal0 = order0.getTotalPrice();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString((String) null);
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal(1);
      VintageDate vintageDate0 = VintageDate.of(1, 1, (-1));
      Order order0 = new Order("i<$$(4cgtUau{&t)", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0);
      BigDecimal bigDecimal1 = order0.getTotalPrice();
      assertEquals((short)1, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal((-29.49619641283195));
      VintageDate vintageDate0 = VintageDate.of(1, 1, 0);
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order(", itemCondition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      BigDecimal bigDecimal1 = order0.getTotalPrice();
      assertSame(bigDecimal0, bigDecimal1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("com.marketplace.vintage.order.Order");
      LinkedList<InvoiceLine> linkedList0 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal((-2632.97));
      Order order0 = new Order("com.marketplace.vintage.order.Order", uUID0, (List<OrderedItem>) null, linkedList0, bigDecimal0, (VintageDate) null);
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(1875, 1875);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "com.marketplace.vintage.order.Order", 1875, usedItemCondition0, "com.marketplace.vintage.order.Order", "com.marketplace.vintage.order.Order", bigDecimal0, "com.marketplace.vintage.order.Order", 1875, false, "com.marketplace.vintage.order.Order", 1875);
      ItemSatisfactionInvoiceLine itemSatisfactionInvoiceLine0 = new ItemSatisfactionInvoiceLine(sapatilhasItem0, bigDecimal0);
      linkedList0.add((InvoiceLine) itemSatisfactionInvoiceLine0);
      BigDecimal bigDecimal1 = order0.getSumOfSatisfactionPrices();
      assertEquals((byte) (-72), bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("impl.TshirtItem$TshirtItemPattern");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      BigDecimal bigDecimal0 = new BigDecimal((-1L));
      OrderedItem orderedItem0 = new OrderedItem(uUID0, "$1wUK8l1_6z1{>-xO", "YI4V", bigDecimal0);
      linkedList0.add(orderedItem0);
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order("caaLt2Voe[W8&ej", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      BigDecimal bigDecimal1 = order0.getSumOfItemPricesFromSeller(uUID0);
      assertEquals((byte) (-1), bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal((-29.49619641283195));
      ParcelShipmentCostInvoiceLine parcelShipmentCostInvoiceLine0 = new ParcelShipmentCostInvoiceLine(", itemCondition=", 1, bigDecimal0);
      linkedList1.add((InvoiceLine) parcelShipmentCostInvoiceLine0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, 0);
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order(", itemCondition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      BigDecimal bigDecimal1 = order0.getParcelCarrierShippingCost(", itemCondition=");
      assertEquals((short) (-29), bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      BigDecimal bigDecimal0 = new BigDecimal((-1538900141));
      OrderedItem orderedItem0 = new OrderedItem(uUID0, "", "j%-SqT'b'h5S?TzO", bigDecimal0);
      linkedList0.addFirst(orderedItem0);
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      Order order0 = new Order("j%-SqT'b'h5S?TzO", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null);
      List<OrderedItem> list0 = order0.getOrderedItemsByParcelCarrier("j%-SqT'b'h5S?TzO");
      assertTrue(list0.contains(orderedItem0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal(1.0);
      Order order0 = new Order("j%-SqT'b'h5S?TzO", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null);
      List<OrderedItem> list0 = order0.getOrderedItems();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("impl.TshirtItem$TshirtItemPattern");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      BigDecimal bigDecimal0 = new BigDecimal((-1L));
      OrderedItem orderedItem0 = new OrderedItem(uUID0, "$1wUK8l1_6z1{>-xO", "YI4V", bigDecimal0);
      linkedList0.add(orderedItem0);
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order("caaLt2Voe[W8&ej", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      List<OrderedItem> list0 = order0.getOrderedItems();
      assertTrue(list0.contains(orderedItem0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal((-29.49619641283195));
      Order order0 = new Order(", ipemCondition=", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, (OrderStatus) null);
      order0.getOrderStatus();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      Order order0 = new Order((String) null, uUID0, linkedList0, (List<InvoiceLine>) null, bigDecimal0, (VintageDate) null, orderStatus0);
      String string0 = order0.getOrderId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("I!Tnhl9&>N9d");
      LinkedList<InvoiceLine> linkedList0 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal(1.0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, (-2521));
      Order order0 = new Order("", uUID0, (List<OrderedItem>) null, linkedList0, bigDecimal0, vintageDate0);
      String string0 = order0.getOrderId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order("", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      VintageDate vintageDate1 = order0.getOrderDate();
      assertSame(vintageDate0, vintageDate1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      Order order0 = new Order("uc(^}]K", uUID0, linkedList0, (List<InvoiceLine>) null, bigDecimal0, (VintageDate) null);
      List<InvoiceLine> list0 = order0.getInvoiceLines();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("impl.TshirtItem$TshirtItemPattern");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      BigDecimal bigDecimal0 = new BigDecimal((-1L));
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order("caaLt2Voe[W8&ej", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      Order order1 = new Order(order0);
      List<InvoiceLine> list0 = order1.getInvoiceLines();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal((-29.49619641283195));
      ParcelShipmentCostInvoiceLine parcelShipmentCostInvoiceLine0 = new ParcelShipmentCostInvoiceLine(", itemCondition=", 1, bigDecimal0);
      linkedList1.add((InvoiceLine) parcelShipmentCostInvoiceLine0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, 0);
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order(", itemCondition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      Order order1 = order0.clone();
      List<InvoiceLine> list0 = order1.getInvoiceLines();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      Order order0 = new Order("Order has not been delivered yet", (UUID) null, linkedList0, linkedList1, (BigDecimal) null, (VintageDate) null);
      UUID uUID0 = order0.getBuyerId();
      assertNull(uUID0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Random.setNextRandom(685);
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal((long) 685);
      Order order0 = new Order("xMw T[Hz}+4uX[", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null);
      UUID uUID1 = order0.getBuyerId();
      assertSame(uUID1, uUID0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      BigDecimal bigDecimal0 = new BigDecimal(36L);
      Order order0 = new Order("y}z[r$khuBm(", uUID0, linkedList0, (List<InvoiceLine>) null, bigDecimal0, (VintageDate) null);
      // Undeclared exception!
      try { 
        order0.getSumOfSatisfactionPrices();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("T#(&DKh)/Z]Ng#GX");
      LinkedList<InvoiceLine> linkedList0 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal(1L);
      Order order0 = new Order("+?VS3", uUID0, (List<OrderedItem>) null, linkedList0, bigDecimal0, (VintageDate) null);
      // Undeclared exception!
      try { 
        order0.getSumOfItemPricesFromSeller(uUID0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      Order order0 = new Order("com.marketplace.vintage.order.Order", uUID0, linkedList0, (List<InvoiceLine>) null, bigDecimal0, (VintageDate) null, orderStatus0);
      // Undeclared exception!
      try { 
        order0.getParcelCarrierShippingCost(".!:]6OM~ZFy?\"e{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<InvoiceLine> linkedList0 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.valueOf(0.0);
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order("?CCC9{k-2", uUID0, (List<OrderedItem>) null, linkedList0, bigDecimal0, (VintageDate) null, orderStatus0);
      // Undeclared exception!
      try { 
        order0.getOrderedItemsByParcelCarrier((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.order.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("com.marketplace.vintage.order.Order");
      LinkedList<InvoiceLine> linkedList0 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal((-2632.97));
      Order order0 = new Order("com.marketplace.vintage.order.Order", uUID0, (List<OrderedItem>) null, linkedList0, bigDecimal0, (VintageDate) null);
      // Undeclared exception!
      try { 
        order0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      Order order0 = new Order("uc(^}]K", uUID0, linkedList0, (List<InvoiceLine>) null, bigDecimal0, (VintageDate) null);
      Order order1 = null;
      try {
        order1 = new Order(order0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      OrderedItem orderedItem0 = new OrderedItem(uUID0, "-$d*R3>", "-$d*R3>", bigDecimal0);
      linkedList0.add(orderedItem0);
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order("-$d*R3>", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null, orderStatus0);
      UUID uUID1 = MockUUID.randomUUID();
      BigDecimal bigDecimal1 = order0.getSumOfItemPricesFromSeller(uUID1);
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      BigDecimal bigDecimal0 = new BigDecimal((-1538900141));
      OrderedItem orderedItem0 = new OrderedItem(uUID0, "", "j%-SqT'b'h5S?TzO", bigDecimal0);
      linkedList0.addFirst(orderedItem0);
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      Order order0 = new Order("j%-SqT'b'h5S?TzO", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null);
      BigDecimal bigDecimal1 = order0.getSumOfItemPricesFromSeller(uUID0);
      assertEquals((short)16211, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("com.marketplace.vintage.order.Order");
      LinkedList<InvoiceLine> linkedList0 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal(2898.0);
      Order order0 = new Order("Kx\u0001h-'D-[s:", uUID0, (List<OrderedItem>) null, linkedList0, bigDecimal0, (VintageDate) null);
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(1875, 1875);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "com.marketplace.vintage.order.Order", 1875, usedItemCondition0, "Kx\u0001h-'D-[s:", ".!:]6OM~ZFy?\"e{", bigDecimal0, "Kx\u0001h-'D-[s:", (-1), false, ".!:]6OM~ZFy?\"e{", (-1));
      ItemSatisfactionInvoiceLine itemSatisfactionInvoiceLine0 = new ItemSatisfactionInvoiceLine(sapatilhasItem0, bigDecimal0);
      linkedList0.add((InvoiceLine) itemSatisfactionInvoiceLine0);
      BigDecimal bigDecimal1 = order0.getSumOfSatisfactionPrices();
      assertEquals((short)2898, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      linkedList1.offer((InvoiceLine) null);
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, 0);
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order(", itemCondition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      BigDecimal bigDecimal1 = order0.getSumOfSatisfactionPrices();
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      ParcelShipmentCostInvoiceLine parcelShipmentCostInvoiceLine0 = new ParcelShipmentCostInvoiceLine("`3.o9bT&8en>dc", (-653), bigDecimal0);
      linkedList1.add((InvoiceLine) parcelShipmentCostInvoiceLine0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, 0);
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order(", itemCondition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      BigDecimal bigDecimal1 = order0.getParcelCarrierShippingCost(".!@]6OM~ZFy?\"e{");
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      linkedList1.offer((InvoiceLine) null);
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, 0);
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order(", itemCondition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      BigDecimal bigDecimal1 = order0.getParcelCarrierShippingCost(".!@]6OM~ZFy?\"e{");
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(", ipemCmndition=");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      ParcelShipmentCostInvoiceLine parcelShipmentCostInvoiceLine0 = new ParcelShipmentCostInvoiceLine(", ipemCmndition=", 1, bigDecimal0);
      linkedList1.add((InvoiceLine) parcelShipmentCostInvoiceLine0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order(", ipemCmndition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      BigDecimal bigDecimal1 = order0.getParcelCarrierShippingCost(", ipemCmndition=");
      assertEquals((byte)1, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString((String) null);
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      byte[] byteArray0 = new byte[8];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, (-1));
      Order order0 = new Order("i<$$(4cgtUau{&t)", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0);
      // Undeclared exception!
      try { 
        order0.getDeliverDate();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Order has not been delivered yet
         //
         verifyException("com.marketplace.vintage.order.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      Order order0 = new Order("4?*RgC8FvM^~&%", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null);
      boolean boolean0 = order0.hasBeenReturned();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(", ipemCmndition=");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order(", ipemCmndition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      String string0 = order0.getOrderId();
      assertEquals(", ipemCmndition=", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      Order order0 = new Order("4?*RgC8FvM^~&%", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null);
      VintageDate vintageDate0 = order0.getOrderDate();
      assertNull(vintageDate0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      VintageDate vintageDate0 = VintageDate.of(1, 1, 0);
      OrderStatus orderStatus0 = OrderStatus.ORDERED;
      Order order0 = new Order(", itemCondition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      BigDecimal bigDecimal1 = order0.getTotalPrice();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order(", itmCondition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      UUID uUID1 = order0.getBuyerId();
      assertSame(uUID0, uUID1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(", ipemCmndition=");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order(", ipemCmndition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      Order order1 = order0.clone();
      assertEquals(OrderStatus.RETURNED, order1.getOrderStatus());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      Order order0 = new Order("", uUID0, linkedList0, linkedList1, bigDecimal0, (VintageDate) null);
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      order0.setOrderStatus(orderStatus0);
      boolean boolean0 = order0.hasBeenReturned();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(", ipemCmndition=");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order(", ipemCmndition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      List<OrderedItem> list0 = order0.getOrderedItemsByParcelCarrier(", ipemCmndition=");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(", ipemCmndition=");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order(", ipemCmndition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      order0.setDeliverDate(vintageDate0);
      VintageDate vintageDate1 = order0.getDeliverDate();
      assertSame(vintageDate0, vintageDate1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("&Q;");
      LinkedList<InvoiceLine> linkedList0 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      Order order0 = new Order("com.marketplace.vintage.order.invoice.ParcelShipmentCostInvoiceLine", uUID0, (List<OrderedItem>) null, linkedList0, bigDecimal0, (VintageDate) null);
      // Undeclared exception!
      try { 
        order0.getOrderedItems();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(", ipemCmndition=");
      LinkedList<OrderedItem> linkedList0 = new LinkedList<OrderedItem>();
      LinkedList<InvoiceLine> linkedList1 = new LinkedList<InvoiceLine>();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      VintageDate vintageDate0 = VintageDate.of(1, 1, 1);
      OrderStatus orderStatus0 = OrderStatus.RETURNED;
      Order order0 = new Order(", ipemCmndition=", uUID0, linkedList0, linkedList1, bigDecimal0, vintageDate0, orderStatus0);
      OrderStatus orderStatus1 = order0.getOrderStatus();
      assertSame(orderStatus0, orderStatus1);
  }
}
