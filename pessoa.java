import java.util.Scanner;
import java.util.Stack;

public class pessoaPrincipal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		pessoa  p = new pessoa();
		
		System.out.println("Informe o Nome da Pessoa");
		String nome = ler.next();
		p.setnomeCadastro(nome);
		
		System.out.println("Iforme a idade");
		int idade = ler.nextInt();
		p.setidade(idade);
		
		System.out.println("Nome: " + p.getnomeCadastro() +  " Idade: " + p.getidade());
		
		
		
	}

}

import java.util.Scanner;

public class pessoa {
	
	 String nome;
	int idade;
	
	public  void setnomeCadastro(String nome){
		
		this.nome = nome;
		
	}
	public String getnomeCadastro(){
		
		return nome;
		
	}
	public void setidade(int idade){
		
		this.idade = idade;
		
	}
	public int getidade(){
		
		return idade;
		
	}
	
	

}
