import javax.swing.*;
import java.text.*;

public class Lab302 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("##.0");
		String weightstr = JOptionPane.showInputDialog("Input Weight: ");
		double weight = Double.parseDouble(weightstr);		
		String CMheightstr = JOptionPane.showInputDialog("Input Height: ");
		double CMheight = Double.parseDouble(CMheightstr);
		
		double Mheight = CMheight/100;
		
		double CalBMI = weight /Math.pow(Mheight,2);
		
		
			JOptionPane.showMessageDialog(null,
					"BMI = "+frm.format(CalBMI)+"\nYou're "+
			(CalBMI < 18.5?"Underweight":
			(CalBMI >= 18.5 && CalBMI < 25.0)?"Normal-weight":
			(CalBMI >= 25.0 && CalBMI < 30)?"Overweight":
			"Obesity")
			,"BMI"
			,JOptionPane.WARNING_MESSAGE);
			
		
	
	}

}
