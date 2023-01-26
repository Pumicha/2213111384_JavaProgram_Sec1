
public class Customer {
	private int id;
	private String name;
	private int discount;
	
	public Customer(int id,String name,int discount) {
		id=1000;
		name="";
		discount=0;		
	}
	
	public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getDiscount() {
		return this.discount;
	}
	public void setDiscount(int discount) {
		this.discount=discount;
	}
	public String toString() {
		return name+"("+id+")"+"("+discount+"%)";
	}
}
