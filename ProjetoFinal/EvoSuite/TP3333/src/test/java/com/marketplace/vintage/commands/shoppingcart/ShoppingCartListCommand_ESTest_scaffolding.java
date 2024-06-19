/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun May 26 20:50:58 GMT 2024
 */

package com.marketplace.vintage.commands.shoppingcart;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ShoppingCartListCommand_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.marketplace.vintage.commands.shoppingcart.ShoppingCartListCommand"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ShoppingCartListCommand_ESTest_scaffolding.class.getClassLoader() ,
      "com.marketplace.vintage.commands.user.UserInfoCommand",
      "com.marketplace.vintage.utils.StringUtils",
      "com.marketplace.vintage.scripting.exception.ScriptRunException",
      "com.marketplace.vintage.commands.user.UserCommandAdminView",
      "com.marketplace.vintage.item.condition.UsedItemCondition",
      "impl.PremiumSapatilhasItem",
      "com.marketplace.vintage.carrier.ParcelCarrierManager",
      "net.objecthunter.exp4j.function.Function",
      "com.marketplace.vintage.commands.shoppingcart.ShoppingCartCommand",
      "impl.SapatilhasItem",
      "net.objecthunter.exp4j.tokenizer.OpenParenthesesToken",
      "com.marketplace.vintage.view.ViewFactory",
      "com.marketplace.vintage.view.ViewType",
      "com.marketplace.vintage.command.ParentCommand",
      "com.marketplace.vintage.commands.user.UserListCommand",
      "com.marketplace.vintage.input.questionnaire.Questionnaire",
      "com.marketplace.vintage.utils.VintageDate",
      "net.objecthunter.exp4j.tokenizer.OperatorToken",
      "com.marketplace.vintage.commands.stats.TopSellerStatsCommand",
      "com.marketplace.vintage.user.UserManager",
      "com.marketplace.vintage.commands.time.CurrentTimeCommand",
      "net.objecthunter.exp4j.tokenizer.FunctionToken",
      "com.marketplace.vintage.carrier.PremiumParcelCarrier",
      "com.marketplace.vintage.commands.time.AdminTimeJumpCommand",
      "com.marketplace.vintage.commands.user.UserCommandUserView",
      "com.marketplace.vintage.input.InputPrompter",
      "com.marketplace.vintage.commands.stats.StatsCommand",
      "com.marketplace.vintage.scripting.runner.ScriptRunner",
      "com.marketplace.vintage.commands.carrier.ParcelCarrierListCommand",
      "com.marketplace.vintage.utils.AlphanumericGenerator",
      "com.marketplace.vintage.carrier.NormalParcelCarrier",
      "com.marketplace.vintage.VintageConstants",
      "com.marketplace.vintage.commands.stats.TopListStatsCommand",
      "com.marketplace.vintage.order.OrderFactory",
      "net.objecthunter.exp4j.operator.Operator",
      "com.marketplace.vintage.user.User",
      "com.marketplace.vintage.commands.item.ItemListAllCommand",
      "com.marketplace.vintage.order.OrderManager",
      "net.objecthunter.exp4j.ArrayStack",
      "com.marketplace.vintage.commands.carrier.ParcelCarrierEditCommand",
      "net.objecthunter.exp4j.function.Functions$1",
      "com.marketplace.vintage.input.impl.StdinInputPrompter",
      "com.marketplace.vintage.commands.shoppingcart.ShoppingCartOrderCommand",
      "net.objecthunter.exp4j.function.Functions$4",
      "com.marketplace.vintage.view.impl.UserView",
      "com.marketplace.vintage.commands.stats.VintageTotalStatsCommand",
      "net.objecthunter.exp4j.function.Functions$5",
      "net.objecthunter.exp4j.function.Functions$2",
      "net.objecthunter.exp4j.function.Functions$3",
      "com.marketplace.vintage.order.OrderController",
      "com.marketplace.vintage.time.TimeManager",
      "com.marketplace.vintage.expression.Exp4jExpressionSolver",
      "com.marketplace.vintage.item.ItemController",
      "com.marketplace.vintage.commands.order.OrderListCommand",
      "com.marketplace.vintage.scripting.ScriptController",
      "com.marketplace.vintage.item.ItemType",
      "com.marketplace.vintage.commands.user.UserRegisterCommand",
      "net.objecthunter.exp4j.function.Functions$8",
      "impl.TshirtItem$TshirtItemSize",
      "net.objecthunter.exp4j.function.Functions$9",
      "net.objecthunter.exp4j.function.Functions$6",
      "net.objecthunter.exp4j.function.Functions$7",
      "com.marketplace.vintage.item.condition.ItemCondition",
      "com.marketplace.vintage.scripting.Script",
      "com.marketplace.vintage.scripting.exception.ScriptParseException",
      "com.marketplace.vintage.command.CommandExecuteException",
      "com.marketplace.vintage.order.OrderStatus",
      "com.marketplace.vintage.input.questionnaire.QuestionnaireBuilder",
      "net.objecthunter.exp4j.function.Functions$23",
      "net.objecthunter.exp4j.function.Functions$22",
      "net.objecthunter.exp4j.shuntingyard.ShuntingYard",
      "com.marketplace.vintage.commands.carrier.ParcelCarrierInfoCommand",
      "net.objecthunter.exp4j.function.Functions$21",
      "com.marketplace.vintage.carrier.ParcelCarrierController",
      "net.objecthunter.exp4j.function.Functions$20",
      "net.objecthunter.exp4j.tokenizer.UnknownFunctionOrVariableException",
      "com.marketplace.vintage.exceptions.EntityNotFoundException",
      "com.marketplace.vintage.scripting.exception.ScriptException",
      "com.marketplace.vintage.command.Command",
      "com.marketplace.vintage.view.impl.AdminView",
      "net.objecthunter.exp4j.tokenizer.VariableToken",
      "impl.TshirtItem",
      "com.marketplace.vintage.commands.LogoutCommand",
      "net.objecthunter.exp4j.tokenizer.CloseParenthesesToken",
      "com.marketplace.vintage.commands.item.ItemCommand",
      "com.marketplace.vintage.item.ItemFactory$1",
      "com.marketplace.vintage.item.ItemManager",
      "net.objecthunter.exp4j.tokenizer.ArgumentSeparatorToken",
      "com.marketplace.vintage.commands.item.stock.ItemStockRemoveCommand",
      "com.marketplace.vintage.order.OrderedItem",
      "net.objecthunter.exp4j.function.Functions$12",
      "net.objecthunter.exp4j.ValidationResult",
      "net.objecthunter.exp4j.function.Functions$11",
      "net.objecthunter.exp4j.function.Functions$10",
      "com.marketplace.vintage.view.BaseView",
      "com.marketplace.vintage.order.Order",
      "net.objecthunter.exp4j.function.Functions$16",
      "net.objecthunter.exp4j.function.Functions$15",
      "com.marketplace.vintage.commands.item.stock.ItemStockChangeCommand",
      "net.objecthunter.exp4j.function.Functions",
      "net.objecthunter.exp4j.function.Functions$14",
      "net.objecthunter.exp4j.function.Functions$13",
      "com.marketplace.vintage.input.questionnaire.QuestionnaireAnswers",
      "com.marketplace.vintage.view.ViewFactory$1",
      "net.objecthunter.exp4j.function.Functions$19",
      "net.objecthunter.exp4j.function.Functions$18",
      "net.objecthunter.exp4j.function.Functions$17",
      "com.marketplace.vintage.carrier.ParcelCarrier",
      "com.marketplace.vintage.view.impl.UserLoginView",
      "com.marketplace.vintage.stats.StatsManager",
      "impl.MalaItem",
      "com.marketplace.vintage.input.impl.BufferedInputPrompter",
      "com.marketplace.vintage.input.questionnaire.QuestionnaireQuestion",
      "net.objecthunter.exp4j.tokenizer.NumberToken",
      "impl.TshirtItem$TshirtItemPattern",
      "com.marketplace.vintage.commands.order.AdminOrderCommand",
      "com.marketplace.vintage.commands.item.stock.ItemStockCommand",
      "com.marketplace.vintage.commands.order.OrderReturnCommand",
      "com.marketplace.vintage.expression.ExpressionSolver",
      "com.marketplace.vintage.item.ItemProperty",
      "com.marketplace.vintage.scripting.ScriptLoader",
      "com.marketplace.vintage.command.BaseCommand",
      "com.marketplace.vintage.exceptions.EntityAlreadyExistsException",
      "com.marketplace.vintage.logging.OnlyWarnLogger",
      "net.objecthunter.exp4j.ExpressionBuilder",
      "com.marketplace.vintage.commands.HelpCommand",
      "com.marketplace.vintage.commands.carrier.ParcelCarrierCreateCommand",
      "com.marketplace.vintage.view.CommandRunnerView",
      "com.marketplace.vintage.command.CommandManager",
      "net.objecthunter.exp4j.tokenizer.Tokenizer",
      "impl.PremiumMalaItem",
      "com.marketplace.vintage.logging.PrefixLogger",
      "com.marketplace.vintage.item.condition.ItemConditionType",
      "com.marketplace.vintage.command.CommandRepository",
      "com.marketplace.vintage.commands.stats.BaseStatsCommand",
      "net.objecthunter.exp4j.operator.Operators",
      "com.marketplace.vintage.Vintage",
      "com.marketplace.vintage.logging.Logger",
      "com.marketplace.vintage.logging.JavaLogger",
      "com.marketplace.vintage.commands.carrier.ParcelCarrierCommand",
      "com.marketplace.vintage.commands.time.AdminTimeCommand",
      "com.marketplace.vintage.item.Item$1",
      "net.objecthunter.exp4j.tokenizer.Token",
      "com.marketplace.vintage.commands.item.AdminItemCommand",
      "com.marketplace.vintage.commands.shoppingcart.ShoppingCartAddItemCommand",
      "com.marketplace.vintage.commands.shoppingcart.ShoppingCartRemoveItemCommand",
      "com.marketplace.vintage.commands.order.AdminOrderListSellerCommand",
      "com.marketplace.vintage.scripting.runner.CommandScriptRunner",
      "com.marketplace.vintage.item.Item",
      "com.marketplace.vintage.commands.order.OrderCommand",
      "net.objecthunter.exp4j.operator.Operators$7",
      "net.objecthunter.exp4j.operator.Operators$6",
      "com.marketplace.vintage.view.View",
      "net.objecthunter.exp4j.operator.Operators$8",
      "com.marketplace.vintage.commands.order.AdminOrderInspectCommand",
      "com.marketplace.vintage.input.impl.BaseInputPrompter",
      "com.marketplace.vintage.input.InputMapper",
      "net.objecthunter.exp4j.Expression",
      "com.marketplace.vintage.commands.shoppingcart.ShoppingCartListCommand",
      "com.marketplace.vintage.carrier.ParcelCarrierType",
      "com.marketplace.vintage.user.UserController",
      "com.marketplace.vintage.commands.item.ItemCreateCommand",
      "com.marketplace.vintage.commands.item.ItemListCommand",
      "net.objecthunter.exp4j.operator.Operators$3",
      "com.marketplace.vintage.item.ItemFactory",
      "net.objecthunter.exp4j.operator.Operators$2",
      "net.objecthunter.exp4j.operator.Operators$5",
      "net.objecthunter.exp4j.operator.Operators$4",
      "com.marketplace.vintage.commands.item.stock.ItemStockAddCommand",
      "com.marketplace.vintage.commands.stats.TopParcelCarrierStatsCommand",
      "com.marketplace.vintage.commands.item.ItemInspectCommand",
      "net.objecthunter.exp4j.operator.Operators$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ShoppingCartListCommand_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.marketplace.vintage.command.BaseCommand",
      "com.marketplace.vintage.commands.shoppingcart.ShoppingCartListCommand",
      "com.marketplace.vintage.utils.StringUtils",
      "com.marketplace.vintage.logging.JavaLogger",
      "com.marketplace.vintage.input.impl.BaseInputPrompter",
      "com.marketplace.vintage.input.impl.StdinInputPrompter",
      "com.marketplace.vintage.item.ItemFactory",
      "com.marketplace.vintage.item.ItemController",
      "com.marketplace.vintage.order.OrderManager",
      "com.marketplace.vintage.order.OrderFactory",
      "com.marketplace.vintage.order.OrderController",
      "com.marketplace.vintage.carrier.ParcelCarrierManager",
      "com.marketplace.vintage.carrier.ParcelCarrierController",
      "com.marketplace.vintage.expression.Exp4jExpressionSolver",
      "com.marketplace.vintage.user.UserManager",
      "com.marketplace.vintage.user.UserController",
      "com.marketplace.vintage.scripting.ScriptController",
      "com.marketplace.vintage.scripting.ScriptLoader",
      "com.marketplace.vintage.Vintage",
      "com.marketplace.vintage.stats.StatsManager",
      "com.marketplace.vintage.view.ViewFactory",
      "com.marketplace.vintage.exceptions.EntityNotFoundException",
      "com.marketplace.vintage.logging.PrefixLogger",
      "com.marketplace.vintage.logging.OnlyWarnLogger",
      "com.marketplace.vintage.input.impl.BufferedInputPrompter",
      "com.marketplace.vintage.item.ItemManager",
      "com.marketplace.vintage.utils.VintageDate",
      "com.marketplace.vintage.time.TimeManager",
      "com.marketplace.vintage.item.condition.UsedItemCondition",
      "com.marketplace.vintage.item.Item",
      "impl.MalaItem",
      "com.marketplace.vintage.view.BaseView",
      "com.marketplace.vintage.view.impl.UserView",
      "com.marketplace.vintage.user.User",
      "com.marketplace.vintage.view.ViewFactory$1",
      "com.marketplace.vintage.view.impl.AdminView",
      "com.marketplace.vintage.command.CommandManager",
      "com.marketplace.vintage.commands.HelpCommand",
      "com.marketplace.vintage.commands.LogoutCommand",
      "com.marketplace.vintage.command.ParentCommand",
      "com.marketplace.vintage.commands.user.UserCommandAdminView",
      "com.marketplace.vintage.commands.user.UserListCommand",
      "com.marketplace.vintage.commands.user.UserRegisterCommand",
      "com.marketplace.vintage.input.questionnaire.QuestionnaireBuilder",
      "com.marketplace.vintage.input.questionnaire.QuestionnaireQuestion",
      "com.marketplace.vintage.input.InputMapper",
      "com.marketplace.vintage.input.questionnaire.Questionnaire",
      "com.marketplace.vintage.commands.carrier.ParcelCarrierCommand",
      "com.marketplace.vintage.VintageConstants",
      "com.marketplace.vintage.commands.carrier.ParcelCarrierCreateCommand",
      "com.marketplace.vintage.commands.carrier.ParcelCarrierInfoCommand",
      "com.marketplace.vintage.commands.carrier.ParcelCarrierListCommand",
      "com.marketplace.vintage.commands.carrier.ParcelCarrierEditCommand",
      "com.marketplace.vintage.commands.time.AdminTimeCommand",
      "com.marketplace.vintage.commands.time.AdminTimeJumpCommand",
      "com.marketplace.vintage.commands.time.CurrentTimeCommand",
      "com.marketplace.vintage.commands.stats.StatsCommand",
      "com.marketplace.vintage.commands.stats.BaseStatsCommand",
      "com.marketplace.vintage.commands.stats.TopSellerStatsCommand",
      "com.marketplace.vintage.commands.stats.TopParcelCarrierStatsCommand",
      "com.marketplace.vintage.commands.stats.VintageTotalStatsCommand",
      "com.marketplace.vintage.commands.stats.TopListStatsCommand",
      "com.marketplace.vintage.commands.order.AdminOrderCommand",
      "com.marketplace.vintage.commands.order.AdminOrderInspectCommand",
      "com.marketplace.vintage.commands.order.AdminOrderListSellerCommand",
      "com.marketplace.vintage.commands.item.AdminItemCommand",
      "com.marketplace.vintage.commands.item.ItemInspectCommand",
      "com.marketplace.vintage.commands.item.ItemListAllCommand",
      "com.marketplace.vintage.commands.user.UserCommandUserView",
      "com.marketplace.vintage.commands.user.UserInfoCommand",
      "com.marketplace.vintage.commands.item.ItemCommand",
      "com.marketplace.vintage.commands.item.ItemCreateCommand",
      "com.marketplace.vintage.commands.item.ItemListCommand",
      "com.marketplace.vintage.commands.item.stock.ItemStockCommand",
      "com.marketplace.vintage.commands.item.stock.ItemStockChangeCommand",
      "com.marketplace.vintage.commands.item.stock.ItemStockAddCommand",
      "com.marketplace.vintage.commands.item.stock.ItemStockRemoveCommand",
      "com.marketplace.vintage.commands.order.OrderCommand",
      "com.marketplace.vintage.commands.order.OrderListCommand",
      "com.marketplace.vintage.commands.order.OrderReturnCommand",
      "com.marketplace.vintage.commands.shoppingcart.ShoppingCartCommand",
      "com.marketplace.vintage.commands.shoppingcart.ShoppingCartAddItemCommand",
      "com.marketplace.vintage.commands.shoppingcart.ShoppingCartRemoveItemCommand",
      "com.marketplace.vintage.commands.shoppingcart.ShoppingCartOrderCommand",
      "com.marketplace.vintage.utils.AlphanumericGenerator",
      "com.marketplace.vintage.item.ItemFactory$1",
      "impl.TshirtItem",
      "com.marketplace.vintage.carrier.ParcelCarrier",
      "com.marketplace.vintage.carrier.PremiumParcelCarrier",
      "com.marketplace.vintage.carrier.ParcelCarrierType",
      "impl.PremiumMalaItem",
      "impl.SapatilhasItem",
      "net.objecthunter.exp4j.ExpressionBuilder",
      "impl.PremiumSapatilhasItem",
      "com.marketplace.vintage.item.Item$1",
      "com.marketplace.vintage.scripting.runner.CommandScriptRunner",
      "com.marketplace.vintage.carrier.NormalParcelCarrier",
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
      "com.marketplace.vintage.exceptions.EntityAlreadyExistsException",
      "com.marketplace.vintage.view.impl.UserLoginView",
      "net.objecthunter.exp4j.tokenizer.Token",
      "net.objecthunter.exp4j.tokenizer.OpenParenthesesToken",
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
      "net.objecthunter.exp4j.tokenizer.CloseParenthesesToken",
      "com.marketplace.vintage.order.Order",
      "net.objecthunter.exp4j.ArrayStack",
      "net.objecthunter.exp4j.tokenizer.ArgumentSeparatorToken",
      "net.objecthunter.exp4j.tokenizer.VariableToken",
      "net.objecthunter.exp4j.ValidationResult",
      "com.marketplace.vintage.item.ItemProperty",
      "com.marketplace.vintage.item.ItemType",
      "com.marketplace.vintage.item.condition.ItemConditionType"
    );
  }
}
