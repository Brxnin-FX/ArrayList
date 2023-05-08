package principal;

import entidades.Livraria;
import entidades.Livro;

public class Principal {

	public static void main(String[] args) {
		Livraria livraria = new Livraria();

        Livro livro1 = new Livro("Dom Casmurro", 1, "Machado de Assis", 10);
        Livro livro2 = new Livro("Mem�rias P�stumas de Br�s Cubas", 2, "Machado de Assis", 7);

        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);

        livraria.exibirLivros();

        livraria.removerLivro(livro2);

        livraria.exibirLivros();

        livraria.renomearLivro(livro1, "Dom Casmurro - Edi��o Especial");

        livraria.exibirLivros();

	}

}
