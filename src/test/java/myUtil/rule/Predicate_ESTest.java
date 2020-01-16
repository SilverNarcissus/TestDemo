package myUtil.rule;/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 08 02:29:06 GMT 2018
 */


import org.junit.Test;

import static org.junit.Assert.*;

public class Predicate_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate predicate0 = new Predicate("");
      String string0 = predicate0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Predicate predicate0 = new Predicate("");
      String string0 = predicate0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Predicate predicate0 = new Predicate("Namecannot be null");
      boolean boolean0 = predicate0.equals(predicate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Predicate predicate0 = new Predicate(">G_YR~");
      boolean boolean0 = predicate0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Predicate predicate0 = new Predicate(">G_YR~");
      boolean boolean0 = predicate0.equals(">G_YR~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Predicate predicate0 = null;
      try {
        predicate0 = new Predicate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name cannot be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Predicate predicate0 = new Predicate(">G_YR~");
      String string0 = predicate0.getName();
      assertEquals(">G_YR~", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Predicate predicate0 = new Predicate("Namecannot be null");
      String string0 = predicate0.toString();
      assertEquals("Namecannot be null", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Predicate predicate0 = new Predicate(">G_YR~");
      predicate0.hashCode();
  }
}
