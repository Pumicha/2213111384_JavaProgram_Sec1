import java.util.*;
import java.io.*;

public class ATMChecking extends ATMData {
	private int money;

	public ATMChecking(String accountNumber, String password, int money) {
		super(accountNumber, password);
		this.money = money;
	}

	public boolean checkBookBank() throws IOException {
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		String account = read.next();
		String password = read.next();
		int money = read.nextInt();
		return true ;
	}

	public void show() {
		System.out.println("You drawing for "+money+"get"
				+"\n1000 ="
				+"\n500 ="
				+"\n100 =");
		System.out.println("You blance is "+ +" Baht.");
	}

}
