import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input movie id   : ");
		String movie = sc.nextLine();
		System.out.print("Input movie name : ");
		String Mname = sc.nextLine();
		
		System.out.println();
		
		System.out.print("Input director name   : ");
		String Dname = sc.nextLine();
		System.out.print("Input director e-mail : ");
		String email = sc.nextLine();
		System.out.print("Input director gender : ");
		String gender = sc.nextLine();
		
		
		while(!(gender== "M"&&gender == "m"||gender=="F"&&gender == "m")){
			System.out.print("Input director gender, again : ");
			gender = sc.nextLine();
			
		
		}
		System.out.println();
		
		System.out.print("Input movie theater no.      :");
		int theaterNo = sc.nextInt();
		while(theaterNo>0||theaterNo<16) {
			System.out.print("Please input 1 - 15 only : ");
		}
		System.out.println();
		
		Theater tt = new Theater(movie,Mname,Dname,email,theaterNo);
		System.out.println(tt);
		
		

	}
	

		

}
