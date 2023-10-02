package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		GamingConsole game = new SuperContraGame();
		GamingConsole game1 = new MarioGame();
		GameRunner gameRunner =new GameRunner(game1);

		gameRunner.run();


	}

}
