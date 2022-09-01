package de.cbw.oca.playground;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		
		//List<String> ints = new ArrayList<>();
		
		GenericBox box = new GenericBox();
		box.setValue(123);
		System.out.println(box.getValue());
		//String s = (String) box.getValue(); // ClassCastException
		
		GenericBox<Integer> box2 = new GenericBox<>();
		box2.setValue(123);
		System.out.println(box2.getValue());
		
	}
}

class GenericBox<T> {
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}