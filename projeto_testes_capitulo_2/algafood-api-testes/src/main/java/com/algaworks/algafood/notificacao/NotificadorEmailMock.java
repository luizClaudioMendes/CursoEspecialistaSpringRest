package com.algaworks.algafood.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.anotacao.TipoDoNotificador;
import com.algaworks.algafood.enumeracao.NivelUrgencia;
import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.propriedades.NotificadorProperties;

@TipoDoNotificador(NivelUrgencia.NORMAL) 
@Component
@Profile("dev")
public class NotificadorEmailMock implements Notificador {
	
	@Autowired
	private NotificadorProperties properties;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("HOST:" +properties.getHostServidor());
		System.out.println("PORTA: "+properties.getPortaServidor());
		
		System.out.printf("MOCK:Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
