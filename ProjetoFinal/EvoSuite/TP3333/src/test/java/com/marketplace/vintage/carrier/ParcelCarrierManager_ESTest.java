/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:33:33 GMT 2024
 */

package com.marketplace.vintage.carrier;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.carrier.NormalParcelCarrier;
import com.marketplace.vintage.carrier.ParcelCarrier;
import com.marketplace.vintage.carrier.ParcelCarrierManager;
import com.marketplace.vintage.carrier.ParcelCarrierType;
import com.marketplace.vintage.carrier.PremiumParcelCarrier;
import com.marketplace.vintage.item.ItemType;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParcelCarrierManager_ESTest extends ParcelCarrierManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("SC{&s|O68,", "*~#");
      parcelCarrierManager0.registerParcelCarrier(premiumParcelCarrier0);
      ItemType itemType0 = ItemType.MALA_PREMIUM;
      List<ParcelCarrier> list0 = parcelCarrierManager0.getAllCompatibleWith(itemType0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      NormalParcelCarrier normalParcelCarrier0 = new NormalParcelCarrier((String) null, (String) null);
      parcelCarrierManager0.registerParcelCarrier(normalParcelCarrier0);
      List<ParcelCarrier> list0 = parcelCarrierManager0.getAll();
      assertEquals(1, list0.size());
  }

  /*
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      // Undeclared exception!
      try { 
        parcelCarrierManager0.registerParcelCarrier((ParcelCarrier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.carrier.ParcelCarrierManager", e);
      }
  }

   */

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("", "");
      parcelCarrierManager0.registerParcelCarrier(premiumParcelCarrier0);
      // Undeclared exception!
      try { 
        parcelCarrierManager0.getAllCompatibleWith((ItemType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.carrier.PremiumParcelCarrier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("", "");
      parcelCarrierManager0.registerParcelCarrier(premiumParcelCarrier0);
      parcelCarrierManager0.updateParcelCarrier("", (ParcelCarrier) null);
      // Undeclared exception!
      try { 
        parcelCarrierManager0.getAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.ReferencePipeline$3$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      List<ParcelCarrier> list0 = parcelCarrierManager0.getAll();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      NormalParcelCarrier normalParcelCarrier0 = new NormalParcelCarrier(" was not found", "");
      // Undeclared exception!
      try { 
        parcelCarrierManager0.updateParcelCarrier("", normalParcelCarrier0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A carrier with the name  was not found
         //
         verifyException("com.marketplace.vintage.carrier.ParcelCarrierManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      boolean boolean0 = parcelCarrierManager0.containsCarrierByName("ParcelCarrier{name='null', expeditionPriceExpression='null', type=PREMIUM}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      // Undeclared exception!
      try { 
        parcelCarrierManager0.getCarrierByName("|38,?7-[rxq=.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A carrier with the name |38,?7-[rxq=. was not found
         //
         verifyException("com.marketplace.vintage.carrier.ParcelCarrierManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier((String) null, (String) null);
      parcelCarrierManager0.registerParcelCarrier(premiumParcelCarrier0);
      ParcelCarrier parcelCarrier0 = parcelCarrierManager0.getCarrierByName((String) null);
      assertEquals(ParcelCarrierType.PREMIUM, parcelCarrier0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier((String) null, (String) null);
      parcelCarrierManager0.registerParcelCarrier(premiumParcelCarrier0);
      // Undeclared exception!
      try { 
        parcelCarrierManager0.registerParcelCarrier(premiumParcelCarrier0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A carrier with that name already exists
         //
         verifyException("com.marketplace.vintage.carrier.ParcelCarrierManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("", "");
      parcelCarrierManager0.registerParcelCarrier(premiumParcelCarrier0);
      boolean boolean0 = parcelCarrierManager0.containsCarrierByName("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParcelCarrierManager parcelCarrierManager0 = new ParcelCarrierManager();
      ItemType itemType0 = ItemType.SAPATILHAS;
      List<ParcelCarrier> list0 = parcelCarrierManager0.getAllCompatibleWith(itemType0);
      assertEquals(0, list0.size());
  }
}
