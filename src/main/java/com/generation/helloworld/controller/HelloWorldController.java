package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld") // qualquer requisição por esse caminho (Endpoint), será responsabilidade da classe:
public class HelloWorldController {
	
	@GetMapping() // Requisições do Tipo GET/ Busca, será responsabilidade da classe:
	public String helloWorld() {
		return "Hello World";
	}

}