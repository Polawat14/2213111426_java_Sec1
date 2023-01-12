import java.util.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many product list in stock : ");
		product[] pd = new product[scan.nextInt()];
		System.out.println();
		
		for(int i=0;i<pd.length;i++) {
			pd[i]=new product();
			System.out.print("Input product Id  : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			pd[i].setUnit(scan.nextInt());
			System.out.println();
			
		}
		
		System.out.println("------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("------------------------------------------");
		
		for(product _pd:pd) {
			if(_pd.getUnit()<5){
				System.out.println(">> "+_pd.getId()+
						"has "+_pd.getUnit()+" Units.");
			}
		}
		System.out.println("------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("------------------------------------------");
		
		for(product _pd:pd) {
			if(_pd.getUnit()>4 && _pd.getUnit()<51) {
				System.out.println(">> "+_pd.getId()+
						"has "+_pd.getUnit()+" Units.");
				
			}
		}
		System.out.println("------------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("------------------------------------------");
		
		for(product _pd:pd) {
			if(_pd.getUnit()>50) {
				System.out.println(">> "+_pd.getId()+
						"has "+_pd.getUnit()+" Units.");
			}
		}
	}

}
