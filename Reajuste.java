package exercicios;

import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		Scanner lerScannner = new Scanner (System.in);
		
		 System.out.println("####################################################");
	        System.out.println("Digite 1 para Gerente      - R$10,00");
	        System.out.println("Digite 2 para Vendedor     - R$15,00");
	        System.out.println("Digite 3 para Supervisor   - R$18,00");
	        System.out.println("Digite 4 para Moptorista   - R$12,00");
	        System.out.println("Digite 5 para Estoquista   - R$8,00");
	        System.out.println("Digite 6 Técnico de TI     - R$3,00");
	        System.out.println("###################################################");

	        System.out.println("Informe o nome do colaborador: ");
	        String nome = lerScannner.nextLine();
	        
	        System.out.print("Informe o cod do cargo do colaborador: ");
	        int cargo = lerScannner.nextInt();
	    	lerScannner.nextLine();

	        System.out.print("Informe valor do seu salário: ");
	        float salario = lerScannner.nextFloat();

	        int reajuste = 0;
	        String cargoNome = "";

	        switch (cargo) {
	            case 1: cargoNome = "Gerente"; reajuste = 10; break;
	            case 2: cargoNome = "Vendedor"; reajuste = 7; break;
	            case 3: cargoNome = "Supervisor"; reajuste = 9; break;
	            case 4: cargoNome = "Moptorista "; reajuste = 6; break;
	            case 5: cargoNome = "Estoquista"; reajuste = 5; break;
	            case 6: cargoNome = "Técnico de TI  "; reajuste = 8; break;
	            default:
	                System.out.println("Opção inválida!");
	                lerScannner.close();  
	                return;
	        }
	        
	        float novoSalario = salario + (salario * reajuste / 100);

	        System.out.printf("Colaborador: %s%nCargo: %s%nNovo Salário: R$%.2f%n", nome, cargoNome, novoSalario);

	        lerScannner.close();

	      
	}

}
