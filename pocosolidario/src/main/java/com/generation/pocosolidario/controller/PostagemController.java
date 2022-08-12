package com.generation.pocosolidario.controller;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
<<<<<<< HEAD
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
=======
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc

import com.generation.pocosolidario.model.PostagemModel;
import com.generation.pocosolidario.repository.PostagemRepository;

@RestController
<<<<<<< HEAD
@RequestMapping ("/postagens")
=======
@RequestMapping("/postagens")
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
@CrossOrigin("*")
public class PostagemController {

	@Autowired
	private PostagemRepository postagemRepository;
<<<<<<< HEAD
	
	@GetMapping
	public ResponseEntity <List<PostagemModel>>getAll(){
		return ResponseEntity.ok(postagemRepository.findAll()); 
	}
	
	
	@GetMapping ("/{id}")
	public ResponseEntity <PostagemModel> getById (@PathVariable Long id){
		return postagemRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/legenda/{legenda}")
	public ResponseEntity <List<PostagemModel>> getByLegenda (@PathVariable String local){ 
		return ResponseEntity.ok(postagemRepository.findAllBylocalizacaoContainingIgnoreCase (local));
	}
	@PostMapping
	public ResponseEntity <PostagemModel> post (@RequestBody @Valid  PostagemModel post){ //RequestBody pega o que tem no corpo da requisição
		return ResponseEntity.status(HttpStatus.CREATED).body(postagemRepository.save(post));	
	}
	@PutMapping
	public ResponseEntity <PostagemModel> put (@RequestBody PostagemModel post){ 
		return ResponseEntity.status(HttpStatus.OK).body(postagemRepository.save(post));
	}
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable Long id) {
	Optional<PostagemModel> post = postagemRepository.findById(id);
		if(post.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		postagemRepository.deleteById(id);
	}
	
=======

	@GetMapping
	public ResponseEntity<List<PostagemModel>> getAll() {
		return ResponseEntity.ok(postagemRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<PostagemModel> getById(@PathVariable Long id) {
		return postagemRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
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
>>>>>>> 2629c7cabd75d7501e85a9400b407262d56f5bcc
}
