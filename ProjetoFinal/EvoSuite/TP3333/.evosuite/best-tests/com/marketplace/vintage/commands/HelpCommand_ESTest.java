/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:48:51 GMT 2024
 */

package com.marketplace.vintage.commands;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.command.CommandManager;
import com.marketplace.vintage.command.CommandRepository;
import com.marketplace.vintage.command.ParentCommand;
import com.marketplace.vintage.commands.HelpCommand;
import com.marketplace.vintage.input.impl.BufferedInputPrompter;
import com.marketplace.vintage.input.impl.StdinInputPrompter;
import com.marketplace.vintage.logging.JavaLogger;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HelpCommand_ESTest extends HelpCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HelpCommand helpCommand0 = new HelpCommand((CommandRepository) null, "Available commands in ", "");
      JavaLogger javaLogger0 = new JavaLogger();
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      BufferedInputPrompter bufferedInputPrompter0 = new BufferedInputPrompter(iterator0);
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        helpCommand0.executeSafely(javaLogger0, bufferedInputPrompter0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.commands.HelpCommand", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[7];
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      CommandManager commandManager0 = new CommandManager();
      HelpCommand helpCommand0 = new HelpCommand(commandManager0, " help");
      JavaLogger javaLogger0 = new JavaLogger();
      helpCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
      assertEquals("Show this help", helpCommand0.getDescription());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParentCommand parentCommand0 = new ParentCommand("", "");
      HelpCommand helpCommand0 = new HelpCommand(parentCommand0, "", "");
      JavaLogger javaLogger0 = new JavaLogger();
      String[] stringArray0 = new String[20];
      StdinInputPrompter stdinInputPrompter0 = new StdinInputPrompter();
      helpCommand0.executeSafely(javaLogger0, stdinInputPrompter0, stringArray0);
      assertEquals("", helpCommand0.getUsage());
  }
}
