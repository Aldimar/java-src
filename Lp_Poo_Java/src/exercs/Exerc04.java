package exercs;
import java.util.Scanner;


public class Exerc04 {

	public static void main(String[] args) {

		double CON, C = 0;
		
		// Criação do objeto Scanner de nome input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Cº (Celsius): ");
		C = input.nextDouble();
		
		CON = C/5*9+32;
		
		System.out.printf("A temperatura %.2fCº é %.2fFº em Fahrenheit", C, CON);
		
	} // Fim do metodo main

} // Fim da classe Exerc04
