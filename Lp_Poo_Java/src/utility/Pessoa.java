package utility;

public class Pessoa
{

	String nome;
	int rg, cpf;
	double peso, altura;

	public Pessoa()
	{
		
		nome = "";
		rg = 0;
		cpf = 0;
		
	}

	public Pessoa(String nome, int rg, int cpf)
	{
		
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		
	}

	double calcularIMC()
	{
		
		return (peso / Math.pow(altura, 2));
		
	}

	String classificaIMC()
	{
		
		double imc;
		String classe;
		imc = calcularIMC();

		if (imc <= 19)
		{
			classe = "Abaixo do peso";
		} 
		
		else if ((imc <= 25) && (imc > 19))
		{
			classe = "Peso ideal";
		} 
		
		else if ((imc <= 30) && (imc > 25))
		{
			classe = "Acima do peso";
		} 
		
		else if ((imc <= 35) && (imc > 30))
		{
			classe = "Obesidade leve";
		} 
		
		else if ((imc >= 22000))
		{
			classe = "Voc� t� muito gordo cara, se vai morrer viado";
		}
		
		else 
		{
			classe = "Obesidade";
		}
		
		return classe;

	}

}