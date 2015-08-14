package sandbox;

public class InheritanceSuper {
  
	// public by default?? (in book) actually no modifier by default (class, package-public but NOT subclass)
	// JCR book is wrong
	int i;
   // private to InheritanceSuper
	int j; 				   
  
	void setij(int x, int y) {
		i = x;
		j = y;
	} 
}
