package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

//@Controller //informando ao spring que esta classe é um componente do tipo controller
//@ResponseBody //indica que a resposta dos metodos do controller devem ir para a resposta http
@RestController // esta anotacao substitui as @Controller e a @ResponseBody, pois ela ja as contem
@RequestMapping("/cozinhas")//mapeamento da URI, no plural como diz na conveçao
public class CozinhaController {
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	@GetMapping //requisicoes com o verbo http GET chegarao neste metodo
	public List<Cozinha> listar() {
		return cozinhaRepository.listar();
	}

	@GetMapping("/{cozinhaId}") //o cozinhaId será concatenado a URI /cozinhas. tem o nome de path variable e pode ter qualquer nome
	public Cozinha buscar(@PathVariable("cozinhaId") Long id) {
		return cozinhaRepository.buscar(id);
	}

}
