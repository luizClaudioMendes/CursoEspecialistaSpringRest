package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.Cozinha;

public interface CozinhaRepository {
	//um repository representa uma coleçao, neste caso de cozinhas.
	// a interface do repositorio faz parte do dominio, nao tem mecanismos de persistencia, ou seja se é em BD ou arquivo, etc
	
	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover (Cozinha cozinha);

}
