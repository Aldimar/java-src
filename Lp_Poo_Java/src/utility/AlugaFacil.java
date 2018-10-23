package utility;

public class AlugaFacil
{

	public static void main(String[] args)
	{

		Carro carro = new Carro();
		carro.idCarro = 001;
		carro.ano = 2018;
		carro.fabricante = "Fiat";
		carro.modelo = "Siena";
		
		Cliente cliente = new Cliente();
		cliente.idCliente = 182;
		cliente.nome = "Aldimar";
		cliente.cpf = "187.233.867-77";
		cliente.cnh = "B";
		
		Locacao locação = new Locacao();
		locação.idLocacao = 123;
		locação.idCarro = carro.idCarro;
		locação.idCliente = cliente.idCliente;
		locação.valorLocado = 750;
		locação.dataInicio = "04/10/2018";
		locação.dataFim = "20/10/2018";
		
		System.out.printf("O cliente %s alugou um carro da marca %s modelo %s de ano %d, de %s até %s no valor de R$%.2f.\n"
						+ "--------------------------------\n"
						+ "Informações para consulta:\n"
						+ "CPF: %s\n"
						+ "CNH: %s\n"
						+ "ID CLIENTE: %d\n"
						+ "ID LOCAÇÃO: %d\n"
						+ "ID CARRO: %d\n"
						+ "--------------------------------\n", 
						cliente.nome, carro.fabricante, 
						carro.modelo, carro.ano, 
						locação.dataInicio, locação.dataFim, 
						locação.valorLocado, cliente.cpf, 
						cliente.cnh, locação.idCliente, 
						locação.idLocacao, locação.idCarro);
		
	}

}
