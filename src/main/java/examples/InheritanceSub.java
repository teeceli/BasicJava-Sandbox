package examples;

public class InheritanceSub extends InheritanceSuper {
  
	int total;
	void sum() {
		total = i + j; 	// ERROR, j is not accessible here; i can be referenced directly without initialization
	} 
}
