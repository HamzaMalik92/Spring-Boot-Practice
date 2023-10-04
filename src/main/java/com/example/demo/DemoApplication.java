package com.example.demo;

import com.example.demo.enterprise.example.MyWebController;
import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

//		GamingConsole game = new SuperContraGame();
//		GamingConsole game1 = new MarioGame();
//		GameRunner gameRunner =new GameRunner(game1);
//		GameRunner gameRunner = context.getBean(GameRunner.class);
//
//		gameRunner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println("value: "+controller.ReturnValueFromBusinessService());


	}

}

