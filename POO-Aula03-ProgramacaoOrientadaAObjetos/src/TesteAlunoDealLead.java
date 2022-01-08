
public class TesteAlunoDealLead {

	public static void main(String[] args) {
		// Aluno
		AlunoDealLead aluno = new AlunoDealLead("João", 100, 10.0, 8.0);
		System.out.println("Classe Aluno");
		System.out.println("aluno: " + aluno.nome);
		System.out.println("cod: " + aluno.codigo);
		System.out.println("nota1: " + aluno.nota1);
		System.out.println("nota2: " + aluno.nota2);
		System.out.println();
		// Novo Aluno
		System.out.println("Classe NovoAluno");
		NovoAluno novoAluno = new NovoAluno("Vicente", 1, 10.0, 9.5);
		System.out.println("aluno: " + novoAluno.getNome());
		System.out.println("cod: " + novoAluno.getCodigo());
		System.out.println("nota1: " + novoAluno.getNota1());
		System.out.println("nota2: " + novoAluno.getNota2());

	}

}
