package exercs;
import java.util.Scanner;

public class Exerc02B {

	public static void main(String[] args) {

		double PRECO_UNIT, PRECO_TOT = 0;
		int QUANT = 0;
		
		// Criação do objeto Scanner de nome input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite o preço unitário: ");
		PRECO_UNIT = input.nextDouble();
		
		System.out.printf("Digite a quantidade: ");
		QUANT = input.nextInt();
		
		PRECO_TOT = (double)PRECO_UNIT * QUANT;
		
		System.out.printf("Preço total: %.2f", PRECO_TOT);

	} // Fim do metodo main

} // Fim da classe Exerc02B
