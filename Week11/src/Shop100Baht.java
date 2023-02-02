import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product sold = new Product();
		
		int button = JOptionPane.showConfirmDialog(null,"Pattanakarn?");
		if(button == 0 ) {
			sold = new PattanakarnBrannch();
		}
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product: ")));
		
		JOptionPane.showMessageDialog(null,sold);
		
	}

}
