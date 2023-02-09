
public class  Cylinder extends Circle{
	private double height;
	
	public Cylinder (double radius,double height) {
		super(radius,null);
		this.height=height;
	}
	public double getHeight() {
		return height ;
	}
	public double getVolume() {
		return super.getArea() * height;
	}
	
	public String toString() {
		return "height="+getHeight()+","+super.toString();
	}
	@Override 
	public double getArea() {
		return 2*Math.PI*(height+radius);
	}
	
}

