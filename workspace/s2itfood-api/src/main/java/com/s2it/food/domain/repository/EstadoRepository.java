package com.s2it.food.domain.repository;

import java.util.List;

import com.s2it.food.domain.model.Estado;

public interface EstadoRepository {

	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Estado estado);
}
