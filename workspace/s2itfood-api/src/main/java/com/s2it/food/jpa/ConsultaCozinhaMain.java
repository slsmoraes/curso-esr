package com.s2it.food.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.s2it.food.S2itfoodApiApplication;
import com.s2it.food.domain.model.Cozinha;
import com.s2it.food.domain.repository.CozinhaRepository;


public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(S2itfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		List<Cozinha> todasCozinhas = cozinhaRepository.listar();
		
		for (Cozinha cozinha : todasCozinhas) {
			System.out.println(cozinha.getNome());
		}
	}
	
}
