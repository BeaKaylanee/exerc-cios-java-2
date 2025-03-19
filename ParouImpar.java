package exercicios;

import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		
		Scanner lerScannner = new Scanner (System.in);
		
		float num;

		
		System.out.println("Digite um número: ");
		num = lerScannner.nextFloat();
		
	
	        
		    String par = (num % 2 == 0) ? "par" : "ímpar";
	        String sinal = (num >= 0) ? "positivo" : "negativo";
	        
	        System.out.println("Número " + num + " é " + par + " e " + sinal + "!");
	        		 
	       lerScannner.close();
	}

}
