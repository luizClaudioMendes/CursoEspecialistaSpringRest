package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;

@RestController
@RequestMapping("/estados")
//@RequestMapping(value = "/estados", produces = MediaType.APPLICATION_JSON_VALUE)
public class EstadoController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping // retorna o tipo configurado no sistema 
//	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}) // retorna o tipo JSON ou XML mesmo que a applicacao permita outros tipos
//	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) // retorna o tipo JSON mesmo que a applicacao permita outros tipos
	public List<Estado> listar() {
		return estadoRepository.listar();
	}

}
