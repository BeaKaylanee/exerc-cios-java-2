package exercicios;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
	
		Scanner lerScannner = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Digite o número A: ");
		a = lerScannner.nextInt();
		
		System.out.println("Digite o número B: ");
		b = lerScannner.nextInt();
		
		System.out.println("Digite o número C: ");
		c = lerScannner.nextInt();
		
       int soma = a + b;
        
        
        System.out.println("\n" + a + " + " + b + " = " + soma + (soma > c ? " > " : soma < c ? " < " : " = ") + c);
        
        System.out.println("A Soma de A + B é " + (soma > c ? "Maior" : soma < c ? "Menor" : "Igual") + " do que C = " + soma);
        
        lerScannner.close();
	}

}
