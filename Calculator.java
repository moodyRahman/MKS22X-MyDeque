public class Calculator{

public static double eval(String s){

	String[] tokens = s.split(" ");
	MyDeque<String> stack = new MyDeque<String>();

	for (String token : tokens) {

	}
	return 5;
}


public static void main(String[] args) {
	// Calculator.eval("5 + 6 - 78");
	System.out.println(isNumeric("5"));
	System.out.println(isNumeric("45"));
	System.out.println(isNumeric("ff"));
}


}
