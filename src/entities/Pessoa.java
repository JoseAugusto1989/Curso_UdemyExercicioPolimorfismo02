package entities;

public abstract class Pessoa {
	
	private String name;
	protected double rendaAnual;
	
	public Pessoa() {
		
	}

	public Pessoa(String name, double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double calculo();
	
}
