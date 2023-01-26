
public class TestStudent {

	public static void main(String[] args) {
		// Test Constructor and toString(
		Student pol = new Student("Polawat Gopatta","Happ Ave");
		System.out.println(pol); //toStrint()
		
		//Test Setter and Getters
		pol.setAddress("25 Pattanakarn");
		System.out.println(pol); //toString()
		System.out.println(pol.getName());
		System.out.println(pol.getAddress());
		
		//Test addCourseGrade(),printGrade() and getAverageGrade()
		pol.addCourseGrade("INT107",67);
		pol.addCourseGrade("INT108",75);
		pol.addCourseGrade("MSC-202",73);
		pol.printGrades();
		
		System.out.printf("\nThe average grade is %.2f%n",pol.getAverageGrade());
	}

}
