import javax.swing.JOptionPane;

public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius[] = new double[5];
		double height[] = new double[5];
		
		for(int i =0;i<radius.length;i++) {
			radius[i]= Double.parseDouble(JOptionPane.showInputDialog(""));
			
			height[i]= Double.parseDouble(JOptionPane.showInputDialog(""));
		}
		for(int i =0;i<radius.length;i++) {
			Cylinder cylinder = new Cylinder(radius[i],height[i]);
			JOptionPane.showMessageDialog(null,"Cylinder "+(i+1)+", volume="+cylinder.getVolume());
		}
	}

}
