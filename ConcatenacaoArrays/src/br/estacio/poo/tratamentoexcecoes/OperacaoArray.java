package br.estacio.poo.tratamentoexcecoes;

public class OperacaoArray {

    public char[] concatenarArray(char[] op1, char[] op2) throws ErroValidacao {
    	// ---- INICIO DA MODIFICACAO ---- 
    	// validacao para garantir que os arrays nao sao nulos
    	if (op1 == null || op2 == null) {
    		throw new ErroValidacao("Um dos arrays para concatenacao e nulo(nao alocado)");
    	}
    	// --- FIM DA MODIFICACAO ---
    	
        int tamnh_res;
        tamnh_res = op1.length + op2.length;
        return copiarArray(op1, op2, tamnh_res, op2.length);
    }

    private char[] copiarArray(char[] op1, char[] op2, int tamnh_res, int n) {
        char[] resultado = new char[tamnh_res];
        System.arraycopy(op1, 0, resultado, 0, op1.length);
        System.arraycopy(op2, 0, resultado, op1.length, n);
        return resultado;
    }
}