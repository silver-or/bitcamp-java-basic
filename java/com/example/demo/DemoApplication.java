package com.example.demo;

import com.example.demo.algorithm.controller.AlgorithmController;
import com.example.demo.oop.controller.OopController;
import com.example.demo.quiz.controller.QuizController;
import com.example.demo.auth.controller.AuthController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {
	// 모든 컨트롤러의 root
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		AuthController authController = new AuthController();
		OopController oopController = new OopController();
		QuizController quizController = new QuizController();
		AlgorithmController algoController = new AlgorithmController();
		while (true) {
			System.out.println("\n[메인 메뉴]\n" +
								"0. EXIT\n" +
								"1. Auth\n" +
								"2. OOP\n" +
								"3. Quiz\n" +
								"4. Algorithm");
			switch (scanner.next()) {
				case "0" :
					System.out.println("Exit");
					return;
				case "1" :
					System.out.println("### Auth ###");
					authController.execute(scanner);
					break;
				case "2" :
					System.out.println("### OOP ###");
					oopController.execute(scanner);
					break;
				case "3" :
					System.out.println("### Quiz ###");
					quizController.execute(scanner);
					break;
				case "4" :
					System.out.println("### Algorithm ###");
					algoController.execute(scanner);
					break;
				default :
					System.out.println("0~4 사이의 숫자를 입력하세요.");
					break;
			}
		}
	}
}
