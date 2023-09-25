package Interfaces.Exercicios.HerdarVSCumprirContrato;

//aula 232. Herdar vs. cumprir contrato
public class Program {

	public static void main(String[] args) {
		
		FormaAbstrata s1 = new Circulo(Cor.BLACK, 2.0);
		FormaAbstrata s2 = new Retangulo(Cor.WHITE, 3.0, 4.0);
		
		System.out.println("Cor do circulo: " + s1.getCor());
		System.out.println("Area do circulo: "+ String .format("%.3f", s1.area()));
		System.out.println("Cor do retangulo: " + s2.getCor());
		System.out.println("Ara do retangulo: " + String.format("%.3f", s2.area()));
	}

}
