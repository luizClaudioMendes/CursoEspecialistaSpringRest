package com.algaworks.algafood.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cozinha")//por padrao o JPA usa o nome da classe como nome da tabela. para setar basta usar @Table(name = NOME_TABELA)
@Entity//anotacao do JPA e informa que esta classe representa uma entidade no banco de dados
public class Cozinha {

	@Id//informa que este atributo representa o identificador da entidade
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//se deixar sem anotacao o JPA vai buscar na tabela a coluna com o nome do atributo
	//se usar @Column somente, ocorre o mesmo
	@Column(name = "nome")//se usar assim o JPA busca pelo nome da coluna
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cozinha other = (Cozinha) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
