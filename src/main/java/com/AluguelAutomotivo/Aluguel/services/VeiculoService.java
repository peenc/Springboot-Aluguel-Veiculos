package com.AluguelAutomotivo.Aluguel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AluguelAutomotivo.Aluguel.models.Veiculo;
import com.AluguelAutomotivo.Aluguel.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	VeiculoRepository vr;
	
	public Veiculo cadastrarVeiculo(Veiculo veic) {
		
		return vr.save(veic);
	}
	
}
