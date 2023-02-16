package com.AluguelAutomotivo.Aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AluguelAutomotivo.Aluguel.models.Veiculo;



public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

	Veiculo findByPlaca(String placa);

}
