package br.com.generation.exercicio_herenca;

public class TesteTodos {

	public static void main(String[] args) {
		
		Cachorro cr = new Cachorro();
		Cavalo cl = new Cavalo();
		Preguica pr = new Preguica();
		
		cr.setNome("Teddy Bear");
		cr.setIdade(5);
		cr.emitirSom();
		cr.correr();
		
		System.out.println(cr.getNome());
		System.out.println(cr.getIdade() + "\n");
		
		cl.setNome("Cavalinho");
		cl.setIdade(10);
		cl.emitirSom();
		cl.correr();
		
		System.out.println(cl.getNome());
		System.out.println(cl.getIdade() + "\n");
		
		pr.setNome("Preguiçinha");
		pr.setIdade(15);
		pr.emitirSom();
		pr.subir();
		
		System.out.println(pr.getNome());
		System.out.println(pr.getIdade());
	}

}
