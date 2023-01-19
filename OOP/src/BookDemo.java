import java.util.*;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		Scanner scan = new Scanner(System.in);

		System.out.print("Input book tile : ");
		book.setTitle(scan.nextLine());
		System.out.print("Input book price : ");
		book.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		book.setPublishyear(scan.nextInt());

		System.out.println("\n" + book.toString());
	}

}
