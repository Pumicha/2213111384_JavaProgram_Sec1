import java.util.*;
import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Input author name: ");
		String email = JOptionPane.showInputDialog("Input author email: ");
		String title = JOptionPane.showInputDialog("Input book title: ");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		int choice = JOptionPane.showConfirmDialog(null, "Is the page correct", title, JOptionPane.YES_NO_OPTION);
		while (choice == 1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page, again :"));
			choice = JOptionPane.showConfirmDialog(null, "Is the page correct", title, JOptionPane.YES_NO_OPTION);
		}
		Book book = new Book(title, new Author(name, email), page);

		JOptionPane.showMessageDialog(null,"Book Title : " + book.getTitle() + "\nAuthor name : " +
				book.getauthor().getName() + " ("+ book.getPage() + " page)" + "\nAuthor e-mail : " + 
				book.getauthor().getEmail(),"Message", JOptionPane.INFORMATION_MESSAGE);
	}

}
