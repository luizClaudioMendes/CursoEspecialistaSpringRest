package com.algaworks.algafood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;

@Component 
public class AtivacaoClienteService {

	//usando a interface para diminuir o acoplamento com a implementacao do notificador
	@Autowired//injetando a dependencia com autowired 
	@Qualifier("urgente")//retirando a ambiguidade, caso ocorra, usar o qualificado como urgente
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
