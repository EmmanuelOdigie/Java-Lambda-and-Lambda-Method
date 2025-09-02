package JavaLambda;// project made in eclipse
import java.util.ArrayList; // imported ArrayList class
import java.util.function.Consumer; // imported Consumer class

public class JavaLambdaPT2 {// created public class 'JavaLamdaPT2'

	public static void main(String[] args) {// Reads , runs & executes
	
	// created object of the imported ArrayList class named 'myNewArrayList'
	//set the imported class to take in Integer = ArrayList<Integer>
		ArrayList<Integer> myNewArrayList = new ArrayList<Integer>();
	
	// used object to call onto the '.add' method to add all the numbers into the object
		myNewArrayList.add(5);
		myNewArrayList.add(10);
		myNewArrayList.add(15);
		myNewArrayList.add(20);
		myNewArrayList.add(30);
	
	//used imported Customer class set the class to take in an Integer 
	// - Consumer<Integer>, created a variable name called 'number' to store all the information
	//created variable 'n' for the lambda expression 
	// (n) -> {System.out.println(n);};, in the variable 'number' is the formation to store and 
	// print out values through the lambda expression
	// then used the object to call onto the '.forEach(number);' to store values in the variable 
	// 'number'
		Consumer<Integer> number = (n) -> {System.out.println(n);};
		myNewArrayList.forEach(number);
	}

}

// Result:
// 5
//10
//15
//20
//30