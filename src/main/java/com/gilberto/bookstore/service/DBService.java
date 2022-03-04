package com.gilberto.bookstore.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilberto.bookstore.domain.Categoria;
import com.gilberto.bookstore.domain.Livro;
import com.gilberto.bookstore.repositories.CategoriaRepository;
import com.gilberto.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	

	@Autowired
	LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livro de TI");
		Categoria cat2 = new Categoria(null, "Ficção Centifica", "Ficção Cientifica");
		Categoria cat3 = new Categoria(null, "Biografias", "Livros de Biografias");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren Ipsum", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Robert Martin", "Loren Ipsum", cat1);
		Livro l3 = new Livro(null, "The Time Machine", "Robert Martin", "Loren Ipsum", cat2);
		Livro l4 = new Livro(null, "The War of the Worlds", "Robert Martin", "Loren Ipsum", cat2);
		Livro l5 = new Livro(null, "I, Robot", "Robert Martin", "Loren Ipsum", cat2);
		
		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));
		 
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	    livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5));
	}

}
