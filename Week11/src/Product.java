
public class Product {
	private int unit;
	
	public void setUnit(int unit) {
		this.unit=unit=100;
	}
	public int getUnit() {
		return unit;
	}
	public int getTotalprice() {
		return unit*100;
		
	}
	public String toString() {
		return "You buy "+unit+" unit ("+getTotalprice()+").";
	}
}
