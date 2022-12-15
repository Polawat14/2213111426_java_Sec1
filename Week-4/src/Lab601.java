import java.util.*;

public class Lab601 {
	static int countofOdd = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] positiveNumber = new int[7];
		for(int i=0; i < positiveNumber.length; i++) {
			System.out.print("Input number "+ (i+1)+ " : ");
			positiveNumber[i] = scan.nextInt();
			/*if(positiveNumber[i]%2 !=0) {
				countofOdd++;
			}*/
			countofOdd = countOddNumber(positiveNumber);
		}
		System.out.println();
		System.out.println("There are "+ countofOdd + " of odd number");
		for(int _posNum : positiveNumber) {
			if(_posNum %2 !=0) {
				System.out.print( _posNum+" ");
			}
		}
	}//end of main

	public static int countOddNumber(int[] num) {
		for(int i=0;i<num.length;i++) {
			countofOdd++;
		}
		return countofOdd;
	}
	
	
}
