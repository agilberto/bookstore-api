package com.gilberto.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilberto.bookstore.domain.Livro;
import com.gilberto.bookstore.repositories.LivroRepository;
import com.gilberto.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {
  
	@Autowired
	private LivroRepository repository;
	
	@Autowired
	private CategoriaService categoriaService;

	public Livro findById(Integer id) {

		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", tipo: " + Livro.class.getName()));
	}

	public List<Livro> findAll(Integer id_cat) {
		 categoriaService.findById(id_cat);
		return repository.findAllByCategoria(id_cat);
	}

	public Livro update(Integer id, Livro obj) {
		 Livro newObj = findById(id);
		 updateDate(newObj, obj);
		return repository.save(newObj);
	}

	private void updateDate(Livro newObj, Livro obj) {
		 newObj.setTitulo(obj.getTitulo());
		 newObj.setNome_autor(obj.getNome_autor());
		 newObj.setTexto(obj.getTexto());
		 
		
	}
}