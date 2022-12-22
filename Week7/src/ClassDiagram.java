import java.util.*;
public class ClassDiagram {
	
	
		
	public static void main(String[] args) {
		testClassDia pb = new testClassDia();
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.print("How many student in classroom : ");
		int[] student = new int[scan.nextInt()];
		testClassDia[] std = new testClassDia[student.length];
		
		for(int i=0;i<student.length;i++) {
			std[i] =new testClassDia();
		
		System.out.print("Input student name  : ");
		//std[i] = scan.next();
		std[i].setName(scan.next());
		
		System.out.print("Input student score : ");
		std[i].getScore(scan.nextInt());
		
		while(!std[i].checkScore()) {
			System.out.print("Input score , again :");
			std[i].getScore(scan.nextInt());
			}
		
		System.out.println("------------------------------------------");
		
		}
		
		System.out.println("------------------------------------------");
		for(int _std:student) {
				System.out.print(">> "+_std
							+"get grade"+
							_std+")");
			
		}
	}
}


