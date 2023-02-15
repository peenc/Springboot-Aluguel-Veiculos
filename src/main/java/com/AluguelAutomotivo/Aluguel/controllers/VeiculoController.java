package com.AluguelAutomotivo.Aluguel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ResponseEntity<Veiculo> cadastrarVeiculo(@RequestBody Veiculo veiculo) {

		veiculo = service.cadastrarVeiculo(veiculo);
		return ResponseEntity.ok().body(veiculo);

	}
	@GetMapping
	public ResponseEntity<List<Veiculo>> buscarTodosVeiculos(){
		List<Veiculo> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}