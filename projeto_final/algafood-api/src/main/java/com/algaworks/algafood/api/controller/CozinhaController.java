package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.api.model.CozinhasXmlWrapper;
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

	@GetMapping(produces = MediaType.APPLICATION_XML_VALUE) 
	public CozinhasXmlWrapper listarXml() {
		return new CozinhasXmlWrapper(cozinhaRepository.listar());
	}
	
//	@ResponseStatus(HttpStatus.CREATED) // teste de alteracao de status da resposta 
	@GetMapping("/{cozinhaId}") //o cozinhaId será concatenado a URI /cozinhas. tem o nome de path variable e pode ter qualquer nome
	public Cozinha buscar(@PathVariable("cozinhaId") Long id) {
		return cozinhaRepository.buscar(id);
	}
	
//	//codigo para exibicao do controle fino da resposta --- ver aula 4.20. Manipulando a resposta HTTP com ResponseEntity
//	@GetMapping("/{cozinhaId}") 
//	public ResponseEntity<Cozinha> buscar(@PathVariable("cozinhaId") Long id) {
//		Cozinha cozinha = cozinhaRepository.buscar(id);
//		
////		return ResponseEntity.status(HttpStatus.OK).body(cozinha);//replica do comportamento padrao
////		return ResponseEntity.status(HttpStatus.OK).build();// retorno sem corpo
//
////		return ResponseEntity.ok(cozinha);// jeito mais simples para usar o response entity replicando o comportamento padrao
////		return ResponseEntity.ok().build();// jeito mais simples para retornar codigo 200 sem payload
//		
//		HttpHeaders headers = new HttpHeaders();
//		headers.add(HttpHeaders.LOCATION, "http://localhost:8080/cozinhas");
//		
//		return ResponseEntity
//				.status(HttpStatus.FOUND)
//				.headers(headers)
//				.build();
//		
//	}

}
