package com.AluguelAutomotivo.Aluguel.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Veiculo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String placa;
	private String nome;
	private String cor;
	private Integer ano;
	
	public Veiculo(String placa, String nome, String cor, Integer ano) {
		super();
		this.placa = placa;
		this.nome = nome;
		this.cor = cor;
		this.ano = ano;
	}

	public Veiculo() {
		super();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public int hashCode() {
		return Objects.hash(placa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(placa, other.placa);
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", nome=" + nome + ", cor=" + cor + ", ano=" + ano + "]";
	}


	
	
}
