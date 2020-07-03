package com.s2it.food.domain.repository;

import java.util.List;

import com.s2it.food.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Long id);

	
}
