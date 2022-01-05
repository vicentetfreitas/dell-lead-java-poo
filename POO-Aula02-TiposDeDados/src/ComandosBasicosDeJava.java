/*
 * Controle de Fluxo: a��o de modifcar a sequ�ncia de execu��o normal de instru��es
 * dentro de um programa.
 *  - Comandos CONDICIONAIS ou INCONDICIONAIS
 *  
 * Etruturas de Decis�o: s�o estruturas de controle de fluxo que PERMITE ou IMPEDE
 * a execu��o de determinados trechos de c�digo.
 *  - if, if-else e if-else aninhado
 *  - if(se): 
 *   > Condi��o para decidir a execu��o de um bloco; 
 *   > APENAS se a condi��o for VERDADEIRA o bloco ser� executado;
 *   > Se a condi��o for falsa, o bloco de c�digo � ignorado e a execu��o 
 *   continua depois dele.
 *   
 *  if(express�o booleana)
		 instru��o_simples;
		 if(express�o booleana){
		 	instru��es
		 }
		 
	if(express�o booleana){
		instru��es	
		}else if(express�o booleana){
			instru��es
		}else{
			instru��es
		}
 * 
 * */

public class ComandosBasicosDeJava {
	public static void main (String args[]) {
		
		int numero = 8;
		
		/*
		 *se a diretiva if tiver apenas uma instru��o no seu escopo,
		 *n�o � necess�rio utilizar chave - ()
		 * */
		if(numero % 2 == 1) {
			System.out.println("O n�mero � impar!");
		}
		/* Neste caso o if deve ter chaves, pois tem duas instru��es no seu escopo*/
        if(numero % 2 == 0) {
        	System.out.println("O n�mero � par!");
        	numero++;
        }
	}
}
