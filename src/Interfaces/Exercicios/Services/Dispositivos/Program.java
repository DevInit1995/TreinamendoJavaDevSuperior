package Interfaces.Exercicios.Services.Dispositivos;

public class Program {

	public static void main(String[] args) {
		
		ImpressoraConcreta p = new ImpressoraConcreta("1080");
		p.processDoc("Minha carta");
		
		ScannerConcreto s = new ScannerConcreto("2003");
		s.processDoc("Meu Email");
		System.out.println("Resultado da impressão: " + s.scan());
	
		System.out.println();
		ComboDispositivos c = new ComboDispositivos("2081");
		c.processDoc("Minha carta");
		c.print("Minha carta");
		System.out.println("Scan resultado: " + c.scan());
	
	}

}
