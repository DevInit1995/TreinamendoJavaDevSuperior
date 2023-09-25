package Interfaces.Exercicios.HerdarVSCumprirContrato.InterfaceComparable.DefaultMethods;

import java.security.InvalidParameterException;

public interface ITaxaService {

	double getTaxaJuro();
	
	default double pagamento(double quantia, int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Os meses devem ser maires que zero");
		}
		return quantia * Math.pow(1.0 + getTaxaJuro() / 100.0, meses);
	}
}
