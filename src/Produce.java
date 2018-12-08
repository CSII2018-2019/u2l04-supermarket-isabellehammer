
public class Produce extends GroceryItems {
		
		private String expiration;
		private double weight;
		
		public Produce (double unit, int quantity, String n, String exp, double w) {
			super(unit, quantity, n);
			
			setExpiration(exp);
			setWeight(w);
			setUnitPrice();
		}
		
		public Produce(String string, double d, int i, String exp, int w) {
			// TODO Auto-generated constructor stub
		}

		public void setUnitPrice() {
			setUnitPrice(weight * getUnitPrice());
		}
		
		public void setExpiration(String exp) {
			expiration = exp;
		}
		
		public void setWeight(double w) {
			if (w > 0) {
				weight = w;
			} else {
				System.out.println("weight not set");
			}
		}
		
		public String getExpiration() {
			return expiration;
		}
		
		public double getWeight() {
			return weight;
		}
		
		
	

}
