package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sdemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Sdemo01Application.class, args);
		hello();
		hello2();
	}
	
	public static void hello()
	{
		System.out.println("Hello World-1...!!!");
	}
	
	public static void hello2()
	{
		System.out.println("Hello World-2..!!!");
		System.out.println("Hello World...!!!..()..");
		System.out.println(" ------***-----***------");
		System.out.println(" ------***-----------");
	}

}
