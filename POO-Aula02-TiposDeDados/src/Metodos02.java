/*
 * Esta classe demonstra a criação de métodos em JAVA
 * */
public class Metodos02 {
	/* Todos os métodos estão declarados com palavra-chave static, que indica
	 * que os métodos serão acessados através de um contexto stático. Assim não
	 * existe a necessidade de se instanciar uma classe.
	 * 
	 * */
	
	// Assinatura do Metódo 01 
	// < modificador de visibilidade > < modificador de contexto > < tipo de retorno > < nome do método >
	public static void metodoEx1() {
		System.out.println("Eu sou um metódo que não retorna valor devido a palavra chave void.");
	}
	
	public static int metodoEx02() {
		System.out.println("Eu sou um metódo que retorna um valor inteiro");
		return 1;
	}
	
	/*
	 * Os parâmetros do método metodo3 são acessíveis apenas no contexto do 
	 * método em que estão declarados, ou seja, dentro do bloco de código do método.
	 * */
	public static void metodoEx03(String nome, int idade) {
		System.out.println("Eu sou um método que não retorna valor");
		System.out.println("Recebe dois parâmetros");
		System.out.println("Uma string nome: " + nome);
		System.out.println("Um inteiro idade: " + idade);
	}
	
	public static void main(String[] args) {
		metodoEx1();
		System.out.println("O valor retornado pelo métodoEx02 é: " + metodoEx02());
		metodoEx03("Rafael", 29);
		
	}
	
	/*
	 * OBS: 
	 *  static: Essa palavra-chave é um modificador de contexto e tem relação 
	 *  com a possibilidade de execução de um método sem a presença de um objeto 
	 *  do mesmo tipo da classe que o contém.
	 *  */
	

}
