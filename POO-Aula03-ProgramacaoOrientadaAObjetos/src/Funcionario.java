
public class Funcionario {
	String nome;
	Double salario;
	
	/* Adiciona um valor ao sal�rio base do funcion�rio */
	public void aplicarBonusAoSalario(double valor) {
		salario += valor;
	}

	public void exibirDadosFuncion�rio() {
		System.out.println(nome);
		System.out.println("Sal�rio Atual: R$" + salario);
	}
}
