package sandbox;

// Demonstrate a method reference to a generic method declared inside a non-generic class.
// A functional interface that operates on an array and a value, and returns an int result.
interface MyFunc {
  int func(T[] vals, T v); 
}
