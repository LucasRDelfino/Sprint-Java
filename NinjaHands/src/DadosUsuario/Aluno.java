package DadosUsuario;
import Ferramentas.AgulhaCirurgica;
import Ferramentas.Bisturi;
import Ferramentas.FerramentaCirurgica;
import Ferramentas.Pinça;
import Frutas.Fruta;

public class Aluno {
	private String nome;
	private Faculdade faculdade;
	private Curso curso;
	private boolean fase1;
	private boolean fase2;
	private boolean fase3;
	
	
	
	public Aluno(String nome, Faculdade faculdade, Curso curso) {
		this.nome = nome;
		this.faculdade = faculdade;
		this.curso = curso;
		fase1 = false;
		fase2 = false;
		fase3 = false;
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
	public boolean isFase1() {
		return fase1;
	}

	public void setFase1(boolean fase1) {
		this.fase1 = fase1;
	}

	public boolean isFase2() {
		return fase2;
	}

	public void setFase2(boolean fase2) {
		this.fase2 = fase2;
	}

	public boolean isFase3() {
		return fase3;
	}

	public void setFase3(boolean fase3) {
		this.fase3 = fase3;
	}

	public void cortar(Fruta fruta, Bisturi bisturi) {
		if (fruta.isCortada() == false) {
			if (bisturi.isUsado() == false){
				System.out.println("A " +fruta.getNome()+ " foi cortada");
				setFase1(true);
				bisturi.setUsado(true);
				fruta.setCortada(true);
			}else {
				System.out.println("Limpe o bisturi para cortar a fruta"); 
			}				
			}else {
				System.out.println("A " +fruta.getNome()+ " já está cortada, hora de remover as sementes");
		}
		
	}
	public void removerSementes(Fruta fruta, Pinça pinça){
		if (fruta.isPossuiSementes() == true) {
			if (fruta.isCortada() == false) {
				System.out.println("Primeiro corte a fruta para remover as sementes");
			}
			else if (pinça.isUsado() == false){
				System.out.println("Foi removida as sementes da  " +fruta.getNome());
				setFase2(true);
				pinça.setUsado(true);
				fruta.setPossuiSementes(false);
			}else {
				System.out.println("Limpe a pinça para remover as sementes"); 
			}				
			}else {
				System.out.println("A " +fruta.getNome()+ " já está sem sementes, hora de suturar");
		}
		
	}
	
	
	public void suturar(Fruta fruta, AgulhaCirurgica agulha) {
		if (fruta.isSuturada() == false) {
			if (fruta.isCortada() == false) {
				System.out.println("Primeiro corte a fruta para suturar");
			}
			else if (fruta.isPossuiSementes() == true) {
				System.out.println("Primeiro retire as sementes para suturar");
			}
			else if (agulha.isUsado() == false){
				System.out.println("A " +fruta.getNome()+ " foi suturada");
				setFase3(true);
				agulha.setUsado(true);
				fruta.setSuturada(true);
			}else {
				System.out.println("Limpe a agulha para remover as sementes"); 
			}				
			}else {
				System.out.println("A " +fruta.getNome()+ " já foi suturada, você conclui todas as fases");
		}
	}
	
	public void limparFerramenta(FerramentaCirurgica ferramenta) {
		if (ferramenta.isUsado() == true) {
			ferramenta.setUsado(false);
		}else {
			System.out.println("Ferramenta já está limpa");
		}
	}

	@Override
	public String toString() {
		if (isFase1() == true && isFase2()== true && isFase3()==true) {
			return "Aluno [nome=" + nome + ", faculdade=" + faculdade.getNome() + ", curso=" + curso.getNome() + ", Todas as fases concluidas]";	
		}if (isFase1() == true && isFase2()== true && isFase3()==false) {
			return "Aluno [nome=" + nome + ", faculdade=" + faculdade.getNome() + ", curso=" + curso.getNome() + ", Fase 1 e 2 concluídas]";	
		}if (isFase1() == true && isFase2()== false && isFase3()==false) {
			return "Aluno [nome=" + nome + ", faculdade=" + faculdade.getNome() + ", curso=" +curso.getNome()+ ", Fase 1 concluída]";
		}
		return "Aluno [nome=" + nome + ", faculdade=" + faculdade.getNome() + ", curso=" + curso.getNome() + ", Nenhuma fase concluída";
		
	}	
	
}
