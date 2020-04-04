package net.digistar.vanadio.support;

import com.abubusoft.kripton.TypeAdapter;

public class CollapsedStringAdapter implements TypeAdapter<String, String> {

  public static boolean isWhiteSpace(char ch) {
    if (ch > ' ') {
      return false;
    } else {
      return ch == '\t' || ch == '\n' || ch == '\r' || ch == ' ';
    }
  }

  @Override
  public String toJava(String text) {
    if (text == null) {
      return null;
    } else {
      int len = text.length();

      int s;
      for (s = 0; s < len && !isWhiteSpace(text.charAt(s)); ++s) {
      }

      if (s == len) {
        return text;
      } else {
        StringBuilder result = new StringBuilder(len);
        if (s != 0) {
          for (int i = 0; i < s; ++i) {
            result.append(text.charAt(i));
          }

          result.append(' ');
        }

        boolean inStripMode = true;

        for (int i = s + 1; i < len; ++i) {
          char ch = text.charAt(i);
          boolean b = isWhiteSpace(ch);
          if (!inStripMode || !b) {
            inStripMode = b;
            if (b) {
              result.append(' ');
            } else {
              result.append(ch);
            }
          }
        }

        len = result.length();
        if (len > 0 && result.charAt(len - 1) == ' ') {
          result.setLength(len - 1);
        }

        return result.toString();
      }
    }
  }

  @Override
  public String toData(String javaValue) {
    return javaValue;
  }
}
