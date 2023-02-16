import java.io.*;
import java.util.*;

public class Example1202 {
	/**use BufferedReader Class*/
	static Scanner input = new Scanner (System.in); //define object for input data from keyboard
	
	public static void main(String[] args) throws IOException{
		System.out.print("Input Section: ");
		int sec = input.nextInt();
		Header(sec);
		showListStudent(sec);
		
	}
	public static void showListStudent(int sec) throws IOException {
		BufferedReader rd = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while((temp= rd.readLine()) != null) {
			String[] data = temp.split("\t");
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			String ResultGrade = findResult(midtermScore,finalScore);
			if(Integer.parseInt(data[3])==sec) {
				System.out.println(data[0]+" "+data[2]+"\t"+midtermScore+"\t"+
			finalScore+"\t"+ResultGrade);
			}
		}
	}
	public static String findResult (double mid ,double fin) {
		double totalScore = mid + fin;
		if(totalScore<=40)return "Fail";
		else return "Pass";
	}
	public static void Header(int sec) {
		System.out.println("*******************************************************");
		System.out.println("\t\tList of Data for Section"+sec);
		System.out.println("*******************************************************");
		
	}

}
