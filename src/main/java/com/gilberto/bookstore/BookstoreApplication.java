package com.gilberto.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gilberto.bookstore.domain.Categoria;
import com.gilberto.bookstore.domain.Livro;
import com.gilberto.bookstore.repositories.CategoriaRepository;
import com.gilberto.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication {

	 
	private LivroRepository  livroRepository ;
	 
	
	public static void main(String[] args) {
		
		SpringApplication.run(BookstoreApplication.class, args);
	}

	 

	 
}
