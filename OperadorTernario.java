//Operador ternário

class OperadorTernario {
	public static void main(String[] args) {
		char tipoNotaFiscal = 'S';
		double totalFaturado = 1200.30;
		
		//double calcularImposto = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;
		double taxaImpostos = tipoNotaFiscal == 'S' ? 0.16 : 0.35;
		double valorImpostos = totalFaturado * taxaImpostos;
		
		//System.out.printf("Valor total calculado: $R %.2f%n", calcularImposto);
		System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
		System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
	}
}