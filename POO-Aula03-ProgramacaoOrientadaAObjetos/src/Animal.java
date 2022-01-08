public class Animal {

	private String nome;
	private String raca;
	private String porte;
	private int idade;
	private String responsavelPeloAnimal;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getResponsavelPeloAnimal() {
		return responsavelPeloAnimal;
	}

	public void setResponsavelPeloAnimal(String responsavelPeloAnimal) {
		this.responsavelPeloAnimal = responsavelPeloAnimal;
	}
}
