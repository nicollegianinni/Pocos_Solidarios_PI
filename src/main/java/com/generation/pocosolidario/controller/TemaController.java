package com.generation.pocosolidario.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.pocosolidario.model.TemaModel;
import com.generation.pocosolidario.repository.TemaRepository;

@RestController //
@RequestMapping ("/tema")
@CrossOrigin ("*")
public class TemaController {
	
	@Autowired 
	private TemaRepository repositoryTema;
	
	@GetMapping // SELECT*FROM tb_produtos;
	public ResponseEntity <List < TemaModel>> getAll(){
		return ResponseEntity.ok(repositoryTema.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity <TemaModel> getById (@PathVariable Long id){
		return repositoryTema.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/descricao/{descricao}")
	public ResponseEntity <List<TemaModel>> getByDescricao (@PathVariable String descricao){ // ResponseEntity é uma lista
		return ResponseEntity.ok(repositoryTema.findAllByDescricaoContainingIgnoreCase (descricao));
	}
	@PostMapping
	public ResponseEntity <TemaModel> post (@RequestBody @Valid  TemaModel tema){ //RequestBody pega o que tem no corpo da requisição
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryTema.save(tema));	
	}
	@PutMapping
	public ResponseEntity <TemaModel> put (@RequestBody TemaModel tema){ 
		return ResponseEntity.status(HttpStatus.OK).body(repositoryTema.save(tema));
	}
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable Long id) {
	Optional<TemaModel> tema = repositoryTema.findById(id);
		if(tema.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	repositoryTema.deleteById(id);
	}
}
