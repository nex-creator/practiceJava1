import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in1 = inputString();
		System.out.println("Entered string  " + in1);
		
	String out =	reverseString(in1);
	System.out.println("Reversed string  " + out);
	System.out.println("Changes done");
	System.out.println("Changes done");
	System.out.println("Changes done");
	
		
	}


//
public static String inputString() {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the input string");
	String s =  scanner.nextLine();
	return s;
}

public static String reverseString(String s) {
	String r =  "";
	char ch;
	for (int  i=0; i<=s.length()-1;i++) {
		
		ch = s.charAt(i);
		r = ch + r;
}
	return r;
}
}