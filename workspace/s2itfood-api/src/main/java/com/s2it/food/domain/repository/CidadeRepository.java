package com.s2it.food.domain.repository;

import java.util.List;

import com.s2it.food.domain.model.Cidade;

public interface CidadeRepository {

	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cidade);
	void remover(Cidade cidade);
	
}