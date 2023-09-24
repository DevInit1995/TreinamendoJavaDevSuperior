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
		contratos.getParcelas().add(new Parcelas(LocalDate.of(2018,  7,  25), 206.04));
		contratos.getParcelas().add(new Parcelas(LocalDate.of(2018, 8, 25), 208.08));
	}	
	
}
