package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class ApagarCozinhaMain {
	
	public static void main(String[] args) {
		//a ideia do teste é iniciar a aplicacao por aqui.
		// nao inciar uma aplicacao web, mas somente uma applicacao nao web
		ApplicationContext applicationContext = 
				new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE) //informa que nao é uma aplicacao web
				.run(args);
		
		//inicio dos testes
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		//deletar
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);//vai deletar a cozinha de id 1 		
		cozinhaRepository.remover(cozinha);
		
		
		
		
		//listar
		List<Cozinha> lista = cozinhaRepository.listar();
		
		for (Cozinha cozinhaItem : lista) {
			System.out.println(cozinhaItem.getId() + "/"+cozinhaItem.getNome());
		}
	}
}
