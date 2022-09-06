package de.lubowiecki.fxproducts;

import java.sql.SQLException;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {
	
	ProductService service; 
	
	@FXML
	private TextField txtName;
	
	@FXML
	private TextArea txtDescription;
	
	@FXML
	private TextField txtPrice;
	
	@FXML
	private TextField txtCount;
	
	@FXML
	private Button saveBtn;
	
	{
		try {
			service = new ProductService();
		}
		catch(SQLException ex) {
			//TODO: Fehler ausgeben
		}
	}
	
	@FXML
	private void save(Event e) {
		
		try {
			Product p = new Product();
			p.setName(txtName.getText());
			p.setDescription(txtDescription.getText());
			p.setPrice(Double.parseDouble(txtPrice.getText()));
			p.setCount(Integer.parseInt(txtCount.getText()));
			service.save(p);
		}
		catch(Exception ex) {
			//TODO: Fehler ausgeben
		}
	}
}