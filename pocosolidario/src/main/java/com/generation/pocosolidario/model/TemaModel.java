package com.generation.pocosolidario.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
<<<<<<< HEAD
=======

>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
@Entity
@Table(name = "tb_tema")
public class TemaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
<<<<<<< HEAD
	
	@NotBlank(message = "O atributo descrição é obrigatório!")
=======

	@NotBlank(message = "O atributo discrição é obrigatório!")
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
	private String descricao;
	
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tema")
	private List<PostagemModel> postagem;
	

	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tema")
	private List<PostagemModel> postagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<PostagemModel> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<PostagemModel> postagem) {
		this.postagem = postagem;
	}
<<<<<<< HEAD
	
	
=======
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
}
