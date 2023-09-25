package Interfaces.Exercicios.Services;

public interface IServicosPagamentoOnline {

	double taxaPagamento(double quantia);
	
	double interesse(double quantia, int meses);
}
