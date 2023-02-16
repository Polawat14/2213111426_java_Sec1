import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {
	private String name,dept;
	
	public void insert() throws IOException{
		Scanner con = new Scanner (System.in);
		PrintStream prs = new PrintStream(new File("employee.txt")); 
		String ans;
		do {
			super.header();
			System.out.print("Enter name: ");
			name = con.next();
			System.out.print("Enter department: ");
			dept = con.next();
			prs.println(name + "\t"+dept);
			System.out.print("Enter data again? : ");
			ans = con.next();
		}while(ans.equalsIgnoreCase("y"));
		}
	public void read() {
		try {
			Scanner in = new Scanner(new File("employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(in.hasNext()) {
				name = in.next();
				dept = in.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.print(i+ ") "+name);
					check = true ;
				}
				
			}// end of while
			if(check) {
				super.header();
				System.out.print("Emplyee in department "+ super.getDept()+
						" is "+i+" person.");
				super.header();
			}else {
				System.out.print("\nSorry,no department : "+super.getDept()+
						" is "+i+" person. ");
			}
		}catch(IOException e) {
			System.out.println("\nSorry file not found...");
		}
		
	}
}
