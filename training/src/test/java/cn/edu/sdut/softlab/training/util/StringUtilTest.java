package cn.edu.sdut.softlab.training.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author SuBaochen:subaochen@126.com
 */
public class StringUtilTest {

  public StringUtilTest() {
  }

  /**
   * Test of strlen method, of class StringUtil.
   */
  @Test
  public void testStrlen() {
    System.out.println("strlen");
    String data = "";
    int expResult = 0;
    int result = StringUtil.strlen(data);
    assertEquals(expResult, result);
  }

  /**
   * Test of strToLower method, of class StringUtil.
   */
  @Test
  public void testStrToLower() {
    System.out.println("strToLower");
    String data = "Abc";
    String expResult = "abc";
    String result = StringUtil.strToLower(data);
    assertEquals(expResult, result);
  }

  /**
   * Test of strToUpper method, of class StringUtil.
   */
  @Test
  public void testStrToUpper() {
    System.out.println("strToUpper");
    String data = "abC";
    String expResult = "ABC";
    String result = StringUtil.strToUpper(data);
    assertEquals(expResult, result);
  }

  /**
   * Test of startsWithLowerCaseChar method, of class StringUtil.
   */
  @Test
  public void testStartsWithLowerCaseChar() {
    System.out.println("startsWithLowerCaseChar");
    String str = "aBC";
    boolean expResult = true;
    boolean result = StringUtil.startsWithLowerCaseChar(str);
    assertEquals(expResult, result);

    assertEquals(false, StringUtil.startsWithLowerCaseChar("Abc"));
  }

  /**
   * Test of stripSpaces method, of class StringUtil.
   */
  @Test
  public void testStripSpaces() {
    System.out.println("stripSpaces");
    String data = "a bc";
    String expResult = "abc";
    String result = StringUtil.stripSpaces(data);
    assertEquals(expResult, result);

  }

  /**
   * Test of replaceLast method, of class StringUtil.
   */
  @Test
  public void testReplaceLast() {
    System.out.println("replaceLast");
    String str = "abc?";
    String oldSymbol = "?";
    String newSymbol = "*";
    String expResult = "abc*";
    String result = StringUtil.replaceLast(str, oldSymbol, newSymbol);
    assertEquals(expResult, result);
  }

}
