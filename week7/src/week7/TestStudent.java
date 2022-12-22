package week7;

import java.util.*;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom:");
		int student = scan.nextInt();
		Student[] std = new Student[student];
		System.out.println();
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();

			System.out.println("-----------------------------");
			System.out.print("Input student name: ");
			// std[i] = scan.next();
			std[i].setName(scan.next());
			System.out.print("Input student score:");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again:");
				std[i].setScore(scan.nextInt());
			}

		}
		System.out.println();
		System.out.println("---------------------------------");
		for (Student stds : std) {

			System.out.println(">>" + stds.getName() + " get grade " + stds.findGrade());
		}
	}

}
