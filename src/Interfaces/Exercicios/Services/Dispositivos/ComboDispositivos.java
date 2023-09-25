package Interfaces.Exercicios.Services.Dispositivos;

import Interfaces.Exercicios.Services.IScanner;

public class ComboDispositivos extends Dispositivo implements IScanner, IImpressora {

	public ComboDispositivos(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Combo scan result";
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
		
	}
}
