package com.gilberto.bookstore.domain;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	private Integer id;
	private String nome;
	private String descricao;
	 
	private List<Livro> livro = new ArrayList<>();

}
