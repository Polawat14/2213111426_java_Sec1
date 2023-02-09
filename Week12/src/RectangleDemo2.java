import java.util.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input width : ");
		double width = scan.nextDouble();
		System.out.print("Input length : ");
		double length = scan.nextDouble();
		System.out.print("Input color : ");
		String color = scan.next();
		
		Rectangle2 rec = new Rectangle2(width,length,color);
		
		System.out.println(rec);
		System.out.println("Area of Rectangle is "+ rec.getArea());

	}

}
