import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number =inputNumber();
	int[] swappedNumbers =	swapTwoNumbers(number);
	 System.out.println("After swapping:");
     System.out.println("First number: " + swappedNumbers[0]);
     System.out.println("Second number: " + swappedNumbers[1]);
	
	}
	
	

	private static int[] inputNumber() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = s.nextInt();
		System.out.println("Entred value of first number" + " " + num1);
		System.out.println("Enter the second number ");
		int num2 = s.nextInt();
		
		System.out.println("Entered value of Second number" + " " + num2);
		 return new int[] {num1,num2};
		
	}



	private static int[] swapTwoNumbers(int[] number) {
		// TODO Auto-generated method stub
		int num1= number[0];
		int num2= number[1];
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		return new int[] {num1,num2};
		
	}

}
