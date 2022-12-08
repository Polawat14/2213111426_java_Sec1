import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 System.out.print("Please enter your name, separated by a space"
		 		+ "\n:");
		 String fullname = scan.nextLine();
		 String firstname = fullname.substring(0,(fullname.indexOf(" ")));
		 abbreviatName(fullname);
		 System.out.println(abbreviatName(fullname)+firstname);
		 
	}
	
	public static String abbreviatName (String fullname) {
		String name = "";
		
		for (int i=0; i < fullname.length(); i++) {
			if(fullname.charAt(i)==' ') {
				name = (name + fullname.charAt(i+1)).toUpperCase(); 
				name = name+".";
			}
			
			
	    }
		return name;
	}
}
