import java.util.Scanner;

public class MathFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = inputNum();
	System.out.println("Entered num to calculate factorial:  " + input1);
	
	System.out.println("To print factorial of given number");
	fact(input1);
	System.out.println("to print the fibnoacci sequence");
	fibnoacci(input1);
	System.out.println("To check whether a number is prime or not");
	if (primNo(input1)) {
		System.out.println(input1 + "is Prime");
	}
	else {
		System.out.println(input1 + "is not Prime");
	}
	}

	// for taking input
	
	public static int inputNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		return num;
	}
	
	//calculate factorial of a number
	public static void fact(int num) {
		int var =1;
		if(num <= 0) {
			System.out.println("Factorial of" + num+ "is: 0" );
		}
		else {	
			for (int i=1;i<= num;i++) 
			var = var *i;
			System.out.println(var);
		}
		
	}
	
	// function to print fibnoacci series
	public static void fibnoacci(int num) {
		int a=0;
		int b=1;
		int c;
		if(num<=1) {
			System.out.println(a+ " ");
		}
		else {
			System.out.print(a + " "  +b+ " ");
			for(int i=3; i<=num;i++) {
				c = a+b;
				a = b;
				b = c;
				System.out.print(c + " ");		
			}
			System.out.println(" ");
		
	}
	}
	
	
	// function to check whether a number is prime
	
	public static boolean primNo(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2; i < num/2; i++) {
			if(num%i == 0)
			return false;
		}
		return true;
		
}
	}
