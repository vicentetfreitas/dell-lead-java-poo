
public class Automovel {

	private String nome;
	private String combustivel;
	private int quantidadeDePssageiros;
	
	public Automovel(String nome) {
		this.nome = nome;
	}
	public Automovel(String nome, String combustivel, int quantidadeDePssageiros) {
		this.nome = nome;
		this.combustivel = combustivel;
		this.quantidadeDePssageiros = quantidadeDePssageiros;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel=combustivel;
	}
	public int getQuantidadeDePassageiros() {
		return quantidadeDePssageiros;
	}
	public void setQuantidadeDePassageiros(int quantidadeDePassageiros) 
	{
		this.quantidadeDePssageiros = quantidadeDePassageiros;
	}
}
