package Frutas;
public class Fruta {
	protected String nome;
	protected String cor;
	protected boolean cortada;
	protected boolean possuiSementes;
	protected boolean suturada;
	
	public Fruta(String nome, String cor, boolean cortada, boolean possuiSementes, boolean suturada) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.cortada = cortada;
		this.possuiSementes = possuiSementes;
		this.suturada = suturada;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isCortada() {
		return cortada;
	}

	public void setCortada(boolean cortada) {
		this.cortada = cortada;
	}

	public boolean isPossuiSementes() {
		return possuiSementes;
	}

	public void setPossuiSementes(boolean possuiSementes) {
		this.possuiSementes = possuiSementes;
	}

	public boolean isSuturada() {
		return suturada;
	}

	public void setSuturada(boolean suturada) {
		this.suturada = suturada;
	}
	
	
}
