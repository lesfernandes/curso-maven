package br.com.leticia.java;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Produto produto = new Produto("7belos", 0.15);
		
		System.out.println("A bala que eu gosto é: " + produto.getNome());
	}
}
