import javax.swing.JOptionPane;

public class Supermarket {

	public static void main(String[] args) {
		GroceryItems cannedAppleSauce = new GroceryItems ("AppleSauce", 2.00, 50);
		
		Produce guava = new Produce ("Guava Fruit", 0.18, 40, "12/31/2018", 5);
		
		Flowers bouquet = new Flowers ("Outdoor Plant", 50.00, 30, "Bleeding Heart", "Pink");

		double totalCost = 0;
		
		String input = JOptionPane.showInputDialog(null, "We have apple sauce, guava, and bleeding hearts."
				+ "/nWhat would you like today? Type in the box below.");
		String input2 = JOptionPane.showInputDialog(null, "How many are you buying?");
		int quant = Integer.parseInt(input2);
		
		if (input.equals("apple sauce")) {
			int newQuantity = cannedAppleSauce.getQuantityInStock() - quant;
			cannedAppleSauce.setQuantityInStock(newQuantity);
			totalCost = totalCost + quant * cannedAppleSauce.getUnitPrice();
				
		}else if (input.equals("guava")) {
			int newQuantity = guava.getQuantityInStock() - quant;
			guava.setQuantityInStock(newQuantity);
			totalCost = totalCost + quant * guava.getUnitPrice();
			
		}else if (input.equals("bleeding hearts")) {
			int newQuantity = bouquet.getQuantityInStock() - quant;
			bouquet.setQuantityInStock(newQuantity);
			totalCost = totalCost + quant * bouquet.getUnitPrice();
		}
		
		System.out.println("Total Purchase: $" + totalCost);
		
	}

}
