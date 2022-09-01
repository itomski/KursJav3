package de.cbw.oca.playground;

public class LambdaTest2 {
	
	public static void main(String[] args) {
		
		Operation add = (a, b) -> a + b;
		System.out.println(add.exec(15.0, 7));
		
		Operation multi = (double x, double y) -> x * y;
		System.out.println(multi.exec(15.0, 7));
		
		Operation blödsinn = (a, b) -> {
			String s = a + "" + b;
			s = s.split("\\.")[0];
			return Double.parseDouble(s);
		};
		System.out.println(blödsinn.exec(15.0, 7));
		
		UnaryOperation abs = x -> Math.abs(x);
		
		DiceCup w6 = () -> (int)(Math.floor(Math.random() * 6) + 1);
		
		System.out.println(w6.roll());
		System.out.println(w6.roll());
		System.out.println(w6.roll());
		System.out.println(w6.roll());
		System.out.println(w6.roll());
		System.out.println(w6.roll());
		
		System.out.println();
		
		DiceCup w10 = () -> (int)(Math.floor(Math.random() * 10) + 1);
		System.out.println(w10.roll());
		System.out.println(w10.roll());
		System.out.println(w10.roll());
		System.out.println(w10.roll());
		System.out.println(w10.roll());
	}
}

@FunctionalInterface
interface Operation {
	double exec(double a, double b);
}

@FunctionalInterface
interface UnaryOperation {	
	double exec(double a);
}

interface DiceCup {	
	int roll();
}