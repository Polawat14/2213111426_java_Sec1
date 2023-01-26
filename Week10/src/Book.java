
public class Book {
	private String title;
	private Author author;//composition concept
	private int page;
	
	public Book(String title,Author author,int page) {
		this.title=title;
		this.author=author;
		this.page=page;
		//this(title,author,page);
	}
	public Book(String title,Author author) {
		this.title=title;
		this.author=author;
		page=0;
		//this(tilte,author,0);
	}
	public Book() {
		title="";
		author=null;
		page=0;
		//this(null,null,0);
	}
	public String getTitle() {
		return this.title;
	}
	public Author getAuthor() {
		return this.author;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPage() {
		return this.page;
	}
	public String toString() {
		return getTitle() + " has " + getPage() +" pages write by "+ author; 
	}
}
