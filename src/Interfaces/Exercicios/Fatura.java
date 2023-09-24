package Interfaces.Exercicios;

import java.time.LocalDateTime;
import java.util.Date;

public class Fatura {

	private double pagamentoBasico;
	private double taxa;
	private double totalPagamento;

	public Fatura() {
		
	}

	public Fatura(double pagamentoBasico, double taxa) {
		this.pagamentoBasico = pagamentoBasico;
		this.taxa = taxa;
	}

	public double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getTotalPagamento() {
		return getTotalPagamento() + getTaxa();
	}

	public void setTotalPagamento(double totalPagamento) {
		this.totalPagamento = totalPagamento;
	}
	
	
}
