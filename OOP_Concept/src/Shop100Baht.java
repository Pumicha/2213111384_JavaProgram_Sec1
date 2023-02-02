import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		Product sold = new Product();

		sold.setUnit(8);
		
		sold.setUnit(
				Integer.parseInt(JOptionPane.showInputDialog("Input the number of product")));
		JOptionPane.showMessageDialog(null, sold);
	}

}
