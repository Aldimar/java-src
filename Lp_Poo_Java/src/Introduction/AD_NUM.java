package Introduction;
import java.util.Scanner;

public class AD_NUM {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double NUM1, NUM2, SOMA;
		
		System.out.println("Digite o 1� n�mero: ");
		NUM1 = input.nextDouble();
		System.out.println("Digite o 2� n�mero: ");
		NUM2 = input.nextDouble();
		
		SOMA = NUM1 + NUM2;
		
		if(SOMA > 10) {
			System.out.printf("A soma � maior que 10 e o valor dela �: %.2f", SOMA);
		} 
		else {
			System.out.printf("A soma � menor ou igual a 10 e o valor dela �: %.2f", SOMA);
		}
	}

}
