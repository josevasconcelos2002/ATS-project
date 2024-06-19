/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 21:13:32 GMT 2024
 */

package com.marketplace.vintage.user;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.user.User;
import com.marketplace.vintage.user.UserController;
import com.marketplace.vintage.user.UserManager;
import java.util.List;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UserController_ESTest extends UserController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      User user0 = userController0.createUser("u~li", "u~li", "D)l", "", "cF6Az'>$T%[F");
      userController0.cleanShoppingCart(user0);
      assertEquals("cF6Az'>$T%[F", user0.getTaxNumber());
      assertEquals("", user0.getAddress());
      assertEquals("u~li", user0.getEmail());
      assertEquals("D)l", user0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      User user0 = userController0.createUser("u~li", "u~li", "D)l", "", "cF6Az'>$T%[F");
      userController0.addCompletedSellOrderId(user0, "D)l");
      assertEquals("", user0.getAddress());
      assertEquals("u~li", user0.getEmail());
      assertEquals("D)l", user0.getName());
      assertEquals("cF6Az'>$T%[F", user0.getTaxNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      User user0 = userController0.createUser("com.marketplace.vintage.exceptions.EntityNotFoundException", "#mc3e", "com.marketplace.vintage.exceptions.EntityNotFoundException", "#mc3e", "com.marketplace.vintage.exceptions.EntityNotFoundException");
      assertEquals("#mc3e", user0.getEmail());
      
      userController0.addCompletedOrderId(user0, "#mc3e");
      assertEquals("com.marketplace.vintage.exceptions.EntityNotFoundException", user0.getUsername());
      assertEquals("com.marketplace.vintage.exceptions.EntityNotFoundException", user0.getName());
      assertEquals("#mc3e", user0.getAddress());
      assertEquals("com.marketplace.vintage.exceptions.EntityNotFoundException", user0.getTaxNumber());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      userManager0.createUser("p(T\fV*hS`30|gpE", "H/[r_-.W}6hVnb|aCH", "ge*La:2W>_wQ S9qb", "", "The user's username cannot contain spaces");
      User user0 = userController0.getUserByUsername("p(T\fV*hS`30|gpE");
      assertEquals("", user0.getAddress());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      userController0.createUser("u~li", "u~li", "D)l", "", "cF6Az'>$T%[F");
      Random.setNextRandom(0);
      UUID uUID0 = MockUUID.fromString("D)l");
      User user0 = userController0.getUserById(uUID0);
      assertEquals("cF6Az'>$T%[F", user0.getTaxNumber());
      assertEquals("D)l", user0.getName());
      assertEquals("u~li", user0.getEmail());
      assertEquals("", user0.getAddress());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      userController0.createUser("u~li", "u~li", "u~li", "u~li", "u~li");
      User user0 = userController0.getUserByEmail("u~li");
      assertEquals("u~li", user0.getTaxNumber());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      List<User> list0 = userController0.getAll();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      userController0.createUser("u~li", "u~li", "D)l", "", "cF6Az'>$T%[F");
      List<User> list0 = userController0.getAll();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      userController0.createUser("u~li", "u~li", "D)l", "", "cF6Az'>$T%[F");
      boolean boolean0 = userController0.existsUserWithUsername("u~li");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      User user0 = userController0.createUser("Rx@F@", "Rx@F@", "", "", (String) null);
      assertEquals("", user0.getName());
      assertEquals("", user0.getAddress());
      
      boolean boolean0 = userController0.existsUserWithEmail("Rx@F@");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      userController0.createUser("t69[}Ix?=7`S*'d`Y", "t69[}Ix?=7`S*'d`Y", "t69[}Ix?=7`S*'d`Y", "t69[}Ix?=7`S*'d`Y", "2i#:<ZJ}SP4?6");
      // Undeclared exception!
      try { 
        userController0.validateUsername("t69[}Ix?=7`S*'d`Y");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A user with that username already exists
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UserController userController0 = new UserController((UserManager) null);
      // Undeclared exception!
      try { 
        userController0.validateUsername("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      // Undeclared exception!
      try { 
        userController0.validateUsername((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The user's username cannot be null or empty
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      UserManager userManager1 = new UserManager();
      User user0 = userManager1.createUser("XF:I!D;NLb0nFPXa>", "", "XF:I!D;NLb0nFPXa>", "", "");
      // Undeclared exception!
      try { 
        userController0.removeItemFromShoppingCart(user0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A user with the id 00000000-0100-4000-8200-000003000000 was not found
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UserController userController0 = new UserController((UserManager) null);
      // Undeclared exception!
      try { 
        userController0.removeItemFromShoppingCart((User) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      // Undeclared exception!
      try { 
        userController0.getUserByUsername("S40");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A user with the username S40 was not found
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UserController userController0 = new UserController((UserManager) null);
      UUID uUID0 = MockUUID.randomUUID();
      // Undeclared exception!
      try { 
        userController0.getUserById(uUID0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UserController userController0 = new UserController((UserManager) null);
      // Undeclared exception!
      try { 
        userController0.getUserByEmail("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UserController userController0 = new UserController((UserManager) null);
      // Undeclared exception!
      try { 
        userController0.existsUserWithUsername("fPegW4Q*R)-rc(,");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      // Undeclared exception!
      try { 
        userController0.existsUserWithEmail((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      userController0.createUser("com.marketplace.vintage.exceptions.EntityNotFoundException", "#mc3e", "com.marketplace.vintage.exceptions.EntityNotFoundException", "#mc3e", "com.marketplace.vintage.exceptions.EntityNotFoundException");
      // Undeclared exception!
      try { 
        userController0.createUser("com.marketplace.vintage.exceptions.EntityNotFoundException", "com.marketplace.vintage.exceptions.EntityNotFoundException", "", "#mc3e", "6TtVrofu5cT\"DO");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A user with that username already exists
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UserController userController0 = new UserController((UserManager) null);
      // Undeclared exception!
      try { 
        userController0.createUser("~J,/J9Tn+H~'UC=m", "r= Vtyo7S,cT#CM[>", "MJ6", "r= Vtyo7S,cT#CM[>", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      // Undeclared exception!
      try { 
        userController0.createUser("", "+,bRM*=3RX7!}2Dl/1N", "The user's username cannot contain spaces", "", "The user's username cannot contain spaces");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The user's username cannot be null or empty
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      User user0 = new User((String) null, "", (String) null, "", (String) null);
      // Undeclared exception!
      try { 
        userController0.cleanShoppingCart(user0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A user with the id 00000000-0100-4000-8200-000003000000 was not found
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      User user0 = new User("", "", "", "Ns8csp$Exd'cV", "");
      // Undeclared exception!
      try { 
        userController0.addItemToShoppingCart(user0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A user with the id 00000000-0100-4000-8200-000003000000 was not found
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UserController userController0 = new UserController((UserManager) null);
      User user0 = new User("L=< 32", "L=< 32", "L=< 32", "L=< 32", "");
      // Undeclared exception!
      try { 
        userController0.addItemToShoppingCart(user0, "qrf|0yvz~\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      UUID uUID0 = MockUUID.randomUUID();
      User user0 = new User(uUID0, "5C.^`ev`$L", "5C.^`ev`$L", "5C.^`ev`$L", "5C.^`ev`$L", "5C.^`ev`$L");
      // Undeclared exception!
      try { 
        userController0.addCompletedSellOrderId(user0, "5C.^`ev`$L");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A user with the id 00000000-0100-4000-8200-000003000000 was not found
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      // Undeclared exception!
      try { 
        userController0.addCompletedOrderId((User) null, "com.marketplace.vintage.user.UserController");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      userController0.validateUsername("com.marketplace.vintage.user.UserController");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      // Undeclared exception!
      try { 
        userController0.addCompletedSellOrderId((User) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      boolean boolean0 = userController0.existsUserWithEmail(" was not foun@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      boolean boolean0 = userController0.existsUserWithUsername(" was o2t fond");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      UUID uUID0 = MockUUID.fromString("com.marketplace.vintage.user.UserController");
      // Undeclared exception!
      try { 
        userController0.getUserById(uUID0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A user with the id 00000000-0100-4000-8200-000003000000 was not found
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      User user0 = userController0.createUser("u~li", "u~li", "u~li", "u~li", "u~li");
      userController0.addItemToShoppingCart(user0, "u~li");
      assertEquals("u~li", user0.getTaxNumber());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      User user0 = new User(" was o2t fond", " was o2t fond", " was o2t fond", " was o2t fond", " was o2t fond");
      // Undeclared exception!
      try { 
        userController0.addCompletedOrderId(user0, " was o2t fond");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A user with the id 00000000-0100-4000-8200-000003000000 was not found
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      // Undeclared exception!
      try { 
        userController0.cleanShoppingCart((User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      // Undeclared exception!
      try { 
        userController0.getUserByEmail("u~li");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A user with the email u~li was not found
         //
         verifyException("com.marketplace.vintage.user.UserManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UserManager userManager0 = new UserManager();
      UserController userController0 = new UserController(userManager0);
      User user0 = userController0.createUser("u~li", "u~li", "u~li", "u~li", "u~li");
      userController0.removeItemFromShoppingCart(user0, "u~li");
      assertEquals("u~li", user0.getEmail());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UserController userController0 = new UserController((UserManager) null);
      // Undeclared exception!
      try { 
        userController0.getAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UserController userController0 = new UserController((UserManager) null);
      // Undeclared exception!
      try { 
        userController0.getUserByUsername("m=]G}VFiP&rDcwmq#'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.user.UserController", e);
      }
  }
}
