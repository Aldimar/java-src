package exercs;
import java.util.Scanner;

public class Exerc02C {

	public static void main(String[] args) {

		double CM, DIST, VOL = 0;
		
		// Criação do objeto Scanner de nome input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.printf("--Algoritmo para calcular consumo--\n");
		System.out.println("Distância total percorrida (Km): ");
		DIST = input.nextDouble();
		
		System.out.println("Volume de combusível gasto (L): ");
		VOL = input.nextDouble();
		
		CM = DIST / VOL;
		
		System.out.printf("Consumo médio = %.2fKm/l", CM);
		
	} // Fim do metodo main

} // Fim da classe Exerc02C
