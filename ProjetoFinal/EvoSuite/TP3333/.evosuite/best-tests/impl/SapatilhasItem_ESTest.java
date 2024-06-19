/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:18:31 GMT 2024
 */

package impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.item.ItemProperty;
import com.marketplace.vintage.item.condition.ItemCondition;
import com.marketplace.vintage.item.condition.UsedItemCondition;
import impl.SapatilhasItem;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SapatilhasItem_ESTest extends SapatilhasItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 250, usedItemCondition0, ", color='", ", color='", (BigDecimal) null, "#m^", 0, false, "V5s-ziOZl", 250);
      boolean boolean0 = sapatilhasItem0.hasLaces();
      assertEquals(0, sapatilhasItem0.getSize());
      assertEquals("V5s-ziOZl", sapatilhasItem0.getColor());
      assertEquals(250, sapatilhasItem0.getCollectionYear());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(1212, 10);
      BigDecimal bigDecimal0 = new BigDecimal(1212);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, ", collectionYear=", 10, usedItemCondition0, ", collectionYear=", ", collectionYear=", bigDecimal0, "", 1212, true, "", 1212);
      int int0 = sapatilhasItem0.getSize();
      assertEquals(1212, sapatilhasItem0.getCollectionYear());
      assertTrue(sapatilhasItem0.hasLaces());
      assertEquals(1212, int0);
      assertEquals("", sapatilhasItem0.getColor());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(125, 125);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, (String) null, 125, usedItemCondition0, (String) null, (String) null, (BigDecimal) null, (String) null, (-1857), true, "\"-kqPi^q", (-1857));
      int int0 = sapatilhasItem0.getSize();
      assertEquals((-1857), sapatilhasItem0.getCollectionYear());
      assertEquals((-1857), int0);
      assertTrue(sapatilhasItem0.hasLaces());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = new BigDecimal((double) 82);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, (String) null, 82, (ItemCondition) null, (String) null, (String) null, bigDecimal0, (String) null, 0, true, (String) null, 82);
      ItemProperty itemProperty0 = ItemProperty.ITEM_CONDITION;
      Class<Object> class0 = Object.class;
      sapatilhasItem0.getProperty(itemProperty0, class0);
      assertEquals(0, sapatilhasItem0.getSize());
      assertTrue(sapatilhasItem0.hasLaces());
      assertEquals(82, sapatilhasItem0.getCollectionYear());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-3335), (-1166));
      BigInteger bigInteger0 = BigInteger.TEN;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 0, usedItemCondition0, "", "", bigDecimal0, "X_E", 0, true, "Fybz<t@INC", 0);
      BigDecimal bigDecimal1 = sapatilhasItem0.getPriceCorrection((-311));
      assertTrue(sapatilhasItem0.hasLaces());
      assertEquals("Fybz<t@INC", sapatilhasItem0.getColor());
      assertEquals(0, sapatilhasItem0.getCollectionYear());
      assertEquals((short)21775, bigDecimal1.shortValue());
      assertEquals(0, sapatilhasItem0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-137), (-137));
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "=UP?+<SJV|X.&bx;X>", 0, usedItemCondition0, "=UP?+<SJV|X.&bx;X>", ".H9", bigDecimal0, "=UP?+<SJV|X.&bx;X>", 0, false, "Wxv1u+byX])R.Ey*", (-218));
      BigDecimal bigDecimal1 = sapatilhasItem0.getPriceCorrection(0);
      assertEquals((-218), sapatilhasItem0.getCollectionYear());
      assertEquals("Wxv1u+byX])R.Ey*", sapatilhasItem0.getColor());
      assertEquals(0, sapatilhasItem0.getSize());
      assertFalse(sapatilhasItem0.hasLaces());
      assertEquals((short) (-938), bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("impl.SapatilhasItem");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(10, 10);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "SapatilhasItem{size=", 10, usedItemCondition0, "", "", bigDecimal0, "{%IlXn", 10, false, "{%IlXn", 10);
      BigDecimal bigDecimal1 = sapatilhasItem0.getPriceCorrection(106);
      assertEquals("{%IlXn", sapatilhasItem0.getColor());
      assertEquals(10, sapatilhasItem0.getSize());
      assertFalse(sapatilhasItem0.hasLaces());
      assertEquals((short) (-50), bigDecimal1.shortValue());
      assertEquals(10, sapatilhasItem0.getCollectionYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 0);
      BigDecimal bigDecimal0 = new BigDecimal((long) 0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 7, usedItemCondition0, "", (String) null, bigDecimal0, "YlnbeEJ?Y.@tD}C?", 7, true, (String) null, 7);
      String string0 = sapatilhasItem0.getColor();
      assertNull(string0);
      assertTrue(sapatilhasItem0.hasLaces());
      assertEquals(7, sapatilhasItem0.getCollectionYear());
      assertEquals(7, sapatilhasItem0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("r]_Y9t+{3@;V");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-1242), 3134);
      BigDecimal bigDecimal0 = new BigDecimal((-1242));
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 3134, usedItemCondition0, "r]_Y9t+{3@;V", "", bigDecimal0, "", 0, false, "", 3134);
      String string0 = sapatilhasItem0.getColor();
      assertFalse(sapatilhasItem0.hasLaces());
      assertEquals(3134, sapatilhasItem0.getCollectionYear());
      assertEquals("", string0);
      assertEquals(0, sapatilhasItem0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 0, (ItemCondition) null, (String) null, (String) null, (BigDecimal) null, "", (-2142), false, "", 0);
      int int0 = sapatilhasItem0.getCollectionYear();
      assertFalse(sapatilhasItem0.hasLaces());
      assertEquals((-2142), sapatilhasItem0.getSize());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 11);
      BigInteger bigInteger0 = BigInteger.TEN;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "Swj", 0, usedItemCondition0, "Swj", "", bigDecimal0, "HnPsFH<|(12", 0, false, "vc,e?fhEl;_d'<R1J", (-2836));
      int int0 = sapatilhasItem0.getCollectionYear();
      assertEquals("vc,e?fhEl;_d'<R1J", sapatilhasItem0.getColor());
      assertEquals((-2836), int0);
      assertFalse(sapatilhasItem0.hasLaces());
      assertEquals(0, sapatilhasItem0.getSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 18);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "SapatilhasItem{size=", 0, usedItemCondition0, "9==aY^~QID<:X^I", ", itemCondition=", bigDecimal0, "SapatilhasItem{size=", 14, false, "S-yzV7.\"\"_2d()E V", 14);
      SapatilhasItem sapatilhasItem1 = (SapatilhasItem)sapatilhasItem0.clone();
      assertEquals("S-yzV7.\"\"_2d()E V", sapatilhasItem1.getColor());
      assertEquals(14, sapatilhasItem1.getSize());
      assertTrue(sapatilhasItem1.equals((Object)sapatilhasItem0));
      assertEquals(14, sapatilhasItem1.getCollectionYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "AAe.^i d2", 125, usedItemCondition0, "", "", bigDecimal0, "SapatilhasItem{size=", 0, false, "com.marketplace.vintage.item.ItemProperty", 0);
      ItemProperty itemProperty0 = ItemProperty.APPRECIATION_RATE_OVER_YEARS;
      Class<SapatilhasItem> class0 = SapatilhasItem.class;
      // Undeclared exception!
      try { 
        sapatilhasItem0.getProperty(itemProperty0, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Property not available in item: APPRECIATION_RATE_OVER_YEARS
         //
         verifyException("com.marketplace.vintage.item.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-1599), 12);
      BigDecimal bigDecimal0 = new BigDecimal((-859.041104987926));
      SapatilhasItem sapatilhasItem0 = null;
      try {
        sapatilhasItem0 = new SapatilhasItem(uUID0, ", hasLaces=", (-1599), usedItemCondition0, ", hasLaces=", ", hasLaces=", bigDecimal0, "/ZHXtU{\\hx", (-352), true, ", hasLaces=", 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Stock cannot be negative
         //
         verifyException("com.marketplace.vintage.item.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SapatilhasItem sapatilhasItem0 = null;
      try {
        sapatilhasItem0 = new SapatilhasItem((SapatilhasItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("impl.SapatilhasItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = new BigDecimal((double) 82);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, (String) null, 82, (ItemCondition) null, (String) null, (String) null, bigDecimal0, (String) null, 0, true, (String) null, 82);
      sapatilhasItem0.getPriceCorrection(0);
      assertEquals(0, sapatilhasItem0.getSize());
      assertEquals(82, sapatilhasItem0.getCollectionYear());
      assertTrue(sapatilhasItem0.hasLaces());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 250, usedItemCondition0, ", color='", ", color='", (BigDecimal) null, "#m^", 0, false, "V5s-ziOZl", 250);
      int int0 = sapatilhasItem0.getCollectionYear();
      assertFalse(sapatilhasItem0.hasLaces());
      assertEquals("V5s-ziOZl", sapatilhasItem0.getColor());
      assertEquals(0, sapatilhasItem0.getSize());
      assertEquals(250, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 250, usedItemCondition0, ", color='", ", color='", (BigDecimal) null, "#m^", 0, false, "V5s-ziOZl", 250);
      int int0 = sapatilhasItem0.getSize();
      assertEquals(0, int0);
      assertFalse(sapatilhasItem0.hasLaces());
      assertEquals("V5s-ziOZl", sapatilhasItem0.getColor());
      assertEquals(250, sapatilhasItem0.getCollectionYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-137), (-137));
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "=UP?+<SJV|X.&bx;X>", 0, usedItemCondition0, "=UP?+<SJV|X.&bx;X>", ".H9", bigDecimal0, "=UP?+<SJV|X.&bx;X>", 0, false, "Wxv1u+byX])R.Ey*", (-218));
      String string0 = sapatilhasItem0.getColor();
      assertEquals((-218), sapatilhasItem0.getCollectionYear());
      assertFalse(sapatilhasItem0.hasLaces());
      assertEquals(0, sapatilhasItem0.getSize());
      assertEquals("Wxv1u+byX])R.Ey*", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = new BigDecimal((double) 82);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, (String) null, 82, (ItemCondition) null, (String) null, (String) null, bigDecimal0, (String) null, 0, true, (String) null, 82);
      boolean boolean0 = sapatilhasItem0.hasLaces();
      assertEquals(0, sapatilhasItem0.getSize());
      assertEquals(82, sapatilhasItem0.getCollectionYear());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(4, 4);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "L 6lRnwH;to(>SRU", 4, usedItemCondition0, "L 6lRnwH;to(>SRU", "L 6lRnwH;to(>SRU", bigDecimal0, "L 6lRnwH;to(>SRU", 4, true, "L 6lRnwH;to(>SRU", 4);
      SapatilhasItem sapatilhasItem1 = new SapatilhasItem(uUID0, "L 6lRnwH;to(>SRU", 4, usedItemCondition0, "L 6lRnwH;to(>SRU", "L 6lRnwH;to(>SRU", bigDecimal0, "L 6lRnwH;to(>SRU", 4, true, "hHoFz\f5C,~u", 4);
      boolean boolean0 = sapatilhasItem0.equals(sapatilhasItem1);
      assertEquals(4, sapatilhasItem1.getCollectionYear());
      assertTrue(sapatilhasItem1.hasLaces());
      assertFalse(boolean0);
      assertEquals(4, sapatilhasItem1.getSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(1888, 1888);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, ")TSHIRT_PATTERN", 1888, usedItemCondition0, (String) null, ")TSHIRT_PATTERN", bigDecimal0, ")TSHIRT_PATTERN", 1888, true, (String) null, 1888);
      SapatilhasItem sapatilhasItem1 = new SapatilhasItem(uUID0, ")TSHIRT_PATTERN", 1888, usedItemCondition0, (String) null, (String) null, bigDecimal0, (String) null, 1888, true, (String) null, 1888);
      boolean boolean0 = sapatilhasItem0.equals(sapatilhasItem1);
      assertEquals(1888, sapatilhasItem1.getSize());
      assertTrue(sapatilhasItem1.hasLaces());
      assertFalse(boolean0);
      assertEquals(1888, sapatilhasItem1.getCollectionYear());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = new BigDecimal((double) 82);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, (String) null, 82, (ItemCondition) null, (String) null, (String) null, bigDecimal0, (String) null, 0, true, (String) null, 82);
      SapatilhasItem sapatilhasItem1 = new SapatilhasItem(sapatilhasItem0);
      boolean boolean0 = sapatilhasItem0.equals(sapatilhasItem1);
      assertEquals(0, sapatilhasItem1.getSize());
      assertTrue(boolean0);
      assertEquals(82, sapatilhasItem1.getCollectionYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = new BigDecimal((double) 82);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, (String) null, 82, (ItemCondition) null, (String) null, (String) null, bigDecimal0, (String) null, 0, true, (String) null, 82);
      boolean boolean0 = sapatilhasItem0.equals((Object) null);
      assertEquals(0, sapatilhasItem0.getSize());
      assertTrue(sapatilhasItem0.hasLaces());
      assertEquals(82, sapatilhasItem0.getCollectionYear());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = new BigDecimal((double) 82);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, (String) null, 82, (ItemCondition) null, (String) null, (String) null, bigDecimal0, (String) null, 0, true, (String) null, 82);
      boolean boolean0 = sapatilhasItem0.equals(sapatilhasItem0);
      assertEquals(82, sapatilhasItem0.getCollectionYear());
      assertTrue(sapatilhasItem0.hasLaces());
      assertEquals(0, sapatilhasItem0.getSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "[CP?+<SJV|X.&bx;X>", 0, usedItemCondition0, "[CP?+<SJV|X.&bx;X>", "[CP?+<SJV|X.&bx;X>", bigDecimal0, "[CP?+<SJV|X.&bx;X>", 0, false, "[CP?+<SJV|X.&bx;X>", 0);
      boolean boolean0 = sapatilhasItem0.equals(usedItemCondition0);
      assertEquals(0, sapatilhasItem0.getCollectionYear());
      assertFalse(boolean0);
      assertFalse(sapatilhasItem0.hasLaces());
      assertEquals(0, sapatilhasItem0.getSize());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("TfI");
      BigDecimal bigDecimal0 = new BigDecimal(13);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "TfI", 13, (ItemCondition) null, "TfI", "TfI", bigDecimal0, "TfI", 13, false, "TfI", 13);
      ItemProperty itemProperty0 = ItemProperty.PARCEL_CARRIER_NAME;
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        sapatilhasItem0.getProperty(itemProperty0, class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("TfI");
      BigDecimal bigDecimal0 = new BigDecimal(13);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "TfI", 13, (ItemCondition) null, "TfI", "TfI", bigDecimal0, "TfI", 13, false, "TfI", 13);
      ItemProperty itemProperty0 = ItemProperty.COLOR;
      Class<Object> class0 = Object.class;
      sapatilhasItem0.getProperty(itemProperty0, class0);
      assertEquals(13, sapatilhasItem0.getSize());
      assertEquals(13, sapatilhasItem0.getCollectionYear());
      assertFalse(sapatilhasItem0.hasLaces());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString((String) null);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, ", hasLaces=", 2, (ItemCondition) null, ", hasLaces=", ", hasLaces=", bigDecimal0, ", hasLaces=", 2, true, ", hasLaces=", 2);
      ItemProperty itemProperty0 = ItemProperty.HAS_LACES;
      // Undeclared exception!
      try { 
        sapatilhasItem0.getProperty(itemProperty0, (Class<UsedItemCondition>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("impl.SapatilhasItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(4, 4);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "L 6lRnwH;to(>SRU", 4, usedItemCondition0, "L 6lRnwH;to(>SRU", "L 6lRnwH;to(>SRU", bigDecimal0, "L 6lRnwH;to(>SRU", 4, true, "L 6lRnwH;to(>SRU", 4);
      ItemProperty itemProperty0 = ItemProperty.SAPATILHA_SIZE;
      Class<Object> class0 = Object.class;
      Object object0 = sapatilhasItem0.getProperty(itemProperty0, class0);
      assertEquals(4, sapatilhasItem0.getCollectionYear());
      assertEquals(4, object0);
      assertTrue(sapatilhasItem0.hasLaces());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "[CP?+<SJV|X.&bx;X>", 0, usedItemCondition0, "[CP?+<SJV|X.&bx;X>", "[CP?+<SJV|X.&bx;X>", bigDecimal0, "[CP?+<SJV|X.&bx;X>", 0, false, "[CP?+<SJV|X.&bx;X>", 0);
      ItemProperty itemProperty0 = ItemProperty.COLLECTION_YEAR;
      Class<Integer> class0 = Integer.class;
      Integer integer0 = sapatilhasItem0.getProperty(itemProperty0, class0);
      assertEquals(0, (int)integer0);
      assertFalse(sapatilhasItem0.hasLaces());
      assertEquals(0, sapatilhasItem0.getSize());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 250, usedItemCondition0, ", color='", ", color='", (BigDecimal) null, "#m^", 0, false, "V5s-ziOZl", 250);
      // Undeclared exception!
      try { 
        sapatilhasItem0.getPriceCorrection(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("impl.SapatilhasItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(1888, 1888);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, ")TSHIRT_PATTERN", 1888, usedItemCondition0, (String) null, ")TSHIRT_PATTERN", bigDecimal0, ")TSHIRT_PATTERN", 1888, true, (String) null, 1888);
      sapatilhasItem0.getItemType();
      assertEquals(1888, sapatilhasItem0.getSize());
      assertTrue(sapatilhasItem0.hasLaces());
      assertEquals(1888, sapatilhasItem0.getCollectionYear());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 250, usedItemCondition0, ", color='", ", color='", (BigDecimal) null, "#m^", 0, false, "V5s-ziOZl", 250);
      String string0 = sapatilhasItem0.toString();
      assertEquals("SapatilhasItem{size=0, hasLaces=false, color='V5s-ziOZl', collectionYear=250, alphanumericID='', itemCondition=Used (0/10, 0 previous owners), description=', color='', brand=', color='', basePrice=null, parcelCarrierName=#m^}", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 250, usedItemCondition0, ", color='", ", color='", (BigDecimal) null, "#m^", 0, false, "V5s-ziOZl", 250);
      SapatilhasItem sapatilhasItem1 = (SapatilhasItem)sapatilhasItem0.clone();
      assertEquals(250, sapatilhasItem1.getCollectionYear());
      assertEquals(0, sapatilhasItem1.getSize());
      assertEquals("V5s-ziOZl", sapatilhasItem1.getColor());
      assertTrue(sapatilhasItem1.equals((Object)sapatilhasItem0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(3455, 3455);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "j5!`%#bRq`", 3455, usedItemCondition0, "j5!`%#bRq`", "j5!`%#bRq`", bigDecimal0, "j5!`%#bRq`", 3455, false, "j5!`%#bRq`", 3455);
      sapatilhasItem0.hashCode();
      assertEquals(3455, sapatilhasItem0.getSize());
      assertEquals(3455, sapatilhasItem0.getCollectionYear());
      assertFalse(sapatilhasItem0.hasLaces());
  }
}