/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:27:15 GMT 2024
 */

package com.marketplace.vintage;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.item.Item;
import com.marketplace.vintage.item.ItemManager;
import com.marketplace.vintage.item.condition.UsedItemCondition;
import impl.MalaItem;
import impl.PremiumMalaItem;
import impl.PremiumSapatilhasItem;
import impl.SapatilhasItem;
import impl.TshirtItem;
import java.math.BigDecimal;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ItemManager_ESTest extends ItemManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      itemManager0.getAllItems();
      itemManager0.generateUniqueCode();
      itemManager0.getAllItems();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-1), 1858);
      String string0 = ", brand='";
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem((UUID) null, "AAA-AAA", 401, usedItemCondition0, "AAA-AAA", ", brand='", bigDecimal0, "AAA-AAA", (-3957), "CoSD{8+bDLB={J", (-3803), (-3803));
      premiumMalaItem0.clone();
      premiumMalaItem0.setCurrentStock(3427);
      MalaItem malaItem0 = new MalaItem(premiumMalaItem0);
      malaItem0.clone();
      itemManager0.registerItem(malaItem0);
      Item item0 = itemManager0.getItem("AAA-AAA");
      itemManager0.getAllItems();
      itemManager0.getItem("AAA-AAA");
      itemManager0.updateItem(item0);
      itemManager0.generateUniqueCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      BigDecimal bigDecimal0 = BigDecimal.valueOf(1.0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem((UUID) null, "fuf%", 0, usedItemCondition0, "AAA-AAA", "fuf%", bigDecimal0, "An item with the id ", 0, true, "AAA-AAA", 2766, 1920);
      PremiumSapatilhasItem premiumSapatilhasItem1 = new PremiumSapatilhasItem(premiumSapatilhasItem0);
      Item item0 = premiumSapatilhasItem1.clone();
      itemManager0.registerItem(item0);
      Item item1 = itemManager0.getItem("fuf%");
      // Undeclared exception!
      try { 
        itemManager0.registerItem(item1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with that id already exists
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      itemManager0.containsItemById("XXX-XXX");
      itemManager0.generateUniqueCode();
      UUID uUID0 = MockUUID.fromString("AAA-AAA");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-2004318069), 3202);
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "XXX-XXX", 1190, usedItemCondition0, "Used (<conditionLevel>/10, <numberOfPreviousOwners> previous owners)", "AAA-AAA", bigDecimal0, "_", (-582), false, "I;B", (-2013265918), (-582));
      PremiumSapatilhasItem premiumSapatilhasItem1 = new PremiumSapatilhasItem(premiumSapatilhasItem0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(premiumSapatilhasItem1);
      // Undeclared exception!
      try { 
        itemManager0.registerItem(sapatilhasItem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The item id must be of the format XXX-XXX
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(1, 1);
      String string0 = null;
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      String string1 = "loeU";
      bigDecimal0.toPlainString();
      MalaItem malaItem0 = new MalaItem(uUID0, "", 1, usedItemCondition0, (String) null, "", bigDecimal0, "loeU", (-1098), "", (-1098), 1793);
      itemManager0.registerItem(malaItem0);
      malaItem0.setCurrentStock(1);
      itemManager0.containsItemById("pbvN5=~X");
      itemManager0.updateItem(malaItem0);
      itemManager0.containsItemById("F#-F/AMPZRZb");
      // Undeclared exception!
      try { 
        itemManager0.getItem((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with the id null was not found
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      String string0 = null;
      BigDecimal bigDecimal0 = new BigDecimal((-1311));
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "uwq", 0, usedItemCondition0, "DEPRECIATION_RATE_OVER_YEARS", (String) null, bigDecimal0, "An item with the id ", 0, true, "", 0, 0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(premiumSapatilhasItem0);
      BigDecimal.valueOf(5276L);
      usedItemCondition0.toString();
      itemManager0.registerItem(sapatilhasItem0);
      itemManager0.getAllItems();
      Object object0 = new Object();
      premiumSapatilhasItem0.equals(object0);
      itemManager0.getAllItems();
      // Undeclared exception!
      try { 
        itemManager0.registerItem(premiumSapatilhasItem0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with that id already exists
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      UUID uUID0 = MockUUID.fromString("");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      SapatilhasItem sapatilhasItem0 = new SapatilhasItem(uUID0, "", 4432, usedItemCondition0, "", "", (BigDecimal) null, "", (-1), true, "", 4432);
      itemManager0.registerItem(sapatilhasItem0);
      itemManager0.containsItemById("");
      itemManager0.getItem("");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, (-561));
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      TshirtItem.TshirtItemSize tshirtItem_TshirtItemSize0 = TshirtItem.TshirtItemSize.MEDIUM;
      TshirtItem.TshirtItemPattern tshirtItem_TshirtItemPattern0 = TshirtItem.TshirtItemPattern.PALM_TREES;
      TshirtItem tshirtItem0 = new TshirtItem((UUID) null, "", 488, usedItemCondition0, "", "", bigDecimal0, "", tshirtItem_TshirtItemSize0, tshirtItem_TshirtItemPattern0);
      itemManager0.registerItem(tshirtItem0);
      // Undeclared exception!
      try { 
        itemManager0.registerItem(tshirtItem0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with that id already exists
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      itemManager0.getAllItems();
      String string0 = "5-4q@|aw52V\\";
      itemManager0.containsItemById("5-4q@|aw52V");
      UUID uUID0 = null;
      String string1 = "feT";
      int int0 = 5;
      int int1 = 0;
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(155, 0);
      usedItemCondition0.toString();
      String string2 = "";
      usedItemCondition0.getDisplayString();
      BigDecimal bigDecimal0 = null;
      String string3 = ">}&gG6up-mT8z6|";
      int int2 = 0;
      String string4 = "3<yq\"O<V,J-=@Sk";
      Item item0 = null;
      itemManager0.generateUniqueCode();
      // Undeclared exception!
      try { 
        itemManager0.registerItem((Item) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      // Undeclared exception!
      try { 
        itemManager0.updateItem((Item) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      itemManager0.containsItemById("6");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-934), (-726));
      BigDecimal bigDecimal0 = new BigDecimal((-934));
      MalaItem malaItem0 = new MalaItem((UUID) null, "N", 39, usedItemCondition0, "S'9OlslhyDYg3z", "", bigDecimal0, "N", (-726), "", (-827), (-1618));
      itemManager0.registerItem(malaItem0);
      // Undeclared exception!
      try { 
        itemManager0.getItem((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with the id null was not found
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(1386, 1386);
      usedItemCondition0.getDisplayString();
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "SMALL", 1386, usedItemCondition0, "M=RfS#}WU\"LA9k", "SMALL", (BigDecimal) null, "~\"~(/?", 4360, "M=RfS#}WU\"LA9k", 4360, 12);
      // Undeclared exception!
      try { 
        itemManager0.updateItem(premiumMalaItem0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with the id SMALL was not found
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      UUID uUID0 = MockUUID.fromString("#&9.T&");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      BigDecimal bigDecimal0 = new BigDecimal((-819.217));
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "SMALL", 0, usedItemCondition0, "Q]k)}D]iYeJcfg 5^", "A#T}fQd", bigDecimal0, "#&9.T&", 0, "A#T}fQd", 0, 0);
      PremiumMalaItem premiumMalaItem1 = new PremiumMalaItem(premiumMalaItem0);
      Item item0 = premiumMalaItem1.clone();
      itemManager0.registerItem(item0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      itemManager0.generateUniqueCode();
      // Undeclared exception!
      try { 
        itemManager0.registerItem((Item) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      itemManager0.generateUniqueCode();
      // Undeclared exception!
      try { 
        itemManager0.getItem("PO)dIr");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with the id PO)dIr was not found
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      UUID uUID0 = MockUUID.fromString(".Q");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(0, 0);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      MalaItem malaItem0 = new MalaItem(uUID0, ".Q", 0, usedItemCondition0, ".Q", "I/.Y(PD[FhbhET", bigDecimal0, ".Q", (-1820), "_a txV[&@\"7Lg6L", (-158), 0);
      // Undeclared exception!
      try { 
        itemManager0.updateItem(malaItem0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with the id .Q was not found
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      itemManager0.getAllItems();
      itemManager0.generateUniqueCode();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition((-1), 1858);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem((UUID) null, "AAA-AAA", 401, usedItemCondition0, "AAA-AAA", "AAA-AAA", bigDecimal0, "AAA-AAA", (-3957), "CoSD{8+bDLB={J", (-3803), (-3803));
      premiumMalaItem0.clone();
      premiumMalaItem0.setCurrentStock(3427);
      MalaItem malaItem0 = new MalaItem(premiumMalaItem0);
      itemManager0.registerItem(malaItem0);
      itemManager0.updateItem(premiumMalaItem0);
      // Undeclared exception!
      itemManager0.generateUniqueCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      itemManager0.generateUniqueCode();
      UUID uUID0 = MockUUID.randomUUID();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(79, 79);
      BigDecimal bigDecimal0 = new BigDecimal(79);
      PremiumMalaItem premiumMalaItem0 = new PremiumMalaItem(uUID0, "AAA-AAA", 79, usedItemCondition0, "AAA-AAA", "AAA-AAA", bigDecimal0, "AAA-AAA", 79, "AAA-AAA", 79, 79);
      itemManager0.getAllItems();
      // Undeclared exception!
      try { 
        itemManager0.updateItem(premiumMalaItem0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with the id AAA-AAA was not found
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(2963, 2963);
      BigDecimal bigDecimal0 = new BigDecimal((double) 2963);
      TshirtItem.TshirtItemSize tshirtItem_TshirtItemSize0 = TshirtItem.TshirtItemSize.MEDIUM;
      TshirtItem.TshirtItemPattern tshirtItem_TshirtItemPattern0 = TshirtItem.TshirtItemPattern.STRIPES;
      TshirtItem tshirtItem0 = new TshirtItem((UUID) null, "", 2963, usedItemCondition0, "", "", bigDecimal0, "", tshirtItem_TshirtItemSize0, tshirtItem_TshirtItemPattern0);
      itemManager0.registerItem(tshirtItem0);
      Item item0 = itemManager0.getItem("");
      itemManager0.updateItem(item0);
      itemManager0.containsItemById("");
      // Undeclared exception!
      try { 
        itemManager0.registerItem(item0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with that id already exists
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      itemManager0.containsItemById("XXX-XXX");
      itemManager0.generateUniqueCode();
      UUID uUID0 = MockUUID.fromString("AAA-AAA");
      UsedItemCondition usedItemCondition0 = new UsedItemCondition(1190, 1190);
      BigDecimal bigDecimal0 = new BigDecimal((double) 1190);
      PremiumSapatilhasItem premiumSapatilhasItem0 = new PremiumSapatilhasItem(uUID0, "XXX-XXX", 1190, usedItemCondition0, "XXX-XXX", "AAA-AAA", bigDecimal0, "AAA-AAA", 1190, false, "AAA-AAA", 1190, 1190);
      // Undeclared exception!
      try { 
        itemManager0.registerItem(premiumSapatilhasItem0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The item id must be of the format XXX-XXX
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ItemManager itemManager0 = new ItemManager();
      // Undeclared exception!
      try { 
        itemManager0.getItem("Y\"la+8}!dQ<s+A");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // An item with the id Y\"la+8}!dQ<s+A was not found
         //
         verifyException("com.marketplace.vintage.item.ItemManager", e);
      }
  }
}
