package Interfaces.Exercicios.HerdarVSCumprirContrato.InterfaceComparable.DefaultMethods;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantia: ");
		double quantia = sc.nextDouble();
		
		System.out.println("Meses: ");
		int meses = sc.nextInt();
		
		ITaxaService is = new UsaServicosJuros(1.0);
		double pagamento = is.pagamento(quantia, meses);
		
		System.out.println("Pagamento realizado " + meses + " meses: ");
		System.out.println(String.format("%.2f", pagamento));
		
		sc.close();
	}

}
