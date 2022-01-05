
public class ArrayExemplo03 {

	public void exemplo3(int quantidadeAlunos, int notasPorAluno){
		float notas[][] = new float[quantidadeAlunos][notasPorAluno];
		
		for(int i = 0; i <quantidadeAlunos; i++) {
			System.out.println("Notas do Aluno " + (i + 1));
			for(int j = 0; j < notasPorAluno; j++) {
				float temp =0;
				 System.out.println("Informe a nota " +(j+1) +" do Aluno " + (i+1) +": ");
				 notas[i][j] = temp;
			}
			
		}
	}
	
	public static void main(String[] args) {
		
	}

}
