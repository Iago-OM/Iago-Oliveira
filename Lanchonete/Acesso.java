package Lanchonete;

import java.util.Scanner;

public class Acesso extends Senha {
	
	// renomeando objeto senha para s1,2,3... e criando usuarios
	public Scanner teclado = new Scanner(System.in);
	public Senha s1 = new Senha();
	public Senha s2 = new Senha();
	public Senha s3 = new Senha();
		
	
	/**
	 * Usuarios do caixa
	 * @param senha
	 */
	
	public void Operador(int senha) {
		
		this.s1.usuario = "Iago Oliviera";
		this.s1.senha = 17242511;
		if(senha == this.s1.senha) {
			System.out.println( "Usuario: " + this.s1.usuario );
			
			}
		this.s2.usuario = "Bruna alves";
		this.s2.senha = 24267367;
		if(senha == this.s2.senha) {
			System.out.println( "Usuario: " + this.s2.usuario );
			
			}
		this.s3.usuario = "Olivia Oliveira";
		this.s3.senha = 23112019;
		if(senha == this.s3.senha) {
			System.out.println( "Usuario: " + this.s3.usuario );
			
			}
		
		
	}
	
	
	/**
	 * inicialização 
	 * @param senha
	 */
	public void Abertura(int senha) {
		
		System.out.println("SENHA: ");
		senha = teclado.nextInt();
		Seguranca(senha);
			
	}	
	
	
	/**
	 * Cabeçalho da nota
	 * @param nome
	 * @param cnpj
	 * @param endereco
	 */
	
	public void Cabeça( String nome, String cnpj, String endereco) {
		nome = Loja.logo;
		cnpj = Loja.cnpj;
		endereco = Loja.endereco;
		System.out.println(nome + cnpj + endereco);
	}
	
	
	/**
	 * 
	 * @param cod
	 */

	public void Seguranca(int cod) {
		switch(cod) {
		case 17242511:
			Operador(17242511);
			this.senha = 1;
			
			break;
		case 24267367:
			Operador(24267367);
			this.senha = 1;
			
			break;
		case 23112019:
			Operador(23112019);
			this.senha = 1;
			
			break;
		default:
			System.out.println("=============Operador invalido==========");
			this.senha = 0;
		
		}
	
	
	}


}
