package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Map;import java.util.List;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        System.out.println(foo(10));
		SpringApplication.run(DemoApplication.class, args);
	}

    static int foo(int a, int c) {
  	 	int b = 12;
  		if (a == 1) {
    			return b;
  		}
  		return b;  // Noncompliant
	}

}

