package week7;

public class Product {
	private String id;
	private int unit;
	private double price;

	public void setId(String ID) {
		id = ID;
	}

	public String getld() {
		return id;
	}

	public void setUnit(int UNIT) {
		unit = UNIT;
	}

	public int getUnit() {
		return unit;
	}

	public void setPrice(double PRICE) {
		price = PRICE;
	}

	public double getPrice() {
		return price;
	}

	public double calculate() {
		double Total = unit * price;
		return Total;
	}

	public boolean checkunit() {
		return unit > 0;
	}

	public boolean checkprice() {
		return price > 0;
	}

	public String CheckStockProduct() {
		if (unit < 5) {
			return "LOW";
		} else if (unit >= 5 && unit <= 50) {
			return "NORMAL";
		} else
			return "HIGH";
	}
}
