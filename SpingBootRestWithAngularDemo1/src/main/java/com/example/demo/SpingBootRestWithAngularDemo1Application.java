package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/books")
@CrossOrigin("http://localhost:4200")
public class SpingBootRestWithAngularDemo1Application {

	public static void main(String[] args) {
		// Youtube Link : https://www.youtube.com/watch?v=fv_EkS34afE
		SpringApplication.run(SpingBootRestWithAngularDemo1Application.class, args);
	}
	
	@GetMapping
	public List<Book> getBooks()
	{
		
		List<Book> books = new ArrayList<>();
		books.add(new Book("1", "Book1", 100));
		books.add(new Book("2", "Book2", 200));
		return books;
	}
	

}
