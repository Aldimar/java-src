package exercs;
import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		double C_PL, C_MM = 0;
		
		// Criação do objeto de nome Scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de chuva em polegadas: ");
		C_PL = input.nextDouble();
		
		C_MM = C_PL * 25.4;
		
		System.out.printf("A quantidade de chuva %.2fin em Milimetros é %.2fmm", C_PL, C_MM);

	} // Fim do metodo main

} // Fim da classe Exerc05
