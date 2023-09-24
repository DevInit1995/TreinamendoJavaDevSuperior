package Interfaces.Exercicios.Services.Exercicios2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Interfaces.Exercicios.Services.ServicosContratos;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número; ");
		
		int numero = sc.nextInt();
		
		System.out.println("Data (dd/MM/yyyy): ");
		
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		
		System.out.println("Valor do contrato: ");
		
		double totalValor = sc.nextDouble();
		
		Contratos obj = new Contratos(numero, data, totalValor);
		
		System.out.println("Entre com o número de parcelas; ");
		int n = sc.nextInt();
		
		ServicosContratos servicosContratos = new ServicosContratos(null);
		
		servicosContratos.processosContratos(obj, n);
		
		System.out.println("Parcelas:");
		
		for(Parcelas parcelas : obj.getParcelas()) {
			System.out.println(parcelas);
		}
		
		sc.close();
		
	}

}
