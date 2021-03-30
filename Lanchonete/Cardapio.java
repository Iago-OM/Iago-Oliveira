package Lanchonete;

import java.util.Scanner;

public class Cardapio extends Produtos {
	public static Scanner teclado = new Scanner(System.in);
	public static float conta;
	public static float contador = 0;
static Produtos p1 = new Produtos();
static Produtos p2 = new Produtos();
static Produtos p3 = new Produtos();
static Produtos p4 = new Produtos();
static Produtos p5 = new Produtos();
static Produtos p6 = new Produtos();
static Produtos p7 = new Produtos();
static Produtos p8 = new Produtos();
static Produtos p9 = new Produtos();
static Produtos p10 = new Produtos();
static Produtos p11 = new Produtos();
static Produtos p12 = new Produtos();
static Pag x1 = new Pag();
	
// contador 

public void Contador( float conta) {
	if(conta > 0) {
		this.contador = conta + this.contador;
		System.out.println("\n" + "VALOR TOTAL DA COMPRA: " + this.contador);
	}else {
		System.out.println("\n" + "VALOR TOTAL DA COMPRA: " + this.contador);
		conta = this.contador;
		x1.Pagar(this.contador);
		
		
		
	}
	
}



/**
//===========BLOCO DE LANCHES=======================
 * 
 *  
 */
public void  Lanches(int codigo, int y) {

	// Xtudo
this.p1.cod = 1 ;
this.p1.nome = "X TUDO";
this.p1.valor = 9.50f;
this.p1.quantidade = y;


if(codigo == this.p1.cod) {
	
	

	System.out.println("Codigo: " +  this.p1.cod + "\n" + "Produto: " + this.p1.nome + "\n" + "Preço unt: R$" + this.p1.valor);
	this.p1.valor = this.p1.quantidade * this.p1.valor;
	
	
	System.out.println("Valor total: " + this.p1.valor);
	if(codigo > 0) {
		Contador(this.p1.valor);
	}else {
		Contador( 0);
	}

}




	// X - PICANHA
this.p2.cod = 2 ;
this.p2.nome = "X PICANHA";
this.p2.valor = 10.00f;
this.p2.quantidade = y;
	//

if(codigo == this.p2.cod) {
	System.out.println("Codigo: " +  this.p2.cod + "\n" + "Produto: " + this.p2.nome + "\n" + "Preço unt: R$" + this.p2.valor);
	this.p2.valor = this.p2.quantidade * this.p2.valor;
	
	System.out.println("Valor total: " + this.p2.valor);
	if(codigo > 0) {
		Contador(this.p2.valor);
	}else {
		Contador( 0);
	}
}



	// X SUPER 

this.p3.cod = 3 ;
this.p3.nome = "X SUPER";
this.p3.valor = 12.50f;
this.p3.quantidade = y;


if(codigo == this.p3.cod) {

	System.out.println("Codigo: " +  this.p3.cod + "\n" + "Produto: " + this.p3.nome + "\n" + "Preço unt: R$" + this.p3.valor);
	this.p3.valor = this.p3.quantidade * this.p3.valor;
	 
	System.out.println("Valor total: " + this.p3.valor);
	
	if(codigo > 0) {
		Contador(this.p3.valor);
	}else {
		Contador( 0);
	}

}

// ARTESANAL 
this.p4.cod = 4 ;
this.p4.nome = "ARTESANAL";
this.p4.valor = 12.50f;
this.p4.quantidade = y;


if(codigo == this.p4.cod) {

	System.out.println("Codigo: " +  this.p4.cod + "\n" + "Produto: " + this.p4.nome + "\n" + "Preço unt: R$" + this.p4.valor);
	this.p4.valor = this.p4.quantidade * this.p4.valor;
	
	System.out.println("Valor total: " + this.p4.valor);
	if(codigo > 0) {
		Contador(this.p4.valor);
	}else {
		Contador( 0);
	}
}
}



/**
//===========BLOCO DE BEBIDAS=======================
*/
public void Bebidas(int cod, int y) {
	 
	// REFRIGERANTE LATA
		this.p5.cod = 5 ;
		this.p5.nome = "REFRIG. LATA";
		this.p5.valor = 6.50f;
		this.p5.quantidade = y;
		
		
		if(cod == this.p5.cod) {
		
			System.out.println("Codigo: " +  this.p5.cod + "\n" + "Produto: " + this.p5.nome + "\n" + "Preço unt: R$" + this.p5.valor);
			this.p5.valor = this.p5.quantidade * this.p5.valor;
			 
			System.out.println("Valor total: " + this.p5.valor);
			if(cod > 0) {
				Contador(this.p5.valor);
			}else {
				Contador( 0);
			}
		}
	 
	 
		// REFRIGERANTE 1,5 L
					this.p6.cod = 6 ;
					this.p6.nome = "REFRIG. 1,5 L";
					this.p6.valor = 8.50f;
					this.p6.quantidade = y;
					
					
					if(cod == this.p6.cod) {
					
						System.out.println("Codigo: " +  this.p6.cod + "\n" + "Produto: " + this.p6.nome + "\n" + "Preço unt: R$" + this.p6.valor);
						this.p6.valor = this.p6.quantidade * this.p6.valor;
						
						System.out.println("Valor total: " + this.p6.valor);
						if(cod > 0) {
							Contador(this.p6.valor);
						}else {
							Contador( 0);
						}
					}
				 
		
			// COCA COLA 
					this.p7.cod = 7 ;
					this.p7.nome = "REFRIG. 2L";
					this.p7.valor = 10.00f;
					this.p7.quantidade = y;
					
					
					if(cod == this.p7.cod) {
					
						System.out.println("Codigo: " +  this.p7.cod + "\n" + "Produto: " + this.p7.nome + "\n" + "Preço unt: R$" + this.p7.valor);
						this.p7.valor = this.p7.quantidade * this.p7.valor;
						 
						System.out.println("Valor total: " + this.p7.valor);
						if(cod > 0) {
							Contador(this.p7.valor);
						}else {
							Contador( 0);
						}
					}
}

	
 
					
 

/**=========== BLOCO DE BATATAS =====================
*/
public void Batatas(int cod, int y) {
		 
		// BATATA P
		 	this.p8.cod = 8 ;
			this.p8.nome = "BATATA P";
			this.p8.valor = 5.00f;
			this.p8.quantidade = y;
			
			
			if(cod == this.p8.cod) {
			
				System.out.println("Codigo: " +  this.p8.cod + "\n" + "Produto: " + this.p8.nome + "\n" + "Preço unt: R$" + this.p8.valor);
				this.p8.valor = this.p8.quantidade * this.p8.valor;
				 
				System.out.println("Valor total: " + this.p8.valor);
				if(cod > 0) {
					Contador(this.p8.valor);
				}else {
					Contador( 0);
				}
			}
		
			
			// BATATA M	
			this.p9.cod = 9 ;
			this.p9.nome = "BATATA M";
			this.p9.valor = 8.00f;
			this.p9.quantidade = y;
			
			
			if(cod == this.p9.cod) {
			
				System.out.println("Codigo: " +  this.p9.cod + "\n" + "Produto: " + this.p9.nome + "\n" + "Preço unt: R$" + this.p9.valor);
				this.p9.valor = this.p9.quantidade * this.p9.valor;
				 
				System.out.println("Valor total: " + this.p9.valor);
				if(cod > 0) {
					Contador(this.p9.valor);
				}else {
					Contador(0);
				}
			}
			
		// BATATA G
			
			this.p10.cod = 10 ;
			this.p10.nome = "BATATA G";
			this.p10.valor = 10.00f;
			this.p10.quantidade = y;
			
			
			if(cod == this.p10.cod) {
			
				System.out.println("Codigo: " +  this.p10.cod + "\n" + "Produto: " + this.p10.nome + "\n" + "Preço unt: R$" + this.p10.valor);
				this.p10.valor = this.p10.quantidade * this.p10.valor;
				 
				System.out.println("Valor total: " + this.p7.valor);
				if(cod > 0) {
					Contador(this.p10.valor);
				}else {
					Contador( 0);
				}
			
			}
	 }
	 
/**
 * 	 Bloco compra dp caixa

 */
public void Compra(int x, int y) {
	while(x > 0) {
		
		
		System.out.println("\n digite o código do Produto: ");
		x = teclado.nextInt();
		if(x > 0) {
			System.out.println("digite a quantidade de Produtos: ");
			y = (int) teclado.nextFloat();
			Lanches(x,y);	
			Bebidas(x, y);
			Batatas(x, y);
			} else {
				System.out.println("qual forma de pagamaneto: [1] Dinheiro  [2] Credito   [3] Debito ");
				x = teclado.nextInt();
				x1.Seg(x);
				
				System.out.println( "\n" + "Compra Finalizada: Tenha um Otimo dia ");
			
			}
		
}
}



		 			
public  void Finalizar() {
	 this.contador = 0;
}	
	 

}
		 
		 








	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	


