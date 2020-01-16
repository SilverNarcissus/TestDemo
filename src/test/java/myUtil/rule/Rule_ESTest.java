package myUtil.rule;/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 08 02:35:46 GMT 2018
 */


import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Rule_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Datalog[] datalogArray0 = new Datalog[3];
      Rule rule0 = new Rule((Datalog) null, datalogArray0);
      Datalog datalog0 = rule0.getHead();
      assertNull(datalog0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Predicate predicate0 = new Predicate("");
      Argument[] argumentArray0 = new Argument[6];
      Datalog datalog0 = new Datalog(predicate0, argumentArray0);
      Rule rule0 = new Rule(datalog0, (Datalog[]) null);
      Datalog[] datalogArray0 = rule0.getBody();
      assertNull(datalogArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Predicate predicate0 = new Predicate("{3%R,g<*p$]V");
      Argument[] argumentArray0 = new Argument[0];
      Datalog datalog0 = new Datalog(predicate0, argumentArray0);
      Datalog[] datalogArray0 = new Datalog[2];
      Rule rule0 = new Rule(datalog0, datalogArray0);
      Datalog[] datalogArray1 = rule0.getBody();
      assertSame(datalogArray0, datalogArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Value value0 = new Value("");
      Predicate predicate0 = new Predicate("EQn");
      Argument[] argumentArray0 = new Argument[1];
      Argument argument0 = Argument.value(value0);
      argumentArray0[0] = argument0;
      Datalog datalog0 = new Datalog(predicate0, argumentArray0);
      Datalog[] datalogArray0 = new Datalog[8];
      datalogArray0[0] = datalog0;
      datalogArray0[1] = datalog0;
      datalogArray0[2] = datalog0;
      datalogArray0[3] = datalog0;
      datalogArray0[4] = datalog0;
      datalogArray0[5] = datalog0;
      datalogArray0[6] = datalog0;
      datalogArray0[7] = datalog0;
      Rule rule0 = new Rule(datalog0, datalogArray0);
      LinkedList<Fact> linkedList0 = new LinkedList<Fact>();
      Fact fact0 = datalog0.toFact();
      linkedList0.addLast(fact0);
      linkedList0.addLast(fact0);
      LinkedList<Fact> linkedList1 = rule0.deriveOnce(linkedList0);
      // Undeclared exception!
      //rule0.deriveOnce(linkedList1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Predicate predicate0 = new Predicate("{3%R,g<*p$]V");
      Argument[] argumentArray0 = new Argument[0];
      Datalog datalog0 = new Datalog(predicate0, argumentArray0);
      Fact fact0 = datalog0.toFact();
      Datalog[] datalogArray0 = new Datalog[2];
      datalogArray0[0] = datalog0;
      Rule rule0 = new Rule(datalog0, datalogArray0);
      LinkedList<Fact> linkedList0 = new LinkedList<Fact>();
      linkedList0.add(fact0);
      // Undeclared exception!
      try { 
        rule0.deriveOnce(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = "f_/5]Z\\ulM]$Z;#Yy";
      Predicate predicate0 = new Predicate(string0);
      Argument[] argumentArray0 = new Argument[2];
      Value value0 = new Value("@:<t");
      Argument argument0 = Argument.value(value0);
      argumentArray0[0] = argument0;
      argumentArray0[1] = argumentArray0[0];
      Datalog datalog0 = new Datalog(predicate0, argumentArray0);
      Datalog[] datalogArray0 = new Datalog[0];
      Rule rule0 = new Rule(datalog0, datalogArray0);
      String string1 = rule0.toString();
      assertEquals("f_/5]Z\\ulM]$Z;#Yy(@:<t,@:<t) :- .", string1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Predicate predicate0 = new Predicate("{3%R,g<*p$]V");
      Argument[] argumentArray0 = new Argument[0];
      Datalog datalog0 = new Datalog(predicate0, argumentArray0);
      Datalog[] datalogArray0 = new Datalog[2];
      datalogArray0[0] = datalog0;
      Rule rule0 = new Rule(datalog0, datalogArray0);
      // Undeclared exception!
      try { 
        rule0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Predicate predicate0 = new Predicate("Substitution");
      Argument[] argumentArray0 = new Argument[1];
      Datalog datalog0 = new Datalog(predicate0, argumentArray0);
      Datalog[] datalogArray0 = new Datalog[8];
      datalogArray0[0] = datalog0;
      Rule rule0 = new Rule(datalog0, datalogArray0);
      LinkedList<Fact> linkedList0 = new LinkedList<Fact>();
      Value[] valueArray0 = new Value[5];
      Fact fact0 = new Fact(predicate0, valueArray0);
      linkedList0.addLast(fact0);
      LinkedList<Fact> linkedList1 = rule0.deriveOnce(linkedList0);
      assertEquals(0, linkedList1.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Predicate predicate0 = new Predicate("{3%R,g<*p$]V");
      Argument[] argumentArray0 = new Argument[0];
      Datalog datalog0 = new Datalog(predicate0, argumentArray0);
      Datalog[] datalogArray0 = new Datalog[2];
      Rule rule0 = new Rule(datalog0, datalogArray0);
      Datalog datalog1 = rule0.getHead();
      assertSame(datalog1, datalog0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Predicate predicate0 = new Predicate("05h5]ZXsrK;Z#Yy");
      Argument[] argumentArray0 = new Argument[2];
      Datalog datalog0 = new Datalog(predicate0, argumentArray0);
      Datalog[] datalogArray0 = new Datalog[0];
      Rule rule0 = new Rule(datalog0, datalogArray0);
      Datalog[] datalogArray1 = rule0.getBody();
      assertEquals(0, datalogArray1.length);
  }
}
