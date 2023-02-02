
public class Director {
	private String name;
	private String email;
	private char gender;
	
	public Director(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public Director(String name,String email) {
		this.name=name;
		this.email=email;
		this.gender=0;
		
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(gender == 'm'||gender == 'M') {
			return "male";
		}
		else if (gender =='f'||gender=='F') {
			 return "Female";
		}
		else return "null";
	}
	public String toString() {
		return getName()+"("+getEmail()+";"+getGenderName()+")";
	}
}
