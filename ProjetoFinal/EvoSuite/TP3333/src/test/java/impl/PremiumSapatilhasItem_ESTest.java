/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:24:04 GMT 2024
 */

package impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.item.ItemProperty;
import com.marketplace.vintage.item.condition.ItemCondition;
import com.marketplace.vintage.item.condition.UsedItemCondition;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PremiumSapatilhasItem_ESTest extends PremiumSapatilhasItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem((UUID) null, "Z2TIL\"o>GrCw,H0t?3", 532, (ItemCondition) null, "Z2TIL\"o>GrCw,H0t?3", "Z2TIL\"o>GrCw,H0t?3", (BigDecimal) null, "Z2TIL\"o>GrCw,H0t?3", 532, false, "Z2TIL\"o>GrCw,H0t?3", 0, 532);
      PremiumSapatilhasItem premiumSapatilhasItem1 = new PremiumSapatilhasItem((UUID) null, "Z2TIL\"o>GrCw,H0t?3", 532, (ItemCondition) null, "Z2TIL\"o>GrCw,H0t?3", "Z2TIL\"o>GrCw,H0t?3", (BigDecimal) null, "Z2TIL\"o>GrCw,H0t?3", 532, false, "Z2TIL\"o>GrCw,H0t?3", 0, 0);
      boolean boolean0 = premiumSapatilhasItem1.equals(premiumSapatilhasItem0);
      assertEquals(532, premiumSapatilhasItem0.getAppreciationRateOverYears());
      assertFalse(premiumSapatilhasItem0.equals((Object)premiumSapatilhasItem1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(10, 0);
      BigDecimal bigDecimal0 = new BigDecimal(1206);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, ", brand='", 487, usedItemCondition0, "", "", bigDecimal0, (String) null, 3, false, (String) null, 487, 0);
      ItemProperty itemProperty0 = ItemProperty.PARCEL_CARRIER_NAME;
      Class<Object> class0 = Object.class;
      premiumSapatilhasItem0.getProperty(itemProperty0, class0);
      assertEquals(0, premiumSapatilhasItem0.getAppreciationRateOverYears());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = new BigDecimal(1L);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "", 2878, (ItemCondition) null, "iHGg[", "", bigDecimal0, "", 2878, false, "iHGg[", (-1), (-3478));
      BigDecimal bigDecimal1 = premiumSapatilhasItem0.getPriceCorrection(8);
      assertEquals((short)14871, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("`Yh.ezMhf'yAmiB^sQ");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      BigDecimal bigDecimal0 = new BigDecimal((-2148.608));
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "`Yh.ezMhf'yAmiB^sQ", 0, usedItemCondition0, "`Yh.ezMhf'yAmiB^sQ", "`Yh.ezMhf'yAmiB^sQ", bigDecimal0, "`Yh.ezMhf'yAmiB^sQ", 0, false, "`Yh.ezMhf'yAmiB^sQ", (-297), (-297));
      BigDecimal bigDecimal1 = premiumSapatilhasItem0.getPriceCorrection(0);
      assertEquals((short) (-27774), bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString(",YB");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      BigInteger bigInteger0 = BigInteger.ONE;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, ",YB", 0, usedItemCondition0, ",YB", "#8bg6", bigDecimal0, "#8bg6", 0, false, "#8bg6", 0, 0);
      int int0 = premiumSapatilhasItem0.getAppreciationRateOverYears();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "U^2sW^6E@zg1~1V]", 0, usedItemCondition0, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", (BigDecimal) null, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", 2916, false, "impl.PremiumSapatilhasItem", 125, 8);
      int int0 = premiumSapatilhasItem0.getAppreciationRateOverYears();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-879), 1123);
      BigDecimal bigDecimal0 = new BigDecimal((double) 1123);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "DIMENSION_AREA", 1123, usedItemCondition0, "DIMENSION_AREA", "", bigDecimal0, (String) null, (-879), false, (String) null, (-879), 1123);
      premiumSapatilhasItem0.clone();
      assertEquals(1123, premiumSapatilhasItem0.getAppreciationRateOverYears());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = new BigDecimal(1L);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "", 2878, (ItemCondition) null, "iHGg[", "", bigDecimal0, "", 2878, false, "iHGg[", (-1), (-3478));
      ItemProperty itemProperty0 = ItemProperty.COLLECTION_YEAR;
      // Undeclared exception!
      try { 
        premiumSapatilhasItem0.getProperty(itemProperty0, (Class<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("impl.SapatilhasItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("_E<0#CH*ltKuVs");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(11, 0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "", 11, usedItemCondition0, "", "", bigDecimal0, "P}oh5^J~nH\"&f`wx", 14, false, ", parcelCarrierName=", 14, 0);
      ItemProperty itemProperty0 = ItemProperty.PARCEL_CARRIER_NAME;
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        premiumSapatilhasItem0.getProperty(itemProperty0, class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigInteger bigInteger0 = BigInteger.TEN;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = null;
      try {
        premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "com.marketplace.vintage.item.condition.UsedItemCondition", (-1197), (ItemCondition) null, "com.marketplace.vintage.item.condition.UsedItemCondition", "com.marketplace.vintage.item.condition.UsedItemCondition", bigDecimal0, "com.marketplace.vintage.item.condition.UsedItemCondition", 2193, false, "!8]]", 0, 2193);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Stock cannot be negative
         //
         verifyException("com.marketplace.vintage.item.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PremiumSapatilhasItem premiumSapatilhasItem0 = null;
      try {
        premiumSapatilhasItem0 = new PremiumSapatilhasItem((PremiumSapatilhasItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("impl.PremiumSapatilhasItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("`Yh.ezMhf'yAmiB^sQ");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      BigDecimal bigDecimal0 = new BigDecimal((-2148.608));
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "`Yh.ezMhf'yAmiB^sQ", 0, usedItemCondition0, "`Yh.ezMhf'yAmiB^sQ", "`Yh.ezMhf'yAmiB^sQ", bigDecimal0, "`Yh.ezMhf'yAmiB^sQ", 0, false, "`Yh.ezMhf'yAmiB^sQ", (-297), (-297));
      int int0 = premiumSapatilhasItem0.getAppreciationRateOverYears();
      assertEquals((-297), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem((UUID) null, "Z2TIL\"o>GrCw,H0t?3", 532, (ItemCondition) null, "Z2TIL\"o>GrCw,H0t?3", "Z2TIL\"o>GrCw,H0t?3", (BigDecimal) null, "Z2TIL\"o>GrCw,H0t?3", 532, false, "Z2TIL\"o>GrCw,H0t?3", 0, 532);
      PremiumSapatilhasItem premiumSapatilhasItem1 = new PremiumSapatilhasItem((UUID) null, "Z2TIL\"o>GrCw,H0t?3", 532, (ItemCondition) null, "Z2TIL\"o>GrCw,H0t?3", "Z2TIL\"o>GrCw,H0t?3", (BigDecimal) null, "Z2TIL\"o>GrCw,H0t?3", 532, false, "Z2TIL\"o>GrCw,H0t?3", 0, 0);
      PremiumSapatilhasItem premiumSapatilhasItem2 = new PremiumSapatilhasItem(premiumSapatilhasItem1);
      boolean boolean0 = premiumSapatilhasItem0.equals(premiumSapatilhasItem2);
      assertFalse(premiumSapatilhasItem2.equals((Object)premiumSapatilhasItem0));
      assertEquals(532, premiumSapatilhasItem0.getAppreciationRateOverYears());
      assertFalse(boolean0);
      assertTrue(premiumSapatilhasItem2.equals((Object)premiumSapatilhasItem1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("_E<0#CH*ltKuVs");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(11, 0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "", 11, usedItemCondition0, "", "", bigDecimal0, "P}oh5^J~nH\"&f`wx", 14, false, ", parcelCarrierName=", 14, 0);
      PremiumSapatilhasItem premiumSapatilhasItem1 = new PremiumSapatilhasItem(uUID0, "_E<0#CH*ltKuVs", 556, usedItemCondition0, "Current year cannot be before collection year", ", description='", bigDecimal0, ", parcelCarrierName=", 318, false, " was found", 11, 39);
      boolean boolean0 = premiumSapatilhasItem0.equals(premiumSapatilhasItem1);
      assertFalse(boolean0);
      assertEquals(39, premiumSapatilhasItem1.getAppreciationRateOverYears());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, (-130));
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, (String) null, 0, usedItemCondition0, (String) null, (String) null, bigDecimal0, (String) null, 0, true, (String) null, (-130), 0);
      PremiumSapatilhasItem premiumSapatilhasItem1 = new PremiumSapatilhasItem(premiumSapatilhasItem0);
      boolean boolean0 = premiumSapatilhasItem0.equals(premiumSapatilhasItem1);
      assertEquals(0, premiumSapatilhasItem1.getAppreciationRateOverYears());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, (-130));
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, (String) null, 0, usedItemCondition0, (String) null, (String) null, bigDecimal0, (String) null, 0, true, (String) null, (-130), 0);
      boolean boolean0 = premiumSapatilhasItem0.equals(premiumSapatilhasItem0);
      assertEquals(0, premiumSapatilhasItem0.getAppreciationRateOverYears());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = BigDecimal.valueOf((long) 3);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "f", 3, (ItemCondition) null, "f", "f", bigDecimal0, "f", 3, false, "f", 3, (-3463));
      boolean boolean0 = premiumSapatilhasItem0.equals("f");
      assertFalse(boolean0);
      assertEquals((-3463), premiumSapatilhasItem0.getAppreciationRateOverYears());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      BigDecimal bigDecimal0 = BigDecimal.valueOf((long) 3);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "f", 3, (ItemCondition) null, "f", "f", bigDecimal0, "f", 3, false, "f", 3, (-3463));
      ItemProperty itemProperty0 = ItemProperty.APPRECIATION_RATE_OVER_YEARS;
      Class<Object> class0 = Object.class;
      Object object0 = premiumSapatilhasItem0.getProperty(itemProperty0, class0);
      assertEquals((-3463), object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(2, 2649);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "", 2, usedItemCondition0, "", ", description='", bigDecimal0, ", description='", (-36), true, ", hasLaces=", (-36), (-3312));
      ItemProperty itemProperty0 = ItemProperty.MATERIAL;
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        premiumSapatilhasItem0.getProperty(itemProperty0, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Property not available in item: MATERIAL
         //
         verifyException("com.marketplace.vintage.item.Item", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-1659), (-1659));
      BigDecimal bigDecimal0 = new BigDecimal(124);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, (String) null, 124, usedItemCondition0, "D@mLd'!8dE^R@cd", (String) null, bigDecimal0, (String) null, (-178), false, (String) null, (-1280), (-1659));
      premiumSapatilhasItem0.getPriceCorrection(4234);
      // Undeclared exception!
      premiumSapatilhasItem0.getPriceCorrection(4234);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "U^2sW^6E@zg1~1V]", 0, usedItemCondition0, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", (BigDecimal) null, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", 2916, false, "impl.PremiumSapatilhasItem", 125, 8);
      // Undeclared exception!
      try { 
        premiumSapatilhasItem0.getPriceCorrection(2916);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("impl.PremiumSapatilhasItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(2, 2);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "ye2_", 2, usedItemCondition0, "QX[9uj", "QX[9uj", bigDecimal0, "LARGE", 0, false, "ye2_", (-1468), (-170));
      // Undeclared exception!
      try { 
        premiumSapatilhasItem0.getPriceCorrection((-2430));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Current year cannot be before collection year
         //
         verifyException("impl.PremiumSapatilhasItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "U^2sW^6E@zg1~1V]", 0, usedItemCondition0, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", (BigDecimal) null, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", 2916, false, "impl.PremiumSapatilhasItem", 125, 8);
      BigDecimal bigDecimal0 = premiumSapatilhasItem0.getPriceCorrection(125);
      assertEquals(8, premiumSapatilhasItem0.getAppreciationRateOverYears());
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "U^2sW^6E@zg1~1V]", 0, usedItemCondition0, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", (BigDecimal) null, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", 2916, false, "impl.PremiumSapatilhasItem", 125, 8);
      premiumSapatilhasItem0.clone();
      assertEquals(8, premiumSapatilhasItem0.getAppreciationRateOverYears());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(8, 0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "U^2sW^6E@zg1~1V]", 0, usedItemCondition0, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", (BigDecimal) null, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", 2916, false, "impl.PremiumSapatilhasItem", 125, 8);
      String string0 = premiumSapatilhasItem0.toString();
      assertEquals("PremiumSapatilhasItem{appreciationRateOverYears=8, alphanumericID='U^2sW^6E@zg1~1V]', itemCondition=Used (8/10, 0 previous owners), description='Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)', brand='Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)', basePrice=null, parcelCarrierName=Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners), size=2916, hasLaces=false, color='impl.PremiumSapatilhasItem', collectionYear=125}", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-1659), (-1659));
      BigDecimal bigDecimal0 = new BigDecimal(124);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, (String) null, 124, usedItemCondition0, "D@mLd'!8dE^R@cd", (String) null, bigDecimal0, (String) null, (-178), false, (String) null, (-1280), (-1659));
      premiumSapatilhasItem0.hashCode();
      assertEquals((-1659), premiumSapatilhasItem0.getAppreciationRateOverYears());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(2, 2649);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "", 2, usedItemCondition0, "", ", description='", bigDecimal0, ", description='", (-36), true, ", hasLaces=", (-36), (-3312));
      premiumSapatilhasItem0.getItemType();
      assertEquals((-3312), premiumSapatilhasItem0.getAppreciationRateOverYears());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem((UUID) null, "Z2TIL\"o>GrCw,H0t?3", 532, (ItemCondition) null, "Z2TIL\"o>GrCw,H0t?3", "Z2TIL\"o>GrCw,H0t?3", (BigDecimal) null, "Z2TIL\"o>GrCw,H0t?3", 532, false, "Z2TIL\"o>GrCw,H0t?3", 15, 532);
      boolean boolean0 = premiumSapatilhasItem0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(532, premiumSapatilhasItem0.getAppreciationRateOverYears());
  }
}
