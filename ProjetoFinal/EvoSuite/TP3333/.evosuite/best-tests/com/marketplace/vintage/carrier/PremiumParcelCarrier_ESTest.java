/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 21:03:44 GMT 2024
 */

package com.marketplace.vintage.carrier;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.carrier.ParcelCarrier;
import com.marketplace.vintage.carrier.ParcelCarrierType;
import com.marketplace.vintage.carrier.PremiumParcelCarrier;
import com.marketplace.vintage.item.ItemType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PremiumParcelCarrier_ESTest extends PremiumParcelCarrier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("", "");
      ItemType itemType0 = ItemType.SAPATILHAS_PREMIUM;
      boolean boolean0 = premiumParcelCarrier0.canDeliverItemType(itemType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("e", "e");
      ItemType itemType0 = ItemType.MALA;
      boolean boolean0 = premiumParcelCarrier0.canDeliverItemType(itemType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PremiumParcelCarrier premiumParcelCarrier0 = null;
      try {
        premiumParcelCarrier0 = new PremiumParcelCarrier((PremiumParcelCarrier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.carrier.ParcelCarrier", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("Invalid number of items on the output queue. Might be caused by an invalid number of arguments for a function.", "Invalid number of items on the output queue. Might be caused by an invalid number of arguments for a function.");
      PremiumParcelCarrier premiumParcelCarrier1 = new PremiumParcelCarrier(premiumParcelCarrier0);
      assertEquals(ParcelCarrierType.PREMIUM, premiumParcelCarrier1.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("", "");
      // Undeclared exception!
      try { 
        premiumParcelCarrier0.canDeliverItemType((ItemType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.carrier.PremiumParcelCarrier", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PremiumParcelCarrier premiumParcelCarrier0 = new PremiumParcelCarrier("Invalid number of items on the output queue. Might be caused by an invalid number of arguments for a function.", "Invalid number of items on the output queue. Might be caused by an invalid number of arguments for a function.");
      ParcelCarrier parcelCarrier0 = premiumParcelCarrier0.clone();
      assertNotSame(parcelCarrier0, premiumParcelCarrier0);
  }
}
