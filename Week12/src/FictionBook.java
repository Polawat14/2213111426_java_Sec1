
public class FictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title =title;
		this.publicYear=publicYear;
		
	}
	public void setAuthorname(String name) {
		this.author_name = name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public boolean checkFormatName() {
		if () {
			return true;
		}
		else {return false;}
	}
	public String toString() {
		return title + " write by "+
	
	}
	@Override 
	public String getLastName() {
		return 
	}
	
	@Override
	public String getFirstName() {
		return 
	}
	
	@Override 
	public boolean checkEmail() {
		
	}
	
	@Override
	public int totalPublicYear() {
		
	}
}
