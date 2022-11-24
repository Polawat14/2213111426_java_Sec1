import java.util.*;
import java.text.*;

public class SalespersonSalary {
	
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;
	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int sales;
		double salary;
		
		System.out.print("Enter sales in dollar (or -1 to end): ");
		Scanner scan = new Scanner(System.in);
		sales = scan.nextInt();
		double cal = 1000+sales*COMMISSION_RATE;
		System.out.println("Salary is: $"+frm.format(cal));

		
		do {
			
		System.out.print("Enter sales in dollar (or -1 to end): ");
		scan = new Scanner(System.in);
		sales = scan.nextInt();
		cal = 1000+sales*COMMISSION_RATE;
		if(sales == SENTINEL) {
			break;
		}
		System.out.println("Salary is: $"+frm.format(cal));
		}while(sales != SENTINEL);
		
		System.out.println("bye");
		 

	}

}
