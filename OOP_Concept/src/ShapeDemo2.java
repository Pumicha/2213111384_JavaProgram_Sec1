import java.util.Scanner;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Array = 5;
		double[] radius = new double[Array];
		double[] height = new double[Array];
		for (int i = 0; i < Array; i++) {
			System.out.print("Input radius " + (i + 1));
			radius[i] = scan.nextDouble();
			System.out.print("Input height " + (i + 1));
			height[i] = scan.nextDouble();
		}
		
		Cylinder[] cylinder = new Cylinder[Array];
		
		for (int i = 0; i < Array; i++) {
			Cylinder cylinder1 = new Cylinder(radius[i], height[i]);
			System.out.println("Cylinder " + (i + 1) + " volume" + cylinder1.getVolume());

		}
	}
}
