package DadosUsuario;

public class Faculdade {
	private String nome;
	private String localidade;
	private double notaMec;
	
	public Faculdade(String nome, String localidade, double notaMec){
		this.nome = nome;
		this.localidade = localidade;
		this.notaMec = notaMec;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public double getNotaMec() {
		return notaMec;
	}

	public void setNotaMec(double notaMec) {
		this.notaMec = notaMec;
	}
	
	

}
