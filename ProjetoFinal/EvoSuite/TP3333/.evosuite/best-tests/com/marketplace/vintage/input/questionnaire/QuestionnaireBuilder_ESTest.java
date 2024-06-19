/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:59:38 GMT 2024
 */

package com.marketplace.vintage.input.questionnaire;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.input.questionnaire.Questionnaire;
import com.marketplace.vintage.input.questionnaire.QuestionnaireBuilder;
import java.util.function.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuestionnaireBuilder_ESTest extends QuestionnaireBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuestionnaireBuilder questionnaireBuilder0 = QuestionnaireBuilder.newBuilder();
      QuestionnaireBuilder questionnaireBuilder1 = questionnaireBuilder0.withQuestion("sv", " already exists", (Function<String, ?>) null);
      // Undeclared exception!
      try { 
        questionnaireBuilder1.withQuestion("sv", "Ggs?DI", (Function<String, ?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Question with id sv already exists
         //
         verifyException("com.marketplace.vintage.input.questionnaire.QuestionnaireBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuestionnaireBuilder questionnaireBuilder0 = QuestionnaireBuilder.newBuilder();
      Function<String, String> function0 = Function.identity();
      questionnaireBuilder0.withQuestion((String) null, " is null or does not exist", function0);
      // Undeclared exception!
      try { 
        questionnaireBuilder0.withQuestion((String) null, (String) null, function0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuestionnaireBuilder questionnaireBuilder0 = QuestionnaireBuilder.newBuilder();
      Questionnaire questionnaire0 = questionnaireBuilder0.build();
      assertNotNull(questionnaire0);
  }
}