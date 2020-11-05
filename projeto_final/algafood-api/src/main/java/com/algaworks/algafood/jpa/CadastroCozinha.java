package com.algaworks.algafood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.Cozinha;

@Component
public class CadastroCozinha {

	@PersistenceContext //o PersistenceContext é o mesmo que o @Autowired mas que permite algumas configuracoes do entity manager
	private EntityManager manager;
	
	public List<Cozinha> listar () {
		TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class); //usando JPQL
		return query.getResultList();
	
	}
}