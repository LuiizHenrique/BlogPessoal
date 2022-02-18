package org.Generation.blogPessoal.controller;

import java.util.List;

import org.Generation.blogPessoal.model.Postagem;
import org.Generation.blogPessoal.repositary.PostagemRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")

public class PostagemController {
	@Autowired
	private PostagemRepositary repositoty;
	
	@GetMapping
	public ResponseEntity<List<Postagem>>GetAll(){
	return ResponseEntity.ok(repositoty.findAll());
		
	}
}
	
