package myUtil.rule;/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 08 02:28:00 GMT 2018
 */


import org.junit.Test;

import static org.junit.Assert.*;

public class Argument_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Value value0 = new Value("");
      Argument argument0 = Argument.value(value0);
      String string0 = argument0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Argument argument0 = Argument.value((Value) null);
      boolean boolean0 = argument0.isValue();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Argument argument0 = Argument.value((Value) null);
      argument0.getVariable();
      assertFalse(argument0.isVariable());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Value value0 = new Value("Argument");
      Argument argument0 = Argument.value(value0);
      argument0.getValue();
      assertFalse(argument0.isVariable());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Argument argument0 = Argument.value((Value) null);
      // Undeclared exception!
      try { 
        argument0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Variable variable0 = new Variable("]}/2Vd6sdC<\"6>");
      Argument argument0 = Argument.variable(variable0);
      String string0 = argument0.toString();
      assertEquals("VAR:]}/2Vd6sdC<\"6>", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Variable variable0 = new Variable("]}/2Vd6sdC<\"6>");
      Argument argument0 = Argument.variable(variable0);
      boolean boolean0 = argument0.isVariable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Argument argument0 = Argument.value((Value) null);
      boolean boolean0 = argument0.isVariable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Variable variable0 = new Variable("]}/2Vd6sdC<\"6>");
      Argument argument0 = Argument.variable(variable0);
      argument0.getVariable();
      assertTrue(argument0.isVariable());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Variable variable0 = new Variable("F4?+3'");
      Argument argument0 = Argument.variable(variable0);
      boolean boolean0 = argument0.isValue();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Variable variable0 = new Variable("F4?+3'");
      Argument argument0 = Argument.variable(variable0);
      argument0.getValue();
      assertTrue(argument0.isVariable());
  }
}
