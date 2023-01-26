
public class TestStudent {

	public static void main(String[] args) {
		// Test Constructor and toString()
		Student anupap=new Student("Anupap Jaising","1 Happy Ave");
		System.out.println(anupap);
		
		//Test SETTER AND Getters
		anupap.setAddress("25 Pattanakarn");
		System.out.println(anupap);
		System.out.println(anupap.getName());
		System.out.println(anupap.getAddress());
		
		//TestaddCourseGrade(),printGrades() and getAverageGrade()
		anupap.addCourseGrade("INT107",87);
		anupap.addCourseGrade("INT107",81);
		anupap.addCourseGrade("MSC-202",92);
		anupap.printGrades();
		
		System.out.printf("The average grade is %.2f%n",anupap.getAverageGrade());
		
	}

}
