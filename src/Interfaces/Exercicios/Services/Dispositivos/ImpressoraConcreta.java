package Interfaces.Exercicios.Services.Dispositivos;

public class ImpressoraConcreta extends Dispositivo implements IImpressora{

	public ImpressoraConcreta(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Impressora processando: " + doc);
		
	}

	@Override
	public void print(String doc) {
		System.out.println("Imprimindo: " + doc);
	}
	
}
