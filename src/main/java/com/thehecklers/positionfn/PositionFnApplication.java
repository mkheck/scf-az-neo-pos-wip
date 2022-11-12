package com.thehecklers.positionfn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PositionFnApplication {

	public static void main(String[] args) {
		SpringApplication.run(PositionFnApplication.class, args);
	}

//	@Bean
//	public Function<Position, Position> echo() {
//		return position -> {
//			System.out.println(position);
//			return position;
//		};
//	}
}
