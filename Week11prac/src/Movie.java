
public class Movie {
	private String id;
	private String name;
	private Director director;
	
	public Movie(String id,String name,Director director) {
		this.id=id;
		this.name=name;
		this.director=director;
	}
	public Movie() {
		
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Director getDirector() {
		return this.director;
	}
	public void setDirector(Director director) {
		this.director=director;
	}
	public String toString() {
		return getId()+getName()+" direct by "+ director.toString();
	}
}
