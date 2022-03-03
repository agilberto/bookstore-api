package com.gilberto.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gilberto.bookstore.repositories.CategoriaRepository;
import com.gilberto.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication  {

	@Autowired
	CategoriaRepository categoriaRepository;
	

	@Autowired
	LivroRepository livroRepository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(BookstoreApplication.class, args);
	}

	 
}
