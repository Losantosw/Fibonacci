package br.com.fibonacci;

public class Fibonacci {
	public void calcFibonacci() {
		int a = 1;
		int b = 0;
		int aux;
		
		for(int i=0; i<10; i++) {
			System.out.print(a + " ");
			aux = a;
			a = a + b;
			b = aux;
		}
	}
}
