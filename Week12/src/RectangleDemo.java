import java.util.*;
import javax.swing.*;
public class RectangleDemo {

	public static void main(String[] args) {
	
	double width = Double.parseDouble(JOptionPane.showInputDialog("Input width : "));
	double length = Double.parseDouble(JOptionPane.showInputDialog("Input length : "));
	String color = JOptionPane.showInputDialog("Input color : ");
	
	Rectangle rec = new Rectangle(width,length,color);
	
	JOptionPane.showMessageDialog(null, rec
			+"\nArea of Rectangle is "+rec.getArea());

	}

}
