package br.estacio.poo.tratamentoexcecoes;
import java.util.ArrayList;
import java.util.List;

public class ExemploEncadeamentoExcecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			List<String> listNomes = new ArrayList<>();
			// Chamamos o metodocom um nome nulo para forcar o erro
			addNome(listNomes, null);
		} catch (NomeInvalidoExcecao e) {
			System.out.println("Um erro ocorreu: " + e.getMessage());
			// Usamos .getCause () para desembrulhar e ver a excecao original
			System.out.println("Causa raiz: " + e.getCause().getMessage());
		}
	}
 public static void addNome (List<String> nomes, String nome) throws NomeInvalidoExcecao {
	 try {
		 //Regra de negocio: nome nao pode ser nulo ou vazio
		 if (nome == null || nome.isBlank()) {
			 //Lanca uma excecao tecnica e generica
			 throw new IllegalArgumentException("Nome nao pode ser nulo ou vazio");
		 }
		 nomes.add(nome);
	 } catch (IllegalArgumentException e) {
		 throw new NomeInvalidoExcecao("Foi detectado um nome invalido", e);
	 }
 }
}
