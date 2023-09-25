package Interfaces.Exercicios.Services;

public class ServicosPaypal implements IServicosPagamentoOnline{

	@Override
	public double taxaPagamento(double quantia) {
		return quantia * 0.02;
	}

	@Override
	public double interesse(double quantia, int meses) {
		return quantia * 0.01 * meses;
	}

}
