import javax.swing.*;
import java.text.*;

public class Lab301 {
	
	static final int pricePerson =299;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofcustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill: "));
		
		double totalPrice = pricePerson * numberofcustomer;
		int memberCard;
		
		do {
			memberCard = JOptionPane.showConfirmDialog(null, 
				"Total Price is "+totalPrice+
				"\nDo you have a member card?");
			}while(memberCard == 2);
			
			double totalPricewithdiscount;
			
			if (memberCard == 0) {
			totalPricewithdiscount = totalPrice*90/100; // totalPrice+(totalPrice*10/100)
			JOptionPane.showMessageDialog(null, 
					"Account to be paid is "+
					frm.format(totalPricewithdiscount)+
					"baht.");
			}
			
			else if(memberCard==1) {
			JOptionPane.showConfirmDialog(null, "Account to be paid is "+
					frm.format(totalPrice)+"baht.");
			}
		
	}

}
;