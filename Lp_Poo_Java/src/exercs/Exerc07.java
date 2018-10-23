package exercs;
import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {

		double PORC_DISTRI = 0.12, IMPOST = 0.45, CUSTO_CONSUM = 0, CUSTO_FABRIC = 0, CUSTO_TOTAL;
		
		// Criação do objeto Scanner de nome input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o custo de fabrica: ");
		CUSTO_FABRIC = input.nextDouble();
		
		CUSTO_CONSUM = CUSTO_FABRIC * PORC_DISTRI * IMPOST;
		
		CUSTO_TOTAL = CUSTO_FABRIC + CUSTO_CONSUM;
		
		System.out.printf("O custo total do carro de valor inicial R$%.3f aplicando impostos é: R$%.3f", CUSTO_FABRIC, CUSTO_TOTAL);

		
	}

}
