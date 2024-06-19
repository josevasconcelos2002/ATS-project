/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun May 26 21:01:30 GMT 2024
 */

package com.marketplace.vintage.commands.stats;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BaseStatsCommand_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.marketplace.vintage.commands.stats.BaseStatsCommand"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\silva\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\silva\\Downloads\\trabalhos_POO 2\\trabalhos_POO\\TP3333"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\silva"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "silva"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseStatsCommand_ESTest_scaffolding.class.getClassLoader() ,
      "com.marketplace.vintage.input.impl.StdinInputPrompter",
      "impl.PremiumMalaItem",
      "com.marketplace.vintage.commands.stats.BaseStatsCommand",
      "com.marketplace.vintage.commands.stats.VintageTotalStatsCommand",
      "impl.PremiumSapatilhasItem",
      "com.marketplace.vintage.carrier.ParcelCarrierManager",
      "com.marketplace.vintage.order.OrderController",
      "com.marketplace.vintage.Vintage",
      "com.marketplace.vintage.order.Order",
      "com.marketplace.vintage.time.TimeManager",
      "com.marketplace.vintage.expression.Exp4jExpressionSolver",
      "com.marketplace.vintage.logging.Logger",
      "com.marketplace.vintage.logging.JavaLogger",
      "com.marketplace.vintage.item.ItemController",
      "impl.SapatilhasItem",
      "com.marketplace.vintage.carrier.ParcelCarrier",
      "com.marketplace.vintage.view.ViewFactory",
      "com.marketplace.vintage.scripting.ScriptController",
      "com.marketplace.vintage.stats.StatsManager",
      "com.marketplace.vintage.utils.VintageDate",
      "com.marketplace.vintage.item.ItemType",
      "impl.MalaItem",
      "com.marketplace.vintage.item.Item",
      "com.marketplace.vintage.commands.stats.TopSellerStatsCommand",
      "com.marketplace.vintage.user.UserManager",
      "com.marketplace.vintage.input.InputPrompter",
      "com.marketplace.vintage.scripting.exception.ScriptParseException",
      "com.marketplace.vintage.order.OrderStatus",
      "com.marketplace.vintage.scripting.runner.ScriptRunner",
      "com.marketplace.vintage.carrier.ParcelCarrierController",
      "com.marketplace.vintage.exceptions.EntityNotFoundException",
      "com.marketplace.vintage.scripting.exception.ScriptException",
      "com.marketplace.vintage.input.impl.BaseInputPrompter",
      "com.marketplace.vintage.command.Command",
      "com.marketplace.vintage.expression.ExpressionSolver",
      "com.marketplace.vintage.scripting.ScriptLoader",
      "com.marketplace.vintage.command.BaseCommand",
      "com.marketplace.vintage.user.UserController",
      "com.marketplace.vintage.exceptions.EntityAlreadyExistsException",
      "impl.TshirtItem",
      "com.marketplace.vintage.commands.stats.TopListStatsCommand",
      "com.marketplace.vintage.order.OrderFactory",
      "com.marketplace.vintage.item.ItemFactory",
      "com.marketplace.vintage.user.User",
      "com.marketplace.vintage.item.ItemManager",
      "com.marketplace.vintage.order.OrderManager",
      "com.marketplace.vintage.commands.stats.TopParcelCarrierStatsCommand"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BaseStatsCommand_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.marketplace.vintage.command.BaseCommand",
      "com.marketplace.vintage.commands.stats.BaseStatsCommand",
      "com.marketplace.vintage.item.ItemManager",
      "com.marketplace.vintage.item.ItemFactory",
      "com.marketplace.vintage.item.ItemController",
      "com.marketplace.vintage.order.OrderManager",
      "com.marketplace.vintage.order.OrderFactory",
      "com.marketplace.vintage.order.OrderController",
      "com.marketplace.vintage.utils.VintageDate",
      "com.marketplace.vintage.carrier.ParcelCarrierManager",
      "com.marketplace.vintage.carrier.ParcelCarrierController",
      "com.marketplace.vintage.expression.Exp4jExpressionSolver",
      "com.marketplace.vintage.user.UserManager",
      "com.marketplace.vintage.user.UserController",
      "com.marketplace.vintage.scripting.ScriptController",
      "com.marketplace.vintage.scripting.ScriptLoader",
      "com.marketplace.vintage.Vintage",
      "com.marketplace.vintage.stats.StatsManager",
      "com.marketplace.vintage.commands.stats.TopParcelCarrierStatsCommand",
      "com.marketplace.vintage.logging.JavaLogger",
      "com.marketplace.vintage.logging.OnlyWarnLogger",
      "com.marketplace.vintage.logging.PrefixLogger",
      "com.marketplace.vintage.commands.stats.TopListStatsCommand",
      "com.marketplace.vintage.input.impl.BaseInputPrompter",
      "com.marketplace.vintage.input.impl.BufferedInputPrompter",
      "com.marketplace.vintage.utils.AlphanumericGenerator",
      "com.marketplace.vintage.time.TimeManager",
      "com.marketplace.vintage.commands.stats.TopSellerStatsCommand",
      "com.marketplace.vintage.commands.stats.VintageTotalStatsCommand",
      "com.marketplace.vintage.item.ItemFactory$1",
      "com.marketplace.vintage.item.Item",
      "impl.MalaItem",
      "impl.PremiumMalaItem",
      "com.marketplace.vintage.input.impl.StdinInputPrompter",
      "com.marketplace.vintage.utils.StringUtils",
      "com.marketplace.vintage.item.condition.UsedItemCondition",
      "impl.SapatilhasItem",
      "com.marketplace.vintage.exceptions.EntityNotFoundException",
      "com.marketplace.vintage.carrier.ParcelCarrier",
      "com.marketplace.vintage.carrier.PremiumParcelCarrier",
      "com.marketplace.vintage.carrier.ParcelCarrierType",
      "net.objecthunter.exp4j.ExpressionBuilder",
      "net.objecthunter.exp4j.function.Function",
      "net.objecthunter.exp4j.function.Functions$1",
      "net.objecthunter.exp4j.function.Functions$2",
      "net.objecthunter.exp4j.function.Functions$3",
      "net.objecthunter.exp4j.function.Functions$4",
      "net.objecthunter.exp4j.function.Functions$5",
      "net.objecthunter.exp4j.function.Functions$6",
      "net.objecthunter.exp4j.function.Functions$7",
      "net.objecthunter.exp4j.function.Functions$8",
      "net.objecthunter.exp4j.function.Functions$9",
      "net.objecthunter.exp4j.function.Functions$10",
      "net.objecthunter.exp4j.function.Functions$11",
      "net.objecthunter.exp4j.function.Functions$12",
      "net.objecthunter.exp4j.function.Functions$13",
      "net.objecthunter.exp4j.function.Functions$14",
      "net.objecthunter.exp4j.function.Functions$15",
      "net.objecthunter.exp4j.function.Functions$16",
      "net.objecthunter.exp4j.function.Functions$17",
      "net.objecthunter.exp4j.function.Functions$18",
      "net.objecthunter.exp4j.function.Functions$19",
      "net.objecthunter.exp4j.function.Functions$20",
      "net.objecthunter.exp4j.function.Functions$21",
      "net.objecthunter.exp4j.function.Functions$22",
      "net.objecthunter.exp4j.function.Functions$23",
      "net.objecthunter.exp4j.function.Functions",
      "net.objecthunter.exp4j.Expression",
      "net.objecthunter.exp4j.shuntingyard.ShuntingYard",
      "net.objecthunter.exp4j.tokenizer.Tokenizer",
      "net.objecthunter.exp4j.operator.Operator",
      "net.objecthunter.exp4j.tokenizer.UnknownFunctionOrVariableException",
      "impl.PremiumSapatilhasItem",
      "net.objecthunter.exp4j.tokenizer.Token",
      "net.objecthunter.exp4j.tokenizer.OpenParenthesesToken",
      "impl.TshirtItem",
      "com.marketplace.vintage.user.User",
      "com.marketplace.vintage.carrier.NormalParcelCarrier",
      "net.objecthunter.exp4j.tokenizer.FunctionToken",
      "net.objecthunter.exp4j.ValidationResult",
      "net.objecthunter.exp4j.tokenizer.ArgumentSeparatorToken",
      "com.marketplace.vintage.view.ViewFactory",
      "com.marketplace.vintage.scripting.runner.CommandScriptRunner",
      "com.marketplace.vintage.item.condition.ItemConditionType",
      "net.objecthunter.exp4j.tokenizer.NumberToken",
      "net.objecthunter.exp4j.tokenizer.OperatorToken",
      "net.objecthunter.exp4j.operator.Operators$1",
      "net.objecthunter.exp4j.operator.Operators$2",
      "net.objecthunter.exp4j.operator.Operators$3",
      "net.objecthunter.exp4j.operator.Operators$4",
      "net.objecthunter.exp4j.operator.Operators$5",
      "net.objecthunter.exp4j.operator.Operators$6",
      "net.objecthunter.exp4j.operator.Operators$7",
      "net.objecthunter.exp4j.operator.Operators$8",
      "net.objecthunter.exp4j.operator.Operators",
      "net.objecthunter.exp4j.tokenizer.VariableToken",
      "net.objecthunter.exp4j.ArrayStack",
      "com.marketplace.vintage.VintageConstants",
      "com.marketplace.vintage.order.Order"
    );
  }
}
