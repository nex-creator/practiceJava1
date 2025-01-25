import java.util.Scanner;

public class MathFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = inputNum();
	System.out.println("Entered num to calculate factorial:  " + input1);
	int output = fact(input1);
	System.out.println("Factorial of " + input1 + " is :" + output);
	
	System.out.println("Factorial of " + input1 + " is :" + output);
	

	}

	
	
	public static int inputNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		return num;
	}
	
	
	public static int fact(int num) {
		int var =1;
		for (int i=1;i<= num;i++) {
			var = var *i;
		}
		return var;
	}
}
