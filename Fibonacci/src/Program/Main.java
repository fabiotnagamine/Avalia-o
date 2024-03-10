package Program;
import entity.Fibonacci;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero a ser verificado: ");
	    int numInformado = sc.nextInt();
	    
	    if(Fibonacci.verificarFibonacci(numInformado)) {
	    	System.out.println("O numero (" + numInformado + ") pertence a sequencia de Fibonacci.");
	    }else {
	    	System.out.println("O numero (" + numInformado + ") nao pertence a sequencia de Fibonacci.");
	    }
	        
	}

}
