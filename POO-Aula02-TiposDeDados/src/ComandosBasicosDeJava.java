/*
 * Controle de Fluxo: ação de modifcar a sequência de execução normal de instruções
 * dentro de um programa.
 *  - Comandos CONDICIONAIS ou INCONDICIONAIS
 *  
 * Etruturas de Decisão: são estruturas de controle de fluxo que PERMITE ou IMPEDE
 * a execução de determinados trechos de código.
 *  - if, if-else e if-else aninhado
 *  - if(se): 
 *   > Condição para decidir a execução de um bloco; 
 *   > APENAS se a condição for VERDADEIRA o bloco será executado;
 *   > Se a condição for falsa, o bloco de código é ignorado e a execução 
 *   continua depois dele.
 *   
 *  if(expressão booleana)
		 instrução_simples;
		 if(expressão booleana){
		 	instruções
		 }
		 
	if(expressão booleana){
		instruções	
		}else if(expressão booleana){
			instruções
		}else{
			instruções
		}
 * 
 * */

public class ComandosBasicosDeJava {
	public static void main (String args[]) {
		
		int numero = 8;
		
		/*
		 *se a diretiva if tiver apenas uma instrução no seu escopo,
		 *não é necessário utilizar chave - ()
		 * */
		if(numero % 2 == 1) {
			System.out.println("O número é impar!");
		}
		/* Neste caso o if deve ter chaves, pois tem duas instruções no seu escopo*/
        if(numero % 2 == 0) {
        	System.out.println("O número é par!");
        	numero++;
        }
	}
}
