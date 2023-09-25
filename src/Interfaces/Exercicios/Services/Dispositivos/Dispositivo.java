package Interfaces.Exercicios.Services.Dispositivos;

public abstract class Dispositivo {

	public String numeroSerie;

	public Dispositivo(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public abstract void processDoc(String doc);
	
	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public void print(String doc) {
		// TODO Auto-generated method stub
		
	}

	public String scan() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
