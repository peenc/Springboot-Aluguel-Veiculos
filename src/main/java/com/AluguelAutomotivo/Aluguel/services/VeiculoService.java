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
	
	public Veiculo uptadeVeiculo(String placa, Veiculo obj) {
		Veiculo veiculo = veiculoRepository.findByPlaca(placa);
		updateData(veiculo, obj);
		return veiculoRepository.save(veiculo);
	}
	
	private void updateData(Veiculo veiculo, Veiculo obj) {
		veiculo.setCor(obj.getCor());
		
	}
	
	public void deleteVeiculo(String placa) {
		Veiculo veiculo = veiculoRepository.findByPlaca(placa);
		veiculoRepository.delete(veiculo);
	}
}
