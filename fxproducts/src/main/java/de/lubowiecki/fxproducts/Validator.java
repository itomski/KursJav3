package de.lubowiecki.fxproducts;

import java.util.Map;

import javafx.scene.control.TextInputControl;

public class Validator {
	
	public static StringBuilder check(Map<TextInputControl, String> fields) {
		
		StringBuilder errors = new StringBuilder();
		
		for(TextInputControl field : fields.keySet()) {
			
			String content = field.getText();
			field.setStyle("");
			
			boolean error = false;
			
			for(String rule : fields.get(field).split(",")) {
				
				if(error) break;
				
				switch(rule) {
					case "required":
						if(content.length() == 0) {
							errors.append("Eingabe erforderlich\n");
							error = true;
						}
						break;
				
					case "text":
						if(!content.matches("[\\w\\s]*")) {
							errors.append("Muss einen Text enthalten\n");
							error = true;
						}
						break;
						
					case "double":
						try {
							Double.parseDouble(content);
						}
						catch(Exception e) {
							errors.append("Muss ein Double sein\n");
							error = true;
						}
						break;
						
					case "int":
						try {
							Integer.parseInt(content);
						}
						catch(Exception e) {
							errors.append("Muss ein Int sein\n");
							error = true;
						}
						break;
						
					default:	
				}
				
				if(error)
					field.setStyle("-fx-border-color: red; -fx-boder-width: 1px;");
			}
		}
		return errors;
	}
}
