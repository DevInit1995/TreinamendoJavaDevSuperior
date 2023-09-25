package Interfaces.Exercicios.Services.Exercicios2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contratos {

	private Integer number;
	private LocalDate data;
	private Double totalValor;
	
	private List<Parcelas> parcelas = new ArrayList<>();
	
	public Contratos() {
		
	}

	public Contratos(Integer number, LocalDate data, Double totalValor) {
		super();
		this.number = number;
		this.data = data;
		this.totalValor = totalValor;
		this.parcelas = parcelas;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(Double totalValor) {
		this.totalValor = totalValor;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}

	
	
}
