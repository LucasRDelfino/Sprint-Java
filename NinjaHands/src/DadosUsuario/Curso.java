package DadosUsuario;

public class Curso {
	private String nome;
	private int duracao;
	private TipoCurso tipo;
	
	public Curso(String nome, int duracao, TipoCurso tipo) {
		this.nome = nome;
		this.duracao = duracao;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public TipoCurso getTipo() {
		return tipo;
	}

	public void setTipo(TipoCurso tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	
}
