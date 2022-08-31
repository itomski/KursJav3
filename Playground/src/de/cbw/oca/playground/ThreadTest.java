package de.cbw.oca.playground;

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Runnable aufgabe = () -> {
			
			String name = Thread.currentThread().getName();
			
			for(int i = 0; i < 100; i++) {
				System.out.println(name + ": " + i);
				
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		};
		
		Thread t1 = new Thread(aufgabe);
		Thread t2 = new Thread(aufgabe);
		Thread t3 = new Thread(aufgabe);
		Thread t4 = new Thread(aufgabe);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("Ende");
	}
}
