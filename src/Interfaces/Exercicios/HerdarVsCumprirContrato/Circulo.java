package Interfaces.Exercicios.HerdarVsCumprirContrato;

public class Circulo extends FormaAbstrata {

	private Double radius;

	public Circulo(Color color, Double radius) {
		super(color);
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
