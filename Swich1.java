package exercicios;

import java.util.Scanner;

public class Swich1 {

	public static void main(String[] args) {
	
	Scanner lerScannner = new Scanner (System.in);		
	int cod;
        int preco = 0;
        String produto = "";

        System.out.println("####################################################");
        System.out.println("Digite 1 para Cachorro-quente            - R$10,00");
        System.out.println("Digite 2 para X-Salada                   - R$15,00");
        System.out.println("Digite 3 para X-Bacon                     - R$18,00");
        System.out.println("Digite 4 para Bauru                       - R$12,00");
        System.out.println("Digite 5 para Refrigerante                - R$8,00");
        System.out.println("Digite 6 para Suco                        - R$3,00");
        System.out.println("###################################################");

        while (true) {
            System.out.print("Informe o código do produto: ");
            cod = lerScannner.nextInt();
            lerScannner.nextLine(); 
            
            if (cod >= 1 && cod <= 6) {
                break; 
            }
            System.out.println("Opção inválida! Digite um código entre 1 e 6.");
        }

        System.out.print("Informe a quantidade desejada: ");
        int quantidade = lerScannner.nextInt();

        switch (cod) {
            case 1: produto = "Cachorro-quente"; preco = 10; break;
            case 2: produto = "X-Salada"; preco = 15; break;
            case 3: produto = "X-Bacon"; preco = 18; break;
            case 4: produto = "Bauru"; preco = 12; break;
            case 5: produto = "Refrigerante"; preco = 8; break;
            case 6: produto = "Suco"; preco = 3; break;
        }

        int total = quantidade * preco;
        System.out.printf("O valor total de %d %s(s) é de R$%d,00%n", quantidade, produto, total);

       lerScannner.close();
	      
    }
}

