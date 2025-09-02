public class JavaLambda {// created public class named 'JavaLamda'

	public static void main(String[] args) { // reads, runs & executes
	
	// created an object of the imported ArrayList class named 'newArrayList' set type as Integer
	// -> ArrayList<Integer>
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		
	// got object to add numbers to the ArrayList
		newArrayList.add(2);
		newArrayList.add(4);
		newArrayList.add(6);
		newArrayList.add(8);
		newArrayList.add(10);
		newArrayList.add(12);
		newArrayList.forEach((list) -> {System.out.println(list);}); // created variable list 
	// using lambda expression then displaying array through the variable 'list' on the lambda
	// expression

	}

}

// Result:
//2
//4
//6
//8
//10
//12