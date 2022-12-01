import java.util.*;

public class Lab401 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name : ");
		String fullname = scan.nextLine();
		if (!fullname.contains(" ")) {
			System.out.println("Incorrect Name");
			return;
		}

		int space = fullname.indexOf(" ");
		String firstname = fullname.substring(0, space);
		String lastname = fullname.substring(space);
		System.out.println("First name : " + firstname.toUpperCase());
		System.out.println("Last name : " + lastname.toLowerCase());

	}

}
