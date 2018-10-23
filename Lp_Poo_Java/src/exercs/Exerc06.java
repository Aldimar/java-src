package exercs;
import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {

		int num, SQR = 0;
		
		// Criação do objeto Scanner de nome input 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num = input.nextInt();
		
		SQR = num * num;
		
		System.out.printf("%d² é %d", num, SQR);
		
	} // Fim do metodo main

} // Fim da classe Exerc06
