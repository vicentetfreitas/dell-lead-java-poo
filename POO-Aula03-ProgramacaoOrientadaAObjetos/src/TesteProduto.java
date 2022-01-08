
public class TesteProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();
	    produto.setNome("Arroz");
	    produto.setValor(3.50f);
	    produto.setQuantidade(10);
	    
	    System.out.println("Nome: " + produto.getNome());
	    System.out.println("Valor R$ " + produto.getValor());
	    System.out.println("Quantidade: " + produto.getQuantidade());

	}

}
