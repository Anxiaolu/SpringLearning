package cn.edu.sdut.softlab.training.util;

import java.util.Locale;

/**
 * 字符串处理类.
 *
 */
public class StringUtil {

  /**
   * Returns length of a string. If the string is null, return 0.
   *
   * @param data input string
   * @return 0 if the data is null or the length of the data string.
   */
  public static int strlen(String data) {
    return (data == null) ? 0 : data.length();
  }

  /**
   * Returns a string with all alphabetic characters converted to lowercase.
   *
   * @param data input string
   * @return a string in lowercse.
   */
  public static String strToLower(String data) {
    return (null == data) ? "" : data.toLowerCase(Locale.getDefault());
  }

  /**
   * Returns a string with all alphabetic characters converted to uppercse.
   *
   * @param data input string
   * @return a string in uppercase.
   */
  public static String strToUpper(String data) {
    return (null == data) ? "" : data.toUpperCase(Locale.getDefault());
  }

  /**
   * Checks if a string starts with lower case char.
   *
   * @param str the string to check
   * @return true if the string starts with lower case char.
   */
  public static boolean startsWithLowerCaseChar(String str) {
    int c0 = (int) str.charAt(0);
    return c0 >= 97 && c0 <= 122;
  }

  /**
   * 删除字符串中间的空格.
   *
   * @TODO 无法删除回车、tab等？
   *
   * @param data 需要处理的字符串
   * @return string
   */
  public static String stripSpaces(String data) {
    if (data == null) {
      return data;
    }

    return replace(data.trim(), " ", "");
  }

  /**
   * Replaces old symbols with an empty string.
   *
   * <pre>
   * Examples:
   *      replace("123te123ch123", "123");    would return "tech"
   * </pre>
   *
   * @param data the original string
   * @param oldSymbol the substring to be replaced
   * @return a replaced string
   */
  public static String replace(String data, String oldSymbol) {
    return replace(data, oldSymbol, "");
  }

  /**
   * Replaces old symbols with new symbols in a string.
   *
   * <pre>
   * Examples:
   *      replace("123te123ch123", "123", "X"); would return "XteXchX"
   * </pre>
   *
   * @param str the original string
   * @param oldSymbol the substring to be replaced
   * @param newSymbol the replacement substring
   * @return a replaced string
   */
  public static String replace(String str, String oldSymbol, String newSymbol) {
    // In a string replace one substring with another
    if (str == null || !str.contains(oldSymbol)) {
      return str;
    }

    int oldLength = oldSymbol.length();
    StringBuilder result = new StringBuilder();
    int idx = str.indexOf(oldSymbol, 0);
    int lastIndex = 0;
    while (idx != -1) {
      result.append(str.substring(lastIndex, idx)).append(newSymbol);
      lastIndex = idx + oldLength;
      idx = str.indexOf(oldSymbol, lastIndex);
    }
    result.append(str.substring(lastIndex));

    return result.toString();
  }

  /**
   * Replaces the last occurance of an old symbol with a new symbol.
   *
   * @param str the original string
   * @param oldSymbol the substring to be replaced
   * @param newSymbol the replacement substring
   * @return a replaced string
   */
  public static String replaceLast(String str, String oldSymbol, String newSymbol) {
    if (str == null || !str.contains(oldSymbol)) {
      return str;
    }

    int lastIndex = str.lastIndexOf(oldSymbol);
    int oldLength = oldSymbol.length();
    String result = str.substring(0, lastIndex) + newSymbol
            + str.substring(lastIndex + oldLength);

    return result;
  }

}
