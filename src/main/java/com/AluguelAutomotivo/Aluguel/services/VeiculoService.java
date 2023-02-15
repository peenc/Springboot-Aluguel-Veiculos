package com.AluguelAutomotivo.Aluguel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AluguelAutomotivo.Aluguel.models.Veiculo;
import com.AluguelAutomotivo.Aluguel.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	VeiculoRepository veiculoRepository;

	public Veiculo cadastrarVeiculo(Veiculo veiculo) {

		return veiculoRepository.save(veiculo);
	}

	public List<Veiculo> findAll() {

		return veiculoRepository.findAll();

	}

}
