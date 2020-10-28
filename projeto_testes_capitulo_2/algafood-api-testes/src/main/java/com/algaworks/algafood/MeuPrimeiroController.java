package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * esta classe servira como exemplo de como criar uma
 * endpoint simples.
 * 
 * agente vai criar uma endpoint simples e testa-la no 
 * browser
 * 
 * esta classe tem um metodo chamado hello. agente quer
 * acessar a endpoint pelo browser e receber a resposta
 * 'hello!'
 * 
 *  - anotar a classe com @Controller 
 *  - anotar o metodo
 *  -- @GetMapping("caminho pra chegar na resposta")
 *  -- @ResponseBody -- necessario para que o spring
 *  retorne a string para o browser
 *  
 *  
 *  iniciar a aplicacao
 *  
 *  basta acessar no browser da seguinte forma:
 *  localhost:8080/hello
 * 
 */

@Controller
public class MeuPrimeiroController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello!";
	}

}
