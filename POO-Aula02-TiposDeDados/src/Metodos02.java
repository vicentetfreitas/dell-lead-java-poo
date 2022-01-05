/*
 * Esta classe demonstra a cria��o de m�todos em JAVA
 * */
public class Metodos02 {
	/* Todos os m�todos est�o declarados com palavra-chave static, que indica
	 * que os m�todos ser�o acessados atrav�s de um contexto st�tico. Assim n�o
	 * existe a necessidade de se instanciar uma classe.
	 * 
	 * */
	
	// Assinatura do Met�do 01 
	// < modificador de visibilidade > < modificador de contexto > < tipo de retorno > < nome do m�todo >
	public static void metodoEx1() {
		System.out.println("Eu sou um met�do que n�o retorna valor devido a palavra chave void.");
	}
	
	public static int metodoEx02() {
		System.out.println("Eu sou um met�do que retorna um valor inteiro");
		return 1;
	}
	
	/*
	 * Os par�metros do m�todo metodo3 s�o acess�veis apenas no contexto do 
	 * m�todo em que est�o declarados, ou seja, dentro do bloco de c�digo do m�todo.
	 * */
	public static void metodoEx03(String nome, int idade) {
		System.out.println("Eu sou um m�todo que n�o retorna valor");
		System.out.println("Recebe dois par�metros");
		System.out.println("Uma string nome: " + nome);
		System.out.println("Um inteiro idade: " + idade);
	}
	
	public static void main(String[] args) {
		metodoEx1();
		System.out.println("O valor retornado pelo m�todoEx02 �: " + metodoEx02());
		metodoEx03("Rafael", 29);
		
	}
	
	/*
	 * OBS: 
	 *  static: Essa palavra-chave � um modificador de contexto e tem rela��o 
	 *  com a possibilidade de execu��o de um m�todo sem a presen�a de um objeto 
	 *  do mesmo tipo da classe que o cont�m.
	 *  */
	

}
