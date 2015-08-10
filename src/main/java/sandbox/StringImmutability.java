package sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringImmutability {
  
  final static Logger logger = LoggerFactory.getLogger(StringImmutability.class);
 
  public static void main(String[] args) {
    String str = "Mississippi";
    String str2 = str;
    
    // Replace just returns a string and because strings are immutable doesn't 
    // actually change the value on the string
    str2.replace("i", "!");
    logger.info("str replace: " + str2.replace("i", "!"));
    logger.info("str: " + str);
    logger.info("str2: " + str2);
    
    referenceEquals(str, str2);
    valueEquals(str, str2);
    
    // Unlike the example above this actually points str2 to a new string object. 
    // str is left alone and still points to the original
    str2 = str2.replace("i", "!");
    logger.info("str: " + str);
    logger.info("str2: " + str2);
    
    referenceEquals(str, str2);
    valueEquals(str, str2);
    
    // Replace str object as well. Verify value is now the same but reference is not
    str = str.replace("i", "!");
    logger.info("str: " + str);
    logger.info("str2: " + str2);
    
    referenceEquals(str, str2);
    valueEquals(str, str2);
  }
  
  private static void referenceEquals(String str, String str2) {
    if (str == str2) {
      logger.info("str == str2 is true");
    } else {
      logger.info("str == str2 is false");
    }
  }
  
  private static void valueEquals(String str, String str2) {
    if (str.equals(str2)) {
      logger.info("str.equals(str2) is true");
    } else {
      logger.info("str.equals(str2) is false");
    }
  }
}
