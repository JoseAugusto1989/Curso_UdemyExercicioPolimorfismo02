package entities;

public class PessoaFisica extends Pessoa {
	
	private double gastoSaude;

	public PessoaFisica() {
		
	}

	public PessoaFisica(String name, double rendaAnual, double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calculo() {
		
		if (gastoSaude > 0) {
			if (rendaAnual < 20000) {
				return (rendaAnual * 0.15) - (gastoSaude * 0.5);
				
			} else if (rendaAnual >= 20000) {
				return (rendaAnual * 0.25) - (gastoSaude * 0.5);
				
			}
			
		} else {
			if (rendaAnual < 20000) {
				return (rendaAnual * 0.15);
				
			} else if (rendaAnual >= 20000) {
				return (rendaAnual * 0.25);
				
			}
		}
		return rendaAnual;
		
	}
	
}
