package Lanchonete;


import java.util.Scanner;



public class Caixa {

	// variveis auxiliares
	static int x;
	static int y;
	static float z ;
	static String a,b, c;
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	// criando abertura de caixa
	Acesso a1 = new Acesso();
	a1.Abertura(x);
	a1.Cabeca(a, b, c);
	
	
	 
	// funcionamento de caixa, fazendo as opera�oes de compra
	
	System.out.println("\n Bem vindo ao Sistema do caixa ");
	x = teclado.nextInt();
	Cardapio c1 = new Cardapio();
	
	c1.Compra(x, y);
		
		
		
		
		
		
		
		
	}

	}

