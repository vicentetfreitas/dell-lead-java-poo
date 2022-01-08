
public class TesteAutomovel {

	public static void main(String[] args) {

		// Usando o primeiro construtor e definindo atributos
		Automovel auto01 = new Automovel("Ferrari");
		auto01.setQuantidadeDePassageiros(5);
		auto01.setCombustivel("Gasolina");

		// Usando o segundo contrutor
		Automovel auto02 = new Automovel("Trator", "Oléo disel", 1);

		// Acessando as informações de cada automovel usando o metódo get
		System.out.println(auto01.getNome() + " - Utiliza " + auto01.getCombustivel());
		System.out.println(auto02.getNome() + " - Transporta " + auto02.getQuantidadeDePassageiros() + " pessoas(s).");
	}

}
