package estacio.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploTratamentoExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader leitor = null;
		try {
			//Abrir Arquivo
			leitor = new BufferedReader(new FileReader("entrada.txt"));
			//leitura do conteudo do arquivo
			String linha;
			while ((linha = leitor.readLine()) != null) {
					//processe cada linha do arquivo
				System.out.println(linha);
	}
} catch (IOException e) {
	// Tratar de uma excecao de IO
	System.out.println("Ocorreu um erro durante a leitura do arquivo: " + e.getMessage());
} finally {
	//fechamento do arquivo no bloco finally
	try {
		if (leitor != null) {
			leitor.close();
		}
	} catch (IOException e) {
		System.out.println("Ocorreu um erro durante o fechamento do arquivo: " + e.getMessage());
	}
}
}
}