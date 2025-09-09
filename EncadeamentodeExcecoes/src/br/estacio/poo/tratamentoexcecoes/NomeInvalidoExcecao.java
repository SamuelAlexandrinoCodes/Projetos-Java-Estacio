package br.estacio.poo.tratamentoexcecoes;

public class NomeInvalidoExcecao extends Exception {
	//Construtor que permite encadeamento.
	//Ele recebe a nova mensagem e a "causa" original
	public NomeInvalidoExcecao(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
