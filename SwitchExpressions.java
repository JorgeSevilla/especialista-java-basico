//Swtich expressions
import java.util.Scanner;

class SwitchExpressions {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dia da semana (ex: seg, ter, qua, etc): ");
		String diaSemana = entrada.nextLine();
		
		System.out.println("Mês: ");
		int mes = entrada.nextInt();
		
		System.out.printf("Horário de funcionamento: %s%n", switch(diaSemana) {
			case "seg" -> {
				if (mes == 12) {
					yield "08:00 às 16:00";
				}
				yield "Fechado";
			}
			case "ter", "qua", "qui" -> "08:00 às 18:00";
			case "sab", "dom" -> "08:00 às 12:00";
			default -> "Dia inválido"; 
		});
		
		/*
		String horarioFuncionamento;
		switch (diaSemana) {
			case "seg" -> horarioFuncionamento = "Fechado";
			case "ter", "qua", "qui" -> horarioFuncionamento = "08:00 às 18:00";
			case "sab", "dom" -> {
				horarioFuncionamento = "08:00 às 12:00";
			}
			default -> horarioFuncionamento = "Dia inválido";
		}*/
	}
}