import DadosUsuario.Aluno;
import DadosUsuario.Curso;
import DadosUsuario.Faculdade;
import DadosUsuario.Professor;
import DadosUsuario.TipoCurso;
import Ferramentas.AgulhaCirurgica;
import Ferramentas.Bisturi;
import Ferramentas.Pinça;
import Frutas.Laranja;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso("Engenharia de Software", 4, TipoCurso.BACHARELADO);
		Faculdade faculdade = new Faculdade("FIAP", "Vila Mariana", 5);
		Laranja fruta = new Laranja("Laranja-pera");
		
		
		Aluno lucas = new Aluno("Lucas Delfino", faculdade, curso);
		
		Bisturi bisturi = new Bisturi("reto");
		
		lucas.cortar(fruta, bisturi);
				
		Pinça pinça = new Pinça("ponta fina");
		
		lucas.removerSementes(fruta, pinça);
		
		
		AgulhaCirurgica agulha = new AgulhaCirurgica("curva");
		
		lucas.suturar(fruta, agulha);
		
		lucas.limparFerramenta(bisturi);
		lucas.limparFerramenta(pinça);
		lucas.limparFerramenta(agulha);
		
		Professor robson = new Professor("Robson de Oliveira", faculdade, curso);
		
		robson.verDadosAluno(lucas);
		
		
		
	}

}
