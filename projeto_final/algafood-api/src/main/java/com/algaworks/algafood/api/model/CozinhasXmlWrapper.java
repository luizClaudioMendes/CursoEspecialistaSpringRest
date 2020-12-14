package com.algaworks.algafood.api.model;

import java.util.List;

import com.algaworks.algafood.domain.model.Cozinha;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;
import lombok.NonNull;

@JacksonXmlRootElement(localName = "cozinhas") //poderia ser tambem o @JsonRootElement
@Data
public class CozinhasXmlWrapper {

	@JacksonXmlProperty(localName = "cozinha") //poderia ser tambem o @JasonProperty
	@JacksonXmlElementWrapper(useWrapping = false)
	@NonNull
	private List<Cozinha> cozinhas;
}
