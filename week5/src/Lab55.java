import javax.swing.*;

import java.util.Scanner;

public class Lab55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputStudent();
		isLength();
		isITStudent();
		isITSubject();
	}
	public static void inputStudent() {
		Scanner scan = new Scanner (System.in);
		String id ="";
		int subject = 0;
		System.out.print("Enter Student Id:");
		id = scan.nextLine();
		subject = Integer.parseInt(scan.nextLine());
		while((id.length()>9||id.length()<11)&&(subject<=0000000||subject>10000000)) {
			System.out.print("Enter Student Id : ");
			id = scan.next();
			System.out.print("Enter Subject ID : ");
			subject = Integer.parseInt(scan.nextLine());
		}
	}
	public static boolean isLength() {
		return "";
	}
	public static boolean isITStudent() {
		return "";
	}
	public static boolean isITSubject() {
		return "";
	}
	public static void displaData() {
		return "";
	}
}
