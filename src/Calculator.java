import java.util.Scanner;

public class Calculator {
	// initialize value
	private int num1;
	private int num2;
	private int num3;
	
	//set and get num1
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	//set and get num2
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum2() {
		return num2;
	}
	
	//set and get num3
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public int getNum3() {
		return num3;
	}
	//Methods to perform action
	
	
	public int add(int num1,int num2)
	{
		return num1+num2;

}
	public int add(int num1,int num2,int num3)
	{
		return num1+num2+num3;

}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Method Overloading - same method name but different parameters
		
		Calculator c1= new Calculator();
		Scanner scanner = new Scanner(System.in); // take input from the console
		System.out.println("Enter the First number:     ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second number:     ");
		int num2 = scanner.nextInt();
		
		c1.setNum1(num1);
		c1.getNum1();
		
		c1.setNum2(num2);
		c1.getNum2();
		
		System.out.println("Sum Of two numebrs:  "+ c1.add(c1.getNum1(),c1.getNum2()));
        
		System.out.println("Enter the Third number:     ");
		
		int num3 = scanner.nextInt();
		
		
		c1.setNum3(num3);
		c1.getNum3();
		
		System.out.println("Sum Of three numebrs:  "+  c1.add(c1.getNum1(),c1.getNum2(),c1.getNum3()));
		scanner.close();  // close the scanner to free the resource when  no longer input is required
	
	}

}
