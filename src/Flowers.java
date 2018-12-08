
public class Flowers extends GroceryItems{
	private String variety;
	private String color;
	
	public Flowers (double unit, int quantity, String n, String v, String c) {
		super (unit, quantity, n);
		
		setVariety(v);
		setColor(c);
	}
	
	public Flowers(String string, double d, int i, String v, String c) {
		// TODO Auto-generated constructor stub
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
