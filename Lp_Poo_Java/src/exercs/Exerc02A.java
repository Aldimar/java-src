package exercs;

public class Exerc02A {

	public static void main(String[] args) {

		double PRECO_UNIT, PRECO_TOT = 0;

		int QUANT = 0;

		PRECO_UNIT = 5.0;
		QUANT = 10;
		PRECO_TOT = (double)PRECO_UNIT * QUANT;
		
		System.out.printf("O preço total é: R$%.2f", PRECO_TOT);

	} // Fim do metodo main

} // Fim da classe Exerc02A
