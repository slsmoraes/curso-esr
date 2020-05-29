package com.s2it.food.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.s2it.food.S2itfoodApiApplication;
import com.s2it.food.domain.model.Permissao;
import com.s2it.food.domain.repository.PermissaoRepository;

public class ConsultaPermissaoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(S2itfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);
		
		List<Permissao> todasPermissoes = permissaoRepository.listar();
		
		for (Permissao permissao : todasPermissoes) {
			System.out.printf("%s - %s\n", permissao.getNome(), permissao.getDescricao());
		}
	}
}
