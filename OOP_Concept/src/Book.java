import java.time.Year;

public class Book {
	
	//attributes
	private String title;
	private float price;
	private int publishyear;

	//Setter Methods
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setPublishyear(int year) {
		this.publishyear = year;
	}
	
	
	//Getter methods
	public String getTitle() {
		return this.title;
	}
	public float getPrice() {
		return this.price;
	}
	public int publishyear() {
		return this.publishyear;
	}
	
	
	//getTotal
	public int getTotalYear() {
		return (Year.now().getValue())-publishyear;
	}
	//toString
	public String toString() {
		return "Title: "+ title + " published for "+
				getTotalYear()+" year "+"("+price+"baht).";
	}
	
	
}
