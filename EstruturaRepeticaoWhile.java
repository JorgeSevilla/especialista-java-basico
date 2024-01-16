//Estrutura de repetição while
import java.util.Scanner;

public class EstruturaRepeticaoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Peso máximo aeronave: ");
		int pesoMaximo = entrada.nextInt();
		
		int pesoTotalPassageiros = 0;
		boolean incluirNovoPassageiro = true;
		
		while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
			System.out.print("Peso do passageiro: ");
			int pesoPassageiro = entrada.nextInt();
			
			pesoTotalPassageiros += pesoPassageiro;
			if (pesoTotalPassageiros > pesoMaximo) {
				System.out.println("Peso excedido");
				break;
			} else {
				System.out.print("Incluir novo passageiro? :");
				incluirNovoPassageiro = entrada.nextBoolean();
			}			
		}
		
		System.out.printf("Peso máximo aeronave: %d kg%n: ", pesoMaximo);
		System.out.printf("Peso total passageiros: %d kg%n: ", pesoTotalPassageiros);
		System.out.printf("Situação aeronave: %s%n",
				pesoTotalPassageiros > pesoMaximo ? "peso excedido": "liberada");
	}
}
