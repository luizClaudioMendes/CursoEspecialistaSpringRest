package com.algaworks.algafood.anotacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

import com.algaworks.algafood.enumeracao.NivelUrgencia;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoNotificador {
	
	NivelUrgencia value();

}
