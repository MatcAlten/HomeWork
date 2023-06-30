package com.example.thread.virtual;


import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.Duration;
@Deprecated
public class VirtualThreads {

	//logger for everything
	static final Logger logger = LoggerFactory.getLogger(VirtualThreads.class);

	//useful to add thread id - thread in esecuzione o che lancia il msg
	static void log(String message){
		logger.info("{} | " + message,Thread.currentThread());
	}

	//converts checked exceptions into unchecked
	@SneakyThrows
	private static void sleep(Duration duration){
		Thread.sleep(duration);  //sleep throwa un exception,con SneakyThrows  converts checked exceptions into unchecked ,fast write code
	}

	//virtual thread
	private static Thread virtualThread(String name,Runnable runnable){
		return  Thread.ofVirtual()
				.name(name)
				.start(runnable);
	}
	//l oggetto returnato è sempr eun istanza dello stesso tipo  di java leng thread



	//morning routine - boil some water while i am taking shower

	static Thread bathTime(){
		return virtualThread(
				"Bath time",
				() -> {
					log("I'm going for a bath");
					sleep(Duration.ofMillis(500L));
					log("I'm done with the bath");
				}
		);
	}

	static Thread boilingWater(){
		return virtualThread(
				"Boil water",
				()-> {
					log("I'm going to boil some water");
					sleep(Duration.ofMillis(1000L));
					log("I'm done boiling water");
				}
		);
	}

	//concurretn methos to start both methos boiling and bath
	@SneakyThrows
	static void concurrentMorningRoutine(){
		var bathTime = bathTime();
		var boilingWater = boilingWater();
		bathTime.join();
		boilingWater.join();
	}

	public static void main(String[] args) {
	concurrentMorningRoutine();


	}

}
