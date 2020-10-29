//package com.algaworks.algafood;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.algaworks.algafood.notificacao.NotificadorEmail;
//import com.algaworks.algafood.service.AtivacaoClienteService;
//
//@Configuration
//public class AlgaConfig {
//	
//	// este metodo é o responsavel por criar e configurar a classe NotificadorEmail
//	@Bean
//	public NotificadorEmail notificadorEmail() {
//		NotificadorEmail notificador = new NotificadorEmail("smtp.teste.config");
//		notificador.setCaixaAlta(true);//configurando a caixa alta
//		
//		return notificador;
//	}
//	
//	@Bean
//	public AtivacaoClienteService ativacaoClienteService() {
//		return new AtivacaoClienteService(notificadorEmail());
//	}
//	
//
//}
