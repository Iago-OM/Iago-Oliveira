package Lanchonete;

// INterface da Loja


public interface Loja {
	// bloco introdução
	public String logo = "       OLI LANCHES \n 		DELIVERY";
	public String cnpj = "\n CNPJ: 15657937732/56";
	public String endereco = "\n Estrada da covanca 1838, Tanque - Rio de Janeiro" + "\n"; 

	// bloco de login
	public void Login( String Usuario, int Senha);
	
	
	// bloco do cardapio
	public void Produto(int cod, String nome, float valor, int quantidade);
	
	// bloco de pagamento
	
	public void Pagamento (float valor, String Bandeira);


	
		
		
		
	}
	
	
	
	

