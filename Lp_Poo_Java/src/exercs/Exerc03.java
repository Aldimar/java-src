package exercs;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		int num = 0;
		int cont = 1;
		int total = 0;
		double media = 0;
		
		// Criação do objeto Scanner de nome input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.printf("Digite o %dº numero: ", cont);
			num = input.nextInt();
			total = total + num;
			cont++;
		} while (cont < 5); // Fim do loop "do"
		
		media = (double)total / 4;
		
		System.out.printf("A media dos numeros é: %.2f", media);
		
	} // Fim do metodo main

} // Fim da classe Exerc03
