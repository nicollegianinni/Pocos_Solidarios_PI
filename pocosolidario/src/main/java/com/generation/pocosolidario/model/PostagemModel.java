package com.generation.pocosolidario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagens")
public class PostagemModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Insira sua cidade e bairro.")
	private String localizacao;

	private String foto;

	@NotBlank
	@Size(max = 500, message = "A legenda deve conter no máximo 500 caracteres.")
	private String legenda;

	private Boolean doacao; //boolean

	@Size(max = 500, message = "O feedback deve conter no máximo 500 caracteres")
	private String feedback;

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private TemaModel tema;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getLegenda() {
		return legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	public Boolean getDoacao() {
		return doacao;
	}

	public void setDoacao(Boolean doacao) {
		this.doacao = doacao;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public TemaModel getTema() {
		return tema;
	}

	public void setTema(TemaModel tema) {
		this.tema = tema;
	}

}
