import java.util.Scanner;

public class ArrayOperations {
	private int[] numbers;  // encapsulated array
	
	
	public void setNumbers(int[] numbers) throws Exception{
		if(numbers.length==0)
		{
			throw new Exception("Arrays cannot be empty");
		}
		this.numbers =numbers;
	}
	
	
	public int findLargest() {
		int largestNo = numbers[0];
		for(int i=1; i< numbers.length;i++)
		{
			if(numbers[i] > largestNo) {
				largestNo = numbers[i];
			}
			}
		return largestNo;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
try {
	System.out.println("Enter the size of array ");
    int size = scanner.nextInt();
    
    if(size <=0) {
    	throw new Exception("Array size must be greater than zero");
    }
     int[] numbers = new int[size];// create dynamic array
     
     System.out.println("Enter " + size + "numbers");
     for(int i= 0;i<size;i++)
     {
    	 numbers[i]= scanner.nextInt();
     }
     
     ArrayOperations arr = new ArrayOperations();
     arr.setNumbers(numbers);
     
     int largestNo = arr.findLargest();
     
     System.out.println("Largest number in the give array is:  " + largestNo);
    
     

}

catch(Exception e) {
	System.out.println("Error "+e.getMessage());
}
	
finally {
	scanner.close();
}
}



}
