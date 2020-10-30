package com.algaworks.algafood.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.anotacao.TipoDoNotificador;
import com.algaworks.algafood.enumeracao.NivelUrgencia;
import com.algaworks.algafood.modelo.Cliente;

//@Primary //em caso de ambiguidade de classes, o spring usara esta como principal
//@Qualifier("normal") //bean qualificado como normal
@TipoDoNotificador(NivelUrgencia.NORMAL) //desambiguacao
@Component
public class NotificadorEmail implements Notificador {
	
//	private boolean caixaAlta;
//	private String hostServidorSMTP;
	
//	public NotificadorEmail(String hostServidorSMTP) {
//		this.hostServidorSMTP = hostServidorSMTP;
//	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
//		if(caixaAlta) {
//			mensagem = mensagem.toUpperCase();
//		}
//		System.out.printf("Notificando %s através do e-mail %s usando o servidor SMTP %s: %s\n", 
//				cliente.getNome(), cliente.getEmail(), this.hostServidorSMTP, mensagem);
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
//	public void setCaixaAlta(boolean caixaAlta) {
//		this.caixaAlta = caixaAlta;
//	}
}
