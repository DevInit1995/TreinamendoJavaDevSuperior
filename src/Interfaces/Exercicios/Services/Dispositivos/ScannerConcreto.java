package Interfaces.Exercicios.Services.Dispositivos;

import Interfaces.Exercicios.Services.IScanner;

public class ScannerConcreto extends Dispositivo implements IScanner {

	public ScannerConcreto(String numeroSerie) {
		super(numeroSerie);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processando: " + doc);
	}
	
	@Override
	public String scan() {
		return "Conteúdo digitalizado";
	}	
}
