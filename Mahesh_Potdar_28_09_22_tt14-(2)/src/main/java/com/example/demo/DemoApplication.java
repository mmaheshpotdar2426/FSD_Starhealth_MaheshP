package com.example.demo;

import java.awt.print.Book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.BookServiceImp;
import com.example.demo.service.IBookService;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public Book getbObject() {
		return new Book();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Star Health...");

		IBookService bservice = context.getBean(BookServiceImp.class);
		System.out.println(bservice);
		bservice.getBook();
	}

}
