
public class Flowers extends GroceryItems{
	private String variety;
	private String color;
	
	public Flowers (double unit, int quantity, String n, String v, String c) {
		super (n, unit, quantity);
		
		setVariety(v);
		setColor(c);
	}
	

	public void setVariety(String v) {
		variety = v;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public String getVariety() {
		return variety;
	}
	
	public String getColor() {
		return color;
	}
	

}
