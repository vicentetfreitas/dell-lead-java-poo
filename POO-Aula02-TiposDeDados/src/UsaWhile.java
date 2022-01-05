/*
 * Estruturas de repeti��o s�o um tipo de estrutura de controel de fluxo que faz
 * com que um trecho de c�digo seja executado v�rias vezes
 * 
 * while/enqunato: o teste de validade da condi��o � executado antes do bloco de instru��es
 * a ser repetido:
 * while(express�o booleana){
 *  instru��es
 * }
 * do...while/fala enquanto: o teste de validade � executado depois do bloco de instru��es.
 * do{
 *  instru��es
 * }while(express�o boolena)
 * 
 * */
public class UsaWhile {
	public static void main(String[] args) {

		int num = 0;
		int loop;
		loop = 5;

		while (loop > num) {
			System.out.println("Valor da vari�vel num " + num + "\n");
			num++;
		}
	}

}
