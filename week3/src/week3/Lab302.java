package week3;

import javax.swing.*;

import java.text.*;


public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.00");
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		
		double bmi = weight/(height/100*height/100);
		
		if(bmi<18.95)
		{
			System.out.print("Underweight");
		}
		else if (bmi<24.9)
		{
			System.out.print("Normal-weight");
		}
		else if (bmi<30)
		{
			System.out.print("Overweight");
		}
		else if (bmi>29)
		{
			System.out.print("Obesity");
		}
		JOptionPane.showMessageDialog(null,"BMI="+frm.format(bmi)+
				"\nYou're "+  ((bmi<18.95)?"Underweight":bmi<24.9?"Normal-weight":bmi<30?"Overweight":"Obesity"),
				"BMI",JOptionPane.WARNING_MESSAGE);
	}

}
