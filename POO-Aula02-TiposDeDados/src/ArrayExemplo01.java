
public class ArrayExemplo01 {
 public static void main(String[] args)
 {
	// Vetor de caracacteres, com tamanho igual a 4
	 char letras[];
	 letras = new char[4];
	 
	 // Adicionando elementos ao array
	 letras[0] = 'J';
	 letras[1] = 'A';
	 letras[2] = 'V';
	 letras[3] = 'A';
	 
	 // Exibindo do conte?do do array
	 int indice =0;
	 while (indice < 4) {
		 System.out.println(letras[indice]);
		 indice++;
	 }
	 
 }
}
