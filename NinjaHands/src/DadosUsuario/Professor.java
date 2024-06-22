package DadosUsuario;

public class Professor {
	private String nome;
	private Faculdade faculdade;
	private Curso curso;
	
	
	public Professor(String nome, Faculdade faculdade, Curso curso) {
		super();
		this.nome = nome;
		this.faculdade = faculdade;
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Faculdade getFaculdade() {
		return faculdade;
	}
	public void setFaculdade(Faculdade faculdade) {
		this.faculdade = faculdade;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void verDadosAluno(Aluno aluno){
		if (getCurso() == aluno.getCurso()) {
			System.out.println(aluno.toString());
		}else {
			System.out.println("Você não pode ver os dados desse aluno");
		}
	}
	
	
}
