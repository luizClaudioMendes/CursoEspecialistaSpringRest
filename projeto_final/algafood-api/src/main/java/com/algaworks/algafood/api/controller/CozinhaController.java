package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<Cozinha> buscar(@PathVariable("cozinhaId") Long id) {
		Cozinha cozinha = cozinhaRepository.buscar(id);
		
		if(cozinha != null) {
			return ResponseEntity.ok(cozinha);
		}
		
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); //forma mais verbosa
		return ResponseEntity.notFound().build(); //forma mais curta
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
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cozinha adicionar (@RequestBody Cozinha cozinha) {
		return cozinhaRepository.salvar(cozinha);
	}
	
	@PutMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> atualizar(@PathVariable Long cozinhaId, @RequestBody Cozinha cozinha) {
		Cozinha cozinhaAtual = cozinhaRepository.buscar(cozinhaId);
		
		if(cozinhaAtual != null) {
//			cozinhaAtual.setNome(cozinha.getNome()); //copia dos atributos manual
			BeanUtils.copyProperties(cozinha, cozinhaAtual, "id");//copia programatica -- ignora o campo id para nao copiar null
			
			cozinhaAtual = cozinhaRepository.salvar(cozinhaAtual);
			
			return ResponseEntity.ok(cozinhaAtual);
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> remover (@PathVariable Long cozinhaId) {
		try {

			Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
		
			if(cozinha != null) {
				cozinhaRepository.remover(cozinha);
				
				return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.notFound().build();
			
		}catch (DataIntegrityViolationException e) {
			//o status 400 bad request tambem seria correto, mas ele é mais abrangente
			//o status 409 conflict é mais apropriado
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
			//ao usar o status 409 é bom retornar um corpo descrevendo qual foi o problema que gerou o conflito.
		}
	}

}
