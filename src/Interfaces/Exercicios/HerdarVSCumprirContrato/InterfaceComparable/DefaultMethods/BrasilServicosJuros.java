package Interfaces.Exercicios.HerdarVSCumprirContrato.InterfaceComparable.DefaultMethods;

public class BrasilServicosJuros implements ITaxaService{

	private double taxaJuro;

	public BrasilServicosJuros(double taxaJuros) {
		this.taxaJuro = taxaJuros;
	}
	
	@Override
	public double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuro = taxaJuros;
	}
	
}
