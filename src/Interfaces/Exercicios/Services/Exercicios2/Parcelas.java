package Interfaces.Exercicios.Services.Exercicios2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate data;
	private Double quantia;
	
	public Parcelas() {
		
	}
	
	public Parcelas(LocalDate data, Double quantia) {
		this.data = data;
		this.quantia = quantia;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getQuantia() {
		return quantia;
	}

	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}
	
	@Override 
	public String toString() {
		return data.format(fmt) + " - " + String.format("%.2f", quantia);
	}

	
}
