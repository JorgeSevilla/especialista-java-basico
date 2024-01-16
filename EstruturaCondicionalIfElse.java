//Condicional if, els eif, else
import java.util.Scanner;

public class EstruturaCondifionalIfElse {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.println("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc <= 18.5) {
			System.out.println("Abaxio do peso ideal: " + imc);
		} else if (imc <= 25) {
			System.out.printf("Peso ideal: " + imc);
		} else if (imc <= 30) {
			System.out.println("Acima do peso: %.2f" + imc);
		} else if (imc <= 35) {
			System.out.println("Obesidade grau I: " + imc);
		} else if (imc <= 35) {
			System.out.println("Obesidade grau II: " + imc);
		} else {
			System.out.println("Obesidade grau III: " + imc);
		}
		System.out.println("Fim do programa");
		
	}
}	