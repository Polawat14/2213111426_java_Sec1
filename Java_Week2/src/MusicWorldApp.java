import javax.*;
import javax.swing.JOptionPane;


public class MusicWorldApp {
static final double TAX_RATE = .0625;
	public static void main(String[] args) {
		String cdId = JOptionPane.showInputDialog("This program calculates the toatal cost of a CD order"
													+"\nPlease enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		String strcdPrice = JOptionPane.showInputDialog("Please enter the price of the CD in U.S.dollars");
		double cdPrice = Double.parseDouble(strcdPrice);
		String strcdQuantity = JOptionPane.showInputDialog("Please enter the quantity to be purchased");
		int cdQuantity = Integer.parseInt(strcdQuantity);
		
		double cdSubtotal= cdPrice*cdQuantity;
		double cdTotal = cdSubtotal * (1+TAX_RATE);
		double tax = TAX_RATE*100;
		
		
			JOptionPane.showMessageDialog(null, "Summary of the transaction: "+
												"\n\nCD ID: "+ cdId +"\nCD Title: "+
												cdTitle + "\nCD Unit Price: $"+ cdPrice + 
												"\nCD Quantity: "+ cdQuantity + 
												"\n\nSubtotal: $"+ cdSubtotal + 
												"\nTax rate: "+ tax +"%"+
												"\nTotal: $"+ cdTotal+
												"\n\nEnd of Program");
		
		

	}

}
