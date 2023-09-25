package Interfaces.Exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Interfaces.Exercicios.Services.AluguelService;
import Interfaces.Exercicios.Services.BrasilTaxaServices;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm)");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.print("Retorno (dd/MM/yyyy hh:mm)");
		LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), fmt);
		
		AluguelCarros cr = new AluguelCarros(inicio, retorno, new Veiculos(modeloCarro));
		
		System.out.print("Entre com o preço por hora: ");
		double precoHora = sc.nextDouble();
		
		System.out.print("Entre com o preço por dia: ");
		double pricoDia = sc.nextDouble();
		
		AluguelService aluguelService = new AluguelService(precoHora, pricoDia, new BrasilTaxaServices());
		
		aluguelService.processoFatura(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + String.format("%.2f", cr.getFatura().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getFatura().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getFatura().getPagamentoBasico()));
		
		sc.close();
	}

}
