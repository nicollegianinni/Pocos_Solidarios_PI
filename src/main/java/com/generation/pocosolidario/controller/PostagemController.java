package com.generation.pocosolidario.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.pocosolidario.model.PostagemModel;
import com.generation.pocosolidario.repository.PostagemRepository;

@RestController


@RequestMapping("/postagens")

@CrossOrigin("*")
public class PostagemController {

	@Autowired
	private PostagemRepository postagemRepository;


	@GetMapping
	public ResponseEntity<List<PostagemModel>> getAll() {
		return ResponseEntity.ok(postagemRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<PostagemModel> getById(@PathVariable Long id) {
		return postagemRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	@GetMapping("/usuario/{usuario}")
	public ResponseEntity<List<PostagemModel>> getByUsuario(@PathVariable long usuario){
		return ResponseEntity.ok(postagemRepository.findAllByUsuarioContainingIgnoreCase(usuario));
	}

	@GetMapping("/legenda/{legenda}")
	public ResponseEntity<List<PostagemModel>> getByLegenda(@PathVariable String legenda) {
		return ResponseEntity.ok(postagemRepository.findAllByLegendaContainingIgnoreCase(legenda));
	}

	@GetMapping("/localizacao/{localizacao}")
	public ResponseEntity<List<PostagemModel>> getByLocalizacao(@PathVariable String localizacao) {
		return ResponseEntity.ok(postagemRepository.findAllByLocalizacaoContainingIgnoreCase(localizacao));
	}

	@GetMapping("/feedback/{feedback}")
	public ResponseEntity<List<PostagemModel>> getByFeedback(@PathVariable String feedback) {
		return ResponseEntity.ok(postagemRepository.findAllByFeedbackContainingIgnoreCase(feedback));
	}

	@PostMapping
	public ResponseEntity<PostagemModel> post(@Valid @RequestBody PostagemModel postagem) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(postagemRepository.save(postagem));
	}

	@PutMapping
	public ResponseEntity<PostagemModel> put(@RequestBody PostagemModel postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(postagemRepository.save(postagem));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable long id) {
		return postagemRepository.findById(id).map(resposta -> {
			postagemRepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}).orElse(ResponseEntity.notFound().build());
	}

}
