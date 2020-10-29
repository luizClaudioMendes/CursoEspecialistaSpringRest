package com.algaworks.algafood.notificacao;

import com.algaworks.algafood.modelo.Cliente;

//@Component retirado pois é um bean configurado nas classes de configuracao
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSMTP;
	
	public NotificadorEmail(String hostServidorSMTP) {
		this.hostServidorSMTP = hostServidorSMTP;
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do e-mail %s usando o servidor SMTP %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), this.hostServidorSMTP, mensagem);
	}
	
	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
