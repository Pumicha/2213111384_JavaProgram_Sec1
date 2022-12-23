package week7;

import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fm = new DecimalFormat("#,###.00");
		Product[] productList = new Product[4];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id    : ");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			productList[i].setUnit(scan.nextInt());
			while (!productList[i].checkunit()) {
				System.out.print("Input product Unit  : ");
				productList[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price : ");
			productList[i].setPrice(scan.nextDouble());
			while (!productList[i].checkprice()) {
				System.out.print("Input product Price : ");
				productList[i].setPrice(scan.nextDouble());
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		for (Product ProductList : productList) {
			System.out.println("Product ID : " + ProductList.getld() + ", Total price = " + ProductList.calculate());
		}
		System.out.println("------------------------------------------");
		double total = 0;
		for (int i = 0; i < productList.length; i++) {
			total = (productList[0].calculate() + productList[1].calculate() + productList[2].calculate()
					+ productList[3].calculate());
		}
		System.out.println("Total price of all products is" + fm.format(total));

	}

}
