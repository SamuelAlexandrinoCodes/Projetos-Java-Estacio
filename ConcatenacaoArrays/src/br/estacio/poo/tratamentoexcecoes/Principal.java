package br.estacio.poo.tratamentoexcecoes;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacaoArray calc = new OperacaoArray();
		
	
		System.out.println("### INICIANDO SUITE DE TESTES ###");
		//-------------------------------------------------------------------
        // TESTE 1: Validando o tratamento de array nulo
        //-------------------------------------------------------------------
		System.out.println("\n--- INICIANDO TESTE 1: VALIDAÇÃO DE ARRAY NULO ---");
		char [] arrayValido = {'a', 'b', 'c'};
		char [] arrayNulo = null;
		
		try {
			System.out.println("Tentando concatenar um array valido com um array NULO...");
			// Esta chamada deve falhar e lançar nossa exceção customizada
			calc.concatenarArray(arrayValido, arrayNulo);
		} catch (ErroValidacao e) {
			//se chegarmos aqui nosso tratamento de erro funcionou
			System.out.println("\n[SUCESSO] Excecao de validacao foi capturada como esperado");
			System.out.println("MENSAGEM: " + e.getMessage());
		}
		
		System.out.println("--- FIM DO TESTE 1 ---");
		
		//-------------------------------------------------------------------
        // TESTE 2: Tentativa de alocação de memória gigante
        //-------------------------------------------------------------------
		
		System.out.println("\n--- INICIANDO TESTE 2: TENTATIVA DE ALOCAÇÃO DE MEMÓRIA GIGANTE ---");
		
		char [] op1 = null;
		char [] op2 = null;
		
		try {
			//tenta alocar dois arrays muito grandes
			System.out.println("Tentando alocar " + (2L * Short.MAX_VALUE) + " arrays de char (aproximadamente " + (4L * Short.MAX_VALUE) / 1024 + " KB)...");
			op1 = new char [Short.MAX_VALUE];
			op2 = new char [Short.MAX_VALUE];
			//se o programa chegar aqui, a memoria foi suficiente.
			System.out.println("[SUCESSO] Memoria alocada sem erros!");
		} catch (OutOfMemoryError e) {
			//se chegarmos aqui, a JVM nao tinha memoria suficiente, e o nosso catch funcionou.
			 System.out.println("\n[SUCESSO] Erro de falta de memória (OutOfMemoryError) foi capturado como esperado!");
			 
			Runtime runtime = Runtime.getRuntime();
			System.out.println("Memoria insuficiente");
			System.out.println("A memoria total da JVM eh " + runtime.totalMemory() + "e o maximo eh " + runtime.maxMemory());
			// P.S. : Um char em Java ocupa 2 bytes (16 bits), entao a memoria necessaria e 4 * Short.MAX_VALUE.
			System.out.println("Reconfigure a JVM usando o parametro -Xmx<size>. Voce precisa de " + (4L * Short.MAX_VALUE) + "bytes soh para os vetores");
		}
		

        System.out.println("--- FIM DO TESTE 2 ---");
        System.out.println("\n### SUÍTE DE TESTES FINALIZADA ###");
	}
}