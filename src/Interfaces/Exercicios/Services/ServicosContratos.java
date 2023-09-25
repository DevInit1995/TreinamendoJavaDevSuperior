package Interfaces.Exercicios.Services;

import java.time.LocalDate;

import Interfaces.Exercicios.Services.Exercicios2.Contratos;
import Interfaces.Exercicios.Services.Exercicios2.Parcelas;

public class ServicosContratos {

	private IServicosPagamentoOnline servicosPagamentosOnline;

	public ServicosContratos(IServicosPagamentoOnline servicosPagamentosOnline) {
		super();
		this.servicosPagamentosOnline = servicosPagamentosOnline;
	}
	
	public void processosContratos(Contratos contratos, int meses) {
		double cotaBasica = contratos.getTotalValor() / meses;
		
		for(int i = 1; i <= meses; i++) {
			LocalDate dadosDevidos = contratos.getData().plusMonths(i);
			
			double interesse = servicosPagamentosOnline.taxaPagamento(cotaBasica + i);
			
			double taxa = servicosPagamentosOnline.taxaPagamento(cotaBasica + interesse);
			
			double cota = cotaBasica + interesse + taxa;
			
			contratos.getParcelas().add(new Parcelas(dadosDevidos, cota));
		}	
	}	
}
