package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class InclusaoCozinhaMain {
	
	public static void main(String[] args) {
		//a ideia do teste é iniciar a aplicacao por aqui.
		// nao inciar uma aplicacao web, mas somente uma applicacao nao web
		ApplicationContext applicationContext = 
				new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE) //informa que nao é uma aplicacao web
				.run(args);
		
		//inicio dos testes
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		
		//inserir
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Brasileira");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Japonesa");
		
		cozinha1 = cadastroCozinha.adicionar(cozinha1);
		cozinha2 = cadastroCozinha.adicionar(cozinha2);
		
		
		
		
		//listar
		List<Cozinha> lista = cadastroCozinha.listar();
		
		for (Cozinha cozinha : lista) {
			System.out.println(cozinha.getId() + "/"+cozinha.getNome());
		}
	}
}
