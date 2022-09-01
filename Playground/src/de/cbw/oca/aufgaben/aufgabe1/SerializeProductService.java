package de.cbw.oca.aufgaben.aufgabe1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializeProductService extends AbstractProductService {
		
		private static final String SER_FILE = "data.ser";
		
		public SerializeProductService() {
			readFromFile();
		}
		
		@Override
		public void save(Product p) {
			products.add(p);
			Collections.sort(products);
			saveToFile();
		}

		private void saveToFile() {
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SER_FILE))) {
				oos.writeObject(products);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		private void readFromFile() {
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SER_FILE))) {
				products = (List<Product>) ois.readObject();
			}
			catch(IOException | ClassNotFoundException e) {
				products = new ArrayList<>();
			}
		}
	}
