import java.util.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while (!sentence.endsWith(".")) {
			System.out.print("The sentence is must end with full stop point : ");
			sentence = scan.nextLine();
			System.out.println();
		}
		String formatsentence = sentence.replace(".", " ");
		int numberofindext = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (formatsentence.charAt(i) == ' ') {
				System.out.println(formatsentence.substring(numberofindext, i).trim());
				
				numberofindext = i + 1;
			}
		}
	

	}

}
