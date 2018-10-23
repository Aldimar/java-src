package Introduction;
import java.util.Scanner;

public class Exc_Scanner {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = s.next();
		System.out.println("Digite a sua idade: ");
		int idade = s.nextInt();
		System.out.printf("Seu nome é %s e você tem %d anos.",nome,idade);
	}

}
