package Interfaces.Exercicios;

import java.time.LocalDateTime;

public class AluguelCarros {

	private LocalDateTime dataInicio;
	private LocalDateTime dataFinal;
	
	private Veiculos veiculos;
	private Fatura fatura;
	
	public AluguelCarros() {

	}

	public AluguelCarros(LocalDateTime dataInicio, LocalDateTime dataFinal, Veiculos veiculos) {
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.veiculos = veiculos;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDateTime dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Veiculos getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Veiculos veiculos) {
		this.veiculos = veiculos;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
}
