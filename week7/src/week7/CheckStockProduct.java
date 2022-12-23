package week7;

import java.util.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list stock:");
		int stock = scan.nextInt();
		Product[] product = new Product[stock];
		for(int i=0;i<product.length;i++) {
			product[i]=new Product();
			System.out.print("Input product Id    : ");
			product[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			product[i].setUnit(scan.nextInt());
			System.out.println();
		}
		System.out.println("------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("------------------------------------------");
		for(Product Product :product) {
			if(Product.CheckStockProduct().equalsIgnoreCase("LOW")) {
				System.out.println(">>"+Product.getld()+" has "+Product.getUnit()+" units");
			}
		}
		
		System.out.println("------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("------------------------------------------");
		for(Product Product :product) {
			if(Product.CheckStockProduct().equalsIgnoreCase("NORMAL")) {
				System.out.println(">>"+Product.getld()+" has "+Product.getUnit()+" units");
			}
		}
		
		System.out.println("------------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("------------------------------------------");
		for(Product Product :product) {
			if(Product.CheckStockProduct().equalsIgnoreCase("HIGH")) {
				System.out.println(">>"+Product.getld()+" has "+Product.getUnit()+" units");
			}
		}
	}

}
