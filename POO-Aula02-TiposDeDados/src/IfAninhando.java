//Importa a classe Random que pertence ao pacote java.util
import java.util.Random;

public class IfAninhando {

	public static void main(String[] args) {
		/**
		 * Esta classe exemplifica uma outra maneira de se utilizar a derivada if.
		 * Verifica se um n�mero gerado aleatoriamente � positivo e par
		 **/
		/*
		 o m�todo nextInt(), passa o valor 200 como par�metro
		 o comando new � usado para instanciar (criar/inicializar) um objeto a 
		partir de uma classe, ou tipo de dado primitivo
		*/
		int numero = new Random().nextInt(200) - 100;

		if (numero % 2 == 0) {
			if (numero > 0) {
				System.out.println("O n�mero � par positivo");
			} else {
				System.out.println("O n�mero � par negativo");
			}
		} else {
			if (numero < 0) {
				System.out.println("O n�mero � impar positivo");
			} else {
				System.out.println("O n�mero � impar negativo");
			}
		}
	}

}
