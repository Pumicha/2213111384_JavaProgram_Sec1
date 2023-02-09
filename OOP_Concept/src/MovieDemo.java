import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input movie id\t  : ");
		String movieid = scan.nextLine();
		System.out.print("Input movie name  : ");
		String moviename = scan.nextLine();
		System.out.println();
		System.out.print("Input director name\t: ");
		String directorname = scan.nextLine();
		System.out.print("Input director e-mail\t: ");
		String directoremail = scan.nextLine();	
		System.out.print("Input director gender\t: ");
		String directorgender = scan.nextLine();
		while (!directorgender.equalsIgnoreCase("m") && !directorgender.equalsIgnoreCase("f")) {
			System.out.print("Input director gender, again\t: ");
			directorgender = scan.nextLine();
		}
		System.out.println();
		System.out.print("Input movie theater no.\t : ");
		int theaterNo = scan.nextInt();
		while (theaterNo < 1 || theaterNo > 15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}
	}

}
