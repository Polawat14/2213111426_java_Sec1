import java.util.*;

public class Lab_403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Message : ");
		String message = scan.nextLine().toLowerCase();
		if(message.indexOf("nichi")>=0)  {
			System.out.println("Nichi is a sentence");
		}
		else {
			System.out.println(message.substring(0));
		}
	}		

}


