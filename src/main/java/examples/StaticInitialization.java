package examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Example of how static class initialization works
public class StaticInitialization {
  
  final static Logger logger = LoggerFactory.getLogger(StaticInitialization.class);
  private static int a = 3;
  private static int b;
  private static void meth(int x) {
		logger.info("x = " + x);
		logger.info("a = " + a);		// If a is set to non-static - compiler error occurs
		logger.info("b = " + b);
	}

  static {
  	logger.info("Static block initialized.");
  	b = a * 4;
  }

  public static void main(String args[]) {
  	meth(42);
  }
}
