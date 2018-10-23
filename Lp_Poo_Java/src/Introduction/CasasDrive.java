package Introduction;
import java.util.Scanner;

public class CasasDrive
{

	public static void main(String[] args)
	{

		String csgo;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		Casas casa01 = new Casas();

		System.out.println("Digite o nome da casa: ");
		csgo = in.nextLine();
		
		casa01.setCasaName(csgo);
		
		System.out.println();
		
		casa01.displayName();
	}

}
