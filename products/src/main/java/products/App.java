package products;

import java.util.List;

public class App {

	public static void main(String[] args) {
		new App().start();
	}
	
	private void start() {
		
		ProductService service = new ProductService();
		
		try {
			
//			Product p = new Product("Andere Zange", "Super Zange...", 19.99, 100);
//			service.create(p);
//			System.out.println(p.getId());
			
//			if(service.delete(3)) {
//				System.out.println("Datensatz gelöscht...");
//			}
			
			Product p1 = service.find(1);
			p1.setName("Spezial Hammer");
			p1.setPrice(49.99);
			p1.setCount(10);
			
			service.save(p1);
			
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
