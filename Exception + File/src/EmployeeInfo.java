import java.util.*;
import java.io.*;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner con = new Scanner (System.in);
		String choice;
		System.out.print("Insert or Read data (from File)? : ");
		choice = con.next().toLowerCase();
		while(!choice.equals("insert")&& !choice.equals("read")) {
			System.out.print("Please text insert or read data? : ");
			choice = con.next().toLowerCase();
		}
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) {
			file.insert();
		}
		else {
			System.out.print("\nEnter department: ");
			choice = con.next();
			file.setDept(choice);
			file.read();
		}
	}

}
