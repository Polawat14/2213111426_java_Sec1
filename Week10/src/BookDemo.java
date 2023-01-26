import java.util.*;
public class BookDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name : ");
		String name = scan.nextLine();
		System.out.print("Input author e-mail : ");
		String email = scan.nextLine();
		
		Author polawat = new Author(name,email);
		System.out.println(polawat);
		
		System.out.print("Input book title: ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("Input book page : ");
		int page = scan.nextInt();
		
		System.out.println();
		Book book = new Book (title,polawat,page);
		System.out.println(book);
	}

}
