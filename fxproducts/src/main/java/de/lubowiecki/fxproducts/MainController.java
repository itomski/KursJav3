package de.lubowiecki.fxproducts;

import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

public class MainController implements Initializable {
	
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
	private TableView<Product> tblProducts;
	
	@FXML
	private Label lblErrors;
	
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
	
	private int edit;
	
	
	@FXML
	private void save(Event e) {
		
		if(validate()) {
			try {
				Product p = new Product();
				if(edit > 0) {
					p.setId(edit);
				}
				p.setName(txtName.getText());
				p.setDescription(txtDescription.getText());
				p.setPrice(Double.parseDouble(txtPrice.getText()));
				p.setCount(Integer.parseInt(txtCount.getText()));
				service.save(p);
				clearForm();
				refreshTable();
			}
			catch(Exception ex) {
			}
		}
	}
	
	@FXML
	private void delete(Event e) {
		
		Product p = tblProducts.getSelectionModel().getSelectedItem();
		try {
			service.delete(p);
			refreshTable();
		} 
		catch (SQLException ex) {
		}
	}
	
	@FXML
	private void edit(Event e) {
		Product p = tblProducts.getSelectionModel().getSelectedItem();
		edit = p.getId();
		txtName.setText(p.getName());
		txtDescription.setText(p.getDescription());
		txtPrice.setText(p.getPrice() + "");
		txtCount.setText(p.getCount() + "");
	}
	
	private void refreshTable() {
		
		try {
			List<Product> products = service.find();
			tblProducts.setItems(FXCollections.observableList(products));
		} 
		catch (SQLException e) {
			// TODO Fehler ausgeben
		}
	}
	
	@FXML
	private void clearForm() {
		edit = 0;
		txtName.clear();
		txtDescription.clear();
		txtPrice.clear();
		txtCount.clear();
		lblErrors.setText("");
	}
	
	private boolean validate() {
		
		Map<TextInputControl, String> fields = new HashMap<>();
		fields.put(txtName, "required,text");
		fields.put(txtDescription, "required,text");
		fields.put(txtPrice, "required,double");
		fields.put(txtCount, "required,int");
		
		StringBuilder sb = Validator.check(fields);
		if(sb.length() > 0) {
			lblErrors.setText(sb.toString());
			return false;
		}
		return true;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		refreshTable(); // Beim Start der App die Tabelle füllen
	}
}