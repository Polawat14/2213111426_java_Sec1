import java.util.*;
import java.text.*;

public class IncomeTaxCalculator {

	static final double TAX_RATE_ABOVE_20K = 0.1;
	static final double TAX_RATE_ABOVE_40K = 0.2;
	static final double TAX_RATE_ABOVE_60K = 0.3;

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,##0.00");
		
		int taxableIncome;
		double taxPayable;
		System.out.print("Enter the taxable income: $");
		Scanner scan =  new Scanner(System.in);
		taxableIncome = scan.nextInt(); 
		
		if (taxableIncome <= 20000) { // [0, 20000]
			taxPayable = taxableIncome*0.00;
			} else if (taxableIncome <= 40000) { // [20001, 40000]
			taxableIncome -= 20000;
			taxPayable = taxableIncome*TAX_RATE_ABOVE_20K;
			} else if (taxableIncome <= 60000) { // [40001, 60000]
			taxableIncome -= 40000;
			taxPayable = (taxableIncome*TAX_RATE_ABOVE_40K)+2000;
			} else { // [60001, ]
			taxableIncome -= 60000;
			taxPayable =(taxableIncome*TAX_RATE_ABOVE_60K)+6000;
			}
		
		
		System.out.print("The income tax payable is: $"+frm.format(taxPayable));
 
	}

}
