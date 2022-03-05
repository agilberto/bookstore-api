package com.gilberto.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilberto.bookstore.domain.Categoria;
import com.gilberto.bookstore.exceptions.ObjectNotFoundException;
import com.gilberto.bookstore.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + id + ", Tipo: " + Categoria.class.getName()));
	}

}
