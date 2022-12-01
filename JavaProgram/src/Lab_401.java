import java.util.*;

public class Lab_401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Fullname   : ");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(' ');
		if(space==-1)  {
			System.out.println("Incorrect Name");
		}
		else {
			System.out.println("First name : "+fullname.substring(0,space).toUpperCase());
			System.out.println("Last name  : "+fullname.substring(space+1).toLowerCase());
		}
	}	
}

