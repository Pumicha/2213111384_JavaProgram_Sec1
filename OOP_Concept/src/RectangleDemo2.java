import java.util.Scanner;

public class RectangleDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input width : ");
		double width = scan.nextDouble();
		System.out.print("Input length : ");
		double length = scan.nextDouble();
		System.out.print("Input color : ");
		String color = scan.nextLine();

		Rectangle rec = new Rectangle(width, length);
		System.out.println(rec);
		System.out.println("Area of Rectangle is " + rec.getArea());
	}

}
