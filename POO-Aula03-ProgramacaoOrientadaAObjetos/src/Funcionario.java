
public class Funcionario {
	String nome;
	Double salario;
	
	/* Adiciona um valor ao salário base do funcionário */
	public void aplicarBonusAoSalario(double valor) {
		salario += valor;
	}

	public void exibirDadosFuncionário() {
		System.out.println(nome);
		System.out.println("Salário Atual: R$" + salario);
	}
}
