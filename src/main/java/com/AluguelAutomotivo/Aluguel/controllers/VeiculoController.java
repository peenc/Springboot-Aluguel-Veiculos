package com.AluguelAutomotivo.Aluguel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AluguelAutomotivo.Aluguel.models.Veiculo;
import com.AluguelAutomotivo.Aluguel.services.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {

	@Autowired
	VeiculoService service;
	
	@PostMapping
	public ResponseEntity<Veiculo> cadastrarVeiculo(@RequestBody Veiculo veic) {

		veic = service.cadastrarVeiculo(veic);
		return ResponseEntity.ok().body(veic);

	}
}