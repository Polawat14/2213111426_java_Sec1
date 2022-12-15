import java.util.*;

public class Lab505 {

	public static void main(String[] args) {
		inputStudent();
		
		

	}
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		String ID = scan.nextLine();
		System.out.print("Enter Subject ID: ");
		String subID= scan.nextLine();
		
		do {
			System.out.print("Enter Student ID: ");
			ID = scan.nextLine();
			System.out.print("Enter Subject ID: ");
			subID= scan.nextLine();
		}while(isLength(ID,subID));

	}
	public static boolean isLength(String chkID,String chksubID) {
		
	}

}
