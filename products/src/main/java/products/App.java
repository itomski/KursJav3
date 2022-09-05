package products;

import java.util.List;

public class App {

	public static void main(String[] args) {
		new App().start();
	}
	
	private void start() {
		
		ProductService service = new ProductService();
		
		try {
			
//			Product p = new Product("Zange", "Super Zange...", 15.99, 200);
//			service.create(p);
			
			
			List<Product> data = service.find();
			
			
			System.out.printf("%5s | %10s | %10s \n", "ID", "Name", "Preis");
			System.out.println("----------------------------------");
			
			for(Product p : data) {
				System.out.printf("%5d | %10s | %10f \n", p.getId(), p.getName(), p.getPrice());
			}
			
		} 
		catch (Exception e) {
			System.out.println("Es gibt Probleme mit der Datenbank.");
			System.out.println(e.getMessage());
		}
	}
}
