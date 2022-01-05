import java.util.Scanner;

/* Tipos de dados
 * 
 * Tipos de dados primitivaso: são dados básicos de uma LP a apartir dos quais se
 * cria tipos complexos
 * 
 * - Tipo inteiro: byte, short, int, long
 * - Tipo ponto flutuante: float, double
 * - Caractere: char
 * - Booleano: boolean*/
public class TiposDeDados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Declaração de variáveis: é a garantia que uma variável existirar no programa.
		 * < TIPO > < VARIÁVEL > = < VALOR >;
		 */
		double peso;
		boolean ativo;
		char letra;
		int idade;
		
		/*
		 * Inicialização de variáveis: garante que a variável conterá um valor que será
		 * utilizado para algum procedimento; < VARIÁVEL > = < VALOR >;
		 * 
		 * */
		peso = 104.50;
		ativo = true;
		letra = 'v';
		idade = 29;
		
		/*Operadores:
		 * Operadores de atribuição de valores:
		 * - =, +=, -=, *=, /=, %= 
		 * 
		 * Operadores lógicos “E”, “OU” e “OU EXCLUSIVO”:
		 * && , || , ^	
		 * 
		 * Operadores relacionais que comparam dois valores e desenvolvem uma resposta
		 * booleana:
		 * <, >, <=, >=, ==, !=	
		 * 
		 * Operadores Aritméticos: 
		 *  Operadores de funções matemáticas básicas
		 *   +, -, *, /, %
		 *  Operadores de incremento e decremento de uma unidade.
		 *   ++, --
		 *   
		 * */
		
		/*Conversao de Tipos: quando já necessidade de converter um tipo de dado 
		 * de uma variável em outro tipo;
		 * CASTING: conversão de tipo;
		 * OBS: em java não é possível conversão/CASTING para tipo booleano
		 *  CASTING IMPLÍCITO: a variável de destino deve converter automaticamente
		 *  o valor da variável de origem sem perda de dados.
		 *   CASTING EXPLÍCITO: permitido para todos os dados (exceto para o tipo booleano).
		 *   Poderá ocorrer perda de dados
		 *   
		 *   		 * */
		 //EXEMPO DE CASTING IMPLÍCITO
         int a = 10;
         float b;
         b = a;
         //EXEMPO DE CASTING IMPLÍCITO
         int x;
         float y = 79.5f;
         x = (int) y;
         
         // OBS-02: String não é tipo primitivo de dados mas sim uma classe.
		sc.close();

	}

}
