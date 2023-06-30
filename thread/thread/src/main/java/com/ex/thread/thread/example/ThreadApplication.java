package com.ex.thread.thread.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ThreadApplication.class, args);

		/*ThreadExThrClass thr1 = new ThreadExThrClass();  //hidle,non in esecuzione
		ThreadExRunClass thr2 = new ThreadExRunClass(); //hidle,non in esecuzione


		thr1.start(); // Causes this thread to begin execution; JVM calls the run method of this thread.
		try {
			thr1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thr2.start();
		try {
			thr2.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
*/
		//join ha la capacità di mettere in sospensione temporanea il thread padre,in questo caso il main
		//thr1.join , l 1 continua l esecuzione mente il main che è il padre verrà bloccato fino alla fine del esecuone di 1,così da non avviare 2 mentre 1 è in esecuzione

		for(int i = 1; i <= 3;i++){
			ThreadExThrClass thr1 = new ThreadExThrClass(i);
			thr1.start();
		}

		for(int i = 1; i <= 3;i++) {
			ThreadExRunClass thr1 = new ThreadExRunClass(i);
			Thread myThr = new Thread(thr1);
			myThr.start();
			myThr.isAlive();
			/*try {
				myThr.join();
			}catch (InterruptedException e) {
			}*/
		}
	}
}
