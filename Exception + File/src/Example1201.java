import java.io.*;
import java.util.*;

public class Example1201 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//try {
		Scanner rd = new Scanner (new File ("MemberLogin.txt"));
		while(rd.hasNext()) {
			String fname = rd.next(); //read data1 from file to fname
			//String lname = rd.next();//read data2 from file to lname
			rd.next(); //read data2 from file
			rd.next(); // read data3 from file
			String email = rd.next().toUpperCase();//read data4 from file to email
			System.out.println(fname + "("+email+")");
		}
		rd.close();
		//}catch(FileNotFound) {
			
			
		//}
	}

}
