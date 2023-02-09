import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {
		int Array = 5;
		double[] radius = new double[Array];
		double[] height = new double[Array];
		for (int i = 0; i < Array; i++) {
			radius[i] = Double.parseDouble(JOptionPane.showInputDialog("Input radius" + (i + 1)));
			height[i] = Double.parseDouble(JOptionPane.showInputDialog("Input height" + (i + 1)));
		}
		Cylinder[] cylinder = new Cylinder[Array];
		for (int i = 0; i < Array; i++) {
			Cylinder cylinder1 = new Cylinder(radius[i], height[i]);
			JOptionPane.showMessageDialog(null, "Cylinder " + (i + 1) + "volume" + cylinder1.getVolume());

		}
	}

}
