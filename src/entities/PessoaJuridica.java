package entities;

public class PessoaJuridica extends Pessoa {
	
	private int numFunc;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, double rendaAnual, int numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}

	public int getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public double calculo() {
		
		if (numFunc > 10) {
			return rendaAnual * 0.14;
			
		} else {
			return rendaAnual * 0.16;
			
		}
	}
	
}
