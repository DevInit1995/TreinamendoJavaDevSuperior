package Interfaces.Exercicios.HerdarVSCumprirContrato;

//aula 232. Herdar vs. cumprir contrato
public class Circulo extends FormaAbstrata{

	private Double radius;
	
	public Circulo(Cor cor, Double radius) {
		super(cor);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	
	
}
