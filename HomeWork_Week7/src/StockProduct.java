import java.util.*;
import java.text.*;
public class StockProduct {

	public static void main(String[] args) {
		
		product[] pd = new product[4];
		Scanner scan = new Scanner(System.in);
		DecimalFormat dm = new DecimalFormat("#,###.00");
		
		for(int i=0;i<pd.length;i++) {
			pd[i] = new product();
			System.out.print("Input product Id    : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			pd[i].setUnit(scan.nextInt());
			
			while(!(pd[i].getUnit()>0)) {
				System.out.print("Input product Unit  : ");
				pd[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price  : ");
			pd[i].setPrice(scan.nextDouble());
			
			while(!(pd[i].getPrice()>0)) {
				System.out.print("Input product Price : ");
				pd[i].setPrice(scan.nextInt());
			}
			System.out.println();
			
		}
			
		System.out.println("------------------------------------------------");
		
		double total =0;
		for (product _pd:pd) {
			System.out.println("Product ID : "+_pd.getId()+
					", Total price = "+dm.format(_pd.calculate())+" baht.");
					total += _pd.calculate();
		}
		System.out.println("------------------------------------------------ ");
		System.out.println("Total price of all product is "+dm.format(total)+" baht.");
		}	
		
		
		
	}


