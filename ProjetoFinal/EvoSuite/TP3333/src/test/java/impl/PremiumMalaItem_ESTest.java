/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:43:39 GMT 2024
 */

package impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.item.Item;
import com.marketplace.vintage.item.ItemProperty;
import com.marketplace.vintage.item.ItemType;
import com.marketplace.vintage.item.condition.UsedItemCondition;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PremiumMalaItem_ESTest extends PremiumMalaItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 1517);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem((UUID) null, "TSHIRT_PATTERN", 907, usedItemCondition0, ", appreciationRateOverYears=", (String) null, bigDecimal0, "", 0, "", (-1), 0);
      ItemProperty itemProperty0 = ItemProperty.BRAND;
      Class<String> class0 = String.class;
      String string0 = premiumMalaItem0.getProperty(itemProperty0, class0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(39, (-2137));
      BigDecimal bigDecimal0 = new BigDecimal(1.0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, ", parcelCarrierName=", 1, usedItemCondition0, ", parcelCarrierName=", "WV'K<YuA$8*AA)(", bigDecimal0, "WV'K<YuA$8*AA)(", 125, "z$", 1, (-2137));
      BigDecimal bigDecimal1 = premiumMalaItem0.getPriceCorrection(3);
      assertEquals((byte)13, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(4, 4);
      BigInteger bigInteger0 = BigInteger.ONE;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, (String) null, 4, usedItemCondition0, (String) null, (String) null, bigDecimal0, (String) null, 4, ", basePrice=", (-753), (-1656));
      BigDecimal bigDecimal1 = premiumMalaItem0.getPriceCorrection(1);
      assertEquals((byte) (-89), bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(127, 0);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem((UUID) null, "rLbsDR6Z  $}x_3*", 127, usedItemCondition0, "rLbsDR6Z  $}x_3*", "5d#", bigDecimal0, "%", 127, "QQ,iLI+n", 0, 0);
      int int0 = premiumMalaItem0.getAppreciationRateOverYears();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(39, (-2137));
      BigDecimal bigDecimal0 = new BigDecimal(1.0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, ", parcelCarrierName=", 1, usedItemCondition0, ", parcelCarrierName=", "WV'K<YuA$8*AA)(", bigDecimal0, "WV'K<YuA$8*AA)(", 125, "z$", 1, (-2137));
      int int0 = premiumMalaItem0.getAppreciationRateOverYears();
      assertEquals((-2137), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(", basePrice=");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(2041, (-1173));
      BigDecimal bigDecimal0 = new BigDecimal((-1173));
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "", 2041, usedItemCondition0, "", "impl.MalaItem", bigDecimal0, "impl.MalaItem", 0, "*h$==gw',", 1567, 1567);
      PremiumMalaItem premiumMalaItem1 = (PremiumMalaItem)premiumMalaItem0.clone();
      assertEquals("*h$==gw',", premiumMalaItem1.getMaterial());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "Zn)YRCC!!&fED nk", 0, usedItemCondition0, "7wl5^", "~p}y`U", (BigDecimal) null, "7wl5^", 0, "7wl5^", 0, 0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        premiumMalaItem0.getProperty((ItemProperty) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.item.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(6274, 0);
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "TcD4xsjh3#3<B", 0, usedItemCondition0, "TcD4xsjh3#3<B", "TcD4xsjh3#3<B", bigDecimal0, "TcD4xsjh3#3<B", 304, "", 304, 0);
      ItemProperty itemProperty0 = ItemProperty.TSHIRT_PATTERN;
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        premiumMalaItem0.getProperty(itemProperty0, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Property not available in item: TSHIRT_PATTERN
         //
         verifyException("com.marketplace.vintage.item.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(", basePrice=");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(2041, (-1173));
      BigDecimal bigDecimal0 = new BigDecimal((-1173));
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "", 2041, usedItemCondition0, "", "impl.MalaItem", bigDecimal0, "impl.MalaItem", 0, "*h$==gw',", 1567, 1567);
      ItemProperty itemProperty0 = ItemProperty.DIMENSION_AREA;
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        premiumMalaItem0.getProperty(itemProperty0, class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-2195), 0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem((UUID) null, "", 2877, usedItemCondition0, "", "", (BigDecimal) null, "impl.PremiumMalaItem", 0, "", 656, (-2195));
      // Undeclared exception!
      try { 
        premiumMalaItem0.getPriceCorrection(1876);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("impl.MalaItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString((String) null);
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(9, 10);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "", 3, usedItemCondition0, (String) null, "", bigDecimal0, ".\u0007>jp;N", 3, (String) null, 10, 0);
      // Undeclared exception!
      try { 
        premiumMalaItem0.getPriceCorrection((-936));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Current year cannot be before collection year
         //
         verifyException("impl.MalaItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(753, 753);
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      PremiumMalaItem premiumMalaItem0 = null;
      try {
        premiumMalaItem0 = new PremiumMalaItem(uUID0, "3f", (-786), usedItemCondition0, "3f", "3f", bigDecimal0, "3f", 753, "3f", 2387, 753);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Stock cannot be negative
         //
         verifyException("com.marketplace.vintage.item.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 2);
      BigDecimal bigDecimal0 = new BigDecimal((double) 0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "gH2bbTNkEX+qpH", 0, usedItemCondition0, "gH2bbTNkEX+qpH", ", material='", bigDecimal0, ", material='", (-2865), "gH2bbTNkEX+qpH", 0, 8);
      int int0 = premiumMalaItem0.getAppreciationRateOverYears();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(", basePrice=");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(2041, (-1173));
      BigDecimal bigDecimal0 = new BigDecimal((-1173));
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "", 2041, usedItemCondition0, "", "impl.MalaItem", bigDecimal0, "impl.MalaItem", 0, "*h$==gw',", 1567, 1567);
      PremiumMalaItem premiumMalaItem1 = new PremiumMalaItem(premiumMalaItem0);
      boolean boolean0 = premiumMalaItem0.equals(premiumMalaItem1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString((String) null);
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(9, 10);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "", 3, usedItemCondition0, (String) null, "", bigDecimal0, ".\u0007>jp;N", 3, (String) null, 10, 0);
      boolean boolean0 = premiumMalaItem0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(", basePrice=");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(2041, (-1173));
      BigDecimal bigDecimal0 = new BigDecimal((-1173));
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "", 2041, usedItemCondition0, "", "impl.MalaItem", bigDecimal0, "impl.MalaItem", 0, "*h$==gw',", 1567, 1567);
      boolean boolean0 = premiumMalaItem0.equals(premiumMalaItem0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 2);
      BigDecimal bigDecimal0 = new BigDecimal((double) 0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "gH2bbTNkEX+qpH", 0, usedItemCondition0, "gH2bbTNkEX+qpH", ", material='", bigDecimal0, ", material='", (-2865), "gH2bbTNkEX+qpH", 0, 8);
      boolean boolean0 = premiumMalaItem0.equals(", material='");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(7, 7);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "Zn)YRCC!!&fED nk", 7, usedItemCondition0, "Zn)YRCC!!&fED nk", "Zn)YRCC!!&fED nk", (BigDecimal) null, "Zn)YRCC!!&fED nk", 7, "Zn)YRCC!!&fED nk", 7, 7);
      Class<Object> class0 = Object.class;
      ItemProperty itemProperty0 = ItemProperty.APPRECIATION_RATE_OVER_YEARS;
      Object object0 = premiumMalaItem0.getProperty(itemProperty0, class0);
      assertEquals(7, object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 2);
      BigDecimal bigDecimal0 = new BigDecimal((double) 0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "gH2bbTNkEX+qpH", 0, usedItemCondition0, "gH2bbTNkEX+qpH", ", material='", bigDecimal0, ", material='", (-2865), "gH2bbTNkEX+qpH", 0, 8);
      Item item0 = premiumMalaItem0.clone();
      assertEquals("gH2bbTNkEX+qpH", item0.getAlphanumericId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 2);
      BigDecimal bigDecimal0 = new BigDecimal((double) 0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "gH2bbTNkEX+qpH", 0, usedItemCondition0, "gH2bbTNkEX+qpH", ", material='", bigDecimal0, ", material='", (-2865), "gH2bbTNkEX+qpH", 0, 8);
      premiumMalaItem0.getPriceCorrection(5240);
      // Undeclared exception!
      premiumMalaItem0.getPriceCorrection(5240);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 2);
      BigDecimal bigDecimal0 = new BigDecimal((double) 0);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "gH2bbTNkEX+qpH", 0, usedItemCondition0, "gH2bbTNkEX+qpH", ", material='", bigDecimal0, ", material='", (-2865), "gH2bbTNkEX+qpH", 0, 8);
      ItemType itemType0 = premiumMalaItem0.getItemType();
      assertTrue(itemType0.isPremium());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString((String) null);
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(9, 10);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "", 3, usedItemCondition0, (String) null, "", bigDecimal0, ".\u0007>jp;N", 3, (String) null, 10, 0);
      String string0 = premiumMalaItem0.toString();
      assertEquals("PremiumMalaItem{alphanumericID='', itemCondition=Used (9/10, 10 previous owners), description='null', brand='', basePrice=0, parcelCarrierName=.\u0007>jp;N, dimensionArea=3, material='null', collectionYear=10, appreciationRateOverYears=0}", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString((String) null);
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(9, 10);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "", 3, usedItemCondition0, (String) null, "", bigDecimal0, ".\u0007>jp;N", 3, (String) null, 10, 0);
      premiumMalaItem0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PremiumMalaItem premiumMalaItem0 = null;
      try {
        premiumMalaItem0 = new PremiumMalaItem((PremiumMalaItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("impl.PremiumMalaItem", e);
      }
  }
}
