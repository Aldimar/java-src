package exercs;
import java.util.Scanner;

public class Exerc02C {

	public static void main(String[] args) {

		double CM, DIST, VOL = 0;
		
		// Cria��o do objeto Scanner de nome input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.printf("--Algoritmo para calcular consumo--\n");
		System.out.println("Dist�ncia total percorrida (Km): ");
		DIST = input.nextDouble();
		
		System.out.println("Volume de combus�vel gasto (L): ");
		VOL = input.nextDouble();
		
		CM = DIST / VOL;
		
		System.out.printf("Consumo m�dio = %.2fKm/l", CM);
		
	} // Fim do metodo main

} // Fim da classe Exerc02C
