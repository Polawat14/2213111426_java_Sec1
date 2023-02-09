import java.util.Scanner;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double radius[] = new double[5];
		double height[] = new double[5];
		
		for(int i =0;i<radius.length;i++) {
			
			radius[i]=sc.nextDouble();
			
			height[i]=sc.nextDouble();
		}
		for(int i =0;i<radius.length;i++) {
			Cylinder cylinder = new Cylinder(radius[i],height[i]);
			System.out.println("Cylinder "+(i+1)+", volume="+cylinder.getVolume());
		}

	}

}
