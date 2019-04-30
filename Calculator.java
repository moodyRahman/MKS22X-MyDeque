public class Calculator{

public static double eval(String s){

	String[] tokens = s.split(" ");
	MyDeque<String> stack = new MyDeque<String>();

	for (String token : tokens) {
		if (isNumeric(token)){
			stack.addFirst(token);
		}
		else{
			double no1 = Double.parseDouble(stack.removeFirst());
			double no2 = Double.parseDouble(stack.removeFirst());
			if (token.equals("+")){
				stack.addFirst(Double.toString(no1 + no2));
			}
			if (token.equals("-")){
				stack.addFirst(Double.toString(no1 - no2));
			}
			if (token.equals("/")){
				stack.addFirst(Double.toString(no1 / no2));
			}
			if (token.equals("*")){
				stack.addFirst(Double.toString(no1 * no2));
			}
		}
	}
	return Double.parseDouble(stack.removeFirst());
}

public static boolean isNumeric(String strNum) {
    	try {
        	double d = Double.parseDouble(strNum);
    	} catch (NumberFormatException | NullPointerException nfe) {
        	return false;
	}
    	return true;
}


public static void main(String[] args) {
	System.out.println(eval("4 5 5 + *"));
}


}
