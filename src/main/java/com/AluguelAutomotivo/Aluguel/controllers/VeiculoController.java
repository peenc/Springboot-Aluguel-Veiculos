package com.AluguelAutomotivo.Aluguel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping(value = "/{placa}")
	public ResponseEntity<Veiculo> atualizarVeiculo(@PathVariable String placa,@RequestBody Veiculo veiculo ){
		veiculo = service.uptadeVeiculo(placa, veiculo);
		return ResponseEntity.ok().body(veiculo);
	}
	
	@DeleteMapping(value = "/{placa}")
	public ResponseEntity<String> deletarVeiculo(@PathVariable String placa){
		service.deleteVeiculo(placa);
		String str = "Deletado";
		return ResponseEntity.ok().body(str);
	}
}