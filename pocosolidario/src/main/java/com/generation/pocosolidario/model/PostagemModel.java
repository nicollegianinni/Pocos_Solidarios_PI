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
<<<<<<< HEAD
@Table(name="tb_postagens")
public class PostagemModel {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	String foto;
	
	@NotBlank
	String localizacao;
	
	@NotBlank
	String legenda;
	
	@Size (min = 10, max =1000)
	String doacao;
	
	@Size(min = 10, max=1000)
	String feedback;
=======
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
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private TemaModel tema;
<<<<<<< HEAD
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


=======

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
	public String getLocalizacao() {
		return localizacao;
	}

<<<<<<< HEAD

=======
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

<<<<<<< HEAD
=======
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc

	public String getLegenda() {
		return legenda;
	}

<<<<<<< HEAD

=======
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

<<<<<<< HEAD

	public String getDoacao() {
		return doacao;
	}


	public void setDoacao(String doacao) {
		this.doacao = doacao;
	}


=======
	public Boolean getDoacao() {
		return doacao;
	}

	public void setDoacao(Boolean doacao) {
		this.doacao = doacao;
	}

>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
	public String getFeedback() {
		return feedback;
	}

<<<<<<< HEAD

=======
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

<<<<<<< HEAD

=======
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
	public TemaModel getTema() {
		return tema;
	}

<<<<<<< HEAD

	public void setTema(TemaModel tema) {
		this.tema = tema;
	}
	
	
=======
	public void setTema(TemaModel tema) {
		this.tema = tema;
	}

>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
}
