import java.util.Scanner;

import javax.swing.*;

public class Lab504 {
	static String fullName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name, seprated by a space.");
		
		fullName = scan.nextLine();

		System.out.print(abbreviatName(fullName));
	}

	public static String abbreviatName(String fullname) {
		String[] split = fullname.split(" ");
		return split[1].toUpperCase().charAt(0) + "." + split[2].toUpperCase().charAt(0) + "." + split[0];
	}
}
