package products;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	public Product find(int id) throws SQLException {
		
		String sql = "SELECT * FROM products WHERE id = " + id;
		
		try(Connection con = DBManager.connect(); Statement stmt = con.createStatement()) {
			return fill(stmt.executeQuery(sql));
		}
	}
	
	public boolean save(Product p) throws SQLException {
		
		if(p.getId() > 0) {
			return update(p);
		}
		else {
			return create(p);
		}
	}
	
	public boolean delete(int id) throws SQLException {
		
		String sql = "DELETE FROM products WHERE id = " + id;
		
		try(Connection con = DBManager.connect(); Statement stmt = con.createStatement()) {
			return stmt.executeUpdate(sql) > 0;
		}
	}
	
	private boolean create(Product p) throws SQLException {
		
		String sql = "INSERT INTO products (name, description, price, count) VALUES(?, ?, ?, ?)";
		
		try(Connection con = DBManager.connect(); PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			stmt.setString(1, p.getName());
			stmt.setString(2, p.getDescription());
			stmt.setDouble(3, p.getPrice());
			stmt.setInt(4, p.getCount());
			stmt.execute();
			
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				p.setId(rs.getInt(1));
				return true;
			}
			return false;
		}
	}
	
	private boolean update(Product p) throws SQLException {
		
		String sql = "UPDATE products SET name = ?, description = ?, price = ?, count = ? WHERE id = ?";
		
		try(Connection con = DBManager.connect(); PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, p.getName());
			stmt.setString(2, p.getDescription());
			stmt.setDouble(3, p.getPrice());
			stmt.setInt(4, p.getCount());
			stmt.setInt(5, p.getId());
			
			return stmt.executeUpdate() > 0;
		}
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
