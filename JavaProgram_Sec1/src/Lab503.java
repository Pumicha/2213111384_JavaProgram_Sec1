import javax.swing.*;

public class Lab503 {
	static int inputYear;
	
	public static void main(String[] args) {

		inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input year"));
		boolean chkYear = checkYear(inputYear);
		while(!chkYear) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog(
					"Please input year between 1000-3000"
					+"\nInput Year,again"));
		}
		if(isLeapYear(inputYear)) {
			JOptionPane.showMessageDialog(null, inputYear+"is Leap Year");
		}
		else {
			JOptionPane.showMessageDialog(null, inputYear+"is not Leap Year");
		}
	}
	public static boolean checkYear(int year) {
		if(year>=1000 && year <= 3000) {
			return true;
		}
		else {
			return false;
		}
	}
	public
}
