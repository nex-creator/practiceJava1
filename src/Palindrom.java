import java.util.Scanner;

public class Palindrom {
	private String inputString;

	
	
	public void getInput(String inputString) {
		this.inputString= inputString;
	}
	public void checkPalindorme() {
		boolean isPalindrome = true;
		for(int i=0; i < inputString.length()/2;i++) {
			if(inputString.charAt(i) !=inputString.charAt(inputString.length()-i-1)) {
				isPalindrome = false;
				break;
			
			}
		}
		if(isPalindrome) {
			System.out.println(inputString + "  is Palindrome");
		}
		else
		{
			System.out.println(inputString + "  is not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner scanner = new Scanner(System.in);
System.out.println("Enter the input string to check whether it is palindorme or not");
String inputString = scanner.nextLine();
System.out.println("Entered input string is   :   " + inputString);
Palindrom obj = new Palindrom();
obj.getInput(inputString);
obj.checkPalindorme();
	scanner.close();
	}
}