package Interfaces.Exercicios.HerdarVSCumprirContrato.InterfaceComparable.DefaultMethods;

public class UsaServicosJuros implements ITaxaService{

	private double taxaJuros;

	public UsaServicosJuros(double taxaJuros) {
		super();
		this.taxaJuros = taxaJuros;
	}
	
	public double getTaxaJuro() {
		return taxaJuros;
	}
}
