package de.cbw.oca.playground;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest2 {

	public static void main(String[] args) {
		
		Runnable aufgabe = () -> {
			for(int i = 0; i < 10_000; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		};
		
//		new Thread(aufgabe).start();
//		new Thread(aufgabe).start();
//		new Thread(aufgabe).start();
//		new Thread(aufgabe).start();
//		new Thread(aufgabe).start();
//		new Thread(aufgabe).start();
//		new Thread(aufgabe).start();
//		new Thread(aufgabe).start();
//		new Thread(aufgabe).start();
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		service.submit(aufgabe);
		
		// ForkJoinPool - Große Aufgabe, die auf viele Threads verteilt wird
		
	}

}
