package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	//dependency injection
	@Autowired
	private ChatService myChatService;

	//dependency injection
	@Autowired
	private AIController myController;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String prompt = sc.nextLine();
		System.out.println(myController.getTerminalPrompt(prompt));
	}
}