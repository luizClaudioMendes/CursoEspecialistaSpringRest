package com.algaworks.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.anotacao.TipoDoNotificador;
import com.algaworks.algafood.enumeracao.NivelUrgencia;
import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;

@Component 
public class AtivacaoClienteService {

	//usando a interface para diminuir o acoplamento com a implementacao do notificador
	@Autowired//injetando a dependencia com autowired 
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
