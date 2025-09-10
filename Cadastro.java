package principal;

import java.util.Scanner;

import modelo.Item;

public class Cadastro {

public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in) ;
	Item item = new Item() ;
	
	System.out.println("informe o nome:");
	item.nome = scan.next();
	
	System.out.println("informe a idade:");
	item.idade = scan.nextInt();
	
	System.out.println("quantas indicacoes voce tem?:");
	item.indicacoes = scan.nextInt();
	
	System.out.println("quantos premios voce tem?:");
	item.indicacoes = scan.nextInt();

//Recado: eu não entendi muito bem o que are pra fazer nessa tarefa, mas tentei meu melhor 
	}

}
