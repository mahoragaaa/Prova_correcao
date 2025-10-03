package br.edu.fatecpg.Provacorrecao.view;
import br.edu.fatecpg.Provacorrecao.model.*;

public class Main {
	
	public static void main(String [] args) {
	
	Livro harrypotter = new Livro();
	
	harrypotter.autor = "jq.Rolling";
	harrypotter.titulo = "prisioneiro de askaban";
	harrypotter.anopublicacao = 1997;
	
	
	System.out.println("O nome do livro é: " + harrypotter.titulo + " ,seu(a) autor é: " + harrypotter.autor + " e foi lançado em: " + harrypotter.anopublicacao + "\n");
		
	
	Funcionario jefferson = new Funcionario();
	
	jefferson.setnome("Jefferson");
	System.out.println(jefferson.getnome());
	jefferson.setsalario(3000.00);
	System.out.println(jefferson.getsalario());
	jefferson.setcargo("programador");
	System.out.println(jefferson.getcargo());
	
	
	
	}
}
