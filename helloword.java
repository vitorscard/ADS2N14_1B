<<<<<<< HEAD
import java.util.Scanner;
import java.util.Stack;


public class principal {
   

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		hello_you  hello = new hello_you();
		
		System.out.println("Cadastre seu login");
		String login = ler.next();
		
		hello.setLogin(login);
		hello.login();
		
		
    
	}
	
		
		
		
	}

import java.util.Scanner;


public class hello_you {
	
	String login, validacao;
	Scanner ler = new Scanner(System.in);
	
	public void setLogin(String login){
		
		this.login=login;
		
		System.out.println("Login cadastrado com sucesso");
		
	}
	public void login(){
		
		validacao = login;
		
	    System.out.println("informe seu login");
		String login = ler.next();
		
		if(login.equalsIgnoreCase(validacao)){
						
			System.out.println("Hello " + login);
			System.exit(0);
			
		}else{
			
			System.out.println("Login Inválido");
			login();
		}
	}
	

}

=======

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hello world");
	}

}
>>>>>>> fbe75cbf35544962590e2a2085b089996e76e32d
