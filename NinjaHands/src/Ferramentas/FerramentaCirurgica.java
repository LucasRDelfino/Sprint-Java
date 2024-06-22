package Ferramentas;
public class FerramentaCirurgica {
	protected String nome;
	protected boolean usado;
	
	public FerramentaCirurgica(String nome, boolean usado) {
		this.nome = nome;
		this.usado = usado;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}
	
}
