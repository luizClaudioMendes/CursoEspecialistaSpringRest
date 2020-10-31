package com.algaworks.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.anotacao.TipoDoNotificador;
import com.algaworks.algafood.enumeracao.NivelUrgencia;
import com.algaworks.algafood.event.ClienteAtivadoEvent;
import com.algaworks.algafood.notificacao.Notificador;

@Component
public class CilenteAtivadoListener {
	
	@TipoDoNotificador(NivelUrgencia.NORMAL)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void notificarCliente(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema esta ativo usando eventos!");
	}
	
	@EventListener
	public void emitirNotaFiscal(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal para o cliente " + event.getCliente().getNome());
	}
}
