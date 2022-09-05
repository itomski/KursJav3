package products;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// CRUD Methoden (Create Read Update Delete)
public class ProductService {
	
	public List<Product> find() throws SQLException {
		try(Connection con = DBManager.connect(); Statement stmt = con.createStatement()) {
			
			List<Product> list = new ArrayList<>();
			ResultSet rs = stmt.executeQuery("SELECT * FROM products");
			
			while(rs.next()) {
				list.add(fill(rs));
			}
			
			return list;
		}
	}
	
	public ResultSet find(int id) throws SQLException {
		try(Connection con = DBManager.connect(); Statement stmt = con.createStatement()) {
			return stmt.executeQuery("SELECT * FROM products WHERE id = " + id);
		}
	}
	
	public void create(Product p) throws SQLException {
		try(Connection con = DBManager.connect(); Statement stmt = con.createStatement()) {
			stmt.executeUpdate("INSERT INTO products (name, description, price, count) "
					+ "VALUES('" + p.getName() + "', '" + p.getDescription() + "', " + p.getPrice() + ", " + p.getCount() + ")");
		
			// INSERT INTO products (name, description, price, count) VALUES('Hammer', '...', 29.99, 15)
		}
	}
	
	public ResultSet delete(int id) {
		throw new UnsupportedOperationException("Noch nicht implementiert");
	}
	
	public ResultSet update(int id, Product p) {
		throw new UnsupportedOperationException("Noch nicht implementiert");
	}
	
	private Product fill(ResultSet rs) throws SQLException {
		Product p = new Product();
		p.setId(rs.getInt("id"));
		p.setName(rs.getString("name"));
		p.setDescription(rs.getString("description"));
		p.setPrice(rs.getDouble("price"));
		p.setCount(rs.getInt("count"));
		return p;
	}
}
