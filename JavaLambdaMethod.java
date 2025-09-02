package JavaLambda;//project created in eclipse

public class JavaLambdaMethod { // created public class 'JavaLamdaMethod'
	
	interface StringFunction {// created interface 'StringFunction' method
	String run(String str);	// set to run String variable 'str'
	}
	
	public static void main(String[] args) {// reads, run & executes code
	
	// used interface StringFunction and created two variables, 'exclaim' & questionMark
	// for the lambda expression, created a variable 'p' that's used to take in the String
	// - "!" & "?"
		StringFunction exclaim = (p) -> p + "!";
		StringFunction questionMark = (p) -> p + "?";
		
		printFormatted("Hey", exclaim); // set up the way it'll be displayed, calling onto variable 'exclaim'
		// Hey!
		printFormatted("Hey", questionMark);// set up the way it'll be displayed, calling onto variable 'questionMark'
		// Hey?

	}

// printFormatted calls on to String 'str' which will run it's method & StringFunction 'format'
//'format' keyword wil be used to format text being displayed
	public static void printFormatted(String str, StringFunction format) { // reads, runs & executes code
		String result = format.run(str); // it'll run the method 'interface StringFunction'
	// it will also format the text using 'format' keyword - 'format.run(str)' this will be stored
	// in variable 'result'	
		System.out.println(result); // displays data in variable 'result'
	}
}
// Result: Hey!
//Hey?