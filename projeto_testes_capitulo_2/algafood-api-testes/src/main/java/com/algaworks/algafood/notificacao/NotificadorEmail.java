package com.algaworks.algafood.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.anotacao.TipoDoNotificador;
import com.algaworks.algafood.enumeracao.NivelUrgencia;
import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.propriedades.NotificadorProperties;

//@Primary //em caso de ambiguidade de classes, o spring usara esta como principal
//@Qualifier("normal") //bean qualificado como normal
@TipoDoNotificador(NivelUrgencia.NORMAL) //desambiguacao
@Component
@Profile("prod")
public class NotificadorEmail implements Notificador {
	
	@Autowired
	private NotificadorProperties properties;
	
	
//	@Value("${notificador.email.host-servidor}")
//	private String host;
//	
//	@Value("${notificador.email.porta-servidor}")
//	private Integer porta;
//	
//	@Value("${spring.profiles.active}")
//	String profileAtivo;
	
//	private boolean caixaAlta;
//	private String hostServidorSMTP;
	
//	public NotificadorEmail(String hostServidorSMTP) {
//		this.hostServidorSMTP = hostServidorSMTP;
//	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("HOST:" +properties.getHostServidor());
		System.out.println("PORTA: "+properties.getPortaServidor());
		
		
//		System.out.println("PROFILE: "+profileAtivo);
//		System.out.println("HOST:" +host);
//		System.out.println("PORTA: "+porta);
		
		
		
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
