import java.util.Scanner;

/* Tipos de dados
 * 
 * Tipos de dados primitivaso: s�o dados b�sicos de uma LP a apartir dos quais se
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
		 * Declara��o de vari�veis: � a garantia que uma vari�vel existirar no programa.
		 * < TIPO > < VARI�VEL > = < VALOR >;
		 */
		double peso;
		boolean ativo;
		char letra;
		int idade;
		
		/*
		 * Inicializa��o de vari�veis: garante que a vari�vel conter� um valor que ser�
		 * utilizado para algum procedimento; < VARI�VEL > = < VALOR >;
		 * 
		 * */
		peso = 104.50;
		ativo = true;
		letra = 'v';
		idade = 29;
		
		/*Operadores:
		 * Operadores de atribui��o de valores:
		 * - =, +=, -=, *=, /=, %= 
		 * 
		 * Operadores l�gicos �E�, �OU� e �OU EXCLUSIVO�:
		 * && , || , ^	
		 * 
		 * Operadores relacionais que comparam dois valores e desenvolvem uma resposta
		 * booleana:
		 * <, >, <=, >=, ==, !=	
		 * 
		 * Operadores Aritm�ticos: 
		 *  Operadores de fun��es matem�ticas b�sicas
		 *   +, -, *, /, %
		 *  Operadores de incremento e decremento de uma unidade.
		 *   ++, --
		 *   
		 * */
		
		/*Conversao de Tipos: quando j� necessidade de converter um tipo de dado 
		 * de uma vari�vel em outro tipo;
		 * CASTING: convers�o de tipo;
		 * OBS: em java n�o � poss�vel convers�o/CASTING para tipo booleano
		 *  CASTING IMPL�CITO: a vari�vel de destino deve converter automaticamente
		 *  o valor da vari�vel de origem sem perda de dados.
		 *   CASTING EXPL�CITO: permitido para todos os dados (exceto para o tipo booleano).
		 *   Poder� ocorrer perda de dados
		 *   
		 *   		 * */
		 //EXEMPO DE CASTING IMPL�CITO
         int a = 10;
         float b;
         b = a;
         //EXEMPO DE CASTING IMPL�CITO
         int x;
         float y = 79.5f;
         x = (int) y;
         
         // OBS-02: String n�o � tipo primitivo de dados mas sim uma classe.
		sc.close();

	}

}
