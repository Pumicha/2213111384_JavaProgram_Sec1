package week2;

import javax.swing.*;

public class MusicWorldApp {

	public static void main(String[] args) {
		final double TAX_RATE = .0625;
		String id;
		id = JOptionPane.showInputDialog("This program calculates the total cost of a CD order"
				+ "\nPlease enter the ID of the CD");
		
		String 	title;
		title = JOptionPane.showInputDialog("Please enter the Title of the CD");
		
		double price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the U.S. dollars"));
		
		int quanity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quanity to be purchased"));
		
		double subtotal = price*quanity;
		
		double taxtotal = subtotal*(1+TAX_RATE);
		
		
		JOptionPane.showMessageDialog(null, "Summary of the transaction:"+
											"\n "+
											"\nCD ID:"+id+
											"\nCD Title:"+title+
											"\nCD Unit Price:$"+price+
											"\nCD Quantity:"+quanity+
											"\n"+
											"\nSubtotal:$"+subtotal+
											"\nTax rate:"+TAX_RATE*100+"%"+
											"\nTotal:$"+taxtotal+
											"\n"+
											"\nEnd of Program");
	}

}
