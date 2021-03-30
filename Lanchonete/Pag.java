package Lanchonete;

public class Pag extends Pagamentos {

	// objetos para criar formas de pagamento
	
	public Pagamentos p1 = new Pagamentos();
	public Pagamentos p2 = new Pagamentos();
	public Pagamentos p3 = new Pagamentos();
	public Pagamentos p4 = new Pagamentos();
	public Pagamentos p5 = new Pagamentos();
	public Cardapio c1 = new Cardapio();

	
	
	
	
	/**
	 * Opções de pagamento
	 * @param cod
	 */
	
	public void Forma( int cod) {
	
	//System.out.println("qual forma de pagamaneto: ");
	this.p1.forma = "DINHEIRO";
	this.p1.valor = c1.contador;
	this.p1.codigo = 1;
	if(cod == this.p1.codigo) {
		System.out.println("Pagamento em " + this.p1.forma);
		System.out.println("valor a pagar: " + this.p1.valor);
		//valor = teclado.nextFloat();
		
		//System.out.println("Troco do cliente: " + (valor - this.p1.valor));
		
	}
	
	this.p2.forma = "CREDITO";
	this.p2.valor = c1.contador;
	this.p2.codigo = 2;
	if(cod == this.p2.codigo) {
		System.out.println("Pagamento em " + this.p2.forma);
		System.out.println("valor a pagar: " + this.p2.valor);
		
		
	}
	this.p3.forma = "DEBITO";
	this.p3.valor = c1.contador;
	this.p3.codigo = 3;
	if(cod == this.p3.codigo) {
		System.out.println("Pagamento em " + this.p3.forma);
		System.out.println("valor a pagar: " + this.p3.valor);
		
		
	}
}
	
	
	
	/**
	 * metodo para escolher a forma de pagamento
	 * @param cod
	 */
	public void Seg(int cod) {
		switch(cod) {
		case 1:
			Forma(cod);
			this.codigo = 1;
			
			break;
		case 2:
			Forma(cod);
			this.codigo = 1;
			
			break;
		case 3:
			Forma(cod);
			this.codigo = 1;
			
			break;
		default:
			System.out.println("Operaão nao definida");
			//this.codigo = 0;
		
		}


	}
	
	

/**
 * pegar o valor para pagar
 * @param valor
 * @return
 */

public float Pagar(float valor) {
	return valor = this.valor ;
	
	
	
	
	
	
	
}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
