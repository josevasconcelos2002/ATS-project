/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 20:54:28 GMT 2024
 */

package com.marketplace.vintage.input.questionnaire;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.marketplace.vintage.input.questionnaire.QuestionnaireAnswers;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuestionnaireAnswers_ESTest extends QuestionnaireAnswers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuestionnaireAnswers questionnaireAnswers0 = new QuestionnaireAnswers();
      Object object0 = new Object();
      questionnaireAnswers0.setAnswer("L[[O:#4:#}x'$t@Dfg", object0);
      Map<String, Object> map0 = questionnaireAnswers0.getAnswersMap();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuestionnaireAnswers questionnaireAnswers0 = new QuestionnaireAnswers();
      Object object0 = new Object();
      questionnaireAnswers0.setAnswer("", object0);
      // Undeclared exception!
      try { 
        questionnaireAnswers0.getAnswer("", (Class<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.marketplace.vintage.input.questionnaire.QuestionnaireAnswers", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuestionnaireAnswers questionnaireAnswers0 = new QuestionnaireAnswers();
      questionnaireAnswers0.setAnswer(" :O e-]AnkMOU1SV%", " :O e-]AnkMOU1SV%");
      Class<Object> class0 = Object.class;
      Object object0 = questionnaireAnswers0.getAnswer(" :O e-]AnkMOU1SV%", class0);
      assertEquals(" :O e-]AnkMOU1SV%", object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuestionnaireAnswers questionnaireAnswers0 = new QuestionnaireAnswers();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        questionnaireAnswers0.getAnswer((String) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Answer with name null is null or does not exist
         //
         verifyException("com.marketplace.vintage.input.questionnaire.QuestionnaireAnswers", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QuestionnaireAnswers questionnaireAnswers0 = new QuestionnaireAnswers();
      Map<String, Object> map0 = questionnaireAnswers0.getAnswersMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<String> class0 = String.class;
      QuestionnaireAnswers questionnaireAnswers0 = new QuestionnaireAnswers();
      questionnaireAnswers0.setAnswer("", class0);
      // Undeclared exception!
      try { 
        questionnaireAnswers0.getAnswer("", class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Answer with name  is not of type java.lang.String
         //
         verifyException("com.marketplace.vintage.input.questionnaire.QuestionnaireAnswers", e);
      }
  }
}