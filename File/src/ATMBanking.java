import java.text.*;
import java.util.Scanner;

public class ATMBanking {

	public static void main(String[] args)  {
		
		DecimalFormat AccountDigit = new DecimalFormat("#-###-###-####");
		Scanner console = new Scanner(System.in);
		System.out.print("Enter acount number : ");
		String acc = console.next();
		System.out.print("Enter password : ");
		int pw = console.nextInt();
		System.out.print("Enter money : ");
		int mn = console.nextInt();
			
		
	}

}
