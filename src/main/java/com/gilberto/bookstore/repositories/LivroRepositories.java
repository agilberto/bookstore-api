package com.gilberto.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gilberto.bookstore.domain.Livro;

@Repository
public interface LivroRepositories extends JpaRepository<Livro, Integer>{

	
}
