package entity;



public class Fibonacci {
	
	public static boolean verificarFibonacci(int numero) {
		int a = 0;
		int b = 1;
		while (b < numero) {
			int temp = b;
			b = a + b;
			System.out.println(a + " + " + temp + " = " + b );
			a = temp;
			
			
		}
		return b == numero;
		
	}
}
