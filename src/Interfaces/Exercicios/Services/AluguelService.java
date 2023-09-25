package Interfaces.Exercicios.Services;

import java.time.Duration;

import Interfaces.Exercicios.AluguelCarros;
import Interfaces.Exercicios.Fatura;

public class AluguelService {
	
	private double precoHora;
	private double precoPorDia;
	
	private ITaxaService taxaService;

	public AluguelService(double precoHora, double precoPorDia, ITaxaService taxaService) {
		this.precoHora = precoHora;
		this.precoPorDia = precoPorDia;
		this.taxaService = taxaService;
	}
	
	public void processoFatura(AluguelCarros aluguelCarros) {

		double minutos = Duration.between(aluguelCarros.getDataInicio(), aluguelCarros.getDataFinal()).toMinutes();
	
		double horas = minutos / 60.0;
		
		double pagamentoBasico;
		if(horas <= 12.0) {
			pagamentoBasico = precoHora * Math.ceil(horas);
		}
		else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
		}
		
		double taxa = taxaService.taxa(pagamentoBasico);
		
		aluguelCarros.setFatura(new Fatura(pagamentoBasico, taxa));
	
	}
	
}
