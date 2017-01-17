package br.com.suitability.entidade;

import javax.persistence.*;

@Entity
@Table(name = "PESSOA")
public class Pessoa {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 60, nullable = false)
	private String nome;
	
	@Column(length = 60, nullable = false)
	private String email;
	
	@Column(length = 11, nullable = false)
	private String cpf;

	@Column(length = 60, nullable = false)
	private String descricao;
	

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	

}
