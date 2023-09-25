package Interfaces.Exercicios.HerdarVSCumprirContrato;

public abstract class FormaAbstrata implements Forma{

	private Cor cor;

	public FormaAbstrata(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
}
