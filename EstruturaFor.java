//Estrutura de repetição For

import java.util.Scanner;

class EstruturaFor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Peso máximo aeronave");
		int pesoMaximo = entrada.nextInt();
		
		System.out.println("Quantidade passageiros");
		int totalPassageiros = entrada.nextInt();
		
		int pesoTotalPasssageiros = 0;
		
		for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++ ) {
			System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
			int pesoPassageiro = entrada.nextInt();
			
			pesoTotalPasssageiros += pesoPassageiro;
		}
		
		System.out.printf("Peso máximo aeronave: %d kg%n: ", pesoMaximo);
		System.out.printf("Peso total passageiros: %d kg%n: ", pesoTotalPasssageiros);
		System.out.printf("Situação aeronave: %s%n",
				pesoTotalPasssageiros > pesoMaximo ? "peso excedido": "liberada");
	}
}