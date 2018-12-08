
public class GroceryItems {

	private String name;
	private double unitPrice;
	private int quantityInStock;
	
	/*public GroceryItems() {
		setName("not set");
		setUnitPrice(5);
		setQuantityInStock(100);
	}
	
	private void setQuantityInStock(int i) {
		// TODO Auto-generated method stub
		
	} //delete this if possible

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	} //delete this if possible*/

	public GroceryItems(String n, double unit, int quantity) {
		name = n;
		setUnitPrice(unit);
		setQuantityInStock(quantity);
	}
	
	public GroceryItems(double unit, int quantity, String n) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getQuantityInStock() {
		return quantityInStock;
	}
	
	public void setUnitPrice(double unit) {
		if (unit >= 0) {
			unitPrice = unit;
		} else {
			System.out.println("Price can't be negative; defaunting to 5 dollars.");
			unitPrice = 5;
		}
	}
	
	public void setQuantityInStock(int quantity) {
		if (quantity >= 0) {
			quantityInStock = quantity;
		} else {
			System.out.println("Quantity cannot be negative, default to 0");
			quantityInStock = 0;
		}
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String toString() {
		return getName() + " costs $" + getUnitPrice() + ". Now, we have " + getQuantityInStock() + " " + getName() + "s left in stock.";
	}
	

}
