package com.algaworks.algafood.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
import lombok.EqualsAndHashCode;

//@JsonRootName("cozinha")// somente executavel para XML de forma a alterar o nome do objeto na resposta
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "cozinha")//por padrao o JPA usa o nome da classe como nome da tabela. para setar basta usar @Table(name = NOME_TABELA)
@Entity//anotacao do JPA e informa que esta classe representa uma entidade no banco de dados
public class Cozinha {

	@EqualsAndHashCode.Include //informa que o equals e hashcode deve incluir esta propriedade
	@Id//informa que este atributo representa o identificador da entidade
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//se deixar sem anotacao o JPA vai buscar na tabela a coluna com o nome do atributo
	//se usar @Column somente, ocorre o mesmo
//	@JsonProperty("titulo")
//	@JsonIgnore
	@Column(name = "nome", nullable = false)//se usar assim o JPA busca pelo nome da coluna
	private String nome;

	
}
