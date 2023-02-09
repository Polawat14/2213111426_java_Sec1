import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double radius = sc.nextDouble();
		double height = sc.nextDouble();
		Circle circle = new Circle(radius,null);
		
		System.out.println();
		System.out.println("Circle[radius="+radius+"]");
		System.out.println("Circle[area="+circle.getArea()+"]");
		
		System.out.println();
		
		Cylinder cylinder = new Cylinder(radius,height);
		System.out.println("Cylinder[height+"+height+",radius="+radius+"]");
		System.out.println("Cylinder[area="+cylinder.getArea()+"]");
		System.out.println("Cylinder[Volume="+cylinder.getVolume()+"]");
	}

}
